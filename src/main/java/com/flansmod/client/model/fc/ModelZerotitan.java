//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelZerotitan extends ModelMecha
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelZerotitan()
	{
		hipsAttachmentPoint = new Vector3f(-50F / 16F, 120F / 16F, 0F);
		legsOrigin = new Vector3f(-1F / 16F, 91F / 19F, 0F);
		leftLegUpperOrigin = new Vector3f(-1F / 16F, 91F / 16F, -19F / 16F);
		leftLegLowerOrigin = new Vector3f(-19F / 16F, 66F / 16F, -19F / 16F);
		rightLegUpperOrigin = new Vector3f(-1F / 16F, 91F / 16F, 35F / 16F);
		rightLegLowerOrigin = new Vector3f(-19F / 16F, 66F / 16F, 35F / 16F);
		rightFootOrigin = new Vector3f(4F/16F, 17F/16F, -36F/16F);
		leftFootOrigin = new Vector3f(4F/16F, 17F/16F, 19F/16F);
		
		bodyModel = new ModelRendererTurbo[64];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 130, textureX, textureY); // Import Box8
		bodyModel[1] = new ModelRendererTurbo(this, 0, 150, textureX, textureY); // Import Box9
		bodyModel[2] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import Box10
		bodyModel[3] = new ModelRendererTurbo(this, 0, 230, textureX, textureY); // Import Box11
		bodyModel[4] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Box13
		bodyModel[5] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Box14
		bodyModel[6] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import Box15
		bodyModel[7] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box17
		bodyModel[8] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Box19
		bodyModel[9] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box20
		bodyModel[10] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box21
		bodyModel[11] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Box22
		bodyModel[12] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box23
		bodyModel[13] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box24
		bodyModel[14] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box25
		bodyModel[15] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Box27
		bodyModel[16] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box28
		bodyModel[17] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Box29
		bodyModel[18] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Box30
		bodyModel[19] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Box31
		bodyModel[20] = new ModelRendererTurbo(this, 0, 570, textureX, textureY); // Import Box32
		bodyModel[21] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Box33
		bodyModel[22] = new ModelRendererTurbo(this, 0, 710, textureX, textureY); // Import Box44
		bodyModel[23] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import Box45
		bodyModel[24] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Box46
		bodyModel[25] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Box47
		bodyModel[26] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box48
		bodyModel[27] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import Box49
		bodyModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box50
		bodyModel[29] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import Box51
		bodyModel[30] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box52
		bodyModel[31] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Import Box53
		bodyModel[32] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box54
		bodyModel[33] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Box55
		bodyModel[34] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Import Box0
		bodyModel[35] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Import Box1
		bodyModel[36] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Import Box2
		bodyModel[37] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Import Box3
		bodyModel[38] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Import Box4
		bodyModel[39] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box5
		bodyModel[40] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Import Box6
		bodyModel[41] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Box7
		bodyModel[42] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Import Box50
		bodyModel[43] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box51
		bodyModel[44] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box52
		bodyModel[45] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box53
		bodyModel[46] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box54
		bodyModel[47] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box55
		bodyModel[48] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box56
		bodyModel[49] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Import Box57
		bodyModel[50] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Import Box58
		bodyModel[51] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Import Box59
		bodyModel[52] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Import Box60
		bodyModel[53] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box61
		bodyModel[54] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box62
		bodyModel[55] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Import Box63
		bodyModel[56] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Import Box64
		bodyModel[57] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Import Box72
		bodyModel[58] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Import Box73
		bodyModel[59] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Box74
		bodyModel[60] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Import Box75
		bodyModel[61] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Import Box76
		bodyModel[62] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Import Box77
		bodyModel[63] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Import Box78

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,-2F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box8
		bodyModel[0].setRotationPoint(31F, -121F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 20, 16, 0F); // Import Box9
		bodyModel[1].setRotationPoint(28F, -137F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, 0F, 0F,0F, -3F, -3F,0F, -3F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, -3F,0F, -3F, -3F,0F, 0F, 0F); // Import Box10
		bodyModel[2].setRotationPoint(31F, -137F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 29, 2, 20, 0F); // Import Box11
		bodyModel[3].setRotationPoint(28F, -117F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 20, 3, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, -2F,0F, 0F, -2F,4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F); // Import Box13
		bodyModel[4].setRotationPoint(58F, -137F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 20, 3, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 2F,0F, 0F, 2F,4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F); // Import Box14
		bodyModel[5].setRotationPoint(58F, -137F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box15
		bodyModel[6].setRotationPoint(58F, -140F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 30, 3, 2, 0F,0F, 7F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, 7F, 0F,0F, -2F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, -2F, 0F); // Import Box17
		bodyModel[7].setRotationPoint(28F, -140F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, -12F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, -12F, 0F,0F, 12F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, 12F, 0F); // Import Box19
		bodyModel[8].setRotationPoint(28F, -131F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 3, 2, 0F,0F, 7F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, 7F, 0F,0F, -2F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, -2F, 0F); // Import Box20
		bodyModel[9].setRotationPoint(28F, -140F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 30, 1, 2, 0F,0F, 7F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, 7F, 0F,0F, -7F, 0F,0F, 0F, 2F,0F, 0F, -2F,0F, -7F, 0F); // Import Box21
		bodyModel[10].setRotationPoint(28F, -139F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 1, 2, 0F,0F, 7F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, 7F, 0F,0F, -7F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, -7F, 0F); // Import Box22
		bodyModel[11].setRotationPoint(28F, -139F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0.58F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.58F, 0F,0F, -0.58F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.58F, 0F); // Import Box23
		bodyModel[12].setRotationPoint(55F, -139F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, -2F,0F, 0F, -2F,4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F); // Import Box24
		bodyModel[13].setRotationPoint(55F, -137F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 2F,0F, 0F, 2F,4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F); // Import Box25
		bodyModel[14].setRotationPoint(55F, -137F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 29, 5, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,2F, -2F, -5F,2F, -2F, -5F,0F, 0F, -5F); // Import Box27
		bodyModel[15].setRotationPoint(28F, -115F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 7, 16, 0F,-2F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,-2F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box28
		bodyModel[16].setRotationPoint(49F, -124F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 32, 20, 0F); // Import Box29
		bodyModel[17].setRotationPoint(26F, -147F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, -4F, 0F); // Import Box30
		bodyModel[18].setRotationPoint(26F, -115F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 32, 20, 0F,0F, 4F, 8F,0F, 0F, 0F,0F, 0F, 0F,0F, 4F, 8F,0F, 0F, 8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F); // Import Box31
		bodyModel[19].setRotationPoint(8F, -147F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 23, 36, 36, 0F); // Import Box32
		bodyModel[20].setRotationPoint(-15F, -151F, -18F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 33, 29, 28, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box33
		bodyModel[21].setRotationPoint(-50F, -144F, -14F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 36, 36, 0F,0F, -4F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Import Box44
		bodyModel[22].setRotationPoint(-17F, -151F, -18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 27, 8, 12, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box45
		bodyModel[23].setRotationPoint(-30F, -153F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 28, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box46
		bodyModel[24].setRotationPoint(-19F, -143F, 14F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 33, 28, 20, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box47
		bodyModel[25].setRotationPoint(-19F, -143F, -34F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 33, 10, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F); // Import Box48
		bodyModel[26].setRotationPoint(-19F, -116F, 14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 33, 10, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F); // Import Box49
		bodyModel[27].setRotationPoint(-19F, -116F, -32F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 10, 20, 0F,0F, 0F, 8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,0F, 0F, 4F,-4F, 0F, -4F,-4F, 0F, -4F,0F, 0F, 4F); // Import Box50
		bodyModel[28].setRotationPoint(8F, -115F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 23, 10, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,-4F, 0F, -4F); // Import Box51
		bodyModel[29].setRotationPoint(-15F, -115F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 19, 16, 18, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box52
		bodyModel[30].setRotationPoint(-38F, -137F, -25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 16, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Box53
		bodyModel[31].setRotationPoint(-38F, -137F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 39, 10, 8, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F); // Import Box54
		bodyModel[32].setRotationPoint(-50F, -115F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 39, 10, 8, 0F,0F, 0F, 0F,0F, 3F, 0F,0F, 3F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F); // Import Box55
		bodyModel[33].setRotationPoint(-50F, -115F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Import Box0
		bodyModel[34].setRotationPoint(48F, -139F, 6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 11, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Import Box1
		bodyModel[35].setRotationPoint(48F, -139F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 20, 3, 1, 0F,0F, -12F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, -12F, 0F,0F, 12F, 0F,0F, 0F, -2F,0F, 0F, 2F,0F, 12F, 0F); // Import Box2
		bodyModel[36].setRotationPoint(28F, -131F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 18, 10, 8, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box3
		bodyModel[37].setRotationPoint(-46F, -134F, -22F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 18, 10, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Box4
		bodyModel[38].setRotationPoint(-46F, -134F, 14F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 20, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box5
		bodyModel[39].setRotationPoint(14F, -139F, 12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 20, 15, 0F,0F, -4F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box6
		bodyModel[40].setRotationPoint(14F, -139F, -27F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 20, 20, 0F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F,0F, -1F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, -1F); // Import Box7
		bodyModel[41].setRotationPoint(-55F, -140F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 29, 4, 26, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box50
		bodyModel[42].setRotationPoint(-17F, -134F, 34F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box51
		bodyModel[43].setRotationPoint(-13F, -138F, 34F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box52
		bodyModel[44].setRotationPoint(4F, -138F, 34F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box53
		bodyModel[45].setRotationPoint(-4F, -138F, 34F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box54
		bodyModel[46].setRotationPoint(-13F, -130F, 39F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 12, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,8F, 0F, 0F); // Import Box55
		bodyModel[47].setRotationPoint(-9F, -126F, 43F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 20, 2, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Import Box56
		bodyModel[48].setRotationPoint(-21F, -114F, 41F);

		bodyModel[49].addBox(0F, 0F, 0F, 20, 8, 2, 0F); // Import Box57
		bodyModel[49].setRotationPoint(-21F, -112F, 39F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box58
		bodyModel[50].setRotationPoint(-21F, -104F, 39F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box59
		bodyModel[51].setRotationPoint(-21F, -104F, 57F);

		bodyModel[52].addBox(0F, 0F, 0F, 20, 8, 2, 0F); // Import Box60
		bodyModel[52].setRotationPoint(-21F, -112F, 57F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box61
		bodyModel[53].setRotationPoint(-13F, -138F, -60F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box62
		bodyModel[54].setRotationPoint(-4F, -138F, -60F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 4, 26, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box63
		bodyModel[55].setRotationPoint(4F, -138F, -60F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 29, 4, 26, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box64
		bodyModel[56].setRotationPoint(-17F, -134F, -60F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 21, 4, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box72
		bodyModel[57].setRotationPoint(-13F, -130F, -59F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 12, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,8F, 0F, 0F); // Import Box73
		bodyModel[58].setRotationPoint(-9F, -126F, -55F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 20, 2, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Import Box74
		bodyModel[59].setRotationPoint(-21F, -114F, -57F);

		bodyModel[60].addBox(0F, 0F, 0F, 20, 8, 2, 0F); // Import Box75
		bodyModel[60].setRotationPoint(-21F, -112F, -59F);

		bodyModel[61].addBox(0F, 0F, 0F, 20, 8, 2, 0F); // Import Box76
		bodyModel[61].setRotationPoint(-21F, -112F, -41F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box77
		bodyModel[62].setRotationPoint(-21F, -104F, -41F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 4, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Import Box78
		bodyModel[63].setRotationPoint(-21F, -104F, -59F);


		hipsModel = new ModelRendererTurbo[8];
		hipsModel[0] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Import Box1
		hipsModel[1] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box4
		hipsModel[2] = new ModelRendererTurbo(this, 200, 420, textureX, textureY); // Import Box5
		hipsModel[3] = new ModelRendererTurbo(this, 200, 460, textureX, textureY); // Import Box8
		hipsModel[4] = new ModelRendererTurbo(this, 200, 510, textureX, textureY); // Import Box9
		hipsModel[5] = new ModelRendererTurbo(this, 200, 560, textureX, textureY); // Import Box10
		hipsModel[6] = new ModelRendererTurbo(this, 200, 620, textureX, textureY); // Import Box11
		hipsModel[7] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Import Box12

		hipsModel[0].addBox(0F, 0F, 0F, 19, 4, 24, 0F); // Import Box1
		hipsModel[0].setRotationPoint(-11F, -105F, -12F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 14, 4, 24, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F); // Import Box4
		hipsModel[1].setRotationPoint(8F, -105F, -12F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 24, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F); // Import Box5
		hipsModel[2].setRotationPoint(-25F, -105F, -12F);

		hipsModel[3].addBox(0F, 0F, 0F, 38, 14, 28, 0F); // Import Box8
		hipsModel[3].setRotationPoint(-16F, -101F, -14F);

		hipsModel[4].addShapeBox(0F, 0F, 0F, 6, 14, 28, 0F,0F, 0F, 0F,0F, -2F, -4F,0F, -2F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Import Box9
		hipsModel[4].setRotationPoint(22F, -101F, -14F);

		hipsModel[5].addShapeBox(0F, 0F, 0F, 17, 14, 28, 0F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, -4F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, -8F); // Import Box10
		hipsModel[5].setRotationPoint(-33F, -101F, -14F);

		hipsModel[6].addShapeBox(0F, 0F, 0F, 21, 7, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F); // Import Box11
		hipsModel[6].setRotationPoint(-11F, -87F, -14F);

		hipsModel[7].addBox(0F, 0F, 0F, 14, 14, 38, 0F); // Import Box12
		hipsModel[7].setRotationPoint(-8F, -98F, -19F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Box 2
		leftArmModel[1] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Box 4
		leftArmModel[3] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Box 5
		leftArmModel[4] = new ModelRendererTurbo(this, 400, 680, textureX, textureY); // Box 6

		leftArmModel[0].addBox(-11F, -8F, 6F, 23, 16, 2, 0F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.57079633F;

		leftArmModel[1].addBox(-11F, -8F, -8F, 23, 16, 2, 0F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addBox(-11F, 8F, -8F, 23, 2, 16, 0F); // Box 4
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addBox(-11F, -10F, -8F, 23, 2, 16, 0F); // Box 5
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addBox(-13F, -10F, -8F, 2, 20, 16, 0F); // Box 6
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		rightArmModel = new ModelRendererTurbo[5];
		rightArmModel[0] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 400, 600, textureX, textureY); // Box 3
		rightArmModel[2] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Box 4
		rightArmModel[3] = new ModelRendererTurbo(this, 400, 640, textureX, textureY); // Box 5
		rightArmModel[4] = new ModelRendererTurbo(this, 400, 680, textureX, textureY); // Box 6

		rightArmModel[0].addBox(-11F, -8F, 6F, 23, 16, 2, 0F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.57079633F;

		rightArmModel[1].addBox(-11F, -8F, -8F, 23, 16, 2, 0F); // Box 3
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.57079633F;

		rightArmModel[2].addBox(-11F, 8F, -8F, 23, 2, 16, 0F); // Box 4
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.57079633F;

		rightArmModel[3].addBox(-11F, -10F, -8F, 23, 2, 16, 0F); // Box 5
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.57079633F;

		rightArmModel[4].addBox(-13F, -10F, -8F, 2, 20, 16, 0F); // Box 6
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -1.57079633F;
		

		leftAnimLegUpperModel = new ModelRendererTurbo[8];
		leftAnimLegUpperModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box13
		leftAnimLegUpperModel[1] = new ModelRendererTurbo(this, 400, 40, textureX, textureY); // Import Box15
		leftAnimLegUpperModel[2] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import Box16
		leftAnimLegUpperModel[3] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import Box17
		leftAnimLegUpperModel[4] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box18
		leftAnimLegUpperModel[5] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box19
		leftAnimLegUpperModel[6] = new ModelRendererTurbo(this, 400, 480, textureX, textureY); // Import Box30
		leftAnimLegUpperModel[7] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box31

		leftAnimLegUpperModel[0].addBox(-6F, -10F, 0F, 23, 20, 18, 0F); // Import Box13
		leftAnimLegUpperModel[0].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[0].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[0].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[1].addBox(17F, -10F, 0F, 4, 2, 18, 0F); // Import Box15
		leftAnimLegUpperModel[1].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[1].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[1].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[2].addBox(17F, -8F, 0F, 4, 18, 2, 0F); // Import Box16
		leftAnimLegUpperModel[2].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[2].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[2].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[3].addBox(17F, -8F, 16F, 4, 18, 2, 0F); // Import Box17
		leftAnimLegUpperModel[3].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[3].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[3].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[4].addBox(7F, 10F, 2F, 10, 25, 14, 0F); // Import Box18
		leftAnimLegUpperModel[4].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[4].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[4].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[5].addBox(-4F, 10F, 6F, 6, 25, 6, 0F); // Import Box19
		leftAnimLegUpperModel[5].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[5].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[5].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[6].addShapeBox(-9F, -10F, 0F, 3, 20, 18, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box30
		leftAnimLegUpperModel[6].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[6].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[6].rotateAngleZ = -0.6981317F;

		leftAnimLegUpperModel[7].addShapeBox(17F, -2F, 4F, 2, 32, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box31
		leftAnimLegUpperModel[7].setRotationPoint(-1F, -91F, 19F);
		leftAnimLegUpperModel[7].rotateAngleX = 0.01745329F;
		leftAnimLegUpperModel[7].rotateAngleZ = -0.6981317F;


		rightAnimLegUpperModel = new ModelRendererTurbo[8];
		rightAnimLegUpperModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import Box32
		rightAnimLegUpperModel[1] = new ModelRendererTurbo(this, 400, 480, textureX, textureY); // Import Box33
		rightAnimLegUpperModel[2] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import Box34
		rightAnimLegUpperModel[3] = new ModelRendererTurbo(this, 400, 40, textureX, textureY); // Import Box35
		rightAnimLegUpperModel[4] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import Box36
		rightAnimLegUpperModel[5] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Import Box37
		rightAnimLegUpperModel[6] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import Box38
		rightAnimLegUpperModel[7] = new ModelRendererTurbo(this, 400, 150, textureX, textureY); // Import Box39

		rightAnimLegUpperModel[0].addBox(-6F, -10F, 0F, 23, 20, 18, 0F); // Import Box32
		rightAnimLegUpperModel[0].setRotationPoint(-1F, -91F, -37F);
		rightAnimLegUpperModel[0].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[0].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[1].addShapeBox(-9F, -10F, 0F, 3, 20, 18, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Import Box33
		rightAnimLegUpperModel[1].setRotationPoint(-1F, -91F, -37F);
		rightAnimLegUpperModel[1].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[1].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[2].addBox(17F, -8F, 16F, 4, 18, 2, 0F); // Import Box34
		rightAnimLegUpperModel[2].setRotationPoint(-1F, -91F, -37F);
		rightAnimLegUpperModel[2].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[2].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[3].addBox(17F, -10F, 0F, 4, 2, 18, 0F); // Import Box35
		rightAnimLegUpperModel[3].setRotationPoint(-1F, -91F, -37F);
		rightAnimLegUpperModel[3].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[3].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[4].addBox(17F, -8F, 0F, 4, 18, 2, 0F); // Import Box36
		rightAnimLegUpperModel[4].setRotationPoint(-1F, -91F, -37F);
		rightAnimLegUpperModel[4].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[4].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[5].addShapeBox(17F, -2F, -4F, 2, 32, 10, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import Box37
		rightAnimLegUpperModel[5].setRotationPoint(-1F, -91F, -29F);
		rightAnimLegUpperModel[5].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[5].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[6].addBox(7F, 10F, -2F, 10, 25, 14, 0F); // Import Box38
		rightAnimLegUpperModel[6].setRotationPoint(-1F, -91F, -33F);
		rightAnimLegUpperModel[6].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[6].rotateAngleZ = -0.6981317F;

		rightAnimLegUpperModel[7].addBox(-4F, 10F, -6F, 6, 25, 6, 0F); // Import Box39
		rightAnimLegUpperModel[7].setRotationPoint(-1F, -91F, -25F);
		rightAnimLegUpperModel[7].rotateAngleX = 0.01745329F;
		rightAnimLegUpperModel[7].rotateAngleZ = -0.6981317F;


		leftAnimLegLowerModel = new ModelRendererTurbo[3];
		leftAnimLegLowerModel[0] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box20
		leftAnimLegLowerModel[1] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Import Box29
		leftAnimLegLowerModel[2] = new ModelRendererTurbo(this, 400, 570, textureX, textureY); // Import Box90

		leftAnimLegLowerModel[0].addBox(-7F, -3F, 1F, 63, 16, 16, 0F); // Import Box20
		leftAnimLegLowerModel[0].rotateAngleZ = -1.04719755F;

		leftAnimLegLowerModel[1].addBox(-17F, 3F, 6F, 10, 6, 6, 0F); // Import Box29
		leftAnimLegLowerModel[1].rotateAngleZ = -1.04719755F;

		leftAnimLegLowerModel[2].addBox(-22F, 2F, 5F, 6, 8, 8, 0F); // Import Box90
		leftAnimLegLowerModel[2].rotateAngleZ = -1.04719755F;


		rightAnimLegLowerModel = new ModelRendererTurbo[3];
		rightAnimLegLowerModel[0] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Import Box40
		rightAnimLegLowerModel[1] = new ModelRendererTurbo(this, 400, 200, textureX, textureY); // Import Box41
		rightAnimLegLowerModel[2] = new ModelRendererTurbo(this, 400, 570, textureX, textureY); // Import Box89

		rightAnimLegLowerModel[0].addBox(-17F, 3F, 4F, 10, 6, 6, 0F); // Import Box40
		rightAnimLegLowerModel[0].rotateAngleX = 0.01745329F;
		rightAnimLegLowerModel[0].rotateAngleZ = -1.04719755F;

		rightAnimLegLowerModel[1].addBox(-7F, -3F, -1F, 63, 16, 16, 0F); // Import Box41
		rightAnimLegLowerModel[1].rotateAngleX = 0.01745329F;
		rightAnimLegLowerModel[1].rotateAngleZ = -1.04719755F;

		rightAnimLegLowerModel[2].addBox(-22F, 2F, 3F, 6, 8, 8, 0F); // Import Box89
		rightAnimLegLowerModel[2].rotateAngleX = 0.01745329F;
		rightAnimLegLowerModel[2].rotateAngleZ = -1.04719755F;


		leftAnimFootModel = new ModelRendererTurbo[8];
		leftAnimFootModel[0] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Box 21
		leftAnimFootModel[1] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Box 22
		leftAnimFootModel[2] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 23
		leftAnimFootModel[3] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Box 24
		leftAnimFootModel[4] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 25
		leftAnimFootModel[5] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Box 26
		leftAnimFootModel[6] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Box 27
		leftAnimFootModel[7] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 28

		leftAnimFootModel[0].addShapeBox(1F, -11F, -0.5F, 22, 28, 18, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		leftAnimFootModel[1].addShapeBox(-17F, 1F, -0.5F, 18, 16, 18, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22

		leftAnimFootModel[2].addShapeBox(14F, 10.9F, 4F, 22, 4, 10, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23

		leftAnimFootModel[3].addBox(14F, 14.9F, 4F, 22, 2, 10, 0F); // Box 24

		leftAnimFootModel[4].addShapeBox(-31F, 10.9F, 4F, 22, 4, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		leftAnimFootModel[5].addBox(-31F, 14.9F, 4F, 22, 2, 10, 0F); // Box 26
		
		leftAnimFootModel[6].addBox(-2F, 15F, -8F, 10, 2, 34, 0F); // Box 27

		leftAnimFootModel[7].addShapeBox(-2F, 11F, -8F, 10, 4, 34, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28


		rightAnimFootModel = new ModelRendererTurbo[8];
		rightAnimFootModel[0] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Box 121
		rightAnimFootModel[1] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Box 122
		rightAnimFootModel[2] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 123
		rightAnimFootModel[3] = new ModelRendererTurbo(this, 400, 380, textureX, textureY); // Box 124
		rightAnimFootModel[4] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Box 125
		rightAnimFootModel[5] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 126
		rightAnimFootModel[6] = new ModelRendererTurbo(this, 400, 360, textureX, textureY); // Box 127
		rightAnimFootModel[7] = new ModelRendererTurbo(this, 400, 340, textureX, textureY); // Box 128

		rightAnimFootModel[0].addShapeBox(1F, -11F, -0.5F, 22, 28, 18, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121

		rightAnimFootModel[1].addShapeBox(-17F, 1F, -0.5F, 18, 16, 18, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122

		rightAnimFootModel[2].addShapeBox(-2F, 11F, -8F, 10, 4, 34, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123

		rightAnimFootModel[3].addBox(-2F, 15F, -8F, 10, 2, 34, 0F); // Box 124

		rightAnimFootModel[4].addBox(-31F, 14.9F, 4F, 22, 2, 10, 0F); // Box 125

		rightAnimFootModel[5].addShapeBox(-31F, 10.9F, 4F, 22, 4, 10, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126

		rightAnimFootModel[6].addBox(14F, 14.9F, 4F, 22, 2, 10, 0F); // Box 127

		rightAnimFootModel[7].addShapeBox(14F, 10.9F, 4F, 22, 4, 10, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128




		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
