package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityAAGun;


public class RenderAAGun extends Render
{
	public RenderAAGun()
	{
		shadowSize = 1.0F;
	}

	public void render(EntityAAGun aa, double d, double d1, double d2, float f, float f1)
	{
    	if(aa.ridingEntity != null)
    	{
    		if(aa.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
    		{
    			return;
    		}
    	}

		GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F);
		GL11.glEnable(GL11.GL_BLEND);
		int srcBlend = GL11.glGetInteger(GL11.GL_BLEND_SRC);
		int dstBlend = GL11.glGetInteger(GL11.GL_BLEND_DST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

    	bindEntityTexture(aa);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glScalef(1F, 1F, 1.0F);
		
		float dYaw = aa.gunYaw - aa.prevGunYaw;
		for(; dYaw > 180F; dYaw -= 360F) {}
		for(; dYaw <= -180F; dYaw += 360F) {}
		
		ModelAAGun modelAAGun = aa.type.model;
		if(modelAAGun != null)
		{
			modelAAGun.renderBase(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
			GL11.glRotatef(180F - (aa.prevGunYaw + dYaw * f1), 0.0F, 1.0F, 0.0F);
			modelAAGun.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, aa);
		}
		GL11.glPopMatrix();

		GL11.glBlendFunc(srcBlend, dstBlend);
		GL11.glDisable(GL11.GL_BLEND);
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		render((EntityAAGun) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getTexture(((EntityAAGun)entity).type);
	}
}
