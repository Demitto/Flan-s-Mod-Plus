
package com.flansmod.client.model.fc;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMissile extends ModelBase
{
	public ModelRenderer bulletModel1;
	public ModelRenderer bulletModel4;
	public ModelRenderer bulletModel5;
	public ModelRenderer bulletModel6;
	public ModelRenderer bulletModel7;
	public ModelRenderer bulletModel8;
	public ModelRenderer bulletModel;	

	public ModelMissile()
	{
		bulletModel1 = new ModelRenderer(this, 0, 0);
		bulletModel1.addBox(-6F, 0F, -1.4F, 11, 2, 2, 0F);
		bulletModel1.setRotationPoint(0F, 0F, 0F);
		bulletModel1.rotateAngleX = 0.7853982F;
		bulletModel1.rotateAngleY = 0F;
		bulletModel1.rotateAngleZ = 1.57079633F;
		bulletModel1.mirror = false;
		bulletModel4 = new ModelRenderer(this, 0, 10);
		bulletModel4.addBox(-4F, 0F, 0F, 2, 0, 5, 0F);
		bulletModel4.setRotationPoint(0F, 0F, 0F);
		bulletModel4.rotateAngleX = 0F;
		bulletModel4.rotateAngleY = 0.5235988F;
		bulletModel4.rotateAngleZ = 1.57079633F;
		bulletModel4.mirror = false;
		bulletModel5 = new ModelRenderer(this, 0, 10);
		bulletModel5.addBox(-4F, 0F, 0F, 2, 0, 5, 0F);
		bulletModel5.setRotationPoint(0F, 0F, 0F);
		bulletModel5.rotateAngleX = 3.141593F;
		bulletModel5.rotateAngleY = -0.5235988F;
		bulletModel5.rotateAngleZ = 1.57079633F;
		bulletModel5.mirror = false;
		bulletModel6 = new ModelRenderer(this, 0, 5);
		bulletModel6.addBox(2F, 0F, 0F, 2, 0, 3, 0F);
		bulletModel6.setRotationPoint(0F, 0F, 0F);
		bulletModel6.rotateAngleX = 3.141593F;
		bulletModel6.rotateAngleY = -0.5235988F;
		bulletModel6.rotateAngleZ = 1.57079633F;
		bulletModel6.mirror = false;
		bulletModel7 = new ModelRenderer(this, 0, 5);
		bulletModel7.addBox(2F, 0F, 0F, 2, 0, 3, 0F);
		bulletModel7.setRotationPoint(0F, 0F, 0F);
		bulletModel7.rotateAngleX = 0F;
		bulletModel7.rotateAngleY = 0.5235988F;
		bulletModel7.rotateAngleZ = 1.57079633F;
		bulletModel7.mirror = false;
		bulletModel8 = new ModelRenderer(this, 0, 5);
		bulletModel8.addBox(2F, 0F, 0F, 2, 0, 3, 0F);
		bulletModel8.setRotationPoint(0F, 0F, 0F);
		bulletModel8.rotateAngleX = 1.570796F;
		bulletModel8.rotateAngleY = 0F;
		bulletModel8.rotateAngleZ = 2.0943951F;
		bulletModel8.mirror = false;
		bulletModel = new ModelRenderer(this, 0, 5);
		bulletModel.addBox(2F, 0F, 0F, 2, 0, 3, 0F);
		bulletModel.setRotationPoint(0F, 0F, 0F);
		bulletModel.rotateAngleX = -1.570796F;
		bulletModel.rotateAngleY = 0F;
		bulletModel.rotateAngleZ = 1.04719755F;
		bulletModel.mirror = false;
	}
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		bulletModel1.render(f5);
		bulletModel4.render(f5);
		bulletModel5.render(f5);
		bulletModel6.render(f5);
		bulletModel7.render(f5);
		bulletModel8.render(f5);
		bulletModel.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

}
