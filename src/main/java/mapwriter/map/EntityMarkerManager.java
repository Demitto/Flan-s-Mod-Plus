package mapwriter.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityGrenade;

import mapwriter.map.mapmode.MapMode;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityMarkerManager
{
	private List<EntityMarker> markerList = new ArrayList<EntityMarker>();
	
	public void clear()
	{
		this.markerList.clear();
	}
	
	public void put(EntityLivingBase clientPlayer, Entity entity, int displayTime)
	{
		EntityMarker marker = null;
		for(EntityMarker em : this.markerList)
		{
			if(em.entity == entity)
			{
				marker = em;
				break;
			}
		}
		if(marker == null)
		{
			marker = new EntityMarker(entity);
			this.markerList.add(marker);
		}
		
		if(entity instanceof EntityLivingBase && clientPlayer.isOnSameTeam((EntityLivingBase)entity))
		{
			marker.update(displayTime, 0x00FFFF, 0x007F7F);
		}
		else if(entity instanceof EntityGrenade)
		{
			marker.update(displayTime, 0xFFFF00, 0x7F7F00);
		}
		else
		{
			marker.update(displayTime, 0xFF0000, 0x7F0000);
		}
	}
	
	public void onTick(EntityLivingBase clientPlayer)
	{
//		if(clientPlayer.ticksExisted % 20 == 0)
		{
			List list = clientPlayer.worldObj.playerEntities;
			for(int i=0; i < list.size(); i++)
			{
				EntityLivingBase entity = (EntityLivingBase) list.get(i);
				if(!entity.isEntityEqual(clientPlayer) && entity.isOnSameTeam(clientPlayer))
				{
					put(clientPlayer, entity, 100);
				}
			}
		}

		if( clientPlayer.ticksExisted % 10 == 0 &&
			clientPlayer.ridingEntity instanceof EntitySeat &&
			((EntitySeat) clientPlayer.ridingEntity).driveable != null)
		{
			DriveableType type = ((EntitySeat) clientPlayer.ridingEntity).driveable.getDriveableType();

			if(type != null && type.radarDetectableAltitude >= 0)
			{
				List list = clientPlayer.worldObj.playerEntities;
				for(int i=0; i < list.size(); i++)
				{
					EntityLivingBase player = (EntityLivingBase) list.get(i);
					Entity entity = ((Entity)list.get(i)).ridingEntity;
					if(entity == null)
					{
						continue;
					}

					if(entity instanceof EntitySeat && ((EntitySeat)entity).driveable != null)
					{
						type = ((EntitySeat)entity).driveable.getDriveableType();
						if(type != null && type.stealth)
						{
							continue;
						}
					}

					if(!player.isEntityEqual(clientPlayer) && !player.isOnSameTeam(clientPlayer))
					{
						Block block = searchBlockVertical(
							entity.worldObj,
							(int)(entity.posX + 0.5),
							(int)(entity.posY + 0.5),
							(int)(entity.posZ + 0.5),
							type.radarDetectableAltitude);

						if(Block.isEqualTo(block, Blocks.air))
						{
							put(clientPlayer, entity, 20 * 9);
						}
					}
				}
			}
		}

		Iterator<EntityMarker> iterator = this.markerList.iterator();
		while(iterator.hasNext())
		{
			EntityMarker em = iterator.next();
			if(em.entity instanceof EntityLivingBase)
			{
				em.onTick(clientPlayer.isOnSameTeam((EntityLivingBase)em.entity));
			}
			else
			{
				em.onTick(false);
			}
			
			if(em.getRestDisplayTime() <= 0 || em.entity.isDead)
			{
				iterator.remove();
			}
		}
	}

	public static Block searchBlockVertical(World world, int px, int py, int pz, int lenY)
	{
		if(lenY == 0)	return Blocks.air;

		for(int y = 0; y < lenY; y++, py--)
		{
			if(py < 0)
			{
				return Blocks.air;
			}

			if(py > 255)
			{
				continue;
			}

			Block block = world.getBlock(px, py, pz);
			if(block != null && block != Blocks.air)
			{
				return block;
			}
		}

		return Blocks.air;
	}

	public void drawMarkers(MapMode mapMode, MapView mapView)
	{
		for (EntityMarker marker : this.markerList)
		{
			// only draw markers that were set in the current dimension
			if(mapView.getDimension() == marker.getDimension())
			{
				marker.draw(mapMode, mapView);
			}
		}
	}

	/*
	public String markerToString(Marker marker)
	{
		return String.format("%s:%d:%d:%d:%d:%06x:%s", marker.name, marker.x, marker.y, marker.z, marker.dimension, marker.colour & 0xffffff, marker.groupName);
	}

	public Marker stringToMarker(String s)
	{
		// new style delimited with colons
		String[] split = s.split(":");
		if(split.length != 7)
		{
			// old style was space delimited
			split = s.split(" ");
		}
		Marker marker = null;
		if(split.length == 7)
		{
			try
			{
				int x = Integer.parseInt(split[1]);
				int y = Integer.parseInt(split[2]);
				int z = Integer.parseInt(split[3]);
				int dimension = Integer.parseInt(split[4]);
				int colour = 0xff000000 | Integer.parseInt(split[5], 16);

				marker = new Marker(split[0], split[6], x, y, z, dimension, colour);

			}
			catch (NumberFormatException e)
			{
				marker = null;
			}
		}
		else
		{
			MwUtil.log("Marker.stringToMarker: invalid marker '%s'", s);
		}
		return marker;
	}

	public void addMarker(Marker marker)
	{
		this.markerList.add(marker);
	}

	public void addMarker(String name, String groupName, int x, int y, int z, int dimension, int colour)
	{
		name = name.replace(":", "");
		groupName = groupName.replace(":", "");
		this.addMarker(new Marker(name, groupName, x, y, z, dimension, colour));
	}

	// returns true if the marker exists in the arraylist.
	// safe to pass null.
	public boolean delMarker(Marker markerToDelete)
	{
		return this.markerList.remove(markerToDelete);
	}

	// deletes the first marker with matching name and group.
	// if null is passed as either name or group it means "any".
	public boolean delMarker(String name, String group)
	{
		Marker markerToDelete = null;
		for (Marker marker : this.markerList)
		{
			if(((name == null) || marker.name.equals(name)) && ((group == null) || marker.groupName.equals(group)))
			{
				markerToDelete = marker;
				break;
			}
		}
		// will return false if a marker matching the criteria is not found
		// (i.e. if markerToDelete is null)
		return this.delMarker(markerToDelete);
	}
*/
	/*
	 * public boolean delGroup(String groupName) { boolean error =
	 * !this.groupList.remove(groupName); Iterator it =
	 * this.markerMap.entrySet().iterator(); while (it.hasNext()) { Map.Entry
	 * entry = (Map.Entry) it.next(); Marker marker = (Marker) entry.getValue();
	 * if (marker.groupName.equals(groupName)) { it.remove(); } } if (groupName
	 * == this.visibleGroupName) { this.nextGroup(); } return error; }
	 */
/*
	public void update()
	{
		this.visibleMarkerList.clear();
		this.groupList.clear();
		this.groupList.add("none");
		this.groupList.add("all");
		for (Marker marker : this.markerList)
		{
			if(marker.groupName.equals(this.visibleGroupName) || this.visibleGroupName.equals("all"))
			{
				this.visibleMarkerList.add(marker);
			}
			if(!this.groupList.contains(marker.groupName))
			{
				this.groupList.add(marker.groupName);
			}
		}
		if(!this.groupList.contains(this.visibleGroupName))
		{
			this.visibleGroupName = "none";
		}
	}

	public void nextGroup(int n)
	{
		if(this.groupList.size() > 0)
		{
			int i = this.groupList.indexOf(this.visibleGroupName);
			int size = this.groupList.size();
			if(i != -1)
			{
				i = (i + size + n) % size;
			}
			else
			{
				i = 0;
			}
			this.visibleGroupName = this.groupList.get(i);
		}
		else
		{
			this.visibleGroupName = "none";
			this.groupList.add("none");
		}
	}

	public void nextGroup()
	{
		this.nextGroup(1);
	}

	public int countMarkersInGroup(String group)
	{
		int count = 0;
		if(group.equals("all"))
		{
			count = this.markerList.size();
		}
		else
		{
			for (Marker marker : this.markerList)
			{
				if(marker.groupName.equals(group))
				{
					count++;
				}
			}
		}
		return count;
	}

	public void selectNextMarker()
	{
		if(this.visibleMarkerList.size() > 0)
		{
			int i = 0;
			if(this.selectedMarker != null)
			{
				i = this.visibleMarkerList.indexOf(this.selectedMarker);
				if(i == -1)
				{
					i = 0;
				}
			}
			i = (i + 1) % this.visibleMarkerList.size();
			this.selectedMarker = this.visibleMarkerList.get(i);
		}
		else
		{
			this.selectedMarker = null;
		}
	}

	public Marker getNearestMarker(int x, int z, int maxDistance)
	{
		int nearestDistance = maxDistance * maxDistance;
		Marker nearestMarker = null;
		for (Marker marker : this.visibleMarkerList)
		{
			int dx = x - marker.x;
			int dz = z - marker.z;
			int d = (dx * dx) + (dz * dz);
			if(d < nearestDistance)
			{
				nearestMarker = marker;
				nearestDistance = d;
			}
		}
		return nearestMarker;
	}

	public Marker getNearestMarkerInDirection(int x, int z, double desiredAngle)
	{
		int nearestDistance = 10000 * 10000;
		Marker nearestMarker = null;
		for (Marker marker : this.visibleMarkerList)
		{
			int dx = marker.x - x;
			int dz = marker.z - z;
			int d = (dx * dx) + (dz * dz);
			double angle = Math.atan2(dz, dx);
			// use cos instead of abs as it will wrap at 2 * Pi.
			// cos will be closer to 1.0 the closer desiredAngle and angle are.
			// 0.8 is the threshold corresponding to a maximum of
			// acos(0.8) = 37 degrees difference between the two angles.
			if((Math.cos(desiredAngle - angle) > 0.8D) && (d < nearestDistance) && (d > 4))
			{
				nearestMarker = marker;
				nearestDistance = d;
			}
		}
		return nearestMarker;
	}

	public void drawMarkers(MapMode mapMode, MapView mapView)
	{
		for (Marker marker : this.visibleMarkerList)
		{
			// only draw markers that were set in the current dimension
			if(mapView.getDimension() == marker.dimension)
			{
				marker.draw(mapMode, mapView, 0xff000000);
			}
		}
		if(this.selectedMarker != null)
		{
			this.selectedMarker.draw(mapMode, mapView, 0xffffffff);
		}
	}
	*/
}
