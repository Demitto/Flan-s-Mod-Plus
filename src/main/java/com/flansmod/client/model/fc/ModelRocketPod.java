package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRocketPod extends ModelMG
{
    public ModelRocketPod()
    {
		bipodModel = new ModelRendererTurbo[2];
		bipodModel[0] = new ModelRendererTurbo(this, 30, 0);
		bipodModel[0].addBox(0F, 0F, 0F, 6, 1, 2, 0F);
		bipodModel[0].setRotationPoint(-3F, 0F, -1F);
		bipodModel[0].rotateAngleX = 0F;
		bipodModel[0].rotateAngleY = 0F;
		bipodModel[0].rotateAngleZ = 0F;
		bipodModel[0].mirror = false;
		bipodModel[1] = new ModelRendererTurbo(this, 25, 16);
		bipodModel[1].addBox(0F, 0F, 0F, 2, 1, 6, 0F);
		bipodModel[1].setRotationPoint(-1F, 0F, -3F);
		bipodModel[1] .rotateAngleX = 0F;
		bipodModel[1] .rotateAngleY = 0F;
		bipodModel[1] .rotateAngleZ = 0F;
		bipodModel[1] .mirror = false;
		
		gunModel = new ModelRendererTurbo[5];
		gunModel[0] = new ModelRendererTurbo(this, 48, 0);
		gunModel[0].addBox(0F, 0F, 0F, 1, 8, 1, 0F);
		gunModel[0].setRotationPoint(-0.5F, 0F, -0.5F);
		gunModel[0].rotateAngleX = 0F;
		gunModel[0].rotateAngleY = 0F;
		gunModel[0].rotateAngleZ = 0F;
		gunModel[0].mirror = false;
		gunModel[1] = new ModelRendererTurbo(this, 0, 0);
		gunModel[1].addBox(0F, 0F, 0F, 3, 3, 12, 0F);
		gunModel[1].setRotationPoint(0.5F, 7F, -3F);
		gunModel[1].rotateAngleX = 0F;
		gunModel[1].rotateAngleY = 0F;
		gunModel[1].rotateAngleZ = 0F;
		gunModel[1].mirror = false;
		gunModel[2] = new ModelRendererTurbo(this, 0, 0);
		gunModel[2].addBox(0F, 0F, 0F, 3, 3, 12, 0F);
		gunModel[2].setRotationPoint(0.5F, 3F, -3F);
		gunModel[2].rotateAngleX = 0F;
		gunModel[2].rotateAngleY = 0F;
		gunModel[2].rotateAngleZ = 0F;
		gunModel[2].mirror = false;
		gunModel[3] = new ModelRendererTurbo(this, 0, 0);
		gunModel[3].addBox(0F, 0F, 0F, 3, 3, 12, 0F);
		gunModel[3].setRotationPoint(-3.5F, 3F, -3F);
		gunModel[3].rotateAngleX = 0F;
		gunModel[3].rotateAngleY = 0F;
		gunModel[3].rotateAngleZ = 0F;
		gunModel[3].mirror = false;
		gunModel[4] = new ModelRendererTurbo(this, 0, 0);
		gunModel[4].addBox(0F, 0F, 0F, 3, 3, 12, 0F);
		gunModel[4].setRotationPoint(-3.5F, 7F, -3F);
		gunModel[4].rotateAngleX = 0F;
		gunModel[4].rotateAngleY = 0F;
		gunModel[4].rotateAngleZ = 0F;
		gunModel[4].mirror = false;	
		
		ammoModel = new ModelRendererTurbo[0];
	
    }
}
