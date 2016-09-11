package com.flansmod.common.guns;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;

public class EntityDamageSourceGun extends EntityDamageSourceIndirect {

	public InfoType weapon;
	public EntityPlayer shooter;
	public boolean headshot;
	
	public EntityDamageSourceGun(String s, Entity entity, EntityPlayer player, InfoType wep, boolean head) 
	{
		super(s, entity, player);
		weapon = wep;
		shooter = player;
		headshot = head;
	}
	
	public Entity getDamageSourceEntity()
	{
		return this.damageSourceEntity;
	}

	@Override
	public IChatComponent func_151519_b(EntityLivingBase living)
    {
		if(!(living instanceof EntityPlayer) || shooter == null || PlayerHandler.getPlayerData(shooter) == null)
		{
			return super.func_151519_b(living);
		}
		EntityPlayer player = (EntityPlayer)living;
    	Team killedTeam = PlayerHandler.getPlayerData(player).team;
    	Team killerTeam = PlayerHandler.getPlayerData(shooter).team;
    	
    	FlansMod.getPacketHandler().sendToDimension(
    		new PacketKillMessage(
    			headshot,
    			weapon,
    			(killedTeam == null ? "f" : killedTeam.textColour) + player.getCommandSenderName(),
    			(killerTeam == null ? "f" : killerTeam.textColour) + shooter.getCommandSenderName()),
    		living.dimension);
    	System.out.println(shooter.getCommandSenderName()+" has killed "+player.getCommandSenderName()+" with "+weapon.name+". TickExisted:"+player.ticksExisted/20+
    		" KilledPos(X:"+(int)player.posX+" Y:"+(int)player.posY+" Z:"+(int)player.posZ+")"+
    		" KillerPos(X:"+(int)shooter.posX+" Y:"+(int)shooter.posY+" Z:"+(int)shooter.posZ+")");
    	
    	if(player.getCurrentArmor(2) != null){
    		System.out.println("KilledPlayer:"+player+" wear a "+player.getCurrentArmor(2).getUnlocalizedName());
    	}else{
    		System.out.println("KilledPlayer:"+player+" wear nothing.");
    	}

    	if(shooter.getCurrentArmor(2) != null){
    		System.out.println("Killer:"+shooter+" wear a "+shooter.getCurrentArmor(2).getUnlocalizedName());
    	}else{
    		System.out.println("Killer:"+shooter+" wear nothing.");
    	}

    	if(player.ticksExisted/20 < FlansMod.noticeSpawnKillTime){
    		System.out.println("Warning! PlayerName:"+shooter.getCommandSenderName()+" may do SPAWN KILL. Time:"+player.ticksExisted/20+" "+player.getCommandSenderName()+" was killed.");
    	}
    	//return new ChatComponentText(shooter.getCommandSenderName()+" has killed "+player.getCommandSenderName()+" with "+weapon+". TickExisted:"+player.ticksExisted/20+" KilledPos(X:"+player.posX+" Y:"+player.posY+" Z:"+player.posZ+")"+" KillerPos(X:"+shooter.posX+" Y:"+shooter.posY+" Z:"+shooter.posZ+")");
        return new ChatComponentText("#flansmod");//flanDeath." + weapon.shortName + "." + (killedTeam == null ? "f" : killedTeam.textColour) + player.getCommandSenderName() + "." + (killerTeam == null ? "f" : killerTeam.textColour) + shooter.getCommandSenderName());
    }
}
