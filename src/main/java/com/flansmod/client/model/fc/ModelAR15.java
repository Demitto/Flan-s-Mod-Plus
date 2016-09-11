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

public class ModelAR15 extends ModelPlane
{
	int textureX = 512;
	int textureY = 512;
	
	
	boolean VarGear = true;
	boolean VarDoor = true;
	boolean VarWing = true;
	
	public ModelAR15()	
	{


		bodyModel = new ModelRendererTurbo[40];
		bodyModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // back
		bodyModel[1] = new ModelRendererTurbo(this,  0,  53, textureX, textureY); // base
		bodyModel[2] = new ModelRendererTurbo(this,  0,  78, textureX, textureY); // seatbottom
		bodyModel[3] = new ModelRendererTurbo(this,  0,  105, textureX, textureY); // seatback
		bodyModel[4] = new ModelRendererTurbo(this,  0,  141, textureX, textureY); // headrest
		bodyModel[5] = new ModelRendererTurbo(this,  0,  157, textureX, textureY); // armrestright
		bodyModel[6] = new ModelRendererTurbo(this,  0,  165, textureX, textureY); // armrestleft
		bodyModel[7] = new ModelRendererTurbo(this,  0,  175, textureX, textureY); // Panelbottom
		bodyModel[8] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // Joystickthing
		bodyModel[9] = new ModelRendererTurbo(this,  0,  212, textureX, textureY); // Joystickbase
		bodyModel[10] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // support1
		bodyModel[11] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // support1
		bodyModel[12] = new ModelRendererTurbo(this,  0,  225, textureX, textureY); // support2
		bodyModel[13] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // support2
		bodyModel[14] = new ModelRendererTurbo(this,  18,  216, textureX, textureY); // moniterstand
		bodyModel[15] = new ModelRendererTurbo(this,  33,  216, textureX, textureY); // moniter
		bodyModel[16] = new ModelRendererTurbo(this,  95,  0, textureX, textureY); //
		bodyModel[17] = new ModelRendererTurbo(this,  95,  50, textureX, textureY); //
		bodyModel[18] = new ModelRendererTurbo(this,  95,  75, textureX, textureY); //
		bodyModel[19] = new ModelRendererTurbo(this,  95,  95, textureX, textureY); //
		bodyModel[20] = new ModelRendererTurbo(this,  95,  115, textureX, textureY); //
		bodyModel[21] = new ModelRendererTurbo(this,  95,  75, textureX, textureY); //
		bodyModel[22] = new ModelRendererTurbo(this,  95,  140, textureX, textureY); //
		bodyModel[23] = new ModelRendererTurbo(this,  95,  75, textureX, textureY); //
		bodyModel[24] = new ModelRendererTurbo(this,  95,  95, textureX, textureY); //
		bodyModel[25] = new ModelRendererTurbo(this,  95,  165, textureX, textureY); //
		bodyModel[26] = new ModelRendererTurbo(this,  95,  75, textureX, textureY); //
		bodyModel[27] = new ModelRendererTurbo(this,  95,  190, textureX, textureY); //
		bodyModel[28] = new ModelRendererTurbo(this,  95,  230, textureX, textureY); //
		bodyModel[29] = new ModelRendererTurbo(this,  95,  270, textureX, textureY); //
		bodyModel[30] = new ModelRendererTurbo(this,  95,  320, textureX, textureY); //
		bodyModel[31] = new ModelRendererTurbo(this,  95,  360, textureX, textureY); //
		bodyModel[32] = new ModelRendererTurbo(this,  95,  405, textureX, textureY); //
		bodyModel[33] = new ModelRendererTurbo(this,  95,  445, textureX, textureY); //
		bodyModel[34] = new ModelRendererTurbo(this,  95,  445, textureX, textureY); //
		bodyModel[35] = new ModelRendererTurbo(this,  170,  445, textureX, textureY); //
		bodyModel[36] = new ModelRendererTurbo(this,  170,  370, textureX, textureY); //
		bodyModel[37] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); //
		bodyModel[38] = new ModelRendererTurbo(this,  200,  270, textureX, textureY); //
		bodyModel[39] = new ModelRendererTurbo(this,  270,  270, textureX, textureY); //


		bodyModel[0].addBox(0F, 0F, 0F, 16, 32, 16, 0F); // back
		bodyModel[0].setRotationPoint(0F, -20F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 20, 4, 16, 0F); // base
		bodyModel[1].setRotationPoint(-20F, 8F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // seatbottom
		bodyModel[2].setRotationPoint(-11F, 4F, -5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 16, 10, 0F); // seatback
		bodyModel[3].setRotationPoint(-2F, -11F, -5F);
		bodyModel[3].rotateAngleZ = -0.1396263F;

		bodyModel[4].addBox(0F, 0F, 0F, 4, 5, 6, 0F); // headrest
		bodyModel[4].setRotationPoint(-2F, -15F, -3F);
		bodyModel[4].rotateAngleZ = -0.1396263F;

		bodyModel[5].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // armrestright
		bodyModel[5].setRotationPoint(-13F, -3F, 5F);
		bodyModel[5].rotateAngleZ = 0.1745329F;

		bodyModel[6].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // armrestleft
		bodyModel[6].setRotationPoint(-13F, -3F, -7F);
		bodyModel[6].rotateAngleZ = 0.1745329F;

		bodyModel[7].addBox(0F, 0F, 0F, 3, 10, 10, 0F); // Panelbottom
		bodyModel[7].setRotationPoint(-20F, 0F, -5F);
		bodyModel[7].rotateAngleZ = 0.3490658F;

		bodyModel[8].addBox(0F, 0F, 0F, 2, 7, 4, 0F); // Joystickthing
		bodyModel[8].setRotationPoint(-16F, 2F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Joystickbase
		bodyModel[9].setRotationPoint(-16F, 1F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 22, 1, 0, 0F); // support1
		bodyModel[10].setRotationPoint(-19F, -7F, -7F);
		bodyModel[10].rotateAngleZ = 0.5061455F;

		bodyModel[11].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // support1
		bodyModel[11].setRotationPoint(-20F, 8F, -7F);
		bodyModel[11].rotateAngleZ = 1.518436F;

		bodyModel[12].addBox(0F, 0F, 0F, 22, 1, 0, 0F); // support2
		bodyModel[12].setRotationPoint(-19F, -7F, 7F);
		bodyModel[12].rotateAngleZ = 0.5061455F;

		bodyModel[13].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // support2
		bodyModel[13].setRotationPoint(-20F, 8F, 7F);
		bodyModel[13].rotateAngleZ = 1.518436F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // moniterstand
		bodyModel[14].setRotationPoint(-19F, -2F, -0.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // moniter
		bodyModel[15].setRotationPoint(-19F, -4F, -2F);		
		
		bodyModel[16].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(26, 5, 26, 5), new Coord2D(28, 10, 28, 10), new Coord2D(29, 15, 29, 15), new Coord2D(27, 20, 27, 20), new Coord2D(22, 25, 22, 25), new Coord2D(17, 29, 17, 29), new Coord2D(0, 32, 0, 32) } ), 16, 29, 32, 111, 16, ModelRendererTurbo.MR_FRONT, new float[] {32, 18, 7, 8, 6, 6, 6, 8, 20});
		bodyModel[16].setRotationPoint(0F, 12F, 8F);

		bodyModel[17].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(35, 2, 35, 2), new Coord2D(40, 5, 40, 5), new Coord2D(85, 5, 85, 5), new Coord2D(85, 6, 85, 6), new Coord2D(0, 6, 0, 6) } ), 16, 85, 6, 179, 16, ModelRendererTurbo.MR_FRONT, new float[] {6, 85, 1, 45, 6, 36});
		bodyModel[17].setRotationPoint(0F, 8F, -8F);

		bodyModel[18].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16) } ), 1, 16, 16, 55, 1, ModelRendererTurbo.MR_FRONT, new float[] {23, 16, 16});
		bodyModel[18].rotateAngleX = -1.57079631F;
		bodyModel[18].rotateAngleY = 3.14159263F;
		bodyModel[18].setRotationPoint(-101F, 3F, -8F);

		bodyModel[19].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(50, 2, 50, 2), new Coord2D(0, 2, 0, 2) } ), 14, 50, 2, 104, 14, ModelRendererTurbo.MR_FRONT, new float[] {2, 50, 2, 50});
		bodyModel[19].setRotationPoint(0F, 2F, -8F);

bodyModel[20].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(85, 0, 85, 0), new Coord2D(85, 2, 85, 2), new Coord2D(80, 2, 80, 2), new Coord2D(75, 3, 75, 3), new Coord2D(70, 3, 70, 3), new Coord2D(65, 4, 65, 4), new Coord2D(60, 4, 60, 4), new Coord2D(50, 5, 50, 5), new Coord2D(0, 5, 0, 5) } ), 16, 85, 5, 175, 16, ModelRendererTurbo.MR_FRONT, new float[] {0, 50, 11, 5, 6, 5, 6, 5, 2, 85});
		bodyModel[20].setRotationPoint(0F, 0F, -8F);

		bodyModel[21].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16) } ), 2, 16, 16, 55, 2, ModelRendererTurbo.MR_FRONT, new float[] {23, 16, 16});
		bodyModel[21].rotateAngleX = -1.57079631F;
		bodyModel[21].rotateAngleY = 3.14159263F;
		bodyModel[21].setRotationPoint(-101F, 0F, -8F);

bodyModel[22].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(35, 2, 35, 2), new Coord2D(40, 5, 40, 5), new Coord2D(85, 5, 85, 5), new Coord2D(85, 6, 85, 6), new Coord2D(0, 6, 0, 6) } ), 16, 85, 6, 179, 16, ModelRendererTurbo.MR_FRONT, new float[] {6, 85, 1, 45, 6, 36});
		bodyModel[22].setRotationPoint(0F, 8F, 24F);

		bodyModel[23].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16) } ), 1, 16, 16, 55, 1, ModelRendererTurbo.MR_FRONT, new float[] {23, 16, 16});
		bodyModel[23].rotateAngleX = 1.57079631F;
		bodyModel[23].rotateAngleY = 3.14159263F;
		bodyModel[23].setRotationPoint(-101F, 2F, 8F);

		bodyModel[24].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(50, 0, 50, 0), new Coord2D(50, 2, 50, 2), new Coord2D(0, 2, 0, 2) } ), 14, 50, 2, 104, 14, ModelRendererTurbo.MR_FRONT, new float[] {2, 50, 2, 50});
		bodyModel[24].setRotationPoint(0F, 2F, 22F);

		bodyModel[25].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(85, 0, 85, 0), new Coord2D(85, 2, 85, 2), new Coord2D(80, 2, 80, 2), new Coord2D(75, 3, 75, 3), new Coord2D(70, 3, 70, 3), new Coord2D(65, 4, 65, 4), new Coord2D(60, 4, 60, 4), new Coord2D(50, 5, 50, 5), new Coord2D(0, 5, 0, 5) } ), 16, 85, 5, 175, 16, ModelRendererTurbo.MR_FRONT, new float[] {0, 50, 11, 5, 6, 5, 6, 5, 2, 85});
		bodyModel[25].setRotationPoint(0F, 0F, 24F);

		bodyModel[26].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16) } ), 2, 16, 16, 55, 2, ModelRendererTurbo.MR_FRONT, new float[] {23, 16, 16});
		bodyModel[26].rotateAngleX = 1.57079631F;
		bodyModel[26].rotateAngleY = 3.14159263F;
		bodyModel[26].setRotationPoint(-101F, -2F, 8F);

		bodyModel[27].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(20, 13, 20, 13), new Coord2D(15, 19, 15, 19), new Coord2D(0, 24, 0, 24) } ), 16, 20, 24, 81, 16, ModelRendererTurbo.MR_FRONT, new float[] {24, 16, 8, 13, 20});
		bodyModel[27].setRotationPoint(20F, 8F, -8F);

		bodyModel[28].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(20, 13, 20, 13), new Coord2D(15, 19, 15, 19), new Coord2D(0, 24, 0, 24) } ), 16, 20, 24, 81, 16, ModelRendererTurbo.MR_FRONT, new float[] {24, 16, 8, 13, 20});
		bodyModel[28].setRotationPoint(20F, 8F, 24F);

		bodyModel[29].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(4, 30, 4, 30), new Coord2D(0, 26, 0, 26), new Coord2D(0, 2, 0, 2), new Coord2D(4, 0, 4, 0) } ), 16, 4, 30, 66, 16, ModelRendererTurbo.MR_FRONT, new float[] {30, 5, 26, 5});
	bodyModel[29].setRotationPoint(20F, 10F, 8F);

		bodyModel[30].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(48, 0, 48, 0), new Coord2D(40, 16, 40, 16), new Coord2D(8, 16, 8, 16) } ), 24, 48, 16, 116, 24, ModelRendererTurbo.MR_FRONT, new float[] {18, 32, 18, 48});
		bodyModel[30].rotateAngleX = -1.57079631F;
		bodyModel[30].rotateAngleY = 4.71238894F;
		bodyModel[30].setRotationPoint(20F, 8F, -24F);

		bodyModel[31].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 1, 1, 0), new Coord2D(16, 1, 16, 1), new Coord2D(14, 4, 14, 4), new Coord2D(2, 4, 2, 4) } ), 40, 16, 4, 38, 40, ModelRendererTurbo.MR_FRONT, new float[] {5, 12, 5, 16});
		bodyModel[31].rotateAngleY = -1.57079631F;
		bodyModel[31].setRotationPoint(76F, -12F, -8F);

		bodyModel[32].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 4, 4, 4) } ), 32, 4, 4, 14, 32, ModelRendererTurbo.MR_FRONT, new float[] {6, 4, 4});
		bodyModel[32].setRotationPoint(40F, -6.6F, 16F);

		bodyModel[33].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) } ), 30, 15, 15, 52, 30, ModelRendererTurbo.MR_FRONT, new float[] {6, 7, 6, 7, 6, 7, 6, 7});
		bodyModel[33].rotateAngleY = -1.57079631F;
		bodyModel[33].rotateAngleZ = -0.26179939F;
		bodyModel[33].setRotationPoint(60F, 10F, -16F);

		bodyModel[34].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) } ), 30, 15, 15, 52, 30, ModelRendererTurbo.MR_FRONT, new float[] {6, 7, 6, 7, 6, 7, 6, 7});
		bodyModel[34].rotateAngleY = -1.57079631F;
		bodyModel[34].rotateAngleZ = -0.26179939F;
		bodyModel[34].setRotationPoint(60F, 10F, 1F);

		bodyModel[35].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 8, 6, 8), new Coord2D(6, 10, 6, 10), new Coord2D(0, 10, 0, 10) } ), 32, 6, 10, 28, 32, ModelRendererTurbo.MR_FRONT, new float[] {10, 6, 2, 10});
		bodyModel[35].rotateAngleY = 3.14159263F;
		bodyModel[35].setRotationPoint(36F, 8F, -16F);

		bodyModel[36].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(30, 16, 30, 16), new Coord2D(0, 32, 0, 32) } ), 4, 30, 32, 100, 4, ModelRendererTurbo.MR_FRONT, new float[] {32, 34, 34});
		bodyModel[36].rotateAngleX = 1.57079631F;
		bodyModel[36].rotateAngleY = 3.14159263F;
		bodyModel[36].setRotationPoint(36F, -16F, -16F);

		bodyModel[37].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(10, 20, 10, 20), new Coord2D(2, 10, 2, 10) } ), 1, 20, 20, 67, 1, ModelRendererTurbo.MR_FRONT, new float[] {11, 13, 23, 20});
		bodyModel[37].rotateAngleX = 2.54818069F;
		bodyModel[37].setRotationPoint(76F, -14F, -7.3F);
		
		bodyModel[38].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(20, 0, 20, 0), new Coord2D(10, 20, 10, 20), new Coord2D(2, 10, 2, 10) } ), 1, 20, 20, 67, 1, ModelRendererTurbo.MR_FRONT, new float[] {11, 13, 23, 20});
		bodyModel[38].rotateAngleX = -2.54818069F;
		bodyModel[38].setRotationPoint(76F, -14F, 6.1F);

		bodyModel[39].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(30, 0, 30, 0), new Coord2D(20, 10, 20, 10), new Coord2D(5, 20, 5, 20), new Coord2D(2, 15, 2, 15) } ), 1, 30, 20, 86, 1, ModelRendererTurbo.MR_FRONT, new float[] {16, 6, 19, 15, 30});
		bodyModel[39].setRotationPoint(76F, -16F, 0.5F);



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
		yawFlapModel[0] = new ModelRendererTurbo(this,  0,  216, textureX, textureY); // Joystick


		yawFlapModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Joystick
		yawFlapModel[0].setRotationPoint(-15.5F, -2F, -0.5F);		
		
		
		pitchFlapLeftModel = new ModelRendererTurbo[0];
		
		
		
		pitchFlapRightModel = new ModelRendererTurbo[0];
		
		
		
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];

		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this,  200,  190, textureX, textureY); //



		pitchFlapLeftWingModel[0].addShape3D(40F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(20, 0, 20, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 35, 20, 35), new Coord2D(0, 45, 0, 45) } ), 1, 40, 45, 134, 1, ModelRendererTurbo.MR_FRONT, new float[] {50, 23, 41, 20});
		pitchFlapLeftWingModel[0].rotateAngleX = 1.57079631F;
		pitchFlapLeftWingModel[0].setRotationPoint(0F,-4F, -24F);
		
		
		
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this,  200,  190, textureX, textureY); //



		pitchFlapRightWingModel[0].addShape3D(40F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(20, 0, 20, 0), new Coord2D(40, 0, 40, 0), new Coord2D(20, 35, 20, 35), new Coord2D(0, 45, 0, 45) } ), 1, 40, 45, 134, 1, ModelRendererTurbo.MR_FRONT, new float[] {50, 23, 41, 20});
		pitchFlapRightWingModel[0].rotateAngleX = 4.71238894F;
		pitchFlapRightWingModel[0].setRotationPoint(0F, -4F, 24F);
		
		
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
