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

public class ModelMechAIC extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelMechAIC()	
	{


// Gun
		gunModel = new ModelRendererTurbo[60];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  61, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  95, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  111, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  0,  257, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  0,  265, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // Body25
		gunModel[25] = new ModelRendererTurbo(this,  0,  295, textureX, textureY); // Body26
		gunModel[26] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body27
		gunModel[27] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body28
		gunModel[28] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body29
		gunModel[29] = new ModelRendererTurbo(this,  0,  61, textureX, textureY); // Body30
		gunModel[30] = new ModelRendererTurbo(this,  0,  95, textureX, textureY); // Body31
		gunModel[31] = new ModelRendererTurbo(this,  0,  111, textureX, textureY); // Body32
		gunModel[32] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // Body33
		gunModel[33] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body34
		gunModel[34] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body35
		gunModel[35] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body36
		gunModel[36] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body37
		gunModel[37] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body38
		gunModel[38] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Body39
		gunModel[39] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body40
		gunModel[40] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body41
		gunModel[41] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body42
		gunModel[42] = new ModelRendererTurbo(this,  0,  220, textureX, textureY); // Body43
		gunModel[43] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body44
		gunModel[44] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body45
		gunModel[45] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body46
		gunModel[46] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body47
		gunModel[47] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body48
		gunModel[48] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body49
		gunModel[49] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body50
		gunModel[50] = new ModelRendererTurbo(this,  0,  257, textureX, textureY); // Body51
		gunModel[51] = new ModelRendererTurbo(this,  0,  265, textureX, textureY); // Body52
		gunModel[52] = new ModelRendererTurbo(this,  0,  280, textureX, textureY); // Body53
		gunModel[53] = new ModelRendererTurbo(this,  0,  295, textureX, textureY); // Body54
		gunModel[54] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body55
		gunModel[55] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body56
		gunModel[56] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // Body57
		gunModel[57] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body58
		gunModel[58] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body59
		gunModel[59] = new ModelRendererTurbo(this,  135,  0, textureX, textureY); // Body60

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(-22F, -28F, -11F, 20, 10, 22, 0F); // Body2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-32F, -28F, -5F, 10, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 6F, 0F, 5F, 6F, 0F, 0F, 0F); //Test
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-2F, -28F, -9F, 15, 10, 18, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 2F); //Test
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(-19F, -38F, -7F, 40, 14, 14, 0F); // Body5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(-17F, -34F, -9F, 4, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(-9F, -34F, -9F, 4, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(-1F, -34F, -9F, 4, 6, 18, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(21F, -33F, -6F, 11, 4, 12, 0F); // Body9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(21F, -37F, -6F, 11, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(21F, -29F, -6F, 11, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addBox(32F, -32.5F, -5.5F, 6, 3, 3, 0F); // Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(32F, -32.5F, 2.5F, 6, 3, 3, 0F); // Body13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(32F, -36.5F, -1.5F, 6, 3, 3, 0F); // Body14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addBox(32F, -28.5F, -1.5F, 6, 3, 3, 0F); // Body15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addBox(42F, -33F, -6F, 3, 4, 12, 0F); // Body16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(42F, -37F, -6F, 3, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(42F, -29F, -6F, 3, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(38F, -36F, -1F, 4, 2, 2, 0F); // Body19
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addBox(38F, -28F, -1F, 4, 2, 2, 0F); // Body20
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addBox(38F, -32F, 3F, 4, 2, 2, 0F); // Body21
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addBox(38F, -32F, -5F, 4, 2, 2, 0F); // Body22
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addBox(45F, -28.5F, -1.5F, 32, 3, 3, 0F); // Body23
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(77F, -29F, -2F, 6, 4, 4, 0F); // Body24
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(-3F, -45F, -2F, 46, 7, 4, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(43F, -45F, -2F, 13, 11, 4, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(37F, -25F, -2F, 8, 4, 4, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(45F, -25F, -2F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(-32F, -38F, -5F, 13, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); //Test
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addBox(-22F, 18F, -11F, 20, 10, 22, 0F); // Body30
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(-32F, 23F, -5F, 10, 5, 10, 0F, 0F, 0F, 0F, 0F, 5F, 6F, 0F, 5F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); //Test
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(-2F, 18F, -9F, 15, 10, 18, 0F, 0F, 0F, 2F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); //Test
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addBox(-19F, 24F, -7F, 40, 14, 14, 0F); // Body33
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-17F, 28F, -9F, 4, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(-9F, 28F, -9F, 4, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(-1F, 28F, -9F, 4, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addBox(21F, 29F, -6F, 11, 4, 12, 0F); // Body37
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(21F, 25F, -6F, 11, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(21F, 33F, -6F, 11, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addBox(32F, 29.5F, -5.5F, 6, 3, 3, 0F); // Body40
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addBox(32F, 29.5F, 2.5F, 6, 3, 3, 0F); // Body41
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addBox(32F, 25.5F, -1.5F, 6, 3, 3, 0F); // Body42
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addBox(32F, 33.5F, -1.5F, 6, 3, 3, 0F); // Body43
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addBox(42F, 29F, -6F, 3, 4, 12, 0F); // Body44
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(42F, 25F, -6F, 3, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(42F, 33F, -6F, 3, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addBox(38F, 26F, 0F, 4, 2, 2, 0F); // Body47
		gunModel[46].setRotationPoint(0F, 0F, -1F);

		gunModel[47].addBox(38F, 34F, 0F, 4, 2, 2, 0F); // Body48
		gunModel[47].setRotationPoint(0F, 0F, -1F);

		gunModel[48].addBox(38F, 30F, 4F, 4, 2, 2, 0F); // Body49
		gunModel[48].setRotationPoint(0F, 0F, -1F);

		gunModel[49].addBox(38F, 30F, -4F, 4, 2, 2, 0F); // Body50
		gunModel[49].setRotationPoint(0F, 0F, -1F);

		gunModel[50].addBox(45F, 25.5F, -1.5F, 32, 3, 3, 0F); // Body51
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addBox(77F, 25F, -2F, 6, 4, 4, 0F); // Body52
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(-3F, 38F, -2F, 46, 7, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F); //Test
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(43F, 34F, -2F, 13, 11, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(37F, 21F, -2F, 8, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); //Test
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(45F, 21F, -2F, 8, 4, 4, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(-32F, 28F, -5F, 13, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); //Test
		gunModel[56].setRotationPoint(0F, 0F, 0F);

		gunModel[57].addBox(19F, -16F, -4F, 8, 32, 8, 0F); // Body58
		gunModel[57].setRotationPoint(0F, 0F, 0F);

		gunModel[58].addShapeBox(19F, -16F, 4F, 8, 32, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[58].setRotationPoint(0F, 0F, 0F);

		gunModel[59].addShapeBox(19F, -16F, -12F, 8, 32, 8, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[59].setRotationPoint(0F, 0F, 0F);

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}