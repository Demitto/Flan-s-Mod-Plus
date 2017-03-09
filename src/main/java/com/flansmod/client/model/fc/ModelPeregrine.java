//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.10
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelPeregrine extends ModelMecha
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelPeregrine()
	{
		bodyModel = new ModelRendererTurbo[45];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import Core1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 1080, textureX, textureY); // Import Core2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import Core3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import Core4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Import Core5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import Core6
		bodyModel[6] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Import Core7
		bodyModel[7] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import Core8
		bodyModel[8] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import Core9
		bodyModel[9] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import Core10
		bodyModel[10] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import Core11
		bodyModel[11] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import Core12
		bodyModel[12] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import Core13
		bodyModel[13] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import Core14
		bodyModel[14] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import Core15
		bodyModel[15] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import Core16
		bodyModel[16] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import Core17
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import Core18
		bodyModel[18] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import Core19
		bodyModel[19] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Import Core20
		bodyModel[20] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import Core21
		bodyModel[21] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import Core22
		bodyModel[22] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Import LCore1
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1080, textureX, textureY); // Import LCore2
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import LCore3
		bodyModel[25] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import LCore4
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1290, textureX, textureY); // Import LCore5
		bodyModel[27] = new ModelRendererTurbo(this, 0, 1370, textureX, textureY); // Import LCore6
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1460, textureX, textureY); // Import LCore7
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1530, textureX, textureY); // Import LCore8
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import LCore9
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import LCore10
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1650, textureX, textureY); // Import LCore11
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import LCore12
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import LCore13
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import LCore14
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1700, textureX, textureY); // Import LCore15
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import LCore16
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1770, textureX, textureY); // Import LCore17
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import LCore18
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1850, textureX, textureY); // Import LCore19
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1900, textureX, textureY); // Import LCore20
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1950, textureX, textureY); // Import LCore21
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1800, textureX, textureY); // Import LCore22
		bodyModel[44] = new ModelRendererTurbo(this, 300, 1480, textureX, textureY); // Box 178

		bodyModel[0].addShapeBox(-106F, 0F, 0F, 106, 44, 26, 0F,0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core1
		bodyModel[0].setRotationPoint(58F, -236F, -57F);
		bodyModel[0].rotateAngleZ = -0.43633231F;

		bodyModel[1].addShapeBox(-132F, 0F, 0F, 26, 44, 36, 0F,0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Import Core2
		bodyModel[1].setRotationPoint(58F, -236F, -57F);
		bodyModel[1].rotateAngleZ = -0.4363323F;

		bodyModel[2].addShapeBox(-80F, -6F, 0F, 57, 6, 11, 0F,-20F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core3
		bodyModel[2].setRotationPoint(58F, -236F, -32F);
		bodyModel[2].rotateAngleZ = -0.4363323F;

		bodyModel[3].addShapeBox(-31F, 0F, 0F, 31, 38, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F); // Import Core4
		bodyModel[3].setRotationPoint(-17.5F, -248F, -60F);

		bodyModel[4].addShapeBox(-31F, 0F, 0F, 31, 28, 40, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core5
		bodyModel[4].setRotationPoint(-17.5F, -276F, -60F);

		bodyModel[5].addShapeBox(-31F, 0F, 0F, 26, 45, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F); // Import Core6
		bodyModel[5].setRotationPoint(-43.5F, -255F, -60F);

		bodyModel[6].addShapeBox(-31F, 0F, 0F, 26, 21, 40, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Core7
		bodyModel[6].setRotationPoint(-43.5F, -276F, -60F);

		bodyModel[7].addBox(-106F, 0F, 0F, 106, 44, 10, 0F); // Import Core8
		bodyModel[7].setRotationPoint(58F, -236F, -31F);
		bodyModel[7].rotateAngleZ = -0.4363323F;

		bodyModel[8].addBox(0F, 0F, 0F, 37, 10, 2, 0F); // Import Core9
		bodyModel[8].setRotationPoint(-27.5F, -248F, -59F);

		bodyModel[9].addBox(0F, 0F, 0F, 37, 9, 2, 0F); // Import Core10
		bodyModel[9].setRotationPoint(-40.5F, -234F, -59F);

		bodyModel[10].addBox(0F, 0F, 0F, 46, 9, 20, 0F); // Import Core11
		bodyModel[10].setRotationPoint(-43.5F, -222F, -45F);

		bodyModel[11].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import Core12
		bodyModel[11].setRotationPoint(-4.5F, -213F, -43F);
		bodyModel[11].rotateAngleZ = -0.7853982F;

		bodyModel[12].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import Core13
		bodyModel[12].setRotationPoint(5F, -213F, -43F);
		bodyModel[12].rotateAngleZ = -0.7853982F;

		bodyModel[13].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import Core14
		bodyModel[13].setRotationPoint(14.5F, -213F, -43F);
		bodyModel[13].rotateAngleZ = -0.7853982F;

		bodyModel[14].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import Core15
		bodyModel[14].setRotationPoint(24F, -213F, -43F);
		bodyModel[14].rotateAngleZ = -0.7853982F;

		bodyModel[15].addBox(-25F, 0F, 0F, 25, 5, 5, 0F); // Import Core16
		bodyModel[15].setRotationPoint(3F, -261F, -37F);
		bodyModel[15].rotateAngleZ = -1.047198F;

		bodyModel[16].addBox(-30F, 0F, 0F, 30, 5, 7, 0F); // Import Core17
		bodyModel[16].setRotationPoint(-24F, -274F, -47F);
		bodyModel[16].rotateAngleZ = -0.9599311F;

		bodyModel[17].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import Core18
		bodyModel[17].setRotationPoint(-57.5F, -247F, -71F);

		bodyModel[18].addBox(0F, 0F, -19F, 29, 27, 19, 0F); // Import Core19
		bodyModel[18].setRotationPoint(-60F, -238F, -60F);
		bodyModel[18].rotateAngleX = -0.6108652F;

		bodyModel[19].addBox(0F, -6F, -22F, 25, 20, 13, 0F); // Import Core20
		bodyModel[19].setRotationPoint(-58F, -238F, -60F);
		bodyModel[19].rotateAngleX = -0.6108652F;

		bodyModel[20].addBox(0F, 27F, -19F, 29, 10, 19, 0F); // Import Core21
		bodyModel[20].setRotationPoint(-60F, -238F, -60F);
		bodyModel[20].rotateAngleX = -0.6108652F;

		bodyModel[21].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import Core22
		bodyModel[21].setRotationPoint(-57.5F, -231F, -97F);

		bodyModel[22].addShapeBox(-106F, 0F, 0F, 106, 44, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -38F, 0F, 0F, 0F, 0F, 0F); // Import LCore1
		bodyModel[22].setRotationPoint(58F, -236F, 31F);
		bodyModel[22].rotateAngleZ = -0.43633231F;

		bodyModel[23].addShapeBox(-132F, 0F, 0F, 26, 44, 36, 0F,0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Import LCore2
		bodyModel[23].setRotationPoint(58F, -236F, 21F);
		bodyModel[23].rotateAngleZ = -0.4363323F;

		bodyModel[24].addShapeBox(-80F, -6F, 0F, 57, 6, 11, 0F,-20F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LCore3
		bodyModel[24].setRotationPoint(58F, -236F, 21F);
		bodyModel[24].rotateAngleZ = -0.4363323F;

		bodyModel[25].addShapeBox(-31F, 0F, 0F, 31, 38, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -29F, 0F, 0F, -29F, 0F, 0F, 0F, 0F, 0F); // Import LCore4
		bodyModel[25].setRotationPoint(-17.5F, -248F, 20F);

		bodyModel[26].addShapeBox(-31F, 0F, 0F, 31, 28, 40, 0F,0F, 0F, 0F, 0F, -26F, 0F, 0F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LCore5
		bodyModel[26].setRotationPoint(-17.5F, -276F, 20F);

		bodyModel[27].addShapeBox(-31F, 0F, 0F, 26, 45, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -43F, 0F); // Import LCore6
		bodyModel[27].setRotationPoint(-43.5F, -255F, 20F);

		bodyModel[28].addShapeBox(-31F, 0F, 0F, 26, 21, 40, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LCore7
		bodyModel[28].setRotationPoint(-43.5F, -276F, 20F);

		bodyModel[29].addBox(-106F, 0F, 0F, 106, 44, 10, 0F); // Import LCore8
		bodyModel[29].setRotationPoint(58F, -236F, 21F);
		bodyModel[29].rotateAngleZ = -0.4363323F;

		bodyModel[30].addBox(0F, 0F, 0F, 37, 10, 2, 0F); // Import LCore9
		bodyModel[30].setRotationPoint(-27.5F, -248F, 57F);

		bodyModel[31].addBox(0F, 0F, 0F, 37, 9, 2, 0F); // Import LCore10
		bodyModel[31].setRotationPoint(-40.5F, -234F, 57F);

		bodyModel[32].addBox(0F, 0F, 0F, 46, 9, 20, 0F); // Import LCore11
		bodyModel[32].setRotationPoint(-43.5F, -222F, 25F);

		bodyModel[33].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import LCore12
		bodyModel[33].setRotationPoint(-4.5F, -213F, 26F);
		bodyModel[33].rotateAngleZ = -0.7853982F;

		bodyModel[34].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import LCore13
		bodyModel[34].setRotationPoint(5F, -213F, 26F);
		bodyModel[34].rotateAngleZ = -0.7853982F;

		bodyModel[35].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import LCore14
		bodyModel[35].setRotationPoint(14.5F, -213F, 26F);
		bodyModel[35].rotateAngleZ = -0.7853982F;

		bodyModel[36].addBox(-6F, 0F, 0F, 6, 23, 17, 0F); // Import LCore15
		bodyModel[36].setRotationPoint(24F, -213F, 26F);
		bodyModel[36].rotateAngleZ = -0.7853982F;

		bodyModel[37].addBox(-25F, 0F, 0F, 25, 5, 5, 0F); // Import LCore16
		bodyModel[37].setRotationPoint(3F, -261F, 32F);
		bodyModel[37].rotateAngleZ = -1.047198F;

		bodyModel[38].addBox(-30F, 0F, 0F, 30, 5, 7, 0F); // Import LCore17
		bodyModel[38].setRotationPoint(-24F, -274F, 40F);
		bodyModel[38].rotateAngleZ = -0.9599311F;

		bodyModel[39].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import LCore18
		bodyModel[39].setRotationPoint(-57.5F, -247F, 60F);

		bodyModel[40].addBox(0F, 0F, 0F, 29, 27, 19, 0F); // Import LCore19
		bodyModel[40].setRotationPoint(-60F, -238F, 60F);
		bodyModel[40].rotateAngleX = 0.6108652F;

		bodyModel[41].addBox(0F, -6F, 9F, 25, 20, 13, 0F); // Import LCore20
		bodyModel[41].setRotationPoint(-58F, -238F, 60F);
		bodyModel[41].rotateAngleX = 0.6108652F;

		bodyModel[42].addBox(0F, 27F, 0F, 29, 10, 19, 0F); // Import LCore21
		bodyModel[42].setRotationPoint(-60F, -238F, 60F);
		bodyModel[42].rotateAngleX = 0.6108652F;

		bodyModel[43].addBox(0F, 0F, 0F, 24, 24, 11, 0F); // Import LCore22
		bodyModel[43].setRotationPoint(-57.5F, -231F, 86F);

		bodyModel[44].addShapeBox(-38F, 10F, 0F, 380, 202, 0, 0F,0F, 0F, 0F, -342F, 0F, -26F, -342F, 0F, 26F, 0F, 0F, 0F, 0F, -182F, 0F, -342F, -182F, -26F, -342F, -182F, 26F, 0F, -182F, 0F); // Box 178
		bodyModel[44].setRotationPoint(58F, -236F, -57.1F);
		bodyModel[44].rotateAngleZ = -0.43633231F;


		headModel = new ModelRendererTurbo[28];
		headModel[0] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Head1
		headModel[1] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Head2
		headModel[2] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Head3
		headModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Head4
		headModel[4] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Head6
		headModel[5] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Head7
		headModel[6] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Head8
		headModel[7] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Head9
		headModel[8] = new ModelRendererTurbo(this, 50, 270, textureX, textureY); // Import Head10
		headModel[9] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Head11
		headModel[10] = new ModelRendererTurbo(this, 0, 370, textureX, textureY); // Import Head12
		headModel[11] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Head13
		headModel[12] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Head14
		headModel[13] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import Head15
		headModel[14] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Head16
		headModel[15] = new ModelRendererTurbo(this, 0, 600, textureX, textureY); // Import Head17
		headModel[16] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import Head18
		headModel[17] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import Head19
		headModel[18] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import Head20
		headModel[19] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import Head21
		headModel[20] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Head22
		headModel[21] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Head23
		headModel[22] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import Head24
		headModel[23] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import Head25
		headModel[24] = new ModelRendererTurbo(this, 200, 330, textureX, textureY); // Import Head26
		headModel[25] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Import Head27
		headModel[26] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Head28
		headModel[27] = new ModelRendererTurbo(this, 200, 490, textureX, textureY); // Import Head29

		headModel[0].addShapeBox(0F, 0F, 0F, 34, 4, 30, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Import Head1
		headModel[0].setRotationPoint(31.5F, -238F, -15F);

		headModel[1].addShapeBox(0F, 0F, 0F, 33, 5, 2, 0F,0F, 0F, 0F, 0F, -22F, -13F, 0F, -22F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, -13F, 0F, 18F, 13F, 0F, 0F, 0F); // Import Head2
		headModel[1].setRotationPoint(31.5F, -265F, -15F);

		headModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, -0.66F, -0.4F, 0F, -0.66F, -0.4F, 0F, 0F, 0F, 2F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0.8F); // Import Head3
		headModel[2].setRotationPoint(64.5F, -243F, -2F);

		headModel[3].addShapeBox(0F, 0F, 0F, 33, 5, 2, 0F,0F, 0F, 0F, 0F, -22F, 13F, 0F, -22F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 13F, 0F, 18F, -13F, 0F, 0F, 0F); // Import Head4
		headModel[3].setRotationPoint(31.5F, -265F, 13F);

		headModel[4].addShapeBox(0F, 0F, 0F, 33, 1, 26, 0F,0F, 0F, 0F, 0F, -22F, -13F, 0F, -22F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, -13F, 0F, 22F, -13F, 0F, 0F, 0F); // Import Head6
		headModel[4].setRotationPoint(31.5F, -265F, -13F);

		headModel[5].addBox(0F, 0F, 0F, 12, 2, 30, 0F); // Import Head7
		headModel[5].setRotationPoint(19.5F, -265F, -15F);

		headModel[6].addBox(0F, 0F, 0F, 12, 4, 30, 0F); // Import Head8
		headModel[6].setRotationPoint(19.5F, -238F, -15F);

		headModel[7].addBox(0F, 0F, 0F, 12, 25, 2, 0F); // Import Head9
		headModel[7].setRotationPoint(19.5F, -263F, -15F);

		headModel[8].addBox(0F, 0F, 0F, 12, 25, 2, 0F); // Import Head10
		headModel[8].setRotationPoint(19.5F, -263F, 13F);

		headModel[9].addBox(0F, 0F, 0F, 2, 31, 30, 0F); // Import Head11
		headModel[9].setRotationPoint(17.5F, -265F, -15F);

		headModel[10].addShapeBox(0F, 0F, 0F, 34, 16, 30, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 5F, -13F, -32F, 5F, -13F, -32F, 5F, -13F, 0F, 5F, -13F); // Import Head12
		headModel[10].setRotationPoint(31.5F, -234F, -15F);

		headModel[11].addShapeBox(0F, 0F, 0F, 15, 36, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 6F, 0F); // Import Head13
		headModel[11].setRotationPoint(17.5F, -270F, -21F);

		headModel[12].addShapeBox(0F, 0F, 0F, 15, 36, 6, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 6F, 0F); // Import Head14
		headModel[12].setRotationPoint(17.5F, -270F, 15F);

		headModel[13].addShapeBox(0F, 0F, 0F, 15, 5, 30, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Head15
		headModel[13].setRotationPoint(17.5F, -270F, -15F);

		headModel[14].addBox(0F, 0F, 0F, 55, 36, 42, 0F); // Import Head16
		headModel[14].setRotationPoint(-37.5F, -270F, -21F);

		headModel[15].addShapeBox(0F, 0F, 0F, 55, 6, 25, 0F,-5F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Head17
		headModel[15].setRotationPoint(-37.5F, -276F, -12.5F);

		headModel[16].addBox(0F, 0F, 0F, 12, 16, 56, 0F); // Import Head18
		headModel[16].setRotationPoint(19.5F, -234F, -28F);

		headModel[17].addShapeBox(0F, 0F, 0F, 10, 5, 56, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Head19
		headModel[17].setRotationPoint(19.5F, -205F, -28F);

		headModel[18].addShapeBox(0F, 0F, 0F, 6, 5, 56, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Head20
		headModel[18].setRotationPoint(19.5F, -200F, -28F);

		headModel[19].addShapeBox(0F, 0F, 0F, 12, 13, 56, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Head21
		headModel[19].setRotationPoint(19.5F, -218F, -28F);

		headModel[20].addShapeBox(0F, 0F, 0F, 7, 7, 56, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import Head22
		headModel[20].setRotationPoint(-28F, -195F, -28F);

		headModel[21].addBox(0F, 0F, 0F, 36, 7, 56, 0F); // Import Head23
		headModel[21].setRotationPoint(-21F, -195F, -28F);

		headModel[22].addShapeBox(0F, 0F, 0F, 16, 36, 42, 0F,0F, -25F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -4F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F); // Import Head24
		headModel[22].setRotationPoint(-53.5F, -270F, -21F);

		headModel[23].addBox(0F, 0F, 0F, 51, 20, 56, 0F); // Import Head25
		headModel[23].setRotationPoint(-31.5F, -234F, -28F);

		headModel[24].addShapeBox(0F, 0F, 0F, 5, 20, 56, 0F,0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Import Head26
		headModel[24].setRotationPoint(-36.5F, -234F, -28F);

		headModel[25].addShapeBox(0F, 0F, 0F, 7, 7, 56, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Head27
		headModel[25].setRotationPoint(15F, -195F, -28F);

		headModel[26].addBox(0F, 0F, 0F, 46, 19, 56, 0F); // Import Head28
		headModel[26].setRotationPoint(-26.5F, -214F, -28F);

		headModel[27].addShapeBox(0F, 0F, 0F, 5, 19, 56, 0F,0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F); // Import Head29
		headModel[27].setRotationPoint(-31.5F, -214F, -28F);


		hipsModel = new ModelRendererTurbo[4];
		hipsModel[0] = new ModelRendererTurbo(this, 200, 600, textureX, textureY); // Import Hips1
		hipsModel[1] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import Hips2
		hipsModel[2] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import Hips3
		hipsModel[3] = new ModelRendererTurbo(this, 200, 820, textureX, textureY); // Import Hips4

		hipsModel[0].addBox(0F, 0F, 0F, 36, 5, 56, 0F); // Import Hips1
		hipsModel[0].setRotationPoint(-21F, -188F, -28F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 7, 5, 56, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Hips2
		hipsModel[1].setRotationPoint(15F, -188F, -28F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 7, 5, 56, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import Hips3
		hipsModel[2].setRotationPoint(-28F, -188F, -28F);

		hipsModel[3].addShapeBox(0F, 0F, 0F, 50, 28, 12, 0F,0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F); // Import Hips4
		hipsModel[3].setRotationPoint(-28F, -183F, -6F);


		// Right Arm
		rightArmModel = new ModelRendererTurbo[13];
		rightArmModel[0] = new ModelRendererTurbo(this,  400,  1000, textureX, textureY); // Arm1
		rightArmModel[1] = new ModelRendererTurbo(this,  460,  1000, textureX, textureY); // Arm2
		rightArmModel[2] = new ModelRendererTurbo(this,  400,  1050, textureX, textureY); // Arm3
		rightArmModel[3] = new ModelRendererTurbo(this,  400,  1100, textureX, textureY); // Arm4
		rightArmModel[4] = new ModelRendererTurbo(this,  400,  1150, textureX, textureY); // Arm5
		rightArmModel[5] = new ModelRendererTurbo(this,  400,  1200, textureX, textureY); // Arm6
		rightArmModel[6] = new ModelRendererTurbo(this,  400,  1250, textureX, textureY); // Arm7
		rightArmModel[7] = new ModelRendererTurbo(this,  400,  1300, textureX, textureY); // Arm8
		rightArmModel[8] = new ModelRendererTurbo(this,  400,  1350, textureX, textureY); // Arm9
		rightArmModel[9] = new ModelRendererTurbo(this,  400,  1350, textureX, textureY); // Arm10
		rightArmModel[10] = new ModelRendererTurbo(this,  400,  1400, textureX, textureY); // Arm11
		rightArmModel[11] = new ModelRendererTurbo(this,  400,  1450, textureX, textureY); // Arm12
		rightArmModel[12] = new ModelRendererTurbo(this,  400,  1450, textureX, textureY); // Arm13

		rightArmModel[0].addBox(5F, -12.5F, 9.5F, 21, 20, 2, 0F); // Arm1
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.570796F;

		rightArmModel[1].addBox(5F, -12.5F, -11.5F, 21, 20, 2, 0F); // Arm2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.570796F;

		rightArmModel[2].addBox(3F, -12.5F, -11.5F, 2, 20, 23, 0F); // Arm3
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.570796F;

		rightArmModel[3].addBox(3F, -20.5F, -11.5F, 34, 8, 23, 0F); // Arm4
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.570796F;

		rightArmModel[4].addBox(-44F, -29.5F, -5F, 39, 16, 10, 0F); // Arm5
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -2.565634F;

		rightArmModel[5].addShapeBox(-36F, -39.5F, -5F, 39, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); //Test
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -2.565634F;

		rightArmModel[6].addBox(-74F, -20.5F, -2F, 30, 4, 4, 0F); // Arm7
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -2.565634F;

		rightArmModel[7].addBox(-59F, -27.5F, -2F, 15, 4, 4, 0F); // Arm8
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -2.565634F;

		rightArmModel[8].addBox(30F, -12.5F, -11.5F, 4, 20, 2, 0F); // Arm9
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.570796F;

		rightArmModel[9].addBox(30F, -12.5F, 9.5F, 4, 20, 2, 0F); // Arm10
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -1.570796F;

		rightArmModel[10].addShapeBox(18F, -26.5F, -4.5F, 34, 13, 9, 0F, 0F, 4F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -1.570796F;

		rightArmModel[11].addBox(52F, -16.5F, -1F, 10, 2, 2, 0F); // Arm12
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -1.570796F;

		rightArmModel[12].addBox(52F, -20.5F, -1F, 10, 2, 2, 0F); // Arm13
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -1.570796F;
		
		
		leftArmModel = new ModelRendererTurbo[13];
		leftArmModel[0] = new ModelRendererTurbo(this, 400, 1000, textureX, textureY); // Arm1
		leftArmModel[1] = new ModelRendererTurbo(this, 460, 1000, textureX, textureY); // Arm2
		leftArmModel[2] = new ModelRendererTurbo(this, 400, 1050, textureX, textureY); // Arm3
		leftArmModel[3] = new ModelRendererTurbo(this, 400, 1100, textureX, textureY); // Arm4
		leftArmModel[4] = new ModelRendererTurbo(this, 400, 1150, textureX, textureY); // Arm5
		leftArmModel[5] = new ModelRendererTurbo(this, 400, 1200, textureX, textureY); // Arm6
		leftArmModel[6] = new ModelRendererTurbo(this, 400, 1250, textureX, textureY); // Arm7
		leftArmModel[7] = new ModelRendererTurbo(this, 400, 1300, textureX, textureY); // Arm8
		leftArmModel[8] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Arm9
		leftArmModel[9] = new ModelRendererTurbo(this, 400, 1350, textureX, textureY); // Arm10
		leftArmModel[10] = new ModelRendererTurbo(this, 400, 1400, textureX, textureY); // Arm11
		leftArmModel[11] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Arm12
		leftArmModel[12] = new ModelRendererTurbo(this, 400, 1450, textureX, textureY); // Arm13

		leftArmModel[0].addBox(5F, -12.5F, 9.5F, 21, 20, 2, 0F); // Arm1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.570796F;

		leftArmModel[1].addBox(5F, -12.5F, -11.5F, 21, 20, 2, 0F); // Arm2
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.570796F;

		leftArmModel[2].addBox(3F, -12.5F, -11.5F, 2, 20, 23, 0F); // Arm3
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.570796F;

		leftArmModel[3].addBox(3F, -20.5F, -11.5F, 34, 8, 23, 0F); // Arm4
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.570796F;

		leftArmModel[4].addBox(-44F, -29.5F, -5F, 39, 16, 10, 0F); // Arm5
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -2.565634F;

		leftArmModel[5].addShapeBox(-36F, -39.5F, -5F, 39, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); //Test
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -2.565634F;

		leftArmModel[6].addBox(-74F, -20.5F, -2F, 30, 4, 4, 0F); // Arm7
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -2.565634F;

		leftArmModel[7].addBox(-59F, -27.5F, -2F, 15, 4, 4, 0F); // Arm8
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -2.565634F;

		leftArmModel[8].addBox(30F, -12.5F, -11.5F, 4, 20, 2, 0F); // Arm9
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.570796F;

		leftArmModel[9].addBox(30F, -12.5F, 9.5F, 4, 20, 2, 0F); // Arm10
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.570796F;

		leftArmModel[10].addShapeBox(18F, -26.5F, -4.5F, 34, 13, 9, 0F, 0F, 4F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.570796F;

		leftArmModel[11].addBox(52F, -16.5F, -1F, 10, 2, 2, 0F); // Arm12
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.570796F;

		leftArmModel[12].addBox(52F, -20.5F, -1F, 10, 2, 2, 0F); // Arm13
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.570796F;



		leftLegModel = new ModelRendererTurbo[29];
		leftLegModel[0] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Import LefttLeg2
		leftLegModel[2] = new ModelRendererTurbo(this, 200, 1100, textureX, textureY); // Import LeftLeg3
		leftLegModel[3] = new ModelRendererTurbo(this, 200, 1150, textureX, textureY); // Import LefttLeg4
		leftLegModel[4] = new ModelRendererTurbo(this, 200, 1205, textureX, textureY); // Import LeftLeg5
		leftLegModel[5] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import LeftLeg6
		leftLegModel[6] = new ModelRendererTurbo(this, 200, 1300, textureX, textureY); // Import LeftLeg7
		leftLegModel[7] = new ModelRendererTurbo(this, 200, 1350, textureX, textureY); // Import LeftLeg8
		leftLegModel[8] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Import LeftLeg9
		leftLegModel[9] = new ModelRendererTurbo(this, 200, 1450, textureX, textureY); // Import LeftLeg10
		leftLegModel[10] = new ModelRendererTurbo(this, 200, 1600, textureX, textureY); // Import LeftLeg11
		leftLegModel[11] = new ModelRendererTurbo(this, 200, 1650, textureX, textureY); // Import LefttLeg12
		leftLegModel[12] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import LeftLeg13
		leftLegModel[13] = new ModelRendererTurbo(this, 200, 1750, textureX, textureY); // Import LeftLeg14
		leftLegModel[14] = new ModelRendererTurbo(this, 200, 1800, textureX, textureY); // Import LeftLeg15
		leftLegModel[15] = new ModelRendererTurbo(this, 200, 1850, textureX, textureY); // Import LeftLeg16
		leftLegModel[16] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Import LeftLeg17
		leftLegModel[17] = new ModelRendererTurbo(this, 200, 1950, textureX, textureY); // Import LeftLeg18
		leftLegModel[18] = new ModelRendererTurbo(this, 200, 2000, textureX, textureY); // Import LeftLeg19
		leftLegModel[19] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import LeftLeg20
		leftLegModel[20] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import LeftLeg21
		leftLegModel[21] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import LeftLeg22
		leftLegModel[22] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import LeftLeg23
		leftLegModel[23] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import LeftLeg24
		leftLegModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import LeftLeg25
		leftLegModel[25] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import LeftLeg26
		leftLegModel[26] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import LeftLeg27
		leftLegModel[27] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import LeftLeg28
		leftLegModel[28] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import LeftLeg29

		leftLegModel[0].addShapeBox(-8F, -8F, 0F, 16, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 11F, 0F, 0F); // Import LeftLeg1
		leftLegModel[0].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[0].rotateAngleZ = -1.047198F;

		leftLegModel[1].addBox(-8F, -27F, 14F, 37, 25, 18, 0F); // Import LefttLeg2
		leftLegModel[1].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[1].rotateAngleZ = -1.047198F;

		leftLegModel[2].addBox(-9F, -15F, 15F, 44, 30, 16, 0F); // Import LeftLeg3
		leftLegModel[2].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[2].rotateAngleZ = -1.047198F;

		leftLegModel[3].addShapeBox(-19F, -15F, 15F, 10, 30, 16, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import LefttLeg4
		leftLegModel[3].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[3].rotateAngleZ = -1.047198F;

		leftLegModel[4].addShapeBox(-19F, -7F, 31F, 43, 15, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -30F, 0F, 0F); // Import LeftLeg5
		leftLegModel[4].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[4].rotateAngleZ = -1.047198F;

		leftLegModel[5].addShapeBox(29F, -27F, 16F, 22, 12, 14, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftLeg6
		leftLegModel[5].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[5].rotateAngleZ = -1.047198F;

		leftLegModel[6].addBox(-9F, 0F, 16F, 40, 19, 16, 0F); // Import LeftLeg7
		leftLegModel[6].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[6].rotateAngleZ = -1.047198F;

		leftLegModel[7].addBox(-5F, 8F, 17F, 19, 12, 17, 0F); // Import LeftLeg8
		leftLegModel[7].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[7].rotateAngleZ = -1.047198F;

		leftLegModel[8].addBox(35F, -14F, 26F, 18, 18, 14, 0F); // Import LeftLeg9
		leftLegModel[8].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[8].rotateAngleZ = -1.047198F;

		leftLegModel[9].addShapeBox(35F, -15F, 15F, 17, 30, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import LeftLeg10
		leftLegModel[9].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[9].rotateAngleZ = -1.047198F;

		leftLegModel[10].addShapeBox(49F, -9F, 40F, 21, 21, 14, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftLeg11
		leftLegModel[10].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[10].rotateAngleZ = -0.9075712F;

		leftLegModel[11].addBox(35F, 6F, 42F, 24, 25, 11, 0F); // Import LefttLeg12
		leftLegModel[11].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[11].rotateAngleZ = -0.9075712F;

		leftLegModel[12].addBox(9F, 22F, 39F, 39, 20, 20, 0F); // Import LeftLeg13
		leftLegModel[12].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[12].rotateAngleZ = -0.2617994F;

		leftLegModel[13].addBox(-32F, 27F, 41F, 37, 11, 16, 0F); // Import LeftLeg14
		leftLegModel[13].setRotationPoint(-3F, -163F, 6F);

		leftLegModel[14].addBox(-32F, 38F, 43F, 37, 15, 9, 0F); // Import LeftLeg15
		leftLegModel[14].setRotationPoint(-3F, -163F, 6F);

		leftLegModel[15].addBox(-8F, 41F, 40.5F, 17, 17, 17, 0F); // Import LeftLeg16
		leftLegModel[15].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[15].rotateAngleZ = -0.6981317F;

		leftLegModel[16].addShapeBox(59F, 12F, 43F, 11, 19, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F); // Import LeftLeg17
		leftLegModel[16].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[16].rotateAngleZ = -0.9075712F;

		leftLegModel[17].addShapeBox(-8F, 41F, 39F, 25, 25, 20, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Import LeftLeg18
		leftLegModel[17].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[17].rotateAngleZ = -0.9599311F;

		leftLegModel[18].addBox(17F, 41F, 39F, 33, 25, 20, 0F); // Import LeftLeg19
		leftLegModel[18].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[18].rotateAngleZ = -0.9599311F;

		leftLegModel[19].addShapeBox(17F, 41F, 59F, 33, 25, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -2F, 0F, -10F, -2F, 0F); // Import LeftLeg20
		leftLegModel[19].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[19].rotateAngleZ = -0.9599311F;

		leftLegModel[20].addShapeBox(17F, 66F, 39F, 33, 11, 20, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Import LeftLeg21
		leftLegModel[20].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[20].rotateAngleZ = -0.9599311F;

		leftLegModel[21].addBox(50F, 55F, 41F, 78, 12, 16, 0F); // Import LeftLeg22
		leftLegModel[21].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[21].rotateAngleZ = -0.9599311F;

		leftLegModel[22].addShapeBox(50F, 41F, 39F, 56, 14, 20, 0F,0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftLeg23
		leftLegModel[22].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[22].rotateAngleZ = -0.9599311F;

		leftLegModel[23].addBox(53F, 8F, 40F, 28, 10, 18, 0F); // Import LeftLeg24
		leftLegModel[23].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[23].rotateAngleZ = -1.448623F;

		leftLegModel[24].addShapeBox(56F, 67F, 41F, 47, 9, 16, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F); // Import LeftLeg25
		leftLegModel[24].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[24].rotateAngleZ = -0.9599311F;

		leftLegModel[25].addShapeBox(-2F, 83F, 42F, 28, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import LeftLeg26
		leftLegModel[25].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[25].rotateAngleZ = -0.4712389F;

		leftLegModel[26].addShapeBox(106F, 44F, 39F, 34, 10, 20, 0F,0F, 0F, -4F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import LeftLeg27
		leftLegModel[26].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[26].rotateAngleZ = -0.9599311F;

		leftLegModel[27].addShapeBox(106F, 54F, 57F, 29, 12, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F); // Import LeftLeg28
		leftLegModel[27].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[27].rotateAngleZ = -0.9599311F;

		leftLegModel[28].addShapeBox(106F, 54F, 30F, 29, 12, 11, 0F,0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LeftLeg29
		leftLegModel[28].setRotationPoint(-3F, -163F, 6F);
		leftLegModel[28].rotateAngleZ = -0.9599311F;


		rightLegModel = new ModelRendererTurbo[29];
		rightLegModel[0] = new ModelRendererTurbo(this, 200, 870, textureX, textureY); // Import RightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 200, 910, textureX, textureY); // Import RightLeg2
		rightLegModel[2] = new ModelRendererTurbo(this, 200, 1100, textureX, textureY); // Import RightLeg3
		rightLegModel[3] = new ModelRendererTurbo(this, 200, 1150, textureX, textureY); // Import RightLeg4
		rightLegModel[4] = new ModelRendererTurbo(this, 200, 1205, textureX, textureY); // Import RightLeg5
		rightLegModel[5] = new ModelRendererTurbo(this, 200, 1250, textureX, textureY); // Import RightLeg6
		rightLegModel[6] = new ModelRendererTurbo(this, 200, 1300, textureX, textureY); // Import RightLeg7
		rightLegModel[7] = new ModelRendererTurbo(this, 200, 1350, textureX, textureY); // Import RightLeg8
		rightLegModel[8] = new ModelRendererTurbo(this, 200, 1400, textureX, textureY); // Import RightLeg9
		rightLegModel[9] = new ModelRendererTurbo(this, 200, 1450, textureX, textureY); // Import RightLeg10
		rightLegModel[10] = new ModelRendererTurbo(this, 200, 1600, textureX, textureY); // Import RightLeg11
		rightLegModel[11] = new ModelRendererTurbo(this, 200, 1650, textureX, textureY); // Import RightLeg12
		rightLegModel[12] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import RightLeg13
		rightLegModel[13] = new ModelRendererTurbo(this, 200, 1750, textureX, textureY); // Import RightLeg14
		rightLegModel[14] = new ModelRendererTurbo(this, 200, 1800, textureX, textureY); // Import RightLeg15
		rightLegModel[15] = new ModelRendererTurbo(this, 200, 1850, textureX, textureY); // Import RightLeg16
		rightLegModel[16] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Import RightLeg17
		rightLegModel[17] = new ModelRendererTurbo(this, 200, 1950, textureX, textureY); // Import RightLeg18
		rightLegModel[18] = new ModelRendererTurbo(this, 200, 2000, textureX, textureY); // Import RightLeg19
		rightLegModel[19] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import RightLeg20
		rightLegModel[20] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import RightLeg21
		rightLegModel[21] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import RightLeg22
		rightLegModel[22] = new ModelRendererTurbo(this, 400, 250, textureX, textureY); // Import RightLeg23
		rightLegModel[23] = new ModelRendererTurbo(this, 400, 350, textureX, textureY); // Import RightLeg24
		rightLegModel[24] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import RightLeg25
		rightLegModel[25] = new ModelRendererTurbo(this, 400, 500, textureX, textureY); // Import RightLeg26
		rightLegModel[26] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Import RightLeg27
		rightLegModel[27] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import RightLeg28
		rightLegModel[28] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Import RightLeg29

		rightLegModel[0].addShapeBox(-8F, -8F, -15F, 16, 16, 15, 0F,11F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg1
		rightLegModel[0].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[0].rotateAngleZ = -1.047198F;

		rightLegModel[1].addBox(-8F, -27F, -32F, 37, 25, 18, 0F); // Import RightLeg2
		rightLegModel[1].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[1].rotateAngleZ = -1.047198F;

		rightLegModel[2].addBox(-9F, -15F, -31F, 44, 30, 16, 0F); // Import RightLeg3
		rightLegModel[2].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[2].rotateAngleZ = -1.047198F;

		rightLegModel[3].addShapeBox(-19F, -15F, -31F, 10, 30, 16, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Import RightLeg4
		rightLegModel[3].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[3].rotateAngleZ = -1.047198F;

		rightLegModel[4].addShapeBox(-19F, -7F, -39F, 43, 15, 8, 0F,-30F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -30F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg5
		rightLegModel[4].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[4].rotateAngleZ = -1.047198F;

		rightLegModel[5].addShapeBox(29F, -27F, -30F, 22, 12, 14, 0F,0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg6
		rightLegModel[5].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[5].rotateAngleZ = -1.047198F;

		rightLegModel[6].addBox(-9F, 0F, -32F, 40, 19, 16, 0F); // Import RightLeg7
		rightLegModel[6].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[6].rotateAngleZ = -1.047198F;

		rightLegModel[7].addBox(-5F, 8F, -34F, 19, 12, 17, 0F); // Import RightLeg8
		rightLegModel[7].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[7].rotateAngleZ = -1.047198F;

		rightLegModel[8].addBox(35F, -14F, -40F, 18, 18, 14, 0F); // Import RightLeg9
		rightLegModel[8].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[8].rotateAngleZ = -1.047198F;

		rightLegModel[9].addShapeBox(35F, -15F, -31F, 17, 30, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F); // Import RightLeg10
		rightLegModel[9].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[9].rotateAngleZ = -1.047198F;

		rightLegModel[10].addShapeBox(49F, -9F, -54F, 21, 21, 14, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg11
		rightLegModel[10].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[10].rotateAngleZ = -0.9075712F;

		rightLegModel[11].addBox(35F, 6F, -53F, 24, 25, 11, 0F); // Import RightLeg12
		rightLegModel[11].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[11].rotateAngleZ = -0.9075712F;

		rightLegModel[12].addBox(9F, 22F, -59F, 39, 20, 20, 0F); // Import RightLeg13
		rightLegModel[12].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[12].rotateAngleZ = -0.2617994F;

		rightLegModel[13].addBox(-32F, 27F, -57F, 37, 11, 16, 0F); // Import RightLeg14
		rightLegModel[13].setRotationPoint(-3F, -163F, -6F);

		rightLegModel[14].addBox(-32F, 38F, -52F, 37, 15, 9, 0F); // Import RightLeg15
		rightLegModel[14].setRotationPoint(-3F, -163F, -6F);

		rightLegModel[15].addBox(-8F, 41F, -57.5F, 17, 17, 17, 0F); // Import RightLeg16
		rightLegModel[15].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[15].rotateAngleZ = -0.6981317F;

		rightLegModel[16].addShapeBox(59F, 12F, -52F, 11, 19, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F); // Import RightLeg17
		rightLegModel[16].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[16].rotateAngleZ = -0.9075712F;

		rightLegModel[17].addShapeBox(-8F, 41F, -59F, 25, 25, 20, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Import RightLeg18
		rightLegModel[17].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[17].rotateAngleZ = -0.9599311F;

		rightLegModel[18].addBox(17F, 41F, -59F, 33, 25, 20, 0F); // Import RightLeg19
		rightLegModel[18].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[18].rotateAngleZ = -0.9599311F;

		rightLegModel[19].addShapeBox(17F, 41F, -70F, 33, 25, 11, 0F,-10F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, -20F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg20
		rightLegModel[19].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[19].rotateAngleZ = -0.9599311F;

		rightLegModel[20].addShapeBox(17F, 66F, -59F, 33, 11, 20, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Import RightLeg21
		rightLegModel[20].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[20].rotateAngleZ = -0.9599311F;

		rightLegModel[21].addBox(50F, 55F, -57F, 78, 12, 16, 0F); // Import RightLeg22
		rightLegModel[21].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[21].rotateAngleZ = -0.9599311F;

		rightLegModel[22].addShapeBox(50F, 41F, -59F, 56, 14, 20, 0F,0F, 0F, 0F, 0F, -7F, -4F, 0F, -7F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg23
		rightLegModel[22].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[22].rotateAngleZ = -0.9599311F;

		rightLegModel[23].addBox(53F, 8F, -58F, 28, 10, 18, 0F); // Import RightLeg24
		rightLegModel[23].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[23].rotateAngleZ = -1.448623F;

		rightLegModel[24].addShapeBox(56F, 67F, -57F, 47, 9, 16, 0F,5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F); // Import RightLeg25
		rightLegModel[24].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[24].rotateAngleZ = -0.9599311F;

		rightLegModel[25].addShapeBox(-2F, 83F, -56F, 28, 16, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import RightLeg26
		rightLegModel[25].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[25].rotateAngleZ = -0.4712389F;

		rightLegModel[26].addShapeBox(106F, 44F, -59F, 34, 10, 20, 0F,0F, 0F, -4F, 0F, -5F, -8F, 0F, -5F, -8F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import RightLeg27
		rightLegModel[26].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[26].rotateAngleZ = -0.9599311F;

		rightLegModel[27].addShapeBox(106F, 54F, -68F, 29, 12, 11, 0F,0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4F, -6F, 3F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import RightLeg28
		rightLegModel[27].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[27].rotateAngleZ = -0.9599311F;

		rightLegModel[28].addShapeBox(106F, 54F, -41F, 29, 12, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F, 0F, 0F, 0F, 0F, -1F, 0F, 3F, -4F, 0F, 0F, -4F, -6F); // Import RightLeg29
		rightLegModel[28].setRotationPoint(-3F, -163F, -6F);
		rightLegModel[28].rotateAngleZ = -0.9599311F;


		leftFootModel = new ModelRendererTurbo[9];
		leftFootModel[0] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Import LeftFoot1
		leftFootModel[1] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Import LeftFoot2
		leftFootModel[2] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import LeftFoot3
		leftFootModel[3] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import LeftFoot4
		leftFootModel[4] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import LeftFoot5
		leftFootModel[5] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import LeftFoot7
		leftFootModel[6] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import LeftFoot8
		leftFootModel[7] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import LeftFoot9
		leftFootModel[8] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import LeftFoot6

		leftFootModel[0].addShapeBox(-5F, 122F, 40F, 12, 22, 18, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import LeftFoot1
		leftFootModel[0].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[1].addShapeBox(7F, 117F, 40.5F, 20, 31, 17, 0F,0F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LeftFoot2
		leftFootModel[1].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[2].addBox(-3F, 148F, 38F, 30, 15, 22, 0F); // Import LeftFoot3
		leftFootModel[2].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[3].addShapeBox(28F, 148F, 49F, 10, 15, 11, 0F,0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import LeftFoot4
		leftFootModel[3].setRotationPoint(-4F, -163F, 6F);

		leftFootModel[4].addShapeBox(27F, 148F, 38F, 10, 15, 11, 0F,0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import LeftFoot5
		leftFootModel[4].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[5].addShapeBox(37F, 153F, 54F, 10, 10, 11, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import LeftFoot7
		leftFootModel[5].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[6].addShapeBox(-18F, 148F, 38F, 15, 15, 22, 0F,0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import LeftFoot8
		leftFootModel[6].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[7].addShapeBox(-32F, 153F, 44F, 14, 10, 10, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import LeftFoot9
		leftFootModel[7].setRotationPoint(-3F, -163F, 6F);

		leftFootModel[8].addShapeBox(37F, 153F, 33F, 10, 10, 11, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import LeftFoot6
		leftFootModel[8].setRotationPoint(-3F, -163F, 6F);


		rightFootModel = new ModelRendererTurbo[9];
		rightFootModel[0] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Import RightFoot1
		rightFootModel[1] = new ModelRendererTurbo(this, 400, 700, textureX, textureY); // Import RightFoot2
		rightFootModel[2] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Import RightFoot3
		rightFootModel[3] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import RightFoot4
		rightFootModel[4] = new ModelRendererTurbo(this, 400, 810, textureX, textureY); // Import RightFoot5
		rightFootModel[5] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import RightFoot6
		rightFootModel[6] = new ModelRendererTurbo(this, 400, 870, textureX, textureY); // Import RightFoot7
		rightFootModel[7] = new ModelRendererTurbo(this, 400, 900, textureX, textureY); // Import RightFoot8
		rightFootModel[8] = new ModelRendererTurbo(this, 400, 950, textureX, textureY); // Import RightFoot9

		rightFootModel[0].addShapeBox(-5F, 122F, -58F, 12, 22, 18, 0F,-8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Import RightFoot1
		rightFootModel[0].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[1].addShapeBox(7F, 117F, -57.5F, 20, 31, 17, 0F,0F, 0F, 0F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import RightFoot2
		rightFootModel[1].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[2].addBox(-3F, 148F, -60F, 30, 15, 22, 0F); // Import RightFoot3
		rightFootModel[2].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[3].addShapeBox(27F, 148F, -60F, 10, 15, 11, 0F,0F, 0F, 0F, 0F, -5F, 5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import RightFoot4
		rightFootModel[3].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[4].addShapeBox(27F, 148F, -49F, 10, 15, 11, 0F,0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 0F); // Import RightFoot5
		rightFootModel[4].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[5].addShapeBox(37F, 153F, -44F, 10, 10, 11, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import RightFoot6
		rightFootModel[5].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[6].addShapeBox(37F, 153F, -65F, 10, 10, 11, 0F,0F, 0F, 0F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import RightFoot7
		rightFootModel[6].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[7].addShapeBox(-18F, 148F, -60F, 15, 15, 22, 0F,0F, -5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import RightFoot8
		rightFootModel[7].setRotationPoint(-3F, -163F, -6F);

		rightFootModel[8].addShapeBox(-32F, 153F, -54F, 14, 10, 10, 0F,0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import RightFoot9
		rightFootModel[8].setRotationPoint(-3F, -163F, -6F);

		
		
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}