//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNSCDBody extends ModelCustomArmour
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelNSCDBody()
	{

		bodyModel = new ModelRendererTurbo[31];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 590, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 0, 665, textureX, textureY); // Box 29
		bodyModel[3] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 30
		bodyModel[4] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 34
		bodyModel[8] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 35
		bodyModel[9] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 40
		bodyModel[14] = new ModelRendererTurbo(this, 0, 795, textureX, textureY); // Box 41
		bodyModel[15] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Box 42
		bodyModel[16] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Box 43
		bodyModel[17] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Box 44
		bodyModel[18] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 45
		bodyModel[19] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 46
		bodyModel[20] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Box 47
		bodyModel[21] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 48
		bodyModel[22] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Box 49
		bodyModel[23] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 0, 930, textureX, textureY); // Box 51
		bodyModel[25] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 52
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 53
		bodyModel[27] = new ModelRendererTurbo(this, 0, 960, textureX, textureY); // Box 54
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1023, textureX, textureY); // Box 55
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1023, textureX, textureY); // Box 56
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1000, textureX, textureY); // Box 57

		bodyModel[0].addShapeBox(-16.5F, 0F, -11F, 33, 48, 22, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F); // Box 27
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-16.5F, 0F, -17F, 12, 25, 6, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 28
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(4.5F, 0F, -17F, 12, 25, 6, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 29
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-4.5F, 18F, -13F, 9, 7, 2, 0F); // Box 30
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-4.5F, 2F, -13F, 9, 7, 2, 0F); // Box 31
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-16.5F, 27F, -14F, 33, 11, 3, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 32
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-16.5F, 40F, -13F, 33, 6, 2, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-16.5F, 1F, 11F, 14, 25, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F); // Box 34
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, 1F, 11F, 14, 25, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, -4F, 0F,-4F, -4F, 0F); // Box 35
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 1F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 36
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 5F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 37
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 9F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 38
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 13F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 39
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 17F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 40
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 21F, 11F, 7, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 41
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-14.5F, 2F, -19F, 8, 21, 8, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 42
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(6.5F, 2F, -19F, 8, 21, 8, 0F,0F, -5F, 0F,0F, -5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-13.5F, 3F, 15F, 8, 29, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 44
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-13.5F, 3F, 9F, 2, 29, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 45
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-7.5F, 3F, 9F, 2, 29, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 46
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(5.5F, 3F, 15F, 8, 29, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 47
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(5.5F, 3F, 9F, 2, 29, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 48
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(11.5F, 3F, 9F, 2, 29, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -10F,0F, 0F, -10F,0F, 0F, 10F,0F, 0F, 10F); // Box 49
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.5F, 25F, 11F, 7, 3, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 50
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-15.5F, 28F, 11F, 31, 17, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, -3F, 0F,-3F, -3F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, -3F, 0F,-3F, -3F, 0F); // Box 51
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-19F, 48.5F, -9F, 2, 16, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -2F,0F, 0F, -2F); // Box 52
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(-20F, 48.5F, -5F, 1, 10, 10, 0F); // Box 53
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(17F, 48.5F, -9F, 2, 16, 18, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -2F,0F, 0F, -2F); // Box 54
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-19F, 46.5F, -9F, 2, 2, 18, 0F,-1F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F); // Box 55
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(17F, 46.5F, -9F, 2, 2, 18, 0F,0.5F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Box 56
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(19F, 48.5F, -5F, 1, 10, 10, 0F); // Box 57
		bodyModel[30].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[7];
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 1050, textureX, textureY); // Box 58
		leftArmModel[1] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 59
		leftArmModel[2] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 60
		leftArmModel[3] = new ModelRendererTurbo(this, 0, 1190, textureX, textureY); // Box 61
		leftArmModel[4] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 62
		leftArmModel[5] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 63
		leftArmModel[6] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 64

		leftArmModel[0].addBox(-4.5F, -9F, -9F, 17, 20, 18, 0F); // Box 58
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(12.5F, -9F, -9F, 4, 20, 18, 0F,0F, 0F, 0F,0F, -10F, -2F,0F, -10F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F); // Box 59
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-5F, 11F, -9F, 18, 29, 18, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F); // Box 60
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addBox(-4F, 15F, -9F, 17, 20, 18, 0F); // Box 61
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(13F, 15F, -9F, 1, 20, 18, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F); // Box 62
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-5F, 15F, -10F, 18, 20, 1, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 63
		leftArmModel[5].setRotationPoint(-1F, 0F, 0F);

		leftArmModel[6].addShapeBox(-5F, 15F, 9F, 18, 20, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 64
		leftArmModel[6].setRotationPoint(-1F, 0F, 0F);




		rightArmModel = new ModelRendererTurbo[6];
		rightArmModel[0] = new ModelRendererTurbo(this, 0, 1095, textureX, textureY); // Box 65
		rightArmModel[1] = new ModelRendererTurbo(this, 0, 1050, textureX, textureY); // Box 66
		rightArmModel[2] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Box 67
		rightArmModel[3] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 68
		rightArmModel[4] = new ModelRendererTurbo(this, 0, 1230, textureX, textureY); // Box 70
		rightArmModel[5] = new ModelRendererTurbo(this, 0, 1275, textureX, textureY); // Box 71

		rightArmModel[0].addShapeBox(-16.5F, -9F, -9F, 4, 20, 18, 0F,0F, -10F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, -10F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F); // Box 65
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addBox(-12.5F, -9F, -9F, 17, 20, 18, 0F); // Box 66
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-13F, 11F, -9F, 18, 29, 18, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F,-0.5F, 0.5F, -0.5F); // Box 67
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-13F, 15F, 9F, 18, 20, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F); // Box 68
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-14F, 15F, -9F, 1, 20, 18, 0F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F); // Box 70
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-13F, 15F, -10F, 18, 20, 1, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 71
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);


	}
}
