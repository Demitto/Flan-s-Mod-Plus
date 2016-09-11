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

public class ModelHB7 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelHB7()	
	{


// Gun
		gunModel = new ModelRendererTurbo[40];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this,  0,  42, textureX, textureY); // Gun2
		gunModel[2] = new ModelRendererTurbo(this,  0,  65, textureX, textureY); // Gun3
		gunModel[3] = new ModelRendererTurbo(this,  0,  80, textureX, textureY); // Gun4
		gunModel[4] = new ModelRendererTurbo(this,  0,  100, textureX, textureY); // Gun5
		gunModel[5] = new ModelRendererTurbo(this,  0,  120, textureX, textureY); // Gun6
		gunModel[6] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // Gun7
		gunModel[7] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Gun8
		gunModel[8] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Gun9
		gunModel[9] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Gun10
		gunModel[10] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Gun12
		gunModel[11] = new ModelRendererTurbo(this,  0,  279, textureX, textureY); // Gun13
		gunModel[12] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Gun14
		gunModel[13] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Gun15
		gunModel[14] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Gun16
		gunModel[15] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Gun17
		gunModel[16] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Gun18
		gunModel[17] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Gun19
		gunModel[18] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Gun20
		gunModel[19] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Gun21
		gunModel[20] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Gun22
		gunModel[21] = new ModelRendererTurbo(this,  0,  380, textureX, textureY); // Gun23
		gunModel[22] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Gun24
		gunModel[23] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun25
		gunModel[24] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun26
		gunModel[25] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun27
		gunModel[26] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun28
		gunModel[27] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun29
		gunModel[28] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun30
		gunModel[29] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun31
		gunModel[30] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Gun31
		gunModel[31] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Gun32
		gunModel[32] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun33
		gunModel[33] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun34
		gunModel[34] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun35
		gunModel[35] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun36
		gunModel[36] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun37
		gunModel[37] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Gun38
		gunModel[38] = new ModelRendererTurbo(this,  100,  20, textureX, textureY); // Gun38.mirror
		gunModel[39] = new ModelRendererTurbo(this,  100,  60, textureX, textureY); // Gun40

		gunModel[0].addShapeBox(0F, 0F, -4F, 13, 10, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(3F, 10F, -4F, 10, 12, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 9F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(13F, 0F, -2F, 6, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(13F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(0F, 22F, -4F, 35, 4, 8, 0F); // Gun5
		gunModel[4].setRotationPoint(-6F, 0F, 0F);

		gunModel[5].addBox(0F, -12F, -4.5F, 35, 12, 9, 0F); // Gun6
		gunModel[5].setRotationPoint(-6F, 0F, 0F);

		gunModel[6].addBox(0F, -15F, -4.5F, 20, 15, 9, 0F); // Gun7
		gunModel[6].setRotationPoint(29F, 0F, 0F);

		gunModel[7].addShapeBox(0F, 0F, -4F, 27, 26, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[7].setRotationPoint(29F, 0F, 0F);

		gunModel[8].addBox(0F, -13F, -2.5F, 9, 11, 5, 0F); // Gun9
		gunModel[8].setRotationPoint(49F, 0F, 0F);

		gunModel[9].addBox(0F, -15F, -4.5F, 9, 2, 2, 0F); // Gun10
		gunModel[9].setRotationPoint(49F, 0F, 0F);

		gunModel[10].addBox(0F, -15F, 2.5F, 9, 2, 2, 0F); // Gun12
		gunModel[10].setRotationPoint(49F, 0F, 0F);

		gunModel[11].addBox(0F, -2F, -4.5F, 9, 2, 9, 0F); // Gun13
		gunModel[11].setRotationPoint(49F, 0F, 0F);

		gunModel[12].addBox(0F, -15F, -4.5F, 2, 2, 9, 0F); // Gun14
		gunModel[12].setRotationPoint(58F, 0F, 0F);

		gunModel[13].addBox(0F, -2F, -4.5F, 2, 2, 9, 0F); // Gun15
		gunModel[13].setRotationPoint(58F, 0F, 0F);

		gunModel[14].addBox(0F, -13F, -4.5F, 2, 11, 2, 0F); // Gun16
		gunModel[14].setRotationPoint(58F, 0F, 0F);

		gunModel[15].addBox(0F, -13F, 2.5F, 2, 11, 2, 0F); // Gun17
		gunModel[15].setRotationPoint(58F, 0F, 0F);

		gunModel[16].addShapeBox(0F, -12F, -1.5F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[16].setRotationPoint(58F, 0F, 0F);

		gunModel[17].addBox(0F, -11F, -1.5F, 1, 1, 3, 0F); // Gun19
		gunModel[17].setRotationPoint(58F, 0F, 0F);

		gunModel[18].addShapeBox(0F, -10F, -1.5F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[18].setRotationPoint(58F, 0F, 0F);

		gunModel[19].addBox(0F, -6F, -2.5F, 1, 1, 5, 0F); // Gun21
		gunModel[19].setRotationPoint(58F, 0F, 0F);

		gunModel[20].addBox(0F, -5F, -1.5F, 1, 3, 1, 0F); // Gun22
		gunModel[20].setRotationPoint(58F, 0F, 0F);

		gunModel[21].addBox(0F, -5F, 0.5F, 1, 3, 1, 0F); // Gun23
		gunModel[21].setRotationPoint(58F, 0F, 0F);

		gunModel[22].addBox(-25.5F, -10F, -5.5F, 16, 5, 11, 0F); // Gun24
		gunModel[22].setRotationPoint(58F, 0F, 0F);

		gunModel[23].addBox(-25F, -9F, -6.5F, 1, 3, 13, 0F); // Gun25
		gunModel[23].setRotationPoint(58F, 0F, 0F);

		gunModel[24].addBox(-23F, -9F, -6.5F, 1, 3, 13, 0F); // Gun26
		gunModel[24].setRotationPoint(58F, 0F, 0F);

		gunModel[25].addBox(-21F, -9F, -6.5F, 1, 3, 13, 0F); // Gun27
		gunModel[25].setRotationPoint(58F, 0F, 0F);

		gunModel[26].addBox(-19F, -9F, -6.5F, 1, 3, 13, 0F); // Gun28
		gunModel[26].setRotationPoint(58F, 0F, 0F);

		gunModel[27].addBox(-17F, -9F, -6.5F, 1, 3, 13, 0F); // Gun29
		gunModel[27].setRotationPoint(58F, 0F, 0F);

		gunModel[28].addBox(-15F, -9F, -6.5F, 1, 3, 13, 0F); // Gun30
		gunModel[28].setRotationPoint(58F, 0F, 0F);

		gunModel[29].addBox(-13F, -9F, -6.5F, 1, 3, 13, 0F); // Gun31
		gunModel[29].setRotationPoint(58F, 0F, 0F);

		gunModel[30].addBox(-11F, -9F, -6.5F, 1, 3, 13, 0F); // Gun31
		gunModel[30].setRotationPoint(58F, 0F, 0F);

		gunModel[31].addShapeBox(-4F, -15F, -4.5F, 4, 3, 9, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[31].setRotationPoint(29F, 0F, 0F);

		gunModel[32].addShapeBox(0F, 1F, -3F, 23, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[32].setRotationPoint(34F, 0F, 0F);

		gunModel[33].addBox(0F, 3F, -3F, 23, 2, 6, 0F); // Gun34
		gunModel[33].setRotationPoint(34F, 0F, 0F);

		gunModel[34].addShapeBox(0F, 5F, -3F, 23, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[34].setRotationPoint(34F, 0F, 0F);

		gunModel[35].addShapeBox(0F, 8F, -3F, 23, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[35].setRotationPoint(34F, 0F, 0F);

		gunModel[36].addBox(0F, 10F, -3F, 23, 2, 6, 0F); // Gun37
		gunModel[36].setRotationPoint(34F, 0F, 0F);

		gunModel[37].addShapeBox(0F, 12F, -3F, 23, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[37].setRotationPoint(34F, 0F, 0F);

		gunModel[38].addBox(2F, -10F, -5F, 9, 7, 10, 0F); // Gun39
		gunModel[38].setRotationPoint(-6F, 0F, 0F);

		gunModel[39].addBox(19F, -10F, -5F, 9, 7, 10, 0F); // Gun40
		gunModel[39].setRotationPoint(-6F, 0F, 0F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[4];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  480, textureX, textureY); // Sight1
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Sight2
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Sight3
		defaultScopeModel[3] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // Sight4

		defaultScopeModel[0].addShapeBox(11F, -15F, -3.5F, 15, 3, 7, 0F, -2F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[0].setRotationPoint(-6F, 0F, 0F);

		defaultScopeModel[1].addShapeBox(13F, -18F, -2.5F, 5, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[1].setRotationPoint(-6F, 0F, 0F);

		defaultScopeModel[2].addShapeBox(13F, -18F, 1.5F, 5, 3, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[2].setRotationPoint(-6F, 0F, 0F);

		defaultScopeModel[3].addShapeBox(13F, -17F, -0.5F, 5, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[3].setRotationPoint(31F, 0F, 0F);



// Ammo
		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Ammo1
		ammoModel[1] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Ammo2
		ammoModel[2] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Ammo3

		ammoModel[0].addShapeBox(0F, 15F, -3F, 23, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		ammoModel[0].setRotationPoint(34F, 0F, 0F);

		ammoModel[1].addBox(0F, 17F, -3F, 23, 2, 6, 0F); // Ammo2
		ammoModel[1].setRotationPoint(34F, 0F, 0F);

		ammoModel[2].addShapeBox(0F, 19F, -3F, 23, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		ammoModel[2].setRotationPoint(34F, 0F, 0F);

		stockAttachPoint = new Vector3f(0F / 16F, 6F / 16F, 0F / 16F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.END_LOADED;

		flipAll();
		translateAll (0F, 12F,0F);
	}
}