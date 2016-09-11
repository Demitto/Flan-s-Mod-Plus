package mapwriter.map;

import java.awt.Point;
import java.awt.geom.Point2D.Double;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import mapwriter.Render;
import mapwriter.map.mapmode.MapMode;

public class EntityMarker
{
	public final Entity entity;
	
	private int restDisplayTime;
	
	private Point.Double screenPos = new Point.Double(0, 0);
	private double posX;
	private double posZ;
	private int dimension;
	private int color;
	private int backgroundColor;
	
	public EntityMarker(Entity entity2)
	{
		this.entity = entity2;
	}

	public void onTick(boolean isOnSameTeam)
	{
		if(!isOnSameTeam)
		{
			if(this.getRestDisplayTime() > 0)
			{
				this.restDisplayTime--;
			}
		}
	}

	public void update(int displayTime, int color, int bgColor)
	{
		this.dimension = this.entity.dimension;
		this.posX = this.entity.posX;
		this.posZ = this.entity.posZ;
		
		if(displayTime > this.restDisplayTime)
		{
			this.restDisplayTime = displayTime;
		}
		
		this.color = color;
		this.backgroundColor = bgColor;
	}

	public void draw(MapMode mapMode, MapView mapView)
	{
		double scale = mapView.getDimensionScaling(this.getDimension());
		Point.Double p = mapMode.getClampedScreenXY(mapView, this.posX * scale, this.posZ * scale);
		this.screenPos.setLocation(p.x + mapMode.xTranslation, p.y + mapMode.yTranslation);
		
		// draw a coloured rectangle centered on the calculated (x, y)
		double mSize = mapMode.markerSize * 1.2;
		double halfMSize = mapMode.markerSize / 2.0;
		int alpha = this.restDisplayTime<100? this.restDisplayTime: 100;
		Render.setColourWithAlphaPercent(this.backgroundColor, alpha);
		Render.drawRect(p.x - halfMSize, p.y - halfMSize, mSize, mSize);
		Render.setColourWithAlphaPercent(this.color, alpha);
		Render.drawRect(p.x - halfMSize + 0.5, p.y - halfMSize + 0.5, mSize - 1.0, mSize - 1.0);
	}

	public int getDimension()
	{
		return this.dimension;
	}

	public int getRestDisplayTime()
	{
		return restDisplayTime;
	}
}