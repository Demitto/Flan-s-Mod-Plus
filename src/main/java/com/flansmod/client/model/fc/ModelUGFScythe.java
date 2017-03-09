//This File was created with the Minecraft-SMP Modelling Toolbox
// Copyright (C) 2012 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 1.4.6

// Model Checklist
//    Model: 
//    - Hitbox              [ ]
//    - Check Left/Right    [ ]  Left = + / Right = -
//    - Code Cleaned        [ ]  
//    - Coverted to Version [1.4.6]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUGFScythe extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;
	
	
	boolean VarGear = true;
	boolean VarDoor = true;
	boolean VarWing = true;
	
	public ModelUGFScythe()	
	{


		bodyModel = new ModelRendererTurbo[50];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // back
		bodyModel[1] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // base
		bodyModel[2] = new ModelRendererTurbo(this,  0,  78, textureX, textureY); // seatbottom
		bodyModel[3] = new ModelRendererTurbo(this,  0,  105, textureX, textureY); // seatback
		bodyModel[4] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // headrest
		bodyModel[5] = new ModelRendererTurbo(this,  0,  157, textureX, textureY); // armrestright
		bodyModel[6] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // armrestleft
		bodyModel[7] = new ModelRendererTurbo(this,  0,  176, textureX, textureY); // Panelbottom
		bodyModel[8] = new ModelRendererTurbo(this,  0,  201, textureX, textureY); // Joystickthing
		bodyModel[9] = new ModelRendererTurbo(this,  0,  213, textureX, textureY); // Joystickbase
		bodyModel[10] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // support1
		bodyModel[11] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // support1
		bodyModel[12] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // support2
		bodyModel[13] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // support2
		bodyModel[14] = new ModelRendererTurbo(this,  18,  216, textureX, textureY); // moniterstand
		bodyModel[15] = new ModelRendererTurbo(this,  33,  216, textureX, textureY); // moniter
		bodyModel[16] = new ModelRendererTurbo(this,  0,  235, textureX, textureY); // Panelbottom
		bodyModel[17] = new ModelRendererTurbo(this,  0,  261, textureX, textureY); // Panelbottom
		bodyModel[18] = new ModelRendererTurbo(this,  110,  0, textureX, textureY); // canopyex
		bodyModel[19] = new ModelRendererTurbo(this,  115,  50, textureX, textureY); // canopyin
		bodyModel[20] = new ModelRendererTurbo(this,  0,  285, textureX, textureY); // cockpitcanopyfrontconnection
		bodyModel[21] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // cockpitcanopysideconnection
		bodyModel[22] = new ModelRendererTurbo(this,  0,  310, textureX, textureY); // cockpitcanopysideconnection
		bodyModel[23] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // cockpitsideconnaction
		bodyModel[24] = new ModelRendererTurbo(this,  0,  325, textureX, textureY); // cockpitsideconnaction
		bodyModel[25] = new ModelRendererTurbo(this,  0,  365, textureX, textureY); // cockpittopconnaction
		bodyModel[26] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // cockpittopconnaction
		bodyModel[27] = new ModelRendererTurbo(this,  0,  425, textureX, textureY); // cockpittopconnaction
		bodyModel[28] = new ModelRendererTurbo(this,  0,  445, textureX, textureY); // cockpittopconnaction
		bodyModel[29] = new ModelRendererTurbo(this,  0,  460, textureX, textureY); // cockpittopconnaction
		bodyModel[30] = new ModelRendererTurbo(this,  30,  461, textureX, textureY); // fuselage
		bodyModel[31] = new ModelRendererTurbo(this,  70,  120, textureX, textureY); // fuselage
		bodyModel[32] = new ModelRendererTurbo(this,  165,  120, textureX, textureY); // fuselage
		bodyModel[33] = new ModelRendererTurbo(this,  165,  120, textureX, textureY); // fuselage
		bodyModel[34] = new ModelRendererTurbo(this,  222,  120, textureX, textureY); // leftwingconnect
		bodyModel[35] = new ModelRendererTurbo(this,  222,  175, textureX, textureY); // leftwingconnect
		bodyModel[36] = new ModelRendererTurbo(this,  57,  254, textureX, textureY); // leftwing
		bodyModel[37] = new ModelRendererTurbo(this,  90,  300, textureX, textureY); // leftwingtip
		bodyModel[38] = new ModelRendererTurbo(this,  222,  220, textureX, textureY); // leftwingdet
		bodyModel[39] = new ModelRendererTurbo(this,  222,  220, textureX, textureY); // leftwingdet
		bodyModel[40] = new ModelRendererTurbo(this,  222,  120, textureX, textureY); // rightwingconnect
		bodyModel[41] = new ModelRendererTurbo(this,  222,  175, textureX, textureY); // rightwingconnect
		bodyModel[42] = new ModelRendererTurbo(this,  57,  254, textureX, textureY); // rightwing
		bodyModel[43] = new ModelRendererTurbo(this,  90,  300, textureX, textureY); // rightwingtip
		bodyModel[44] = new ModelRendererTurbo(this,  222,  220, textureX, textureY); // rightwingdet
		bodyModel[45] = new ModelRendererTurbo(this,  222,  220, textureX, textureY); // rightwingdet
		bodyModel[46] = new ModelRendererTurbo(this,  210,  300, textureX, textureY); // thrusterconnect
		bodyModel[47] = new ModelRendererTurbo(this,  40,  375, textureX, textureY); // thruster
		bodyModel[48] = new ModelRendererTurbo(this,  40,  375, textureX, textureY); // thruster
		bodyModel[49] = new ModelRendererTurbo(this,  244,  397, textureX, textureY); // thrusterdet
		





		bodyModel[0].addBox(0F, 0F, 0F, 16, 32, 16, 0F); // back
		bodyModel[0].setRotationPoint(0F, -29F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 40, 4, 16, 0F); // base
		bodyModel[1].setRotationPoint(-40F, -1F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // seatbottom
		bodyModel[2].setRotationPoint(-11F, -5F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 16, 10, 0F); // seatback
		bodyModel[3].setRotationPoint(-2F, -20F, -5F);
		bodyModel[3].rotateAngleZ = -0.1396263F;

		bodyModel[4].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // headrest
		bodyModel[4].setRotationPoint(-2F, -24F, -3F);
		bodyModel[4].rotateAngleZ = -0.1396263F;

		bodyModel[5].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // armrestright
		bodyModel[5].setRotationPoint(-13F, -12F, 5F);
		bodyModel[5].rotateAngleZ = 0.1745329F;

		bodyModel[6].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // armrestleft
		bodyModel[6].setRotationPoint(-13F, -12F, -7F);
		bodyModel[6].rotateAngleZ = 0.1745329F;

		bodyModel[7].addBox(0F, 0F, 0F, 6, 11, 10, 0F); // Panelbottom
		bodyModel[7].setRotationPoint(-28F, -9F, -5F);
		bodyModel[7].rotateAngleZ = 0.3490658F;

		bodyModel[8].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Joystickthing
		bodyModel[8].setRotationPoint(-16F, -7F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Joystickbase
		bodyModel[9].setRotationPoint(-16F, -8F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 38, 1, 0, 0F); // support1
		bodyModel[10].setRotationPoint(-34.8F, -15F, -7.9F);
		bodyModel[10].rotateAngleZ = 0.3839724F;

		bodyModel[11].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // support1
		bodyModel[11].setRotationPoint(-40F, -1F, -7.9F);
		bodyModel[11].rotateAngleZ = 1.22173F;

		bodyModel[12].addBox(0F, 0F, 0F, 38, 1, 0, 0F); // support2
		bodyModel[12].setRotationPoint(-34.8F, -15F, 7.9F);
		bodyModel[12].rotateAngleZ = 0.3839724F;

		bodyModel[13].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // support2
		bodyModel[13].setRotationPoint(-40F, -1F, 7.9F);
		bodyModel[13].rotateAngleZ = 1.22173F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // moniterstand
		bodyModel[14].setRotationPoint(-24F, -12F, -0.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // moniter
		bodyModel[15].setRotationPoint(-24F, -16F, -2F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 12, 8, 0F); // Panelbottom
		bodyModel[16].setRotationPoint(-33F, -9F, -4F);
		bodyModel[16].rotateAngleZ = 0.1919862F;

		bodyModel[17].addBox(0F, 0F, 0F, 4, 12, 6, 0F); // Panelbottom
		bodyModel[17].setRotationPoint(-25.8F, -13F, -3F);
		bodyModel[17].rotateAngleZ = -0.4886922F;		

		bodyModel[18].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 28, 0, 28), new Coord2D(0, 0, 0, 0), new Coord2D(46, 0, 46, 0), new Coord2D(35, 14, 35, 14) } ), 16, 46, 28, 130, 16, ModelRendererTurbo.MR_FRONT, new float[] {38, 18, 46, 28});
		bodyModel[18].setRotationPoint(0F, -1F, 8F);

		bodyModel[19].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(35, 14, 35, 14), new Coord2D(46, 0, 46, 0), new Coord2D(0, 0, 0, 0), new Coord2D(0, 28, 0, 28) } ), 16, 46, 28, 130, 16, ModelRendererTurbo.MR_FRONT, new float[] {38, 28, 46, 18});
		bodyModel[19].setRotationPoint(0F, -1F, 8F);

		bodyModel[20].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 4, 6, 4), new Coord2D(0, 4, 0, 4) } ), 16, 6, 4, 18, 16, ModelRendererTurbo.MR_FRONT, new float[] {4, 6, 8});
		bodyModel[20].setRotationPoint(-40F, 3F, 8F);
		
		bodyModel[21].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 4, 40, 4), new Coord2D(0, 4, 0, 4) } ), 4, 40, 4, 85, 4, ModelRendererTurbo.MR_FRONT, new float[] {4, 40, 41});
		bodyModel[21].rotateAngleX = 1.57079631F;
		bodyModel[21].setRotationPoint(0F, -1F, 12F);

		bodyModel[22].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 4, 40, 4), new Coord2D(0, 4, 0, 4) } ), 4, 40, 4, 85, 4, ModelRendererTurbo.MR_FRONT, new float[] {4, 40, 41});
		bodyModel[22].rotateAngleX = 4.71238894F;
		bodyModel[22].setRotationPoint(0F, 3F, -12F);

		bodyModel[23].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(18, 0, 18, 0), new Coord2D(18, 4, 18, 4), new Coord2D(2, 32, 2, 32), new Coord2D(0, 32, 0, 32) } ), 4, 18, 32, 89, 4, ModelRendererTurbo.MR_FRONT, new float[] {32, 2, 33, 4, 18});
		bodyModel[23].setRotationPoint(18F, 3F, -8F);


		bodyModel[24].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(18, 0, 18, 0), new Coord2D(18, 4, 18, 4), new Coord2D(2, 32, 2, 32), new Coord2D(0, 32, 0, 32) } ), 4, 18, 32, 89, 4, ModelRendererTurbo.MR_FRONT, new float[] {32, 2, 33, 4, 18});
		bodyModel[24].setRotationPoint(18F, 3F, 12F);

		bodyModel[25].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(0, 4, 0, 4), new Coord2D(0, 4, 0, 4) } ), 24, 2, 4, 11, 24, ModelRendererTurbo.MR_FRONT, new float[] {4, 0, 5, 2});
		bodyModel[25].setRotationPoint(18F, -29F, 12F);
		
		bodyModel[26].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(0, 4, 0, 4), new Coord2D(0, 4, 0, 4) } ), 16, 2, 4, 11, 16, ModelRendererTurbo.MR_FRONT, new float[] {4, 0, 5, 2});
		bodyModel[26].setRotationPoint(18F, -29F, 8F);
		
		bodyModel[27].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(8, 0, 8, 0), new Coord2D(0, 4, 0, 4), new Coord2D(0, 4, 0, 4) } ), 12, 2, 4, 11, 12, ModelRendererTurbo.MR_FRONT, new float[] {4, 0, 5, 2});
		bodyModel[27].setRotationPoint(18F, -29F, 6F);
		
		bodyModel[28].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(10, 0, 10, 0), new Coord2D(0, 4, 0, 4), new Coord2D(0, 4, 0, 4) } ), 8, 2, 4, 11, 8, ModelRendererTurbo.MR_FRONT, new float[] {4, 0, 5, 2});
		bodyModel[28].setRotationPoint(18F, -29F, 4F);
		
		bodyModel[29].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(12, 0, 12, 0), new Coord2D(0, 4, 0, 4), new Coord2D(0, 4, 0, 4) } ), 4, 2, 4, 11, 4, ModelRendererTurbo.MR_FRONT, new float[] {4, 0, 5, 2});
		bodyModel[29].setRotationPoint(18F, -29F, 2F);

		bodyModel[30].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(100, 0, 100, 0), new Coord2D(100, 26, 100, 26), new Coord2D(70, 26, 70, 26), new Coord2D(0, 26, 0, 26) } ), 24, 100, 26, 252, 24, ModelRendererTurbo.MR_FRONT, new float[] {26, 70, 30, 26, 100});
		bodyModel[30].setRotationPoint(116F, 3F, 12F);

		bodyModel[31].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 0, 40, 0), new Coord2D(40, 10, 40, 10), new Coord2D(30, 10, 30, 10) } ), 24, 40, 10, 92, 24, ModelRendererTurbo.MR_FRONT, new float[] {32, 10, 10, 40});
		bodyModel[31].setRotationPoint(58F, -23F, 12F);

		bodyModel[32].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 6, 2, 6), new Coord2D(2, 20, 2, 20), new Coord2D(0, 26, 0, 26) } ), 100, 2, 26, 54, 100, ModelRendererTurbo.MR_FRONT, new float[] {26, 7, 14, 7});
		bodyModel[32].rotateAngleY = 1.57079631F;
		bodyModel[32].setRotationPoint(18F, 3F, -12F);

		bodyModel[33].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 6, 2, 6), new Coord2D(2, 20, 2, 20), new Coord2D(0, 26, 0, 26) } ), 100, 2, 26, 54, 100, ModelRendererTurbo.MR_FRONT, new float[] {26, 7, 14, 7});
		bodyModel[33].rotateAngleY = 4.71238894F;
		bodyModel[33].setRotationPoint(118F, 3F, 12F);

		bodyModel[34].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(60, 5, 60, 5), new Coord2D(60, 10, 60, 10), new Coord2D(0, 20, 0, 20) } ), 32, 60, 20, 151, 32, ModelRendererTurbo.MR_RIGHT, new float[] {20, 61, 10, 60});
		bodyModel[34].rotateAngleX = 0.26179939F;
		bodyModel[34].setRotationPoint(60F, -1F, -7F);

		bodyModel[35].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 30, 0, 30), new Coord2D(30, 0, 30, 0), new Coord2D(30, 10, 30, 10), new Coord2D(10, 30, 10, 30) } ), 10, 30, 30, 92, 10, ModelRendererTurbo.MR_BOTTOM, new float[] {10, 29, 10, 43});
		bodyModel[35].rotateAngleX = 0.26179939F;
		bodyModel[35].setRotationPoint(30F, -5F, -42F);

		bodyModel[36].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(100, 0, 100, 0), new Coord2D(200, 5, 200, 5), new Coord2D(200, 20, 200, 20), new Coord2D(100, 35, 100, 35), new Coord2D(10, 35, 10, 35) } ), 5, 200, 35, 445, 5, ModelRendererTurbo.MR_FRONT, new float[] {37, 90, 102, 15, 101, 100});
		bodyModel[36].rotateAngleX = 1.57079631F;
		bodyModel[36].setRotationPoint(126F, 5F, -63F);

		bodyModel[37].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 20, 0, 20), new Coord2D(40, 0, 40, 0), new Coord2D(0, 35, 0, 35) } ), 5, 40, 35, 114, 5, ModelRendererTurbo.MR_FRONT, new float[] {15, 54, 45});
		bodyModel[37].rotateAngleX = 1.57079631F;
		bodyModel[37].setRotationPoint(-74F, 5F, -48F);

		bodyModel[38].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 2, 20, 2), new Coord2D(5, 2, 5, 2) } ), 4, 40, 2, 82, 4, ModelRendererTurbo.MR_FRONT, new float[] {6, 15, 21, 40});
		bodyModel[38].setRotationPoint(100F, 5F, -74F);

		bodyModel[39].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 2, 20, 2), new Coord2D(5, 2, 5, 2) } ), 4, 40, 2, 82, 4, ModelRendererTurbo.MR_FRONT, new float[] {6, 15, 21, 40});
		bodyModel[39].setRotationPoint(100F, 5F, -86F);

		bodyModel[40].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(60, 5, 60, 5), new Coord2D(60, 10, 60, 10), new Coord2D(0, 20, 0, 20) } ), 32, 60, 20, 151, 32, ModelRendererTurbo.MR_LEFT, new float[] {20, 61, 10, 60});
		bodyModel[40].rotateAngleX = -0.26179939F;
		bodyModel[40].setRotationPoint(92F, -1F, 7F);

		bodyModel[41].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 30, 0, 30), new Coord2D(30, 0, 30, 0), new Coord2D(30, 10, 30, 10), new Coord2D(10, 30, 10, 30) } ), 10, 30, 30, 92, 10, ModelRendererTurbo.MR_TOP, new float[] {10, 29, 10, 43});
		bodyModel[41].rotateAngleX = -0.26179939F;
		bodyModel[41].setRotationPoint(30F, 4.5F, 39F);

		bodyModel[42].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(100, 0, 100, 0), new Coord2D(200, 5, 200, 5), new Coord2D(200, 20, 200, 20), new Coord2D(100, 35, 100, 35), new Coord2D(10, 35, 10, 35) } ), 5, 200, 35, 445, 5, ModelRendererTurbo.MR_FRONT, new float[] {37, 90, 102, 15, 101, 100});
		bodyModel[42].rotateAngleX = -1.57079631F;
		bodyModel[42].setRotationPoint(126F, 10F, 63F);

		bodyModel[43].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 20, 0, 20), new Coord2D(40, 0, 40, 0), new Coord2D(0, 35, 0, 35) } ), 5, 40, 35, 114, 5, ModelRendererTurbo.MR_FRONT, new float[] {15, 54, 45});
		bodyModel[43].rotateAngleX = -1.57079631F;
		bodyModel[43].setRotationPoint(-74F, 10F, 48F);

		bodyModel[44].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 2, 20, 2), new Coord2D(5, 2, 5, 2) } ), 4, 40, 2, 82, 4, ModelRendererTurbo.MR_FRONT, new float[] {6, 15, 21, 40});
		bodyModel[44].setRotationPoint(100F, 5F, 76F);

		bodyModel[45].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 2, 20, 2), new Coord2D(5, 2, 5, 2) } ), 4, 40, 2, 82, 4, ModelRendererTurbo.MR_FRONT, new float[] {6, 15, 21, 40});
		bodyModel[45].setRotationPoint(100F, 5F, 88F);

		bodyModel[46].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(60, 8, 60, 8), new Coord2D(60, 32, 60, 32), new Coord2D(0, 40, 0, 40) } ), 26, 40, 48, 156, 26, ModelRendererTurbo.MR_FRONT, new float[] {48, 42, 24, 42});
		bodyModel[46].rotateAngleX = 1.57079631F;
		bodyModel[46].setRotationPoint(163F, -23.1F, 20F);

		bodyModel[47].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 3, 0, 3), new Coord2D(3, 0, 3, 0), new Coord2D(35, 0, 35, 0), new Coord2D(38, 3, 38, 3), new Coord2D(38, 8, 38, 8), new Coord2D(35, 11, 35, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8) } ), 10, 38, 11, 94, 10, ModelRendererTurbo.MR_RIGHT, new float[] {5, 5, 32, 5, 5, 5, 32, 5});
		bodyModel[47].setRotationPoint(163F, -11F, 19F);

		bodyModel[48].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 3, 0, 3), new Coord2D(3, 0, 3, 0), new Coord2D(35, 0, 35, 0), new Coord2D(38, 3, 38, 3), new Coord2D(38, 8, 38, 8), new Coord2D(35, 11, 35, 11), new Coord2D(3, 11, 3, 11), new Coord2D(0, 8, 0, 8) } ), 10, 38, 11, 94, 10, ModelRendererTurbo.MR_RIGHT, new float[] {5, 5, 32, 5, 5, 5, 32, 5});
		bodyModel[48].setRotationPoint(163F, 1F, 19F);

		bodyModel[49].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(15, 2, 15, 2), new Coord2D(5, 2, 5, 2) } ), 22, 20, 2, 42, 22, ModelRendererTurbo.MR_FRONT, new float[] {6, 10, 6, 20});
		bodyModel[49].setRotationPoint(153F, -23F, 11F);


		if(VarGear == true)

		{
			 
		}
		if(VarDoor == true)
		{
			 
		}
		if(VarWing == true)
		{
			 
		}
		
		
		
		tailModel = new ModelRendererTurbo[0];
		
		
		
		if(VarGear == true)
		{
			 
		}
		if(VarDoor == true)
		{
			 
		}
		if(VarWing == true)
		{
			 
		}
		
		
		
		leftWingModel = new ModelRendererTurbo[0];
		
		
		
		if(VarGear == true)
		{
			 
		}
		if(VarDoor == true)
		{
			 
		}
		if(VarWing == true)
		{
			 
		}
		
		
		
		rightWingModel = new ModelRendererTurbo[0];
		
		
		
		if(VarGear == true)
		{
			 
		}
		if(VarDoor == true)
		{
			 
		}
		if(VarWing == true)
		{
			 
		}
		
		
// Propeller
		propellerModels = new ModelRendererTurbo[1][1];
        	propellerModels[0][0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY);
        	propellerModels[0][0].addBox(0F, 0F, 0F, 10, 2, 2, 0F);
        	propellerModels[0][0].setRotationPoint(65F, -23F, -1F);



		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this,  0,  217, textureX, textureY); // Joystick


		yawFlapModel[0].addBox(0F, 0F, -0.5F, 4, 1, 1, 0F); // Joystick
		yawFlapModel[0].setRotationPoint(-15.5F, -7F, 0F);
		yawFlapModel[0].rotateAngleZ = 1.570796F;		
		
		
		pitchFlapLeftModel = new ModelRendererTurbo[0];
		
		
		
		pitchFlapRightModel = new ModelRendererTurbo[0];
		
		
		
		pitchFlapLeftWingModel = new ModelRendererTurbo[0];
		
		
		
		pitchFlapRightWingModel = new ModelRendererTurbo[0];
		
		
		
		// Stuff not used in this modeltype. Should be defined to avoid errors.
		
		topWingModel = new ModelRendererTurbo[0];
		
		
		flipAll();
		
	}
	
	// Replace with your propeller function
	private ModelRendererTurbo[] makeProp(int i, int j, int k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[0];
		return prop;
	}
}