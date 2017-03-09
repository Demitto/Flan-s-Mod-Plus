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

public class ModelLRW extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelLRW()	
	{


// Gun
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  33, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  54, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  79, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  130, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  290, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body25
		gunModel[25] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body26
		gunModel[26] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Body27
		gunModel[27] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Body28
		gunModel[28] = new ModelRendererTurbo(this,  100,  32, textureX, textureY); // Body29
		gunModel[29] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Body30
		gunModel[30] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Body31
		gunModel[31] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Body32
		gunModel[32] = new ModelRendererTurbo(this,  100,  128, textureX, textureY); // Body33
		gunModel[33] = new ModelRendererTurbo(this,  100,  178, textureX, textureY); // Body34

		gunModel[0].addBox(0F, 0F, -4F, 10, 12, 8, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 12F, -4F, 8, 4, 8, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(0F, -15F, -4F, 51, 15, 8, 0F); // Body3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-10F, -15F, -4F, 10, 15, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); //Test
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(10F, 4F, -3F, 6, 2, 6, 0F); // Body5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addBox(16F, 0F, -3F, 2, 6, 6, 0F); // Body6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(-1F, -17F, -5F, 50, 11, 10, 0F); // Body7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addBox(24F, -7F, -3F, 18, 15, 6, 0F); // Body8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(25F, -7F, -3.5F, 3, 12, 7, 0F); // Body9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addBox(38F, -7F, -3.5F, 3, 12, 7, 0F); // Body10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addBox(34F, -7F, -3.5F, 3, 12, 7, 0F); // Body11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(29F, -7F, -3.5F, 3, 12, 7, 0F); // Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(20F, -7F, -2.5F, 26, 14, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); //Test
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(9F, -16F, -3.5F, 70, 11, 7, 0F); // Body14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(52F, -16F, -4.5F, 33, 10, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(52F, -5F, -4F, 25, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addBox(31F, -14F, -4.5F, 10, 11, 9, 0F); // Body17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addBox(10F, -14F, -4.5F, 10, 11, 9, 0F); // Body18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(52F, -19F, -4.5F, 27, 3, 9, 0F, -2F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(77F, -5F, -4F, 2, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F); //Test
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addBox(85F, -13F, -3F, 44, 2, 6, 0F); // Body21
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(85F, -15F, -3F, 44, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(85F, -11F, -3F, 44, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(97F, -13.5F, -4.5F, 8, 3, 9, 0F); // Body24
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(97F, -16.5F, -4.5F, 8, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(97F, -10.5F, -4.5F, 8, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(7F, -20F, -4F, 33, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); //Test
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addBox(7F, -28F, -5.5F, 33, 8, 11, 0F); // Body28
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(7F, -31F, -5.5F, 33, 3, 11, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(3F, -23F, -4.5F, 46, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addBox(3F, -26F, -4.5F, 46, 3, 9, 0F); // Body31
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(3F, -29F, -4.5F, 46, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(-53F, -16F, -3.5F, 52, 9, 7, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-53F, -7F, -3.5F, 53, 20, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -40F, 0F, -2F, -40F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[33].setRotationPoint(0F, 0F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  100,  220, textureX, textureY); // Ammo1

		ammoModel[0].addBox(25F, 1.48F, -2.5F, 15, 5, 5, 0F); // Ammo1
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.PISTOL_CLIP;

		flipAll();
	}
}