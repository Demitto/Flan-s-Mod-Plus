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

public class ModelAB24 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB24()	
	{


// Gun
		gunModel = new ModelRendererTurbo[56];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  30, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  30, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  40, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  46, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  57, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  66, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  22, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  81, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  104, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  131, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  20,  170, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  20,  170, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  190, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body25
		gunModel[25] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Body26
		gunModel[26] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body27
		gunModel[27] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body28
		gunModel[28] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body29
		gunModel[29] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body30
		gunModel[30] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body31
		gunModel[31] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Body32
		gunModel[32] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Body33
		gunModel[33] = new ModelRendererTurbo(this,  0,  260, textureX, textureY); // Body34
		gunModel[34] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // Body35
		gunModel[35] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // Body36
		gunModel[36] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // Body37
		gunModel[37] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // Body38
		gunModel[38] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // Body39
		gunModel[39] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // Body40
		gunModel[40] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // Body41
		gunModel[41] = new ModelRendererTurbo(this,  0,  275, textureX, textureY); // Body42
		gunModel[42] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body43
		gunModel[43] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body44
		gunModel[44] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body45
		gunModel[45] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body46
		gunModel[46] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body47
		gunModel[47] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body48
		gunModel[48] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // Body49
		gunModel[49] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body50
		gunModel[50] = new ModelRendererTurbo(this,  0,  240, textureX, textureY); // Body51
		gunModel[51] = new ModelRendererTurbo(this,  0,  355, textureX, textureY); // Grip1
		gunModel[52] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Grip2
		gunModel[53] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Grip3
		gunModel[54] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Grip4
		gunModel[55] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Grip5

		gunModel[0].addBox(0F, 0F, -3F, 8, 12, 6, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addBox(1F, 0F, -4F, 6, 7, 1, 0F); // Body2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addBox(1F, 0F, 3F, 6, 7, 1, 0F); // Body3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(1F, 7F, -4F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(1F, 7F, 3F, 6, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); //Test
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(0F, 12F, -3F, 8, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); //Test
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addBox(8F, 6F, -2F, 8, 2, 4, 0F); // Body7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addBox(16F, 0F, -2F, 2, 8, 4, 0F); // Body8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addBox(8F, 0F, -1F, 5, 4, 2, 0F); // Body9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(0F, -11F, -4F, 6, 12, 8, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addBox(6F, -11F, -4F, 29, 11, 8, 0F); // Body11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(18F, 0F, -3F, 17, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); //Test
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addBox(19F, -4F, -4.5F, 13, 8, 9, 0F); // Body13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(21F, 8F, -2F, 1, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); //Test
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addBox(22F, 8F, -2F, 2, 4, 4, 0F); // Body15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(24F, 8F, -2F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(27F, 8F, -2F, 1, 4, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); //Test
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addBox(28F, 8F, -2F, 2, 4, 4, 0F); // Body18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(30F, 8F, -2F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(6F, -14F, -4F, 29, 3, 8, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(35F, -14F, -4F, 22, 4, 8, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(35F, -4F, -4F, 22, 4, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addBox(35F, -10F, -4F, 4, 6, 1, 0F); // Body23
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(43F, -10F, -4F, 2, 6, 1, 0F); // Body24
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addBox(49F, -10F, -4F, 2, 6, 1, 0F); // Body25
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addBox(35F, -10F, 3F, 4, 6, 1, 0F); // Body26
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addBox(43F, -10F, 3F, 2, 6, 1, 0F); // Body27
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addBox(49F, -10F, 3F, 2, 6, 1, 0F); // Body28
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addBox(35F, -8F, -3F, 35, 2, 6, 0F); // Body29
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(35F, -10F, -3F, 35, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(35F, -6F, -3F, 35, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addBox(70F, -8.5F, -4.5F, 2, 3, 9, 0F); // Body32
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(70F, -11.5F, -4.5F, 2, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(70F, -5.5F, -4.5F, 2, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addBox(72F, -11.5F, -1.5F, 3, 1, 3, 0F); // Body35
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addBox(78F, -11.5F, -1.5F, 3, 1, 3, 0F); // Body36
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addBox(72F, -8.5F, 3.5F, 3, 3, 1, 0F); // Body37
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addBox(78F, -8.5F, 3.5F, 3, 3, 1, 0F); // Body38
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addBox(72F, -8.5F, -4.5F, 3, 3, 1, 0F); // Body39
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addBox(78F, -8.5F, -4.5F, 3, 3, 1, 0F); // Body40
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addBox(72F, -3.5F, -1.5F, 3, 1, 3, 0F); // Body41
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addBox(78F, -3.5F, -1.5F, 3, 1, 3, 0F); // Body42
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(72F, -11.5F, -4.5F, 9, 3, 3, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(72F, -11.5F, 1.5F, 9, 3, 3, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(72F, -5.5F, 1.5F, 9, 3, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(72F, -5.5F, -4.5F, 9, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F); //Test
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addBox(23F, -10F, -5F, 4, 5, 10, 0F); // Body47
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addBox(10F, -10F, -5F, 4, 5, 10, 0F); // Body48
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addBox(14F, -9F, -4.5F, 9, 3, 9, 0F); // Body49
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addBox(55F, -10F, -4F, 2, 6, 1, 0F); // Body50
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addBox(55F, -10F, 3F, 2, 6, 1, 0F); // Body51
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addBox(37F, 0F, -3F, 20, 3, 6, 0F); // Grip1
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(37F, 3F, -3F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(43F, 3F, -3F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(49F, 3F, -3F, 4, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(55F, 3F, -3F, 2, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		gunModel[55].setRotationPoint(0F, 0F, 0F);



// Default Scope
		defaultScopeModel = new ModelRendererTurbo[18];
		defaultScopeModel[0] = new ModelRendererTurbo(this,  0,  390, textureX, textureY); // Sight1
		defaultScopeModel[1] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Sight2
		defaultScopeModel[2] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Sight3
		defaultScopeModel[3] = new ModelRendererTurbo(this,  0,  410, textureX, textureY); // Sight4
		defaultScopeModel[4] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Sight5
		defaultScopeModel[5] = new ModelRendererTurbo(this,  0,  430, textureX, textureY); // Sight6
		defaultScopeModel[6] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Sight7
		defaultScopeModel[7] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Sight8
		defaultScopeModel[8] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight9
		defaultScopeModel[9] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight10
		defaultScopeModel[10] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight11
		defaultScopeModel[11] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight12
		defaultScopeModel[12] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight13
		defaultScopeModel[13] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight14
		defaultScopeModel[14] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight15
		defaultScopeModel[15] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight16
		defaultScopeModel[16] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight17
		defaultScopeModel[17] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // Sight18

		defaultScopeModel[0].addShapeBox(45F, -20F, -0.5F, 12, 6, 1, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[1].addBox(45.1F, -18F, -2.5F, 4, 1, 5, 0F); // Sight2
		defaultScopeModel[1].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[2].addBox(33F, -21F, 2F, 2, 10, 2, 0F); // Sight3
		defaultScopeModel[2].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[3].addBox(33F, -21F, -4F, 2, 10, 2, 0F); // Sight4
		defaultScopeModel[3].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[4].addBox(17F, -21F, -4F, 16, 2, 2, 0F); // Sight5
		defaultScopeModel[4].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[5].addBox(17F, -21F, 2F, 16, 2, 2, 0F); // Sight6
		defaultScopeModel[5].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[6].addShapeBox(7F, -21F, 2F, 10, 10, 2, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F); //Test
		defaultScopeModel[6].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[7].addShapeBox(7F, -21F, -4F, 10, 10, 2, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, -2F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2F, 0F, 0F); //Test
		defaultScopeModel[7].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[8].addBox(17F, -21.5F, 2F, 2, 1, 1, 0F); // Sight9
		defaultScopeModel[8].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[8].rotateAngleZ = 0.01745329F;

		defaultScopeModel[9].addBox(21F, -21.5F, 2F, 2, 1, 1, 0F); // Sight10
		defaultScopeModel[9].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[9].rotateAngleZ = 0.01745329F;

		defaultScopeModel[10].addBox(25F, -21.5F, 2F, 2, 1, 1, 0F); // Sight11
		defaultScopeModel[10].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[10].rotateAngleZ = 0.01745329F;

		defaultScopeModel[11].addBox(29F, -21.5F, 2F, 2, 1, 1, 0F); // Sight12
		defaultScopeModel[11].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[11].rotateAngleZ = 0.01745329F;

		defaultScopeModel[12].addBox(33F, -21.5F, 2F, 2, 1, 1, 0F); // Sight13
		defaultScopeModel[12].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[12].rotateAngleZ = 0.01745329F;

		defaultScopeModel[13].addBox(33F, -21.5F, -3F, 2, 1, 1, 0F); // Sight14
		defaultScopeModel[13].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[13].rotateAngleZ = 0.01745329F;

		defaultScopeModel[14].addBox(29F, -21.5F, -3F, 2, 1, 1, 0F); // Sight15
		defaultScopeModel[14].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[14].rotateAngleZ = 0.01745329F;

		defaultScopeModel[15].addBox(25F, -21.5F, -3F, 2, 1, 1, 0F); // Sight16
		defaultScopeModel[15].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[15].rotateAngleZ = 0.01745329F;

		defaultScopeModel[16].addBox(21F, -21.5F, -3F, 2, 1, 1, 0F); // Sight17
		defaultScopeModel[16].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[16].rotateAngleZ = 0.01745329F;

		defaultScopeModel[17].addBox(17F, -21.5F, -3F, 2, 1, 1, 0F); // Sight18
		defaultScopeModel[17].setRotationPoint(0F, 0F, 0F);
		defaultScopeModel[17].rotateAngleZ = 0.01745329F;



// Default Stock
		defaultStockModel = new ModelRendererTurbo[6];
		defaultStockModel[0] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Stock1
		defaultStockModel[1] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Stock2
		defaultStockModel[2] = new ModelRendererTurbo(this,  100,  100, textureX, textureY); // Stock3
		defaultStockModel[3] = new ModelRendererTurbo(this,  100,  0, textureX, textureY); // Stock4
		defaultStockModel[4] = new ModelRendererTurbo(this,  100,  30, textureX, textureY); // Stock5
		defaultStockModel[5] = new ModelRendererTurbo(this,  100,  50, textureX, textureY); // Stock6

		defaultStockModel[0].addShapeBox(-6F, -10.97333F, -3F, 11, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[1].addBox(-6F, -8.973333F, -3F, 11, 2, 6, 0F); // Stock2
		defaultStockModel[1].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[2].addShapeBox(-6F, -6.973333F, -3F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); //Test
		defaultStockModel[2].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[3].addBox(-30F, -10.97333F, -3F, 24, 8, 6, 0F); // Stock4
		defaultStockModel[3].setRotationPoint(0F, 0F, 0F);

				defaultStockModel[4].addShapeBox(-30F, -2.973333F, -3F, 24, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -20F, 0F, -2F, -20F, 0F, -2F, 0F, 0F, -2F); //Test
		defaultStockModel[4].setRotationPoint(0F, 0F, 0F);

		defaultStockModel[5].addShapeBox(-30F, -12.97333F, -3F, 24, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		defaultStockModel[5].setRotationPoint(0F, 0F, 0F);




// Ammo
		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this,  200,  81, textureX, textureY); // Ammo1

		ammoModel[0].addBox(11F, -11F, -2F, 8, 4, 4, 0F); // Ammo1
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		
		barrelAttachPoint = new Vector3f(81F / 16F, 7F / 16F, 0F / 16F);
		stockAttachPoint = new Vector3f(4F / 16F, 8F / 16F, 0F / 16F);
		scopeAttachPoint = new Vector3f(26F / 16F, 14F / 16F, 0F / 16F);
		gripAttachPoint = new Vector3f(47F / 16F, -6F / 16F, 0F / 16F);


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.RIFLE;
		
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;


		flipAll();
	}
}