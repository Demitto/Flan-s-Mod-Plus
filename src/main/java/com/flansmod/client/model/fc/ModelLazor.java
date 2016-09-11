package com.flansmod.client.model.fc;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelLazor extends ModelBase 
{
	public ModelRendererTurbo Shape1;

	public ModelLazor()
	{
		Shape1 = new ModelRendererTurbo(this, 2, 0, 64, 32);
		Shape1.addBox(0F, -0.5F, -0.5F, 30, 1, 1, 0F);
		Shape1.rotateAngleZ = 1.570796F;





	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		Shape1.render(f5);
	}
}
