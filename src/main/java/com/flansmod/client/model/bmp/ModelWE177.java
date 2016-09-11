package com.flansmod.client.model.bmp;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;


public class ModelWE177 extends ModelBase
{
	int textureX = 64;
	int textureY = 128;

    public ModelWE177()
    {
		bombModel = new ModelRendererTurbo[9];
		bombModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bombModel[1] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Box 1
		bombModel[2] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 2
		bombModel[3] = new ModelRendererTurbo(this, 30, 24, textureX, textureY); // Box 3
		bombModel[4] = new ModelRendererTurbo(this, 0, 61, textureX, textureY); // Box 4
		bombModel[5] = new ModelRendererTurbo(this, 0, 82, textureX, textureY); // Box 5
		bombModel[6] = new ModelRendererTurbo(this, 0, 94, textureX, textureY); // Box 6
		bombModel[7] = new ModelRendererTurbo(this, 0, 101, textureX, textureY); // Box 7
		bombModel[8] = new ModelRendererTurbo(this, 36, 0, textureX, textureY); // Box 8

		bombModel[0].addTrapezoid(-2F, 0F, -2F, 4, 5, 4, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 0
		bombModel[0].setRotationPoint(0F, 0F, 0F);

		bombModel[1].addTrapezoid(-3F, 5F, -3F, 6, 5, 6, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 1
		bombModel[1].setRotationPoint(0F, 0F, 0F);

		bombModel[2].addTrapezoid(-4F, 10F, -4F, 8, 10, 8, 0F, -1.00F, ModelRendererTurbo.MR_TOP); // Box 2
		bombModel[2].setRotationPoint(0F, 0F, 0F);

		bombModel[3].addBox(-4F, 20F, -4F, 8, 15, 8, 0F); // Box 3
		bombModel[3].setRotationPoint(0F, 0F, 0F);

		bombModel[4].addTrapezoid(-4F, 35F, -4F, 8, 10, 8, 0F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 4
		bombModel[4].setRotationPoint(0F, 0F, 0F);

		bombModel[5].addTrapezoid(-3F, 45F, -3F, 6, 5, 6, 0F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 5
		bombModel[5].setRotationPoint(0F, 0F, 0F);

		bombModel[6].addTrapezoid(-2F, 50F, -2F, 4, 2, 4, 0F, -1.00F, ModelRendererTurbo.MR_BOTTOM); // Box 6
		bombModel[6].setRotationPoint(0F, 0F, 0F);

		bombModel[7].addShapeBox(-5F, 1F, -0.5F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		bombModel[7].setRotationPoint(0F, 0F, 0F);

		bombModel[8].addShapeBox(-0.5F, 1F, -5F, 1, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 8
		bombModel[8].setRotationPoint(0F, 0F, 0F);	
    }

    @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for(int i = 0; i < 4; i++)
        {
            bombModel[i].render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public ModelRendererTurbo bombModel[];
}
