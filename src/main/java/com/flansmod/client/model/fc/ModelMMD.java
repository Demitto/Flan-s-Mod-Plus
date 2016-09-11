//This File was created with the Minecraft-SMP Modelling Toolbox
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 1.4.6+

// Model Checklist
//    Model: 
//    - Hitbox              [ ]
//    - Check Left/Right    [ ]  Left = + / Right = -
//    - Code Cleaned        [ ]  
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMMD extends ModelMG
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelMMD()	
	{


		bipodModel = new ModelRendererTurbo[6];
		bipodModel[0] = new ModelRendererTurbo(this,  67,  0, textureX, textureY); // Stand
		bipodModel[1] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Stand
		bipodModel[2] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Stand
		bipodModel[3] = new ModelRendererTurbo(this,  0,  36, textureX, textureY); // Stand
		bipodModel[4] = new ModelRendererTurbo(this,  0,  36, textureX, textureY); // Stand
		bipodModel[5] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Stand


		bipodModel[0].addBox(0F, 0F, 0F, 2, 1, 16, 0F); // Stand
		bipodModel[0].setRotationPoint(-1F, 1F, -8F);

		bipodModel[1].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Stand
		bipodModel[1].setRotationPoint(-4F, 0F, -8F);

		bipodModel[2].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Stand
		bipodModel[2].setRotationPoint(-4F, 0F, 6F);

		bipodModel[3].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Stand
		bipodModel[3].setRotationPoint(-1F, 1F, -8F);
		bipodModel[3].rotateAngleX = -0.3490658F;

		bipodModel[4].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Stand
		bipodModel[4].setRotationPoint(-1F, 2F, 7F);
		bipodModel[4].rotateAngleX = 0.3665192F;
		bipodModel[4].rotateAngleY = 3.141593F;
		bipodModel[4].rotateAngleZ = -3.141593F;

		bipodModel[5].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Stand
		bipodModel[5].setRotationPoint(-1F, 3F, -3F);


		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this,  0,  69, textureX, textureY); // Gun
		gunModel[1] = new ModelRendererTurbo(this,  0,  80, textureX, textureY); // Gun
		gunModel[2] = new ModelRendererTurbo(this,  0,  99, textureX, textureY); // Gun
		gunModel[3] = new ModelRendererTurbo(this,  0,  117, textureX, textureY); // Gun
		gunModel[4] = new ModelRendererTurbo(this,  0,  123, textureX, textureY); // Gun
		gunModel[5] = new ModelRendererTurbo(this,  114,  0, textureX, textureY); // Gun
		gunModel[6] = new ModelRendererTurbo(this,  0,  23, textureX, textureY); // Gun
		gunModel[7] = new ModelRendererTurbo(this,  0,  130, textureX, textureY); // Gun
		gunModel[8] = new ModelRendererTurbo(this,  43,  0, textureX, textureY); // Gun
		gunModel[9] = new ModelRendererTurbo(this,  44,  14, textureX, textureY); // Gun
		gunModel[10] = new ModelRendererTurbo(this,  39,  31, textureX, textureY); // Gun
		gunModel[11] = new ModelRendererTurbo(this,  0,  15, textureX, textureY); // Gun
		gunModel[12] = new ModelRendererTurbo(this,  0,  10, textureX, textureY); // Gun
		gunModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun
		gunModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun
		gunModel[15] = new ModelRendererTurbo(this,  20,  13, textureX, textureY); // Gun


		gunModel[0].addBox(-1F, 4F, -1F, 2, 3, 2, 0F); // Gun
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(-2F, 7F, -1F, 4, 4, 7, 0F); // Gun
		gunModel[1].setRotationPoint(0F, 0F, 0);

		gunModel[2].addBox(-1F, 11F, -1F, 2, 1, 7, 0F); // Gun
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addBox(-1F, 9F, 6F, 2, 1, 2, 0F); // Gun
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(-1F, 10F, 7F, 2, 1, 5, 0F); // Gun
		gunModel[4].setRotationPoint(0F, 0F, 0F);
		gunModel[4].rotateAngleX = 1.047198F;

		gunModel[5].addBox(-2F, 7F, -10F, 4, 3, 9, 0F); // Gun
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-1F, 10F, -9F, 2, 1, 9, 0F); // Gun
		gunModel[6].setRotationPoint(0F, 0F, 0F);
		gunModel[6].rotateAngleX = -0.122173F;

		gunModel[7].addBox(-1F, 7F, -19F, 2, 3, 9, 0F); // Gun
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(-1F, 7F, -24F, 2, 2, 5, 0F); // Gun
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(-0.5F, 7F, -23F, 1, 1, 5, 0F); // Gun
		gunModel[9].setRotationPoint(0F, 0F, 0F);
		gunModel[9].rotateAngleX = 0.2094395F;

		gunModel[10].addBox(-0.5F, 7.5F, -26F, 1, 1, 17, 0F); // Gun
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(-0.5F, 7.5F, -26F, 1, 1, 2, 0F); // Gun
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(-1.5F, 7.5F, -28F, 3, 1, 2, 0F); // Gun
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(-0.5F, 12F, -1F, 1, 1, 1, 0F); // Gun
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addBox(-0.5F, 12F, 4F, 1, 1, 1, 0F); // Gun
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addBox(-0.5F, 13F, -2F, 1, 1, 8, 0F); // Gun
		gunModel[15].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[1];

		ammoModel[0] = new ModelRendererTurbo(this,  22,  0, textureX, textureY); // Ammo

		ammoModel[0].addBox(2F, 7.5F, -2F, 4, 2, 5, 0F); // Ammo
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
	}
}