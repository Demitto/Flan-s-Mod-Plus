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

public class ModelMechCannon extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechCannon()	
	{


// Gun
		gunModel = new ModelRendererTurbo[38];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  125, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  125, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  148, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  148, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  168, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  207, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  235, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  235, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  269, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  306, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  367, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  450, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  36,  470, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  0,  496, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body25
		gunModel[25] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body26
		gunModel[26] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body27
		gunModel[27] = new ModelRendererTurbo(this,  135,  41, textureX, textureY); // Body28
		gunModel[28] = new ModelRendererTurbo(this,  135,  77, textureX, textureY); // Body29
		gunModel[29] = new ModelRendererTurbo(this,  135,  122, textureX, textureY); // Body30
		gunModel[30] = new ModelRendererTurbo(this,  135,  141, textureX, textureY); // Body31
		gunModel[31] = new ModelRendererTurbo(this,  135,  165, textureX, textureY); // Body32
		gunModel[32] = new ModelRendererTurbo(this,  135,  186, textureX, textureY); // Body33
		gunModel[33] = new ModelRendererTurbo(this,  135,  206, textureX, textureY); // Body34
		gunModel[34] = new ModelRendererTurbo(this,  135,  227, textureX, textureY); // Body35
		gunModel[35] = new ModelRendererTurbo(this,  135,  274, textureX, textureY); // Body36
		gunModel[36] = new ModelRendererTurbo(this,  135,  300, textureX, textureY); // Body37
		gunModel[37] = new ModelRendererTurbo(this,  135,  350, textureX, textureY); // Body38

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(19F, 0F, -12F, 41, 32, 24, 0F); // Body2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(14F, 16F, -12F, 5, 16, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); //Test
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(14F, 16F, 7F, 5, 16, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F); //Test
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(-22F, 16F, -11F, 36, 10, 4, 0F); // Body5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(-22F, 16F, 7F, 36, 10, 4, 0F); // Body6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-22F, 16F, -4F, 30, 25, 8, 0F); // Body7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(-22F, 41F, -4F, 30, 15, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 5F, -4F, 0F, 5F, -4F, 0F, -6F, 0F, 0F); //Test
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(-17F, 16F, -5F, 8, 20, 10, 0F); // Body9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(-4F, 16F, -5F, 8, 20, 10, 0F); // Body10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-38F, 16F, -11F, 16, 10, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); //Test
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(-38F, -16F, -11F, 14, 32, 22, 0F); // Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(-52F, -15F, -8F, 14, 16, 16, 0F); // Body13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(-40F, 1F, -8F, 2, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-44F, 1F, -8F, 2, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-48F, 1F, -8F, 2, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-52F, 1F, -8F, 2, 8, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addBox(-51F, 1F, -4F, 11, 4, 8, 0F); // Body18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(-56F, 6F, -4F, 6, 8, 8, 0F); // Body19
		gunModel[18].setRotationPoint(0F, 0F, 0F);
		gunModel[18].rotateAngleZ = -0.418879F;

		gunModel[19].addShapeBox(-59F, 4F, -6F, 3, 12, 12, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); //Test
		gunModel[19].setRotationPoint(0F, 0F, 0F);
		gunModel[19].rotateAngleZ = -0.418879F;

		gunModel[20].addBox(-70F, 4F, -6F, 11, 12, 12, 0F); // Body21
		gunModel[20].setRotationPoint(0F, 0F, 0F);
		gunModel[20].rotateAngleZ = -0.418879F;

		gunModel[21].addShapeBox(-73F, 4F, -6F, 3, 12, 12, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F); //Test
		gunModel[21].setRotationPoint(0F, 0F, 0F);
		gunModel[21].rotateAngleZ = -0.418879F;

		gunModel[22].addBox(-53F, -17F, -2F, 29, 2, 4, 0F); // Body23
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addShapeBox(19F, -16F, -12F, 4, 16, 24, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(27F, -16F, -12F, 4, 16, 24, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(35F, -16F, -12F, 4, 16, 24, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(43F, -16F, -12F, 4, 16, 24, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addBox(23F, -10F, -5F, 28, 10, 10, 0F); // Body28
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(51F, -16F, -12F, 9, 16, 24, 0F, 0F, 0F, -8F, 0F, -7F, -7F, 0F, -7F, -7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); //Test
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addBox(60F, -8F, -4F, 125, 8, 8, 0F); // Body30
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(185F, -9F, -5F, 4, 10, 10, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); //Test
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(189F, -9F, -5F, 16, 10, 10, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F); //Test
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addBox(60F, 15F, -4F, 75, 8, 8, 0F); // Body33
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addBox(135F, 14.5F, -4.5F, 25, 9, 9, 0F); // Body34
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(60F, 0F, -5F, 11, 32, 10, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F); //Test
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addBox(60F, -9F, -5.5F, 40, 10, 11, 0F); // Body36
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(75F, -19F, -3F, 20, 10, 6, 0F, -2F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(71, 0F, -5F, 28, 31, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F); //Test
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}