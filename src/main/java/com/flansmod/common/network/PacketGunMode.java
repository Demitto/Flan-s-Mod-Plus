package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.ItemGun;

public class PacketGunMode extends PacketBase 
{
	/** Only server to client */
	public EnumFireMode mode = EnumFireMode.SEMIAUTO;
	
	public PacketGunMode() {}
	
	public PacketGunMode(EnumFireMode md)
	{
		this.mode = md;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		data.writeByte(this.mode.ordinal());
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		int i = data.readByte();
		if(i < EnumFireMode.values().length)
		{
			this.mode = EnumFireMode.values()[i];
		}
	}
	
	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		ItemStack itemStack = playerEntity.inventory.getCurrentItem();
		if(itemStack != null && itemStack.getItem() instanceof ItemGun)
		{
			ItemGun gun = (ItemGun) itemStack.getItem();
			
			EnumFireMode currentMode = gun.type.getFireMode(itemStack);
			EnumFireMode nextMode = currentMode;

			EnumFireMode[] submode = gun.type.submode;
			for( int i=0; i<submode.length; i++ )
			{
				if(currentMode == submode[i])
				{
					nextMode = submode[ (i + 1) % submode.length ];
					break;
				}
			}

			if(currentMode != nextMode)
			{
//				FlansMod.log("[Server]Switched the gun mode : " + currentMode + " -> " + nextMode);
				
				gun.type.setFireMode(itemStack, nextMode.ordinal());
				
		//		playerEntity.worldObj.playSoundEffect(
		//				playerEntity.posX+0.5,
		//				playerEntity.posY+0.5,
		//				playerEntity.posZ+0.5,
		//				"random.click", 2.3F, 1.0F);

				FlansMod.getPacketHandler().sendTo(new PacketGunMode(nextMode), playerEntity);
			}
			else
			{
//				FlansMod.log("[Server]Do not switch the gun mode : " + currentMode);
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		ItemStack itemStack = clientPlayer.inventory.getCurrentItem();
		if(itemStack != null && itemStack.getItem() instanceof ItemGun)
		{
//			FlansMod.log("[Client]Switched the gun mode : " + this.mode);

			((ItemGun)itemStack.getItem()).type.setFireMode(itemStack, this.mode.ordinal());
		}
	}
}
