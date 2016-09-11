package com.flansmod.client.model.fc;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelRocket extends ModelBase 
{
	public ModelRendererTurbo Shape1;
	public ModelRendererTurbo Shape2;
	public ModelRendererTurbo Shape3;
	public ModelRendererTurbo Shape4;
	public ModelRendererTurbo Shape5;
	public ModelRendererTurbo Shape6;
	public ModelRendererTurbo Shape7;
	public ModelRendererTurbo Shape8;
	public ModelRendererTurbo Shape9;

	public ModelRocket()
	{
		Shape1 = new ModelRendererTurbo(this, 0, 0, 64, 32);
		Shape1.addBox(0F, -2F, -2F, 14, 4, 4, 0F);
		Shape1.rotateAngleZ = 1.570796F;

		Shape2 = new ModelRendererTurbo(this, 0, 10, 64, 32);
		Shape2.addShapeBox(14F, -2F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); //Test
		Shape2.rotateAngleZ = 1.570796F;


		Shape3 = new ModelRendererTurbo(this, 0, 20, 64, 32);
		Shape3.addShapeBox(0F, -4F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		Shape3.rotateAngleZ = 1.570796F;


		Shape4 = new ModelRendererTurbo(this, 0, 20, 64, 32);
		Shape4.addShapeBox(0F, -4F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		Shape4.rotateAngleY = 1.570796F;
		Shape4.rotateAngleZ = 1.570796F;

		Shape5 = new ModelRendererTurbo(this, 0, 20, 64, 32);
		Shape5.addShapeBox(0F, -4F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		Shape5.rotateAngleY = 3.141593F;
		Shape5.rotateAngleZ = 1.570796F;

		Shape6 = new ModelRendererTurbo(this, 0, 20, 64, 32);
		Shape6.addShapeBox(0F, -4F, -0.5F, 4, 2, 1, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		Shape6.rotateAngleY = -1.570796F;
		Shape6.rotateAngleZ = 1.570796F;

		Shape7 = new ModelRendererTurbo(this, 0, 24, 64, 32);
		Shape7.addShapeBox(-4F, -2F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F); //Test
		Shape7.rotateAngleZ = 1.570796F;

		Shape8 = new ModelRendererTurbo(this, 17, 16, 64, 32);
		Shape8.addBox(-8F, -2F, -2F, 4, 4, 4, 0F);
		Shape8.rotateAngleZ = 1.570796F;

		Shape9 = new ModelRendererTurbo(this, 38, 0, 64, 32);
		Shape9.addShapeBox(-17F, -2F, -2F, 9, 4, 4, 0F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F); //Test
		Shape9.rotateAngleZ = 1.570796F;








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
		Shape9.render(f5);
	}
}
