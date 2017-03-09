//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBanana extends ModelMecha
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBanana()	
	{


// Body
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this,  1,  426, textureX, textureY); // BanaMechCore1
		bodyModel[1] = new ModelRendererTurbo(this,  1,  448, textureX, textureY); // BanaMechCore2
		bodyModel[2] = new ModelRendererTurbo(this,  1,  479, textureX, textureY); // BanaMechCore3
		bodyModel[3] = new ModelRendererTurbo(this,  1,  517, textureX, textureY); // BanaMechCore4
		bodyModel[4] = new ModelRendererTurbo(this,  101,  480, textureX, textureY); // BanaMechCore5
		bodyModel[5] = new ModelRendererTurbo(this,  1,  549, textureX, textureY); // BanaMechCore6
		bodyModel[6] = new ModelRendererTurbo(this,  161,  480, textureX, textureY); // BanaMechCore7
		bodyModel[7] = new ModelRendererTurbo(this,  99,  400, textureX, textureY); // BanaMechCore8Pit
		bodyModel[8] = new ModelRendererTurbo(this,  150,  457, textureX, textureY); // BanaMechCore9
		bodyModel[9] = new ModelRendererTurbo(this,  185,  437, textureX, textureY); // BanaMechCore10
		bodyModel[10] = new ModelRendererTurbo(this,  188,  418, textureX, textureY); // BanaMechCore11
		bodyModel[11] = new ModelRendererTurbo(this,  221,  400, textureX, textureY); // BanaMechCore12
		bodyModel[12] = new ModelRendererTurbo(this,  188,  400, textureX, textureY); // BanaMechCore13
		bodyModel[13] = new ModelRendererTurbo(this,  222,  416, textureX, textureY); // BanaMechCore14
		bodyModel[14] = new ModelRendererTurbo(this,  246,  400, textureX, textureY); // BanaMechCore15
		bodyModel[15] = new ModelRendererTurbo(this,  188,  400, textureX, textureY); // BanaMechCore16
		bodyModel[16] = new ModelRendererTurbo(this,  221,  400, textureX, textureY); // BanaMechCore18
		bodyModel[17] = new ModelRendererTurbo(this,  185,  437, textureX, textureY); // BanaMechCore17
		bodyModel[18] = new ModelRendererTurbo(this,  188,  418, textureX, textureY); // BanaMechCore19
		bodyModel[19] = new ModelRendererTurbo(this,  222,  416, textureX, textureY); // BanaMechCore20
		bodyModel[20] = new ModelRendererTurbo(this,  246,  400, textureX, textureY); // BanaMechCore21
		bodyModel[21] = new ModelRendererTurbo(this,  150,  457, textureX, textureY); // BanaMechCore22
		bodyModel[22] = new ModelRendererTurbo(this,  101,  511, textureX, textureY); // BanaMechCore23
		bodyModel[23] = new ModelRendererTurbo(this,  101,  323, textureX, textureY); // BanaMechCore24
		bodyModel[24] = new ModelRendererTurbo(this,  92,  360, textureX, textureY); // BanaMechCore25
		bodyModel[25] = new ModelRendererTurbo(this,  101,  323, textureX, textureY); // BanaMechCore26
		bodyModel[26] = new ModelRendererTurbo(this,  82,  324, textureX, textureY); // BanaMechCore27
		bodyModel[27] = new ModelRendererTurbo(this,  92,  360, textureX, textureY); // BanaMechCore28
		bodyModel[28] = new ModelRendererTurbo(this,  146,  310, textureX, textureY); // BanaMechCore29
		bodyModel[29] = new ModelRendererTurbo(this,  82,  324, textureX, textureY); // BanaMechCore30
		bodyModel[30] = new ModelRendererTurbo(this,  82,  324, textureX, textureY); // BanaMechCore31
		bodyModel[31] = new ModelRendererTurbo(this,  82,  324, textureX, textureY); // BanaMechCore32
		bodyModel[32] = new ModelRendererTurbo(this,  151,  347, textureX, textureY); // BanaMechCore33
		bodyModel[33] = new ModelRendererTurbo(this,  179,  317, textureX, textureY); // BanaMechCore34
		bodyModel[34] = new ModelRendererTurbo(this,  146,  327, textureX, textureY); // BanaMechCore35
		bodyModel[35] = new ModelRendererTurbo(this,  101,  455, textureX, textureY); // BanaMechCore36
		bodyModel[36] = new ModelRendererTurbo(this,  102,  449, textureX, textureY); // BanaMechCore37
		bodyModel[37] = new ModelRendererTurbo(this,  102,  449, textureX, textureY); // BanaMechCore38
		bodyModel[38] = new ModelRendererTurbo(this,  103,  455, textureX, textureY); // BanaMechCore39
		bodyModel[39] = new ModelRendererTurbo(this,  162,  458, textureX, textureY); // BanaMechCore40
		bodyModel[40] = new ModelRendererTurbo(this,  162,  458, textureX, textureY); // BanaMechCore41

		bodyModel[0].addBox(-6F, -34F, -4F, 8, 13, 8, 0); // BanaMechCore1
		bodyModel[0].setRotationPoint(0F, -93F, 0F);
		bodyModel[0].rotateAngleZ = -0.669215F;

		bodyModel[1].addBox(-15F, -23F, -7F, 14, 15, 14, 0); // BanaMechCore2
		bodyModel[1].setRotationPoint(0F, -93F, 0F);
		bodyModel[1].rotateAngleZ = -0.8922867F;

		bodyModel[2].addBox(-9F, -15F, -9F, 18, 18, 18, 0); // BanaMechCore3
		bodyModel[2].setRotationPoint(0F, -93F, 0F);
		bodyModel[2].rotateAngleZ = -0.2974289F;

		bodyModel[3].addBox(-12F, -3F, -11F, 22, 7, 22, 0); // BanaMechCore4
		bodyModel[3].setRotationPoint(0F, -93F, 0F);

		bodyModel[4].addBox(5F, -10F, -11F, 7, 7, 22, 0); // BanaMechCore5
		bodyModel[4].setRotationPoint(0F, -93F, 0F);
		bodyModel[4].rotateAngleZ = -0.7853982F;

		bodyModel[5].addBox(-11F, 23F, -11F, 22, 7, 22, 0); // BanaMechCore6
		bodyModel[5].setRotationPoint(0F, -93F, 0F);

		bodyModel[6].addBox(22F, 7F, -11F, 7, 7, 22, 0); // BanaMechCore7
		bodyModel[6].setRotationPoint(0F, -93F, 0F);
		bodyModel[6].rotateAngleZ = -0.7853982F;

		bodyModel[7].addBox(-7F, 0F, -10F, 20, 28, 20, 0); // BanaMechCore8Pit
		bodyModel[7].setRotationPoint(0F, -93F, 0F);

		bodyModel[8].addBox(12F, 4F, -10F, 3, 20, 2, 0); // BanaMechCore9
		bodyModel[8].setRotationPoint(0F, -93F, 0F);

		bodyModel[9].addBox(-10F, 1F, -16F, 20, 24, 6, 0); // BanaMechCore10
		bodyModel[9].setRotationPoint(0F, -93F, 0F);

		bodyModel[10].addBox(14F, 0F, -16F, 10, 10, 5, 0); // BanaMechCore11
		bodyModel[10].setRotationPoint(0F, -93F, 0F);
		bodyModel[10].rotateAngleZ = -0.7853982F;

		bodyModel[11].addBox(8.5F, 8F, -15F, 8, 9, 3, 0); // BanaMechCore12
		bodyModel[11].setRotationPoint(0F, -93F, 0F);

		bodyModel[12].addBox(8F, -6F, -16F, 10, 10, 5, 0); // BanaMechCore13
		bodyModel[12].setRotationPoint(0F, -93F, 0F);
		bodyModel[12].rotateAngleZ = -0.7853982F;

		bodyModel[13].addBox(5F, 4F, -20F, 10, 10, 4, 0); // BanaMechCore14
		bodyModel[13].setRotationPoint(0F, -93F, 0F);
		bodyModel[13].rotateAngleZ = -0.7853982F;

		bodyModel[14].addBox(7F, 6F, -24F, 6, 6, 4, 0); // BanaMechCore15
		bodyModel[14].setRotationPoint(0F, -93F, 0F);
		bodyModel[14].rotateAngleZ = -0.7853982F;

		bodyModel[15].addBox(8F, -6F, 11F, 10, 10, 5, 0); // BanaMechCore16
		bodyModel[15].setRotationPoint(0F, -93F, 0F);
		bodyModel[15].rotateAngleZ = -0.7853982F;

		bodyModel[16].addBox(8.5F, 8F, 12F, 8, 9, 3, 0); // BanaMechCore18
		bodyModel[16].setRotationPoint(0F, -93F, 0F);

		bodyModel[17].addBox(-10F, 1F, 10F, 20, 24, 6, 0); // BanaMechCore17
		bodyModel[17].setRotationPoint(0F, -93F, 0F);

		bodyModel[18].addBox(14F, 0F, 11F, 10, 10, 5, 0); // BanaMechCore19
		bodyModel[18].setRotationPoint(0F, -93F, 0F);
		bodyModel[18].rotateAngleZ = -0.7853982F;

		bodyModel[19].addBox(5F, 4F, 16F, 10, 10, 4, 0); // BanaMechCore20
		bodyModel[19].setRotationPoint(0F, -93F, 0F);
		bodyModel[19].rotateAngleZ = -0.7853982F;

		bodyModel[20].addBox(7F, 6F, 20F, 6, 6, 4, 0); // BanaMechCore21
		bodyModel[20].setRotationPoint(0F, -93F, 0F);
		bodyModel[20].rotateAngleZ = -0.7853982F;

		bodyModel[21].addBox(12F, 4F, 8F, 3, 20, 2, 0); // BanaMechCore22
		bodyModel[21].setRotationPoint(0F, -93F, 0F);

		bodyModel[22].addBox(14F, 4F, -8F, 3, 20, 16, 0); // BanaMechCore23
		bodyModel[22].setRotationPoint(0F, -93F, 0F);

		bodyModel[23].addBox(-9F, 1F, -19F, 10, 22, 10, 0); // BanaMechCore24
		bodyModel[23].setRotationPoint(0F, -93F, 0F);
		bodyModel[23].rotateAngleY = -0.7853982F;

		bodyModel[24].addBox(-6F, 12F, -8F, 10, 10, 16, 0); // BanaMechCore25
		bodyModel[24].setRotationPoint(0F, -80.8F, 0F);
		bodyModel[24].rotateAngleZ = -0.7853982F;

		bodyModel[25].addBox(-19F, 1F, -9F, 10, 22, 10, 0); // BanaMechCore26
		bodyModel[25].setRotationPoint(0F, -93F, 0F);
		bodyModel[25].rotateAngleY = -0.7853982F;

		bodyModel[26].addBox(-16F, 21F, -13F, 4, 11, 4, 0); // BanaMechCore27
		bodyModel[26].setRotationPoint(0F, -93F, 0F);
		bodyModel[26].rotateAngleX = 0.7853982F;

		bodyModel[27].addBox(-22F, -4F, -8F, 10, 10, 16, 0); // BanaMechCore28
		bodyModel[27].setRotationPoint(0F, -80.8F, 0F);
		bodyModel[27].rotateAngleZ = -0.7853982F;

		bodyModel[28].addBox(-11F, 10.8F, -4F, 5, 6, 8, 0); // BanaMechCore29
		bodyModel[28].setRotationPoint(0F, -93F, 0F);
		bodyModel[28].rotateAngleZ = -1.226894F;

		bodyModel[29].addBox(-16F, 20F, 9F, 4, 11, 4, 0); // BanaMechCore30
		bodyModel[29].setRotationPoint(0F, -93F, 0F);
		bodyModel[29].rotateAngleX = -0.7853982F;

		bodyModel[30].addBox(-16F, -14F, -8F, 4, 11, 4, 0); // BanaMechCore31
		bodyModel[30].setRotationPoint(0F, -93F, 0F);
		bodyModel[30].rotateAngleX = 0.7853982F;

		bodyModel[31].addBox(-16F, -14F, 4F, 4, 11, 4, 0); // BanaMechCore32
		bodyModel[31].setRotationPoint(0F, -93F, 0F);
		bodyModel[31].rotateAngleX = -0.7853982F;

		bodyModel[32].addBox(-20F, 1F, -8F, 10, 23, 16, 0); // BanaMechCore33
		bodyModel[32].setRotationPoint(0F, -93F, 0F);

		bodyModel[33].addBox(-23F, -1F, -4F, 4, 18, 8, 0); // BanaMechCore34
		bodyModel[33].setRotationPoint(0F, -93F, 0F);
		bodyModel[33].rotateAngleZ = 0.03717861F;

		bodyModel[34].addBox(-20F, 2F, -4F, 5, 9, 8, 0); // BanaMechCore35
		bodyModel[34].setRotationPoint(0F, -93F, 0F);
		bodyModel[34].rotateAngleZ = -0.3346075F;

		bodyModel[35].addBox(11F, 11F, -11F, 2, 2, 22, 0); // BanaMechCore36
		bodyModel[35].setRotationPoint(0F, -93F, 0F);
		bodyModel[35].rotateAngleZ = 0.669215F;

		bodyModel[36].addBox(2F, 11F, 9F, 9, 2, 2, 0); // BanaMechCore37
		bodyModel[36].setRotationPoint(0F, -93F, 0F);
		bodyModel[36].rotateAngleZ = 0.669215F;

		bodyModel[37].addBox(2F, 11F, -11F, 9, 2, 2, 0); // BanaMechCore38
		bodyModel[37].setRotationPoint(0F, -93F, 0F);
		bodyModel[37].rotateAngleZ = 0.669215F;

		bodyModel[38].addBox(-16F, 27F, -10F, 2, 2, 20, 0); // BanaMechCore39
		bodyModel[38].setRotationPoint(0F, -93F, 0F);
		bodyModel[38].rotateAngleZ = 1.07818F;

		bodyModel[39].addBox(-16F, 19F, -10F, 2, 8, 2, 0); // BanaMechCore40
		bodyModel[39].setRotationPoint(0F, -93F, 0F);
		bodyModel[39].rotateAngleZ = 1.07818F;

		bodyModel[40].addBox(-16F, 19F, 8F, 2, 8, 2, 0); // BanaMechCore41
		bodyModel[40].setRotationPoint(0F, -93F, 0F);
		bodyModel[40].rotateAngleZ = 1.07818F;



// Left Arm
		leftArmModel = new ModelRendererTurbo[47];
		leftArmModel[0] = new ModelRendererTurbo(this,  285,  427, textureX, textureY); // BanaMechLeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this,  208,  330, textureX, textureY); // BanaMechLeftArm2
		leftArmModel[2] = new ModelRendererTurbo(this,  208,  348, textureX, textureY); // BanaMechLeftArm3
		leftArmModel[3] = new ModelRendererTurbo(this,  260,  440, textureX, textureY); // BanaMechLeftArm4
		leftArmModel[4] = new ModelRendererTurbo(this,  369,  499, textureX, textureY); // BanaMechLeftArm5
		leftArmModel[5] = new ModelRendererTurbo(this,  260,  440, textureX, textureY); // BanaMechLeftArm6
		leftArmModel[6] = new ModelRendererTurbo(this,  286,  455, textureX, textureY); // BanaMechLeftArm8
		leftArmModel[7] = new ModelRendererTurbo(this,  285,  440, textureX, textureY); // BanaMechLeftArm9
		leftArmModel[8] = new ModelRendererTurbo(this,  330,  465, textureX, textureY); // BanaMechLeftArm10
		leftArmModel[9] = new ModelRendererTurbo(this,  286,  472, textureX, textureY); // BanaMechLeftArm11
		leftArmModel[10] = new ModelRendererTurbo(this,  288,  500, textureX, textureY); // BanaMechLeftArm12
		leftArmModel[11] = new ModelRendererTurbo(this,  287,  486, textureX, textureY); // BanaMechLeftArm13
		leftArmModel[12] = new ModelRendererTurbo(this,  383,  491, textureX, textureY); // BanaMechLeftArm14
		leftArmModel[13] = new ModelRendererTurbo(this,  369,  499, textureX, textureY); // BanaMechLeftArm15
		leftArmModel[14] = new ModelRendererTurbo(this,  383,  491, textureX, textureY); // BanaMechLeftArm16
		leftArmModel[15] = new ModelRendererTurbo(this,  366,  458, textureX, textureY); // BanaMechLeftArm17
		leftArmModel[16] = new ModelRendererTurbo(this,  365,  443, textureX, textureY); // BanaMechLeftArm18
		leftArmModel[17] = new ModelRendererTurbo(this,  368,  490, textureX, textureY); // BanaMechLeftArm19
		leftArmModel[18] = new ModelRendererTurbo(this,  368,  490, textureX, textureY); // BanaMechLeftArm20
		leftArmModel[19] = new ModelRendererTurbo(this,  239,  472, textureX, textureY); // BanaMechLeftArm21
		leftArmModel[20] = new ModelRendererTurbo(this,  367,  477, textureX, textureY); // BanaMechLeftArm22
		leftArmModel[21] = new ModelRendererTurbo(this,  254,  471, textureX, textureY); // BanaMechLeftArm23
		leftArmModel[22] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm24
		leftArmModel[23] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm26
		leftArmModel[24] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm27
		leftArmModel[25] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm28
		leftArmModel[26] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm29
		leftArmModel[27] = new ModelRendererTurbo(this,  232,  478, textureX, textureY); // BanaMechLeftArm30
		leftArmModel[28] = new ModelRendererTurbo(this,  243,  480, textureX, textureY); // BanaMechLeftArm31
		leftArmModel[29] = new ModelRendererTurbo(this,  245,  498, textureX, textureY); // BanaMechLeftArm32
		leftArmModel[30] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm33
		leftArmModel[31] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm34
		leftArmModel[32] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm35
		leftArmModel[33] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm36
		leftArmModel[34] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechLeftArm37
		leftArmModel[35] = new ModelRendererTurbo(this,  322,  400, textureX, textureY); // BanaMechLeftArm43
		leftArmModel[36] = new ModelRendererTurbo(this,  322,  385, textureX, textureY); // BanaMechLeftArm44
		leftArmModel[37] = new ModelRendererTurbo(this,  323,  369, textureX, textureY); // BanaMechLeftArm45
		leftArmModel[38] = new ModelRendererTurbo(this,  324,  353, textureX, textureY); // BanaMechLeftArm46
		leftArmModel[39] = new ModelRendererTurbo(this,  358,  348, textureX, textureY); // BanaMechLeftArm47
		leftArmModel[40] = new ModelRendererTurbo(this,  325,  440, textureX, textureY); // BanaMechLeftArm48
		leftArmModel[41] = new ModelRendererTurbo(this,  403,  377, textureX, textureY); // BanaMechLeftArm53
		leftArmModel[42] = new ModelRendererTurbo(this,  426,  378, textureX, textureY); // BanaMechLeftArm54
		leftArmModel[43] = new ModelRendererTurbo(this,  442,  378, textureX, textureY); // BanaMechLeftArm55
		leftArmModel[44] = new ModelRendererTurbo(this,  426,  378, textureX, textureY); // BanaMechLeftArm56
		leftArmModel[45] = new ModelRendererTurbo(this,  403,  377, textureX, textureY); // BanaMechLeftArm57
		leftArmModel[46] = new ModelRendererTurbo(this,  401,  431, textureX, textureY); // BanaMechLeftArm66

		leftArmModel[0].addBox(-9F, -8F, -9F, 18, 4, 4, 0); // BanaMechLeftArm1
		leftArmModel[0].setRotationPoint(0F, 0F, 5F);
		leftArmModel[0].rotateAngleX = 0.7853982F;
		leftArmModel[0].rotateAngleZ = -0.1745329F;

		leftArmModel[1].addBox(-5F, -4F, 0F, 10, 10, 5, 0); // BanaMechLeftArm2
		leftArmModel[1].setRotationPoint(0F, 0F, 5F);

		leftArmModel[2].addBox(-6F, -5F, -4F, 12, 12, 4, 0); // BanaMechLeftArm3
		leftArmModel[2].setRotationPoint(0F, 0F, 5F);

		leftArmModel[3].addBox(-5F, -3F, -13F, 3, 13, 8, 0); // BanaMechLeftArm4
		leftArmModel[3].setRotationPoint(0F, 0F, 5F);
		leftArmModel[3].rotateAngleZ = -0.1745329F;

		leftArmModel[4].addBox(-14.5F, 34F, -8.5F, 3, 4, 3, 0); // BanaMechLeftArm5
		leftArmModel[4].setRotationPoint(0F, 0F, 5F);
		leftArmModel[4].rotateAngleZ = 0.2754315F;

		leftArmModel[5].addBox(2F, -3F, -13F, 3, 13, 8, 0); // BanaMechLeftArm6
		leftArmModel[5].setRotationPoint(0F, 0F, 5F);
		leftArmModel[5].rotateAngleZ = -0.1745329F;

		leftArmModel[6].addBox(-4F, 8F, -14F, 8, 4, 10, 0); // BanaMechLeftArm8
		leftArmModel[6].setRotationPoint(0F, 0F, 5F);
		leftArmModel[6].rotateAngleZ = -0.1745329F;

		leftArmModel[7].addBox(-6F, 8F, -12F, 12, 5, 6, 0); // BanaMechLeftArm9
		leftArmModel[7].setRotationPoint(0F, 0F, 5F);
		leftArmModel[7].rotateAngleZ = -0.1745329F;

		leftArmModel[8].addBox(-20F, 14F, -9F, 6, 6, 4, 0); // BanaMechLeftArm10
		leftArmModel[8].setRotationPoint(0F, 0F, 3F);
		leftArmModel[8].rotateAngleZ = 0.6108652F;

		leftArmModel[9].addBox(-3.5F, 12F, -12.5F, 7, 4, 7, 0); // BanaMechLeftArm11
		leftArmModel[9].setRotationPoint(0F, 0F, 5F);
		leftArmModel[9].rotateAngleZ = -0.1745329F;

		leftArmModel[10].addBox(-3.5F, 19F, -10.5F, 7, 3, 7, 0); // BanaMechLeftArm12
		leftArmModel[10].setRotationPoint(0F, 0F, 3F);
		leftArmModel[10].rotateAngleZ = -0.1745329F;

		leftArmModel[11].addBox(-3F, 16F, -12F, 6, 4, 6, 0); // BanaMechLeftArm13
		leftArmModel[11].setRotationPoint(0F, 0F, 5F);
		leftArmModel[11].rotateAngleZ = -0.1745329F;

		leftArmModel[12].addBox(-14F, 31F, -8F, 2, 4, 2, 0); // BanaMechLeftArm14
		leftArmModel[12].setRotationPoint(0F, 0F, 5F);
		leftArmModel[12].rotateAngleZ = 0.2754315F;

		leftArmModel[13].addBox(-14.5F, 34F, -12.5F, 3, 4, 3, 0); // BanaMechLeftArm15
		leftArmModel[13].setRotationPoint(0F, 0F, 5F);
		leftArmModel[13].rotateAngleZ = 0.2754315F;

		leftArmModel[14].addBox(-14F, 31F, -12F, 2, 4, 2, 0); // BanaMechLeftArm16
		leftArmModel[14].setRotationPoint(0F, 0F, 5F);
		leftArmModel[14].rotateAngleZ = 0.2754315F;

		leftArmModel[15].addBox(-7F, 26.5F, -11F, 2, 12, 4, 0); // BanaMechLeftArm17
		leftArmModel[15].setRotationPoint(0F, 0F, 5F);
		leftArmModel[15].rotateAngleZ = 0.2010743F;

		leftArmModel[16].addBox(-15F, 23F, -11F, 8, 4, 8, 0); // BanaMechLeftArm18
		leftArmModel[16].setRotationPoint(0F, 0F, 3F);
		leftArmModel[16].rotateAngleZ = 0.2754315F;

		leftArmModel[17].addBox(-14.5F, 27F, -12.5F, 3, 4, 3, 0); // BanaMechLeftArm19
		leftArmModel[17].setRotationPoint(0F, 0F, 5F);
		leftArmModel[17].rotateAngleZ = 0.2754315F;

		leftArmModel[18].addBox(-14.5F, 27F, -8.5F, 3, 4, 3, 0); // BanaMechLeftArm20
		leftArmModel[18].setRotationPoint(0F, 0F, 5F);
		leftArmModel[18].rotateAngleZ = 0.2754315F;

		leftArmModel[19].addBox(-1.5F, 41F, -9F, 3, 2, 2, 0); // BanaMechLeftArm21
		leftArmModel[19].setRotationPoint(0F, 0F, 5F);

		leftArmModel[20].addBox(-14F, 35F, -12F, 6, 4, 6, 0); // BanaMechLeftArm22
		leftArmModel[20].setRotationPoint(0F, 0F, 5F);
		leftArmModel[20].rotateAngleZ = 0.2754315F;

		leftArmModel[21].addBox(-1.5F, 39F, -10.5F, 3, 2, 3, 0); // BanaMechLeftArm23
		leftArmModel[21].setRotationPoint(0F, 0F, 5F);

		leftArmModel[22].addBox(-2F, 43.5F, -10F, 1, 3, 1, 0); // BanaMechLeftArm24
		leftArmModel[22].setRotationPoint(0F, 0F, 5F);

		leftArmModel[23].addBox(-0.5F, 45.5F, -8F, 2, 1, 1, 0); // BanaMechLeftArm26
		leftArmModel[23].setRotationPoint(0F, 0F, 5F);

		leftArmModel[24].addBox(-1F, 46.7F, -9.5F, 1, 1, 2, 0); // BanaMechLeftArm27
		leftArmModel[24].setRotationPoint(0F, 0F, 5F);

		leftArmModel[25].addBox(0F, 43.5F, -10F, 1, 4, 1, 0); // BanaMechLeftArm28
		leftArmModel[25].setRotationPoint(0F, 0F, 5F);

		leftArmModel[26].addBox(-1F, 44.2F, -10F, 1, 3, 1, 0); // BanaMechLeftArm29
		leftArmModel[26].setRotationPoint(0F, 0F, 5F);

		leftArmModel[27].addBox(0F, 43F, -9F, 2, 2, 2, 0); // BanaMechLeftArm30
		leftArmModel[27].setRotationPoint(0F, 0F, 5F);

		leftArmModel[28].addBox(-2.5F, 41F, -10.5F, 5, 4, 2, 0); // BanaMechLeftArm31
		leftArmModel[28].setRotationPoint(0F, 0F, 5F);

		leftArmModel[29].addBox(-2.5F, 20.4F, -36.7F, 5, 2, 2, 0); // BanaMechLeftArm32
		leftArmModel[29].setRotationPoint(0F, 4F, 5F);
		leftArmModel[29].rotateAngleX = 0.7853982F;

		leftArmModel[30].addBox(1F, 44F, -10F, 1, 3, 1, 0); // BanaMechLeftArm33
		leftArmModel[30].setRotationPoint(0F, 0F, 5F);

		leftArmModel[31].addBox(-2F, 46.1F, -9.5F, 1, 1, 2, 0); // BanaMechLeftArm34
		leftArmModel[31].setRotationPoint(0F, 0F, 5F);

		leftArmModel[32].addBox(0F, 47F, -9.5F, 1, 1, 2, 0); // BanaMechLeftArm35
		leftArmModel[32].setRotationPoint(0F, 0F, 5F);

		leftArmModel[33].addBox(1F, 46.5F, -9.5F, 1, 1, 2, 0); // BanaMechLeftArm36
		leftArmModel[33].setRotationPoint(0F, 0F, 5F);

		leftArmModel[34].addBox(1F, 44F, -8F, 1, 2, 1, 0); // BanaMechLeftArm37
		leftArmModel[34].setRotationPoint(0F, 0F, 5F);

		leftArmModel[35].addBox(9.5F, -3.5F, -5F, 4, 8, 8, 0); // BanaMechLeftArm43
		leftArmModel[35].setRotationPoint(0F, 0F, 5F);

		leftArmModel[36].addBox(-1F, -12F, -5F, 8, 4, 8, 0); // BanaMechLeftArm44
		leftArmModel[36].setRotationPoint(0F, 0F, 5F);
		leftArmModel[36].rotateAngleZ = -0.7853982F;

		leftArmModel[37].addBox(-8F, -9F, -5F, 16, 4, 8, 0); // BanaMechLeftArm45
		leftArmModel[37].setRotationPoint(0F, 0F, 5F);

		leftArmModel[38].addBox(-7F, -12F, -5F, 8, 4, 8, 0); // BanaMechLeftArm46
		leftArmModel[38].setRotationPoint(0F, 0F, 5F);
		leftArmModel[38].rotateAngleZ = 0.7853982F;

		leftArmModel[39].addBox(-13.5F, -3.5F, -5F, 4, 8, 8, 0); // BanaMechLeftArm47
		leftArmModel[39].setRotationPoint(0F, 0F, 5F);

		leftArmModel[40].addBox(-2F, -4F, -14F, 4, 10, 10, 0); // BanaMechLeftArm48
		leftArmModel[40].setRotationPoint(0F, 0F, 5F);
		leftArmModel[40].rotateAngleZ = -0.1745329F;

		leftArmModel[41].addBox(9F, -3F, -15F, 3, 10, 6, 0); // BanaMechLeftArm53
		leftArmModel[41].setRotationPoint(0F, 0F, 5F);
		leftArmModel[41].rotateAngleZ = -0.1745329F;

		leftArmModel[42].addBox(8F, -3F, -17F, 3, 10, 3, 0); // BanaMechLeftArm54
		leftArmModel[42].setRotationPoint(0F, 0F, 5F);
		leftArmModel[42].rotateAngleZ = -0.1745329F;

		leftArmModel[43].addBox(-7F, -3F, -20F, 16, 10, 3, 0); // BanaMechLeftArm55
		leftArmModel[43].setRotationPoint(0F, 0F, 5F);
		leftArmModel[43].rotateAngleZ = -0.1745329F;

		leftArmModel[44].addBox(-9F, -3F, -17F, 3, 10, 3, 0); // BanaMechLeftArm56
		leftArmModel[44].setRotationPoint(0F, 0F, 5F);
		leftArmModel[44].rotateAngleZ = -0.1745329F;

		leftArmModel[45].addBox(-10F, -3F, -14F, 3, 10, 6, 0); // BanaMechLeftArm57
		leftArmModel[45].setRotationPoint(0F, 0F, 5F);
		leftArmModel[45].rotateAngleZ = -0.1745329F;

		leftArmModel[46].addBox(-15F, 29F, -14F, 10, 7, 2, 0); // BanaMechLeftArm66
		leftArmModel[46].setRotationPoint(0F, 0F, 5F);
		leftArmModel[46].rotateAngleZ = 0.2754315F;


// Right Arm
		rightArmModel = new ModelRendererTurbo[47];
		rightArmModel[0] = new ModelRendererTurbo(this,  285,  427, textureX, textureY); // BanaMechRightArm1
		rightArmModel[1] = new ModelRendererTurbo(this,  208,  330, textureX, textureY); // BanaMechRightArm2
		rightArmModel[2] = new ModelRendererTurbo(this,  208,  348, textureX, textureY); // BanaMechRightArm3
		rightArmModel[3] = new ModelRendererTurbo(this,  260,  440, textureX, textureY); // BanaMechRightArm4
		rightArmModel[4] = new ModelRendererTurbo(this,  369,  499, textureX, textureY); // BanaMechRightArm5
		rightArmModel[5] = new ModelRendererTurbo(this,  260,  440, textureX, textureY); // BanaMechRightArm6
		rightArmModel[6] = new ModelRendererTurbo(this,  286,  455, textureX, textureY); // BanaMechRightArm8
		rightArmModel[7] = new ModelRendererTurbo(this,  285,  440, textureX, textureY); // BanaMechRightArm9
		rightArmModel[8] = new ModelRendererTurbo(this,  330,  465, textureX, textureY); // BanaMechRightArm10
		rightArmModel[9] = new ModelRendererTurbo(this,  286,  472, textureX, textureY); // BanaMechRightArm11
		rightArmModel[10] = new ModelRendererTurbo(this,  288,  500, textureX, textureY); // BanaMechRightArm12
		rightArmModel[11] = new ModelRendererTurbo(this,  287,  486, textureX, textureY); // BanaMechRightArm13
		rightArmModel[12] = new ModelRendererTurbo(this,  383,  491, textureX, textureY); // BanaMechRightArm14
		rightArmModel[13] = new ModelRendererTurbo(this,  369,  499, textureX, textureY); // BanaMechRightArm15
		rightArmModel[14] = new ModelRendererTurbo(this,  383,  491, textureX, textureY); // BanaMechRightArm16
		rightArmModel[15] = new ModelRendererTurbo(this,  366,  458, textureX, textureY); // BanaMechRightArm17
		rightArmModel[16] = new ModelRendererTurbo(this,  365,  443, textureX, textureY); // BanaMechRightArm18
		rightArmModel[17] = new ModelRendererTurbo(this,  368,  490, textureX, textureY); // BanaMechRightArm19
		rightArmModel[18] = new ModelRendererTurbo(this,  368,  490, textureX, textureY); // BanaMechRightArm20
		rightArmModel[19] = new ModelRendererTurbo(this,  239,  472, textureX, textureY); // BanaMechRightArm21
		rightArmModel[20] = new ModelRendererTurbo(this,  367,  477, textureX, textureY); // BanaMechRightArm22
		rightArmModel[21] = new ModelRendererTurbo(this,  254,  471, textureX, textureY); // BanaMechRightArm23
		rightArmModel[22] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm24
		rightArmModel[23] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm26
		rightArmModel[24] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm27
		rightArmModel[25] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm28
		rightArmModel[26] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm29
		rightArmModel[27] = new ModelRendererTurbo(this,  232,  478, textureX, textureY); // BanaMechRightArm30
		rightArmModel[28] = new ModelRendererTurbo(this,  243,  480, textureX, textureY); // BanaMechRightArm31
		rightArmModel[29] = new ModelRendererTurbo(this,  245,  498, textureX, textureY); // BanaMechRightArm32
		rightArmModel[30] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm33
		rightArmModel[31] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm34
		rightArmModel[32] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm35
		rightArmModel[33] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm36
		rightArmModel[34] = new ModelRendererTurbo(this,  260,  485, textureX, textureY); // BanaMechRightArm37
		rightArmModel[35] = new ModelRendererTurbo(this,  322,  400, textureX, textureY); // BanaMechRightArm43
		rightArmModel[36] = new ModelRendererTurbo(this,  322,  385, textureX, textureY); // BanaMechRightArm44
		rightArmModel[37] = new ModelRendererTurbo(this,  323,  369, textureX, textureY); // BanaMechRightArm45
		rightArmModel[38] = new ModelRendererTurbo(this,  324,  353, textureX, textureY); // BanaMechRightArm46
		rightArmModel[39] = new ModelRendererTurbo(this,  358,  348, textureX, textureY); // BanaMechRightArm47
		rightArmModel[40] = new ModelRendererTurbo(this,  325,  440, textureX, textureY); // BanaMechRightArm48
		rightArmModel[41] = new ModelRendererTurbo(this,  403,  377, textureX, textureY); // BanaMechRightArm53
		rightArmModel[42] = new ModelRendererTurbo(this,  426,  378, textureX, textureY); // BanaMechRightArm54
		rightArmModel[43] = new ModelRendererTurbo(this,  442,  378, textureX, textureY); // BanaMechRightArm55
		rightArmModel[44] = new ModelRendererTurbo(this,  426,  378, textureX, textureY); // BanaMechRightArm56
		rightArmModel[45] = new ModelRendererTurbo(this,  403,  377, textureX, textureY); // BanaMechRightArm57
		rightArmModel[46] = new ModelRendererTurbo(this,  401,  431, textureX, textureY); // BanaMechRightArm66

		rightArmModel[0].addBox(-9F, 5F, 4F, 18, 4, 4, 0); // BanaMechRightArm1
		rightArmModel[0].setRotationPoint(0F, 0F, -5F);
		rightArmModel[0].rotateAngleX = 0.7853982F;
		rightArmModel[0].rotateAngleZ = -0.1745329F;

		rightArmModel[1].addBox(-5F, -4F, -5F, 10, 10, 5, 0); // BanaMechRightArm2
		rightArmModel[1].setRotationPoint(0F, 0F, -5F);

		rightArmModel[2].addBox(-6F, -5F, 0F, 12, 12, 4, 0); // BanaMechRightArm3
		rightArmModel[2].setRotationPoint(0F, 0F, -5F);

		rightArmModel[3].addBox(-5F, -3F, 5F, 3, 13, 8, 0); // BanaMechRightArm4
		rightArmModel[3].setRotationPoint(0F, 0F, -5F);
		rightArmModel[3].rotateAngleZ = -0.1745329F;

		rightArmModel[4].addBox(-14.5F, 34F, 9.5F, 3, 4, 3, 0); // BanaMechRightArm5
		rightArmModel[4].setRotationPoint(0F, 0F, -5F);
		rightArmModel[4].rotateAngleZ = 0.2754315F;

		rightArmModel[5].addBox(2F, -3F, 5F, 3, 13, 8, 0); // BanaMechRightArm6
		rightArmModel[5].setRotationPoint(0F, 0F, -5F);
		rightArmModel[5].rotateAngleZ = -0.1745329F;

		rightArmModel[6].addBox(-4F, 8F, 4F, 8, 4, 10, 0); // BanaMechRightArm8
		rightArmModel[6].setRotationPoint(0F, 0F, -5F);
		rightArmModel[6].rotateAngleZ = -0.1745329F;

		rightArmModel[7].addBox(-6F, 8F, 6F, 12, 5, 6, 0); // BanaMechRightArm9
		rightArmModel[7].setRotationPoint(0F, 0F, -5F);
		rightArmModel[7].rotateAngleZ = -0.1745329F;

		rightArmModel[8].addBox(-20F, 14F, 7F, 6, 6, 4, 0); // BanaMechRightArm10
		rightArmModel[8].setRotationPoint(0F, 0F, -5F);
		rightArmModel[8].rotateAngleZ = 0.6108652F;

		rightArmModel[9].addBox(-3.5F, 12F, 5.5F, 7, 4, 7, 0); // BanaMechRightArm11
		rightArmModel[9].setRotationPoint(0F, 0F, -5F);
		rightArmModel[9].rotateAngleZ = -0.1745329F;

		rightArmModel[10].addBox(-3.5F, 19F, 5.5F, 7, 3, 7, 0); // BanaMechRightArm12
		rightArmModel[10].setRotationPoint(0F, 0F, -5F);
		rightArmModel[10].rotateAngleZ = -0.1745329F;

		rightArmModel[11].addBox(-3F, 16F, 6F, 6, 4, 6, 0); // BanaMechRightArm13
		rightArmModel[11].setRotationPoint(0F, 0F, -5F);
		rightArmModel[11].rotateAngleZ = -0.1745329F;

		rightArmModel[12].addBox(-14F, 31F, 10F, 2, 4, 2, 0); // BanaMechRightArm14
		rightArmModel[12].setRotationPoint(0F, 0F, -5F);
		rightArmModel[12].rotateAngleZ = 0.2754315F;

		rightArmModel[13].addBox(-14.5F, 34F, 5.5F, 3, 4, 3, 0); // BanaMechRightArm15
		rightArmModel[13].setRotationPoint(0F, 0F, -5F);
		rightArmModel[13].rotateAngleZ = 0.2754315F;

		rightArmModel[14].addBox(-14F, 31F, 6F, 2, 4, 2, 0); // BanaMechRightArm16
		rightArmModel[14].setRotationPoint(0F, 0F, -5F);
		rightArmModel[14].rotateAngleZ = 0.2754315F;

		rightArmModel[15].addBox(-7F, 26.5F, 7F, 2, 12, 4, 0); // BanaMechRightArm17
		rightArmModel[15].setRotationPoint(0F, 0F, -5F);
		rightArmModel[15].rotateAngleZ = 0.2010743F;

		rightArmModel[16].addBox(-15F, 23F, 5F, 8, 4, 8, 0); // BanaMechRightArm18
		rightArmModel[16].setRotationPoint(0F, 0F, -5F);
		rightArmModel[16].rotateAngleZ = 0.2754315F;

		rightArmModel[17].addBox(-14.5F, 27F, 5.5F, 3, 4, 3, 0); // BanaMechRightArm19
		rightArmModel[17].setRotationPoint(0F, 0F, -5F);
		rightArmModel[17].rotateAngleZ = 0.2754315F;

		rightArmModel[18].addBox(-14.5F, 27F, 9.5F, 3, 4, 3, 0); // BanaMechRightArm20
		rightArmModel[18].setRotationPoint(0F, 0F, -5F);
		rightArmModel[18].rotateAngleZ = 0.2754315F;

		rightArmModel[19].addBox(-1.5F, 41F, 7F, 3, 2, 2, 0); // BanaMechRightArm21
		rightArmModel[19].setRotationPoint(0F, 0F, -5F);

		rightArmModel[20].addBox(-14F, 35F, 6F, 6, 4, 6, 0); // BanaMechRightArm22
		rightArmModel[20].setRotationPoint(0F, 0F, -5F);
		rightArmModel[20].rotateAngleZ = 0.2754315F;

		rightArmModel[21].addBox(-1.5F, 39F, 7.5F, 3, 2, 3, 0); // BanaMechRightArm23
		rightArmModel[21].setRotationPoint(0F, 0F, -5F);

		rightArmModel[22].addBox(-2F, 43.5F, 9F, 1, 3, 1, 0); // BanaMechRightArm24
		rightArmModel[22].setRotationPoint(0F, 0F, -5F);

		rightArmModel[23].addBox(-0.5F, 45.5F, 7F, 2, 1, 1, 0); // BanaMechRightArm26
		rightArmModel[23].setRotationPoint(0F, 0F, -5F);

		rightArmModel[24].addBox(-1F, 46.7F, 7.5F, 1, 1, 2, 0); // BanaMechRightArm27
		rightArmModel[24].setRotationPoint(0F, 0F, -5F);

		rightArmModel[25].addBox(0F, 43.5F, 9F, 1, 4, 1, 0); // BanaMechRightArm28
		rightArmModel[25].setRotationPoint(0F, 0F, -5F);

		rightArmModel[26].addBox(-1F, 44.2F, 9F, 1, 3, 1, 0); // BanaMechRightArm29
		rightArmModel[26].setRotationPoint(0F, 0F, -5F);

		rightArmModel[27].addBox(0F, 43F, 7F, 2, 2, 2, 0); // BanaMechRightArm30
		rightArmModel[27].setRotationPoint(0F, 0F, -5F);

		rightArmModel[28].addBox(-2.5F, 41F, 8.5F, 5, 4, 2, 0); // BanaMechRightArm31
		rightArmModel[28].setRotationPoint(0F, 0F, -5F);

		rightArmModel[29].addBox(-2.5F, 37.5F, -24.8F, 5, 2, 2, 0); // BanaMechRightArm32
		rightArmModel[29].setRotationPoint(0F, 0F, -5F);
		rightArmModel[29].rotateAngleX = 0.7853982F;

		rightArmModel[30].addBox(1F, 44F, 9F, 1, 3, 1, 0); // BanaMechRightArm33
		rightArmModel[30].setRotationPoint(0F, 0F, -5F);

		rightArmModel[31].addBox(-2F, 46.1F, 7.5F, 1, 1, 2, 0); // BanaMechRightArm34
		rightArmModel[31].setRotationPoint(0F, 0F, -5F);

		rightArmModel[32].addBox(0F, 47F, 7.5F, 1, 1, 2, 0); // BanaMechRightArm35
		rightArmModel[32].setRotationPoint(0F, 0F, -5F);

		rightArmModel[33].addBox(1F, 46.5F, 7.5F, 1, 1, 2, 0); // BanaMechRightArm36
		rightArmModel[33].setRotationPoint(0F, 0F, -5F);

		rightArmModel[34].addBox(1F, 44F, 7F, 1, 2, 1, 0); // BanaMechRightArm37
		rightArmModel[34].setRotationPoint(0F, 0F, -5F);

		rightArmModel[35].addBox(9.5F, -3.5F, -3F, 4, 8, 8, 0); // BanaMechRightArm43
		rightArmModel[35].setRotationPoint(0F, 0F, -5F);

		rightArmModel[36].addBox(-1F, -12F, -3F, 8, 4, 8, 0); // BanaMechRightArm44
		rightArmModel[36].setRotationPoint(0F, 0F, -5F);
		rightArmModel[36].rotateAngleZ = -0.7853982F;

		rightArmModel[37].addBox(-8F, -9F, -3F, 16, 4, 8, 0); // BanaMechRightArm45
		rightArmModel[37].setRotationPoint(0F, 0F, -5F);

		rightArmModel[38].addBox(-7F, -12F, -3F, 8, 4, 8, 0); // BanaMechRightArm46
		rightArmModel[38].setRotationPoint(0F, 0F, -5F);
		rightArmModel[38].rotateAngleZ = 0.7853982F;

		rightArmModel[39].addBox(-13.5F, -3.5F, -3F, 4, 8, 8, 0); // BanaMechRightArm47
		rightArmModel[39].setRotationPoint(0F, 0F, -5F);

		rightArmModel[40].addBox(-2F, -4F, 4F, 4, 10, 10, 0); // BanaMechRightArm48
		rightArmModel[40].setRotationPoint(0F, 0F, -5F);
		rightArmModel[40].rotateAngleZ = -0.1745329F;

		rightArmModel[41].addBox(9F, -3F, 9F, 3, 10, 6, 0); // BanaMechRightArm53
		rightArmModel[41].setRotationPoint(0F, 0F, -5F);
		rightArmModel[41].rotateAngleZ = -0.1745329F;

		rightArmModel[42].addBox(8F, -3F, 14F, 3, 10, 3, 0); // BanaMechRightArm54
		rightArmModel[42].setRotationPoint(0F, 0F, -5F);
		rightArmModel[42].rotateAngleZ = -0.1745329F;

		rightArmModel[43].addBox(-7F, -3F, 17F, 16, 10, 3, 0); // BanaMechRightArm55
		rightArmModel[43].setRotationPoint(0F, 0F, -5F);
		rightArmModel[43].rotateAngleZ = -0.1745329F;

		rightArmModel[44].addBox(-9F, -3F, 14F, 3, 10, 3, 0); // BanaMechRightArm56
		rightArmModel[44].setRotationPoint(0F, 0F, -5F);
		rightArmModel[44].rotateAngleZ = -0.1745329F;

		rightArmModel[45].addBox(-10F, -3F, 9F, 3, 10, 6, 0); // BanaMechRightArm57
		rightArmModel[45].setRotationPoint(0F, 0F, -5F);
		rightArmModel[45].rotateAngleZ = -0.1745329F;

		rightArmModel[46].addBox(-15F, 29F, 12F, 10, 7, 2, 0); // BanaMechRightArm66
		rightArmModel[46].setRotationPoint(0F, 0F, -5F);
		rightArmModel[46].rotateAngleZ = 0.2754315F;



// Hips
		hipsModel = new ModelRendererTurbo[14];
		hipsModel[0] = new ModelRendererTurbo(this,  1,  606, textureX, textureY); // BanaMechLeg1
		hipsModel[1] = new ModelRendererTurbo(this,  1,  639, textureX, textureY); // BanaMechLeg2
		hipsModel[2] = new ModelRendererTurbo(this,  1,  683, textureX, textureY); // BanaMechLeg3
		hipsModel[3] = new ModelRendererTurbo(this,  1,  724, textureX, textureY); // BanaMechLeg4
		hipsModel[4] = new ModelRendererTurbo(this,  2,  774, textureX, textureY); // BanaMechLeg5
		hipsModel[5] = new ModelRendererTurbo(this,  1,  750, textureX, textureY); // BanaMechLeg6
		hipsModel[6] = new ModelRendererTurbo(this,  22,  750, textureX, textureY); // BanaMechLeg7
		hipsModel[7] = new ModelRendererTurbo(this,  14,  775, textureX, textureY); // BanaMechLeg8
		hipsModel[8] = new ModelRendererTurbo(this,  2,  763, textureX, textureY); // BanaMechLeg9
		hipsModel[9] = new ModelRendererTurbo(this,  15,  764, textureX, textureY); // BanaMechLeg10
		hipsModel[10] = new ModelRendererTurbo(this,  2,  785, textureX, textureY); // BanaMechLeg11
		hipsModel[11] = new ModelRendererTurbo(this,  28,  788, textureX, textureY); // BanaMechLeg12
		hipsModel[12] = new ModelRendererTurbo(this,  2,  785, textureX, textureY); // BanaMechLeg13
		hipsModel[13] = new ModelRendererTurbo(this,  28,  788, textureX, textureY); // BanaMechLeg14

		hipsModel[0].addBox(-11F, 0F, -11F, 22, 7, 22, 0); // BanaMechLeg1
		hipsModel[0].setRotationPoint(0F, -63F, 0F);

		hipsModel[1].addBox(-12F, -1F, -9F, 18, 23, 18, 0); // BanaMechLeg2
		hipsModel[1].setRotationPoint(0F, -63F, 0F);
		hipsModel[1].rotateAngleZ = 0.6320364F;

		hipsModel[2].addBox(-20F, 12F, -8F, 16, 23, 16, 0); // BanaMechLeg3
		hipsModel[2].setRotationPoint(0F, -63F, 0F);
		hipsModel[2].rotateAngleZ = 1.152537F;

		hipsModel[3].addBox(-21F, 22F, -5F, 10, 12, 10, 0); // BanaMechLeg4
		hipsModel[3].setRotationPoint(0F, -63F, 0F);
		hipsModel[3].rotateAngleZ = 1.412787F;

		hipsModel[4].addBox(34F, 21.5F, 2.5F, 2, 2, 2, 0); // BanaMechLeg5
		hipsModel[4].setRotationPoint(0F, -63F, 0F);

		hipsModel[5].addBox(7F, 33F, -1.5F, 6, 6, 3, 0); // BanaMechLeg6
		hipsModel[5].setRotationPoint(0F, -63F, 0F);
		hipsModel[5].rotateAngleZ = 0.6981317F;

		hipsModel[6].addBox(8F, 35F, -4F, 3, 3, 8, 0); // BanaMechLeg7
		hipsModel[6].setRotationPoint(0F, -63F, 0F);
		hipsModel[6].rotateAngleZ = 0.6981317F;

		hipsModel[7].addBox(35F, 20.5F, -3.5F, 1, 1, 1, 0); // BanaMechLeg8
		hipsModel[7].setRotationPoint(0F, -63F, 0F);

		hipsModel[8].addBox(31F, 20F, -4F, 4, 5, 2, 0); // BanaMechLeg9
		hipsModel[8].setRotationPoint(0F, -63F, 0F);

		hipsModel[9].addBox(31F, 21F, 2F, 4, 3, 3, 0); // BanaMechLeg10
		hipsModel[9].setRotationPoint(0F, -63F, 0F);

		hipsModel[10].addBox(3F, 2F, -13F, 8, 8, 4, 0); // BanaMechLeg11
		hipsModel[10].setRotationPoint(0F, -63F, 0F);
		hipsModel[10].rotateAngleZ = -0.7853982F;

		hipsModel[11].addBox(5F, 4F, -17F, 4, 4, 4, 0); // BanaMechLeg12
		hipsModel[11].setRotationPoint(0F, -63F, 0F);
		hipsModel[11].rotateAngleZ = -0.7853982F;

		hipsModel[12].addBox(3F, 2F, 9F, 8, 8, 4, 0); // BanaMechLeg13
		hipsModel[12].setRotationPoint(0F, -63F, 0F);
		hipsModel[12].rotateAngleZ = -0.7853982F;

		hipsModel[13].addBox(5F, 4F, 13F, 4, 4, 4, 0); // BanaMechLeg14
		hipsModel[13].setRotationPoint(0F, -63F, 0F);
		hipsModel[13].rotateAngleZ = -0.7853982F;

		leftLegModel = new ModelRendererTurbo[49];
		leftLegModel[0] = new ModelRendererTurbo(this, 102, 597, textureX, textureY); // BanaMechLeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 102, 620, textureX, textureY); // BanaMechLeftLeg2
		leftLegModel[2] = new ModelRendererTurbo(this, 105, 637, textureX, textureY); // BanaMechLeftLeg3
		leftLegModel[3] = new ModelRendererTurbo(this, 109, 653, textureX, textureY); // BanaMechLeftLeg4
		leftLegModel[4] = new ModelRendererTurbo(this, 133, 740, textureX, textureY); // BanaMechLeftLeg6
		leftLegModel[5] = new ModelRendererTurbo(this, 124, 639, textureX, textureY); // BanaMechLeftLeg7
		leftLegModel[6] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechLeftLeg8
		leftLegModel[7] = new ModelRendererTurbo(this, 115, 774, textureX, textureY); // BanaMechLeftLeg9
		leftLegModel[8] = new ModelRendererTurbo(this, 236, 618, textureX, textureY); // BanaMechLeftLeg10
		leftLegModel[9] = new ModelRendererTurbo(this, 236, 599, textureX, textureY); // BanaMechLeftLeg11
		leftLegModel[10] = new ModelRendererTurbo(this, 114, 739, textureX, textureY); // BanaMechLeftLeg12
		leftLegModel[11] = new ModelRendererTurbo(this, 114, 739, textureX, textureY); // BanaMechLeftLeg13
		leftLegModel[12] = new ModelRendererTurbo(this, 133, 740, textureX, textureY); // BanaMechLeftLeg14
		leftLegModel[13] = new ModelRendererTurbo(this, 161, 600, textureX, textureY); // BanaMechLeftLeg15
		leftLegModel[14] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechLLefteg17
		leftLegModel[15] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechLeftLeg18
		leftLegModel[16] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechLeftLeg19
		leftLegModel[17] = new ModelRendererTurbo(this, 113, 715, textureX, textureY); // BanaMechLeftLeg20
		leftLegModel[18] = new ModelRendererTurbo(this, 209, 600, textureX, textureY); // BanaMechLeftLeg21
		leftLegModel[19] = new ModelRendererTurbo(this, 110, 671, textureX, textureY); // BanaMechLeftLeg22
		leftLegModel[20] = new ModelRendererTurbo(this, 107, 692, textureX, textureY); // BanaMechLeftLeg23
		leftLegModel[21] = new ModelRendererTurbo(this, 113, 757, textureX, textureY); // BanaMechLeftLeg24
		leftLegModel[22] = new ModelRendererTurbo(this, 162, 612, textureX, textureY); // BanaMechLeftLeg30
		leftLegModel[23] = new ModelRendererTurbo(this, 162, 631, textureX, textureY); // BanaMechLeftLeg31
		leftLegModel[24] = new ModelRendererTurbo(this, 162, 631, textureX, textureY); // BanaMechLeftLeg32
		leftLegModel[25] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechLeftLeg33
		leftLegModel[26] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechLeftLeg34
		leftLegModel[27] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechLeftLeg35
		leftLegModel[28] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechLeftLeg36
		leftLegModel[29] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechLeftLeg37
		leftLegModel[30] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechLeftLeg38
		leftLegModel[31] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechLeftLeg39
		leftLegModel[32] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechLeftLeg40
		leftLegModel[33] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechLeftLeg41
		leftLegModel[34] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechLeftLeg42
		leftLegModel[35] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechLeftLeg43
		leftLegModel[36] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechLeftLeg44
		leftLegModel[37] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechLeftLeg45
		leftLegModel[38] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechLeftLeg46
		leftLegModel[39] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechLeftLeg48
		leftLegModel[40] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechLeftLeg47
		leftLegModel[41] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechLeftLeg49
		leftLegModel[42] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechLeftLeg50
		leftLegModel[43] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechLeftLeg51
		leftLegModel[44] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechLeftLeg52
		leftLegModel[45] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechLeftLeg53
		leftLegModel[46] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechLeftLeg54
		leftLegModel[47] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechLeftLeg55
		leftLegModel[48] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechLeftLeg56

		leftLegModel[0].addBox(-5F, -5F, -5F, 10, 10, 10, 0); // BanaMechLeftLeg1
		leftLegModel[0].setRotationPoint(0F, -54F, -19F);
		leftLegModel[0].rotateAngleZ = 0.3346075F;

		leftLegModel[1].addBox(-4F, 5F, -4F, 15, 5, 8, 0); // BanaMechLeftLeg2
		leftLegModel[1].setRotationPoint(0F, -54F, -19F);
		leftLegModel[1].rotateAngleZ = 0.3346075F;

		leftLegModel[2].addBox(-2F, 10F, -2F, 4, 3, 4, 0); // BanaMechLeftLeg3
		leftLegModel[2].setRotationPoint(0F, -54F, -19F);
		leftLegModel[2].rotateAngleZ = 0.3346075F;

		leftLegModel[3].addBox(-4F, 16F, -4F, 8, 5, 8, 0); // BanaMechLeftLeg4
		leftLegModel[3].setRotationPoint(0F, -54F, -19F);
		leftLegModel[3].rotateAngleZ = 0.3346075F;

		leftLegModel[4].addBox(10.5F, 34F, -4.5F, 3, 6, 3, 0); // BanaMechLeftLeg6
		leftLegModel[4].setRotationPoint(0F, -54F, -19F);
		leftLegModel[4].rotateAngleZ = -0.3717861F;

		leftLegModel[5].addBox(-3F, 13F, -3F, 6, 3, 6, 0); // BanaMechLeftLeg7
		leftLegModel[5].setRotationPoint(0F, -54F, -19F);
		leftLegModel[5].rotateAngleZ = 0.3346075F;

		leftLegModel[6].addBox(18F, 35F, 1F, 3, 3, 2, 0); // BanaMechLeftLeg8
		leftLegModel[6].setRotationPoint(0F, -54F, -19F);
		leftLegModel[6].rotateAngleZ = -0.3717861F;

		leftLegModel[7].addBox(-6F, 43F, -3F, 8, 7, 6, 0); // BanaMechLeftLeg9
		leftLegModel[7].setRotationPoint(0F, -54F, -19F);
		leftLegModel[7].rotateAngleY = -0.01745329F;

		leftLegModel[8].addBox(9.1F, 0.3F, -5F, 3, 23, 10, 0); // BanaMechLeftLeg10
		leftLegModel[8].setRotationPoint(0F, -54F, -19F);
		leftLegModel[8].rotateAngleZ = 0.2602503F;

		leftLegModel[9].addBox(7F, 1F, -5F, 3, 6, 10, 0); // BanaMechLeftLeg11
		leftLegModel[9].setRotationPoint(0F, -54F, -19F);
		leftLegModel[9].rotateAngleZ = 0.8551081F;

		leftLegModel[10].addBox(10F, 28F, -5F, 4, 6, 4, 0); // BanaMechLeftLeg12
		leftLegModel[10].setRotationPoint(0F, -54F, -19F);
		leftLegModel[10].rotateAngleZ = -0.3717861F;

		leftLegModel[11].addBox(10F, 28F, 1F, 4, 6, 4, 0); // BanaMechLeftLeg13
		leftLegModel[11].setRotationPoint(0F, -54F, -19F);
		leftLegModel[11].rotateAngleZ = -0.3717861F;

		leftLegModel[12].addBox(10.5F, 34F, 1.5F, 3, 6, 3, 0); // BanaMechLeftLeg14
		leftLegModel[12].setRotationPoint(0F, -54F, -19F);
		leftLegModel[12].rotateAngleZ = -0.3717861F;

		leftLegModel[13].addBox(-10F, 48F, -2F, 16, 4, 4, 0); // BanaMechLeftLeg15
		leftLegModel[13].setRotationPoint(0F, -54F, -19F);

		leftLegModel[14].addBox(18F, 29F, 1F, 3, 3, 2, 0); // BanaMechLLefteg17
		leftLegModel[14].setRotationPoint(0F, -54F, -19F);
		leftLegModel[14].rotateAngleZ = -0.3717861F;

		leftLegModel[15].addBox(18F, 35F, -3F, 3, 3, 2, 0); // BanaMechLeftLeg18
		leftLegModel[15].setRotationPoint(0F, -54F, -19F);
		leftLegModel[15].rotateAngleZ = -0.3717861F;

		leftLegModel[16].addBox(18F, 29F, -3F, 3, 3, 2, 0); // BanaMechLeftLeg19
		leftLegModel[16].setRotationPoint(0F, -54F, -19F);
		leftLegModel[16].rotateAngleZ = -0.3717861F;

		leftLegModel[17].addBox(15F, 28F, -4F, 3, 12, 8, 0); // BanaMechLeftLeg20
		leftLegModel[17].setRotationPoint(0F, -54F, -19F);
		leftLegModel[17].rotateAngleZ = -0.3717861F;

		leftLegModel[18].addBox(14F, 31F, -4F, 2, 12, 8, 0); // BanaMechLeftLeg21
		leftLegModel[18].setRotationPoint(0F, -54F, -19F);
		leftLegModel[18].rotateAngleZ = -0.1858931F;

		leftLegModel[19].addBox(-1F, 18F, -3F, 11, 7, 6, 0); // BanaMechLeftLeg22
		leftLegModel[19].setRotationPoint(0F, -54F, -19F);

		leftLegModel[20].addBox(9F, 18F, -5F, 10, 10, 10, 0); // BanaMechLeftLeg23
		leftLegModel[20].setRotationPoint(0F, -54F, -19F);
		leftLegModel[20].rotateAngleZ = -0.3717861F;

		leftLegModel[21].addBox(9F, 39F, -5F, 10, 4, 10, 0); // BanaMechLeftLeg24
		leftLegModel[21].setRotationPoint(0F, -54F, -19F);
		leftLegModel[21].rotateAngleZ = -0.3717861F;

		leftLegModel[22].addBox(-7F, 50F, -5F, 10, 4, 10, 0); // BanaMechLeftLeg30
		leftLegModel[22].setRotationPoint(0F, -54F, -19F);

		leftLegModel[23].addBox(-9F, 50.5F, -8F, 3, 3, 16, 0); // BanaMechLeftLeg31
		leftLegModel[23].setRotationPoint(0F, -54F, -19F);

		leftLegModel[24].addBox(2F, 50.5F, -8F, 3, 3, 16, 0); // BanaMechLeftLeg32
		leftLegModel[24].setRotationPoint(0F, -54F, -19F);

		leftLegModel[25].addBox(-10F, 50F, -9F, 4, 4, 3, 0); // BanaMechLeftLeg33
		leftLegModel[25].setRotationPoint(0F, -54F, -19F);

		leftLegModel[26].addBox(2F, 50F, 6F, 4, 4, 3, 0); // BanaMechLeftLeg34
		leftLegModel[26].setRotationPoint(0F, -54F, -19F);

		leftLegModel[27].addBox(2F, 50F, -9F, 4, 4, 3, 0); // BanaMechLeftLeg35
		leftLegModel[27].setRotationPoint(0F, -54F, -19F);

		leftLegModel[28].addBox(-10F, 50F, 6F, 4, 4, 3, 0); // BanaMechLeftLeg36
		leftLegModel[28].setRotationPoint(0F, -54F, -19F);

		leftLegModel[29].addBox(11F, 52F, -10F, 2, 2, 5, 0); // BanaMechLeftLeg37
		leftLegModel[29].setRotationPoint(0F, -54F, -19F);

		leftLegModel[30].addBox(11F, 52F, 5F, 2, 2, 5, 0); // BanaMechLeftLeg38
		leftLegModel[30].setRotationPoint(0F, -54F, -19F);

		leftLegModel[31].addBox(9F, 47F, 5F, 2, 7, 5, 0); // BanaMechLeftLeg39
		leftLegModel[31].setRotationPoint(0F, -54F, -19F);

		leftLegModel[32].addBox(9F, 47F, -10F, 2, 7, 5, 0); // BanaMechLeftLeg40
		leftLegModel[32].setRotationPoint(0F, -54F, -19F);

		leftLegModel[33].addBox(-7F, 48F, 5F, 2, 6, 5, 0); // BanaMechLeftLeg41
		leftLegModel[33].setRotationPoint(0F, -54F, -19F);
		leftLegModel[33].rotateAngleZ = 0.3346075F;

		leftLegModel[34].addBox(-7F, 48F, -10F, 2, 6, 5, 0); // BanaMechLeftLeg42
		leftLegModel[34].setRotationPoint(0F, -54F, -19F);
		leftLegModel[34].rotateAngleZ = 0.3346075F;

		leftLegModel[35].addBox(6F, 51F, 6.5F, 3, 2, 2, 0); // BanaMechLeftLeg43
		leftLegModel[35].setRotationPoint(0F, -54F, -19F);

		leftLegModel[36].addBox(-19F, 47F, 6.5F, 5, 1, 2, 0); // BanaMechLeftLeg44
		leftLegModel[36].setRotationPoint(0F, -54F, -19F);
		leftLegModel[36].rotateAngleZ = 0.483322F;

		leftLegModel[37].addBox(6F, 51F, -8.5F, 3, 2, 2, 0); // BanaMechLeftLeg45
		leftLegModel[37].setRotationPoint(0F, -54F, -19F);

		leftLegModel[38].addBox(-19F, 47F, -8.5F, 5, 1, 2, 0); // BanaMechLeftLeg46
		leftLegModel[38].setRotationPoint(0F, -54F, -19F);
		leftLegModel[38].rotateAngleZ = 0.483322F;

		leftLegModel[39].addBox(-17F, 52F, -10F, 2, 2, 5, 0); // BanaMechLeftLeg48
		leftLegModel[39].setRotationPoint(0F, -54F, -19F);

		leftLegModel[40].addBox(1.2F, 49.5F, 9F, 2, 6, 5, 0); // BanaMechLeftLeg47
		leftLegModel[40].setRotationPoint(0F, -54F, -23F);
		leftLegModel[40].rotateAngleZ = -0.3346145F;

		leftLegModel[41].addBox(1.2F, 49.5F, -10F, 2, 6, 5, 0); // BanaMechLeftLeg49
		leftLegModel[41].setRotationPoint(0F, -54F, -19F);
		leftLegModel[41].rotateAngleZ = -0.3346145F;

		leftLegModel[42].addBox(-15F, 47F, -10F, 2, 7, 5, 0); // BanaMechLeftLeg50
		leftLegModel[42].setRotationPoint(0F, -54F, -19F);

		leftLegModel[43].addBox(-15F, 47F, 9F, 2, 7, 5, 0); // BanaMechLeftLeg51
		leftLegModel[43].setRotationPoint(0F, -54F, -23F);

		leftLegModel[44].addBox(-13F, 51F, 10.5F, 3, 2, 2, 0); // BanaMechLeftLeg52
		leftLegModel[44].setRotationPoint(0F, -54F, -23F);

		leftLegModel[45].addBox(-13F, 51F, -8.5F, 3, 2, 2, 0); // BanaMechLeftLeg53
		leftLegModel[45].setRotationPoint(0F, -54F, -19F);

		leftLegModel[46].addBox(10F, 49F, -8.5F, 5, 1, 2, 0); // BanaMechLeftLeg54
		leftLegModel[46].setRotationPoint(0F, -54F, -19F);
		leftLegModel[46].rotateAngleZ = -0.4658633F;

		leftLegModel[47].addBox(10F, 49F, 10.5F, 5, 1, 2, 0); // BanaMechLeftLeg55
		leftLegModel[47].setRotationPoint(0F, -54F, -23F);
		leftLegModel[47].rotateAngleZ = -0.4658633F;

		leftLegModel[48].addBox(-17F, 52F, 5F, 2, 2, 5, 0); // BanaMechLeftLeg56
		leftLegModel[48].setRotationPoint(0F, -54F, -19F);

		rightLegModel = new ModelRendererTurbo[49];
		rightLegModel[0] = new ModelRendererTurbo(this, 102, 597, textureX, textureY); // BanaMechRightLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 102, 620, textureX, textureY); // BanaMechRightLeg2
		rightLegModel[2] = new ModelRendererTurbo(this, 105, 637, textureX, textureY); // BanaMechRightLeg3
		rightLegModel[3] = new ModelRendererTurbo(this, 133, 740, textureX, textureY); // BanaMechRightLeg6
		rightLegModel[4] = new ModelRendererTurbo(this, 109, 653, textureX, textureY); // BanaMechRightLeg4
		rightLegModel[5] = new ModelRendererTurbo(this, 124, 639, textureX, textureY); // BanaMechRightLeg7
		rightLegModel[6] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechRightLeg8
		rightLegModel[7] = new ModelRendererTurbo(this, 115, 774, textureX, textureY); // BanaMechRightLeg9
		rightLegModel[8] = new ModelRendererTurbo(this, 236, 618, textureX, textureY); // BanaMechRightLeg10
		rightLegModel[9] = new ModelRendererTurbo(this, 236, 599, textureX, textureY); // BanaMechRightLeg11
		rightLegModel[10] = new ModelRendererTurbo(this, 114, 739, textureX, textureY); // BanaMechRightLeg12
		rightLegModel[11] = new ModelRendererTurbo(this, 114, 739, textureX, textureY); // BanaMechRightLeg13
		rightLegModel[12] = new ModelRendererTurbo(this, 133, 740, textureX, textureY); // BanaMechRightLeg14
		rightLegModel[13] = new ModelRendererTurbo(this, 161, 600, textureX, textureY); // BanaMechRightLeg15
		rightLegModel[14] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechRightLeg17
		rightLegModel[15] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechRightLeg18
		rightLegModel[16] = new ModelRendererTurbo(this, 138, 718, textureX, textureY); // BanaMechRightLeg19
		rightLegModel[17] = new ModelRendererTurbo(this, 113, 715, textureX, textureY); // BanaMechRightLeg20
		rightLegModel[18] = new ModelRendererTurbo(this, 209, 600, textureX, textureY); // BanaMechRightLeg21
		rightLegModel[19] = new ModelRendererTurbo(this, 110, 671, textureX, textureY); // BanaMechRightLeg22
		rightLegModel[20] = new ModelRendererTurbo(this, 107, 692, textureX, textureY); // BanaMechRightLeg23
		rightLegModel[21] = new ModelRendererTurbo(this, 113, 757, textureX, textureY); // BanaMechRightLeg24
		rightLegModel[22] = new ModelRendererTurbo(this, 162, 612, textureX, textureY); // BanaMechRightLeg30
		rightLegModel[23] = new ModelRendererTurbo(this, 162, 631, textureX, textureY); // BanaMechRightLeg31
		rightLegModel[24] = new ModelRendererTurbo(this, 162, 631, textureX, textureY); // BanaMechRightLeg32
		rightLegModel[25] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechRightLeg33
		rightLegModel[26] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechRightLeg34
		rightLegModel[27] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechRightLeg35
		rightLegModel[28] = new ModelRendererTurbo(this, 163, 654, textureX, textureY); // BanaMechRightLeg36
		rightLegModel[29] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechRightLeg37
		rightLegModel[30] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechRightLeg38
		rightLegModel[31] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechRightLeg39
		rightLegModel[32] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechRightLeg40
		rightLegModel[33] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechRightLeg41
		rightLegModel[34] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechRightLeg42
		rightLegModel[35] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechRightLeg43
		rightLegModel[36] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechRightLeg44
		rightLegModel[37] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechRightLeg45
		rightLegModel[38] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechRightLeg46
		rightLegModel[39] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechRightLeg47
		rightLegModel[40] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechRightLeg48
		rightLegModel[41] = new ModelRendererTurbo(this, 166, 691, textureX, textureY); // BanaMechRightLeg49
		rightLegModel[42] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechRightLeg50
		rightLegModel[43] = new ModelRendererTurbo(this, 180, 672, textureX, textureY); // BanaMechRightLeg51
		rightLegModel[44] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechRightLeg53
		rightLegModel[45] = new ModelRendererTurbo(this, 183, 663, textureX, textureY); // BanaMechRightLeg52
		rightLegModel[46] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechRightLeg54
		rightLegModel[47] = new ModelRendererTurbo(this, 180, 656, textureX, textureY); // BanaMechRightLeg55
		rightLegModel[48] = new ModelRendererTurbo(this, 164, 674, textureX, textureY); // BanaMechRightLeg56

		rightLegModel[0].addBox(-5F, -5F, -5F, 10, 10, 10, 0); // BanaMechRightLeg1
		rightLegModel[0].setRotationPoint(0F, -54F, 19F);
		rightLegModel[0].rotateAngleZ = 0.3346075F;

		rightLegModel[1].addBox(-4F, 5F, -4F, 15, 5, 8, 0); // BanaMechRightLeg2
		rightLegModel[1].setRotationPoint(0F, -54F, 19F);
		rightLegModel[1].rotateAngleZ = 0.3346075F;

		rightLegModel[2].addBox(-2F, 10F, -2F, 4, 3, 4, 0); // BanaMechRightLeg3
		rightLegModel[2].setRotationPoint(0F, -54F, 19F);
		rightLegModel[2].rotateAngleZ = 0.3346075F;

		rightLegModel[3].addBox(10.5F, 34F, -4.5F, 3, 6, 3, 0); // BanaMechRightLeg6
		rightLegModel[3].setRotationPoint(0F, -54F, 19F);
		rightLegModel[3].rotateAngleZ = -0.3717861F;

		rightLegModel[4].addBox(-4F, 16F, -4F, 8, 5, 8, 0); // BanaMechRightLeg4
		rightLegModel[4].setRotationPoint(0F, -54F, 19F);
		rightLegModel[4].rotateAngleZ = 0.3346075F;

		rightLegModel[5].addBox(-3F, 13F, -3F, 6, 3, 6, 0); // BanaMechRightLeg7
		rightLegModel[5].setRotationPoint(0F, -54F, 19F);
		rightLegModel[5].rotateAngleZ = 0.3346075F;

		rightLegModel[6].addBox(18F, 35F, 1F, 3, 3, 2, 0); // BanaMechRightLeg8
		rightLegModel[6].setRotationPoint(0F, -54F, 19F);
		rightLegModel[6].rotateAngleZ = -0.3717861F;

		rightLegModel[7].addBox(-6F, 43F, -3F, 8, 7, 6, 0); // BanaMechRightLeg9
		rightLegModel[7].setRotationPoint(0F, -54F, 19F);
		rightLegModel[7].rotateAngleY = -0.01745329F;

		rightLegModel[8].addBox(9.1F, 0.3F, -5F, 3, 23, 10, 0); // BanaMechRightLeg10
		rightLegModel[8].setRotationPoint(0F, -54F, 19F);
		rightLegModel[8].rotateAngleZ = 0.2602503F;

		rightLegModel[9].addBox(7F, 1F, -5F, 3, 6, 10, 0); // BanaMechRightLeg11
		rightLegModel[9].setRotationPoint(0F, -54F, 19F);
		rightLegModel[9].rotateAngleZ = 0.8551081F;

		rightLegModel[10].addBox(10F, 28F, -5F, 4, 6, 4, 0); // BanaMechRightLeg12
		rightLegModel[10].setRotationPoint(0F, -54F, 19F);
		rightLegModel[10].rotateAngleZ = -0.3717861F;

		rightLegModel[11].addBox(10F, 28F, 1F, 4, 6, 4, 0); // BanaMechRightLeg13
		rightLegModel[11].setRotationPoint(0F, -54F, 19F);
		rightLegModel[11].rotateAngleZ = -0.3717861F;

		rightLegModel[12].addBox(10.5F, 34F, 1.5F, 3, 6, 3, 0); // BanaMechRightLeg14
		rightLegModel[12].setRotationPoint(0F, -54F, 19F);
		rightLegModel[12].rotateAngleZ = -0.3717861F;

		rightLegModel[13].addBox(-10F, 48F, -2F, 16, 4, 4, 0); // BanaMechRightLeg15
		rightLegModel[13].setRotationPoint(0F, -54F, 19F);

		rightLegModel[14].addBox(18F, 29F, 1F, 3, 3, 2, 0); // BanaMechRightLeg17
		rightLegModel[14].setRotationPoint(0F, -54F, 19F);
		rightLegModel[14].rotateAngleZ = -0.3717861F;

		rightLegModel[15].addBox(18F, 35F, -3F, 3, 3, 2, 0); // BanaMechRightLeg18
		rightLegModel[15].setRotationPoint(0F, -54F, 19F);
		rightLegModel[15].rotateAngleZ = -0.3717861F;

		rightLegModel[16].addBox(18F, 29F, -3F, 3, 3, 2, 0); // BanaMechRightLeg19
		rightLegModel[16].setRotationPoint(0F, -54F, 19F);
		rightLegModel[16].rotateAngleZ = -0.3717861F;

		rightLegModel[17].addBox(15F, 28F, -4F, 3, 12, 8, 0); // BanaMechRightLeg20
		rightLegModel[17].setRotationPoint(0F, -54F, 19F);
		rightLegModel[17].rotateAngleZ = -0.3717861F;

		rightLegModel[18].addBox(14F, 31F, -4F, 2, 12, 8, 0); // BanaMechRightLeg21
		rightLegModel[18].setRotationPoint(0F, -54F, 19F);
		rightLegModel[18].rotateAngleZ = -0.1858931F;

		rightLegModel[19].addBox(-1F, 18F, -3F, 11, 7, 6, 0); // BanaMechRightLeg22
		rightLegModel[19].setRotationPoint(0F, -54F, 19F);

		rightLegModel[20].addBox(9F, 18F, -5F, 10, 10, 10, 0); // BanaMechRightLeg23
		rightLegModel[20].setRotationPoint(0F, -54F, 19F);
		rightLegModel[20].rotateAngleZ = -0.3717861F;

		rightLegModel[21].addBox(9F, 39F, -5F, 10, 4, 10, 0); // BanaMechRightLeg24
		rightLegModel[21].setRotationPoint(0F, -54F, 19F);
		rightLegModel[21].rotateAngleZ = -0.3717861F;

		rightLegModel[22].addBox(-7F, 50F, -5F, 10, 4, 10, 0); // BanaMechRightLeg30
		rightLegModel[22].setRotationPoint(0F, -54F, 19F);

		rightLegModel[23].addBox(-9F, 50.5F, -8F, 3, 3, 16, 0); // BanaMechRightLeg31
		rightLegModel[23].setRotationPoint(0F, -54F, 19F);

		rightLegModel[24].addBox(2F, 50.5F, -8F, 3, 3, 16, 0); // BanaMechRightLeg32
		rightLegModel[24].setRotationPoint(0F, -54F, 19F);

		rightLegModel[25].addBox(-10F, 50F, -9F, 4, 4, 3, 0); // BanaMechRightLeg33
		rightLegModel[25].setRotationPoint(0F, -54F, 19F);

		rightLegModel[26].addBox(2F, 50F, 6F, 4, 4, 3, 0); // BanaMechRightLeg34
		rightLegModel[26].setRotationPoint(0F, -54F, 19F);

		rightLegModel[27].addBox(2F, 50F, -9F, 4, 4, 3, 0); // BanaMechRightLeg35
		rightLegModel[27].setRotationPoint(0F, -54F, 19F);

		rightLegModel[28].addBox(-10F, 50F, 6F, 4, 4, 3, 0); // BanaMechRightLeg36
		rightLegModel[28].setRotationPoint(0F, -54F, 19F);

		rightLegModel[29].addBox(11F, 52F, -10F, 2, 2, 5, 0); // BanaMechRightLeg37
		rightLegModel[29].setRotationPoint(0F, -54F, 19F);

		rightLegModel[30].addBox(11F, 52F, 5F, 2, 2, 5, 0); // BanaMechRightLeg38
		rightLegModel[30].setRotationPoint(0F, -54F, 19F);

		rightLegModel[31].addBox(9F, 47F, 5F, 2, 7, 5, 0); // BanaMechRightLeg39
		rightLegModel[31].setRotationPoint(0F, -54F, 19F);

		rightLegModel[32].addBox(9F, 47F, -10F, 2, 7, 5, 0); // BanaMechRightLeg40
		rightLegModel[32].setRotationPoint(0F, -54F, 19F);

		rightLegModel[33].addBox(-7F, 48F, 5F, 2, 6, 5, 0); // BanaMechRightLeg41
		rightLegModel[33].setRotationPoint(0F, -54F, 19F);
		rightLegModel[33].rotateAngleZ = 0.3346075F;

		rightLegModel[34].addBox(-7F, 48F, -10F, 2, 6, 5, 0); // BanaMechRightLeg42
		rightLegModel[34].setRotationPoint(0F, -54F, 19F);
		rightLegModel[34].rotateAngleZ = 0.3346075F;

		rightLegModel[35].addBox(6F, 51F, 6.5F, 3, 2, 2, 0); // BanaMechRightLeg43
		rightLegModel[35].setRotationPoint(0F, -54F, 19F);

		rightLegModel[36].addBox(-19F, 47F, 6.5F, 5, 1, 2, 0); // BanaMechRightLeg44
		rightLegModel[36].setRotationPoint(0F, -54F, 19F);
		rightLegModel[36].rotateAngleZ = 0.483322F;

		rightLegModel[37].addBox(6F, 51F, -8.5F, 3, 2, 2, 0); // BanaMechRightLeg45
		rightLegModel[37].setRotationPoint(0F, -54F, 19F);

		rightLegModel[38].addBox(-19F, 47F, -8.5F, 5, 1, 2, 0); // BanaMechRightLeg46
		rightLegModel[38].setRotationPoint(0F, -54F, 19F);
		rightLegModel[38].rotateAngleZ = 0.483322F;

		rightLegModel[39].addBox(1.2F, 49.5F, 5F, 2, 6, 5, 0); // BanaMechRightLeg47
		rightLegModel[39].setRotationPoint(0F, -54F, 19F);
		rightLegModel[39].rotateAngleZ = -0.3346145F;

		rightLegModel[40].addBox(-17F, 52F, -10F, 2, 2, 5, 0); // BanaMechRightLeg48
		rightLegModel[40].setRotationPoint(0F, -54F, 19F);

		rightLegModel[41].addBox(1.2F, 49.5F, -10F, 2, 6, 5, 0); // BanaMechRightLeg49
		rightLegModel[41].setRotationPoint(0F, -54F, 19F);
		rightLegModel[41].rotateAngleZ = -0.3346145F;

		rightLegModel[42].addBox(-15F, 47F, -10F, 2, 7, 5, 0); // BanaMechRightLeg50
		rightLegModel[42].setRotationPoint(0F, -54F, 19F);

		rightLegModel[43].addBox(-15F, 47F, 5F, 2, 7, 5, 0); // BanaMechRightLeg51
		rightLegModel[43].setRotationPoint(0F, -54F, 19F);

		rightLegModel[44].addBox(-13F, 51F, -8.5F, 3, 2, 2, 0); // BanaMechRightLeg53
		rightLegModel[44].setRotationPoint(0F, -54F, 19F);

		rightLegModel[45].addBox(-13F, 51F, 6.5F, 3, 2, 2, 0); // BanaMechRightLeg52
		rightLegModel[45].setRotationPoint(0F, -54F, 19F);

		rightLegModel[46].addBox(10F, 49F, -8.5F, 5, 1, 2, 0); // BanaMechRightLeg54
		rightLegModel[46].setRotationPoint(0F, -54F, 19F);
		rightLegModel[46].rotateAngleZ = -0.4658633F;

		rightLegModel[47].addBox(10F, 49F, 6.5F, 5, 1, 2, 0); // BanaMechRightLeg55
		rightLegModel[47].setRotationPoint(0F, -54F, 19F);
		rightLegModel[47].rotateAngleZ = -0.4658633F;

		rightLegModel[48].addBox(-17F, 52F, 5F, 2, 2, 5, 0); // BanaMechRightLeg56
		rightLegModel[48].setRotationPoint(0F, -54F, 19F);

		flipAll();
	}
}