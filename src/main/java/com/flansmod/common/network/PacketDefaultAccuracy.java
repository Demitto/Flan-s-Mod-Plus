package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketDefaultAccuracy extends PacketBase
{

	public float bulletSpread = 0;

	public PacketDefaultAccuracy() {}

	public PacketDefaultAccuracy(ItemStack itemstack)
	{
		if(itemstack != null && itemstack.getItem() instanceof ItemGun)
		{
		ItemGun gun = (ItemGun)itemstack.getItem();
		bulletSpread = gun.type.defaultSpread;
		}
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		data.writeFloat(bulletSpread);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
	{
		bulletSpread = data.readFloat();
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity)
	{
		ItemStack itemStack = playerEntity.inventory.getCurrentItem();
		if(itemStack != null && itemStack.getItem() instanceof ItemGun)
		{
			ItemGun gun = (ItemGun) itemStack.getItem();
			gun.type.bulletSpread = bulletSpread;
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

			((ItemGun)itemStack.getItem()).type.bulletSpread = bulletSpread;
		}
	}
}

