package com.flansmod.client.model.fc;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelPlasma extends ModelBase 
{
	public ModelRendererTurbo Shape1;
	public ModelRendererTurbo Shape2;
	public ModelRendererTurbo Shape3;
	public ModelRendererTurbo Shape4;
	public ModelRendererTurbo Shape5;
	public ModelRendererTurbo Shape6;
	public ModelRendererTurbo Shape7;
	public ModelRendererTurbo Shape8;

	public ModelPlasma()
	{
		Shape1 = new ModelRendererTurbo(this, 0, 0, 128, 32);
		Shape1.addShapeBox(0F, -1F, -1F, 8, 2, 2, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); 
		Shape1.rotateAngleZ = 1.57079633F;

		Shape2 = new ModelRendererTurbo(this, 23, 0, 128, 32);
		Shape2.addShapeBox(8F, -1.5F, -1.5F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); 
		Shape2.rotateAngleZ = 1.57079633F;

		Shape3 = new ModelRendererTurbo(this, 41, 0, 128, 32);
		Shape3.addShapeBox(13F, -2F, -2F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); 
		Shape3.rotateAngleZ = 1.57079633F;

		Shape4 = new ModelRendererTurbo(this, 65, 0, 128, 32);
		Shape4.addBox(18F, -2.5F, -2.5F, 5, 5, 5, 0F);
		Shape4.rotateAngleZ = 1.57079633F;

		Shape5 = new ModelRendererTurbo(this, 87, 0, 128, 32);
		Shape5.addShapeBox(23F, -2.5F, -2.5F, 4, 5, 5, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); //Test
		Shape5.rotateAngleZ = 1.57079633F;

		Shape6 = new ModelRendererTurbo(this, 64, 10, 128, 32);
		Shape6.addBox(18F, -5.5F, -5.5F, 0, 11, 11, 0F);
		Shape6.rotateAngleZ = 1.57079633F;

		Shape7 = new ModelRendererTurbo(this, 0, 14, 128, 32);
		Shape7.addBox(13F, -4.5F, -4.5F, 0, 9, 9, 0F);
		Shape7.rotateAngleZ = 1.57079633F;

		Shape8 = new ModelRendererTurbo(this, 0, 0, 128, 32);
		Shape8.addBox(7F, -3.5F, -3.5F, 0, 7, 7, 0F);
		Shape8.rotateAngleZ = 1.57079633F;







	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
	}
}
