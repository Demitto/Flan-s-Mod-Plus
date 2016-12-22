package com.flansmod.client;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityFMFlame extends EntityFX
{
	public static ResourceLocation icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
	public EntityFMFlame(World w, double px, double py, double pz, double mx, double my, double mz)
	{
		super(w, px, py, pz, mx, my, mz);
		this.particleMaxAge = 6;
		this.particleAge = 0;
		this.particleGravity = 1;
		this.motionX = mx;
		this.motionY = my;
		this.motionZ = mz;
		FlansMod.proxy.spawnParticle("flansmod.fmsmoke",
				this.posX,
				this.posY,
				this.posZ,
				0,0,0);
		icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
	}
	
	public int getFXLayer()
	{
			 return 2;
	}

	public float getEntityBrightness(float f)
	{
			return 1.0F;
	}
	
	public int getBrightnessForRender(float par1)
	{
		return 15728880;
	}
	
    public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        //func_98187_b() = bindTexture();
    	FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/FMFlame.png"));

        float scale = 0.6F - ((this.particleAge)*0.1F);
        float xPos = (float) (this.prevPosX + (this.posX - this.prevPosX) * (double) par2 - interpPosX);
        float yPos = (float) (this.prevPosY + (this.posY - this.prevPosY) * (double) par2 - interpPosY);
        float zPos = (float) (this.prevPosZ + (this.posZ - this.prevPosZ) * (double) par2 - interpPosZ);
        float colorIntensity = 1.0F;
        //par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);//, 1.0F);
        par1Tessellator.setColorRGBA_F(this.particleRed * colorIntensity, this.particleGreen * (colorIntensity - this.particleAge*0.2F), this.particleBlue * (colorIntensity - this.particleAge*0.2F), (0.5F - this.particleAge*0.1F));
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos - par5 * scale - par7 * scale), 0D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos - par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos - par5 * scale + par7 * scale), 1D, 1D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale + par6 * scale), (double) (yPos + par4 * scale), (double) (zPos + par5 * scale + par7 * scale), 1D, 0D);
        par1Tessellator.addVertexWithUV((double) (xPos + par3 * scale - par6 * scale), (double) (yPos - par4 * scale), (double) (zPos + par5 * scale - par7 * scale), 0D, 0D);

    }

	public void onUpdate()
	{
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		this.renderDistanceWeight = 2000.0D;
		if(this.particleAge++ >= this.particleMaxAge)
		{
			this.setDead();
		}
		
		this.moveEntity(this.motionX, this.motionY, this.motionZ);
		if(this.onGround)
		{
			setDead();
		}
	}
}
