package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.EntityMG;

public class RenderMG extends Render
{

    public RenderMG()
    {
        shadowSize = 0.5F;
    }

    public void render(EntityMG mg, double d, double d1, double d2, float f, float f1)
    {
		GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F);
		GL11.glEnable(GL11.GL_BLEND);
		int srcBlend = GL11.glGetInteger(GL11.GL_BLEND_SRC);
		int dstBlend = GL11.glGetInteger(GL11.GL_BLEND_DST);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

    	bindEntityTexture(mg);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
		GL11.glRotatef(180F - mg.direction * 90F, 0.0F, 1.0F, 0.0F);
		ModelMG model = mg.type.deployableModel;
		if(model != null)
		{
			//GL11.glScalef(-1F, -1F, 1.0F);
			model.renderBipod(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, mg);
	        GL11.glRotatef(-(mg.prevRotationYaw + (mg.rotationYaw - mg.prevRotationYaw) * f1), 0.0F, 1.0F, 0.0F);
			model.renderGun(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, f1, mg);
		}
        GL11.glPopMatrix();

		GL11.glBlendFunc(srcBlend, dstBlend);
		GL11.glDisable(GL11.GL_BLEND);
    }

    @Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityMG)entity, d, d1, d2, f, f1);
    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return FlansModResourceHandler.getDeployableTexture(((EntityMG)entity).type);
	}
}
