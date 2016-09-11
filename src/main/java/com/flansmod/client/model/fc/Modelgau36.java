//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.4.1
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

public class Modelgau36 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public Modelgau36()	
	{


// Gun
		gunModel = new ModelRendererTurbo[29];
		gunModel[0] = new ModelRendererTurbo(this,  0,  45, textureX, textureY); // Body1
		gunModel[1] = new ModelRendererTurbo(this,  0,  110, textureX, textureY); // Body2
		gunModel[2] = new ModelRendererTurbo(this,  0,  170, textureX, textureY); // Body3
		gunModel[3] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body4
		gunModel[4] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body5
		gunModel[5] = new ModelRendererTurbo(this,  0,  210, textureX, textureY); // Body6
		gunModel[6] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body7
		gunModel[7] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body8
		gunModel[8] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body9
		gunModel[9] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body10
		gunModel[10] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body11
		gunModel[11] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body12
		gunModel[12] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body13
		gunModel[13] = new ModelRendererTurbo(this,  0,  250, textureX, textureY); // Body14
		gunModel[14] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body15
		gunModel[15] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body16
		gunModel[16] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); // Body17
		gunModel[17] = new ModelRendererTurbo(this,  0,  300, textureX, textureY); // Body18
		gunModel[18] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // Body19
		gunModel[19] = new ModelRendererTurbo(this,  0,  370, textureX, textureY); // Body20
		gunModel[20] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // Body21
		gunModel[21] = new ModelRendererTurbo(this,  0,  470, textureX, textureY); // Body22
		gunModel[22] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Body23
		gunModel[23] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Body24
		gunModel[24] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Body25
		gunModel[25] = new ModelRendererTurbo(this,  200,  50, textureX, textureY); // Body26
		gunModel[26] = new ModelRendererTurbo(this,  200,  70, textureX, textureY); // Body27
		gunModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body28
		gunModel[28] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Body29

		gunModel[0].addBox(-22F, -16F, -12F, 41, 32, 24, 0F); // Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 15, 32, 24, 0F, 0F, 0F, 0F, 0F, -12F, -3F, 0F, -12F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F); //Test
		gunModel[1].setRotationPoint(19F, -16F, -12F);

		gunModel[2].addBox(0F, 0F, 0F, 5, 18, 18, 0F); // Body3
		gunModel[2].setRotationPoint(34F, -4F, -9F);

		gunModel[3].addShapeBox(5F, 0F, 0F, 10, 6, 18, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[3].setRotationPoint(34F, -4F, -9F);

		gunModel[4].addBox(5F, 0F, 0F, 10, 6, 18, 0F); // Body5
		gunModel[4].setRotationPoint(34F, 2F, -9F);

		gunModel[5].addShapeBox(5F, 0F, 0F, 10, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[5].setRotationPoint(34F, 8F, -9F);

		gunModel[6].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body7
		gunModel[6].setRotationPoint(34F, 5F, 0F);

		gunModel[7].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body8
		gunModel[7].setRotationPoint(34F, 5F, 0F);
		gunModel[7].rotateAngleX = 0.7853982F;

		gunModel[8].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body9
		gunModel[8].setRotationPoint(34F, 5F, 0F);
		gunModel[8].rotateAngleX = 1.570796F;

		gunModel[9].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body10
		gunModel[9].setRotationPoint(34F, 5F, 0F);
		gunModel[9].rotateAngleX = 2.356194F;

		gunModel[10].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body11
		gunModel[10].setRotationPoint(34F, 5F, 0F);
		gunModel[10].rotateAngleX = 3.141593F;

		gunModel[11].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body12
		gunModel[11].setRotationPoint(34F, 5F, 0F);
		gunModel[11].rotateAngleX = -2.356194F;

		gunModel[12].addBox(15F, -7.5F, -1.5F, 103, 3, 3, 0F); // Body13
		gunModel[12].setRotationPoint(34F, 5F, 0F);
		gunModel[12].rotateAngleX = -1.570796F;

		gunModel[13].addBox(15F, -6.5F, -1.5F, 103, 3, 3, 0F); // Body14
		gunModel[13].setRotationPoint(34F, 5F, 0F);
		gunModel[13].rotateAngleX = -0.7853982F;

		gunModel[14].addShapeBox(0F, 0F, 0F, 23, 6, 18, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[14].setRotationPoint(127F, -4F, -9F);

		gunModel[15].addBox(0F, 0F, 0F, 23, 6, 18, 0F); // Body16
		gunModel[15].setRotationPoint(127F, 2F, -9F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 23, 6, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); //Test
		gunModel[16].setRotationPoint(127F, 8F, -9F);

		gunModel[17].addBox(0F, 16F, 0F, 32, 4, 10, 0F); // Body18
		gunModel[17].setRotationPoint(-16F, 0F, -5F);

		gunModel[18].addShapeBox(0F, 20F, 0F, 45, 10, 30, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[18].setRotationPoint(-24F, 0F, -15F);

		gunModel[19].addBox(0F, 30F, 0F, 45, 10, 30, 0F); // Body20
		gunModel[19].setRotationPoint(-24F, 0F, -15F);

		gunModel[20].addShapeBox(0F, 40F, 0F, 45, 10, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); //Test
		gunModel[20].setRotationPoint(-24F, 0F, -15F);

		gunModel[21].addBox(0F, 0F, 0F, 6, 14, 14, 0F); // Body22
		gunModel[21].setRotationPoint(-29F, -2F, -7F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[22].setRotationPoint(-35F, -1F, -6F);

		gunModel[23].addBox(0F, 0F, 0F, 6, 4, 12, 0F); // Body24
		gunModel[23].setRotationPoint(-35F, 3F, -6F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		gunModel[24].setRotationPoint(-35F, 7F, -6F);

		gunModel[25].addBox(0F, 0F, 0F, 45, 10, 6, 0F); // Body26
		gunModel[25].setRotationPoint(19F, -14F, -3F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 15, 10, 6, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		gunModel[26].setRotationPoint(64F, -14F, -3F);

		gunModel[27].addBox(-3F, -16F, 0F, 3, 16, 3, 0F); // Body28
		gunModel[27].setRotationPoint(59F, -14F, -1.5F);
		gunModel[27].rotateAngleZ = 0.7853982F;

		gunModel[28].addBox(-3F, -16F, 0F, 3, 16, 3, 0F); // Body29
		gunModel[28].setRotationPoint(50F, -14F, -1.5F);
		gunModel[28].rotateAngleZ = 0.7853982F;

		


		gunSlideDistance = 0F;
		animationType = EnumAnimationType.NONE;

		flipAll();
	}
}