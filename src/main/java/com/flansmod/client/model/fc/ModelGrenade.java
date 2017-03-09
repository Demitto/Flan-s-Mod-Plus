
package com.flansmod.client.model.fc;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGrenade extends ModelBase
{
	public ModelRenderer Grenade1;
	public ModelRenderer Grenade2;
	public ModelRenderer Grenade3;
	public ModelRenderer Grenade4;
	public ModelRenderer Grenade5;


	public ModelGrenade()
	{
		
		Grenade1 = new ModelRenderer(this, 0, 9);
		Grenade1.addBox(-1F, -1F, -1F, 2, 2, 2, 0F);
		Grenade1.setRotationPoint(0F, 0F, 0F);
		Grenade1.rotateAngleX = 0F;
		Grenade1.rotateAngleY = 0F;
		Grenade1.rotateAngleZ = 1.57079633F;
		Grenade1.mirror = false;
		Grenade2 = new ModelRenderer(this, 0, 5);
		Grenade2.addBox(-2F, -0.5F, -0.5F, 1, 1, 1, 0F);
		Grenade2.setRotationPoint(0F, 0F, 0F);
		Grenade2.rotateAngleX = 0F;
		Grenade2.rotateAngleY = 0F;
		Grenade2.rotateAngleZ = 1.57079633F;
		Grenade2.mirror = false;
		Grenade3 = new ModelRenderer(this, 0, 14);
		Grenade3.addBox(1F, -0.5F, -0.5F, 1, 1, 1, 0F);
		Grenade3.setRotationPoint(0F, 0F, 0F);
		Grenade3.rotateAngleX = 0F;
		Grenade3.rotateAngleY = 0F;
		Grenade3.rotateAngleZ = 1.57079633F;
		Grenade3.mirror = false;
		Grenade4 = new ModelRenderer(this, 15, 0);
		Grenade4.addBox(2F, -2F, 0F, 1, 4, 0, 0F);
		Grenade4.setRotationPoint(0F, 0F, 0F);
		Grenade4.rotateAngleX = 0F;
		Grenade4.rotateAngleY = 0F;
		Grenade4.rotateAngleZ = 1.57079633F;
		Grenade4.mirror = false;
		Grenade5 = new ModelRenderer(this, 0, 0);
		Grenade5.addBox(2F, 0F, -2F, 1, 0, 4, 0F);
		Grenade5.setRotationPoint(0F, 0F, 0F);
		Grenade5.rotateAngleX = 0F;
		Grenade5.rotateAngleY = 0F;
		Grenade5.rotateAngleZ = 1.57079633F;
		Grenade5.mirror = false;

	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Grenade1.render(f5);
		Grenade2.render(f5);
		Grenade3.render(f5);
		Grenade4.render(f5);
		Grenade5.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

}
