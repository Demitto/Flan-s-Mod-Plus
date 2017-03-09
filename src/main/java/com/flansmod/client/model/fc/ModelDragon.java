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

public class ModelDragon extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelDragon()	
	{


// Gun
		gunModel = new ModelRendererTurbo[22];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  13, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Body4
		gunModel[3] = new ModelRendererTurbo(this,  0,  60, textureX, textureY); // Body3
		gunModel[4] = new ModelRendererTurbo(this,  0,  70, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  85, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  110, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  130, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  140, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  190, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body22

		gunModel[0].addBox(0F, 0F, 0F, 2, 3, 4, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 1F, -2F);

		gunModel[1].addBox(-7F, -4F, 0F, 7, 4, 4, 0F); // Body2
		gunModel[1].setRotationPoint(0F, 0F, -2F);

		gunModel[2].addBox(0F, -4F, 0F, 10, 5, 4, 0F); // Body4
		gunModel[2].setRotationPoint(0F, 0F, -2F);

		gunModel[3].addBox(4.5F, 1F, 0F, 5, 1, 4, 0F); // Body3
		gunModel[3].setRotationPoint(0F, 0F, -2F);

		gunModel[4].addBox(0F, -4F, 0F, 3, 7, 4, 0F); // Body5
		gunModel[4].setRotationPoint(10F, 0F, -2F);

		gunModel[5].addBox(0F, -4F, 0F, 1, 7, 4, 0F); // Body6
		gunModel[5].setRotationPoint(13F, 0F, -2F);

		gunModel[6].addBox(0F, -4F, 0F, 6, 1, 4, 0F); // Body7
		gunModel[6].setRotationPoint(14F, 0F, -2F);

		gunModel[7].addBox(0F, 2F, 0F, 6, 1, 4, 0F); // Body8
		gunModel[7].setRotationPoint(14F, 0F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[8].setRotationPoint(14F, 0F, -2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[9].setRotationPoint(14F, 0F, 1F);

		gunModel[10].addShapeBox(0F, -3F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); //Test
		gunModel[10].setRotationPoint(14F, 0F, 1F);

		gunModel[11].addShapeBox(0F, -3F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); //Test
		gunModel[11].setRotationPoint(14F, 0F, -2F);

		gunModel[12].addShapeBox(0F, -4F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test
		gunModel[12].setRotationPoint(0F, 2F, 2F);

		gunModel[13].addBox(0F, -7F, 0F, 7, 3, 1, 0F); // Body14
		gunModel[13].setRotationPoint(0F, 0F, -0.5F);

		gunModel[14].addBox(0F, -7F, 0F, 9, 2, 2, 0F); // Body15
		gunModel[14].setRotationPoint(0F, -2F, -1F);

		gunModel[15].addBox(0F, -7F, 0F, 4, 1, 1, 0F); // Body16
		gunModel[15].setRotationPoint(-4F, 0F, -0.5F);

		gunModel[16].addShapeBox(0F, -7F, 0F, 3, 1, 1, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F); //Test
		gunModel[16].setRotationPoint(-7F, 0F, -0.5F);

		gunModel[17].addShapeBox(0F, -4F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[17].setRotationPoint(14F, -2F, -2F);

		gunModel[18].addShapeBox(0F, -4F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[18].setRotationPoint(14F, -2F, 2F);

		gunModel[19].addShapeBox(0F, -4F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[19].setRotationPoint(14F, 7F, 2F);

		gunModel[20].addShapeBox(0F, -4F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[20].setRotationPoint(14F, 7F, -2F);

		gunModel[21].addBox(0F, -3F, 0F, 6, 3, 1, 0F); // Body22
		gunModel[21].setRotationPoint(0F, 0F, -2.5F);



// Ammo
		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  38, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  0,  49, textureX, textureY); // Ammo2
		ammoModel[2] = new ModelRendererTurbo(this,  0,  55, textureX, textureY); // Ammo3
		ammoModel[3] = new ModelRendererTurbo(this,  0,  55, textureX, textureY); // Ammo4

		ammoModel[0].addBox(4F, -4F, 0F, 6, 4, 3, 0F); // Ammo1
		ammoModel[0].setRotationPoint(0F, 5F, -1.5F);

		ammoModel[1].addBox(4F, -4F, 0F, 4, 1, 1, 0F); // Ammo2
		ammoModel[1].setRotationPoint(1F, 10F, -0.5F);

		ammoModel[2].addBox(4F, -5F, 0F, 1, 1, 1, 0F); // Ammo3
		ammoModel[2].setRotationPoint(1F, 10F, -0.5F);

		ammoModel[3].addBox(7F, -5F, 0F, 1, 1, 1, 0F); // Ammo4
		ammoModel[3].setRotationPoint(1F, 10F, -0.5F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.BOTTOM_CLIP;

		flipAll();
	}
}