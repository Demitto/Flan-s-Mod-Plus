//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMechPAC1 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechPAC1()	
	{


// Gun
		gunModel = new ModelRendererTurbo[26];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  99, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  126, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  155, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  155, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  155, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  195, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  272, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  286, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body15
		gunModel[17] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body16
		gunModel[18] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // Body17
		gunModel[19] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Body18
		gunModel[20] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body19
		gunModel[21] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body20
		gunModel[22] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body21
		gunModel[23] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body22
		gunModel[24] = new ModelRendererTurbo(this,  100,  420, textureX, textureY); // Body23
		gunModel[25] = new ModelRendererTurbo(this,  0,  475, textureX, textureY); // Body24

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(19F, -2F, -12F, 29, 13, 24, 0F); // Body2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(19F, -14F, -6F, 8, 12, 12, 0F, 0F, 2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F); //Test
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addBox(27F, -14F, -6F, 60, 12, 12, 0F); // Body4
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(28F, -13F, -12F, 4, 11, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(36F, -13F, -12F, 4, 11, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(44F, -13F, -12F, 4, 11, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addBox(48F, -16F, -8F, 18, 16, 16, 0F); // Body8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(48F, 0F, -8F, 18, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(48F, 0F, 2F, 18, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addBox(66F, -12F, -7F, 21, 8, 1, 0F); // Body11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(66F, -12F, 6F, 21, 8, 1, 0F); // Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(66F, -15F, -4F, 21, 1, 8, 0F); // Body13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(66F, -2F, -4F, 21, 1, 8, 0F); // Body14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(27F, -22F, -2F, 6, 8, 4, 0F, -6F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addBox(33F, -22F, -2F, 22, 4, 4, 0F); // Body16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(55F, -22F, -2F, 11, 6, 4, 0F, 0F, -4F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, -4F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); //Test
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(19F, 11F, -12F, 29, 7, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F); //Test
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(19F, 18F, -3F, 29, 14, 6, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, 0F, -6F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, -6F, 0F); //Test
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addBox(-29F, 26F, -3F, 48, 6, 6, 0F); // Body18
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(6F, 18F, -3F, 10, 8, 6, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(-6F, 18F, -3F, 10, 8, 6, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(-18F, 18F, -3F, 10, 8, 6, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(-45F, -14F, -10F, 16, 30, 20, 0F); // Body22
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(-51F, -14F, -10F, 6, 30, 20, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F); //Test
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(-45F, 16F, -3F, 16, 16, 6, 0F, -6F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -6F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F); //Test
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}