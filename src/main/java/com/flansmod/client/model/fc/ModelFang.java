//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelFang extends ModelPlane
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelFang()
	{
		bodyModel = new ModelRendererTurbo[86];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Import ImportBox0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 125, textureX, textureY); // Import ImportBox1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportBox2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import ImportBox3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import ImportBox4
		bodyModel[5] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import ImportBox5
		bodyModel[6] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportBox6
		bodyModel[7] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import ImportBox12
		bodyModel[8] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import ImportBox13
		bodyModel[9] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Import ImportBox14
		bodyModel[10] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import ImportBox15
		bodyModel[11] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import ImportBox16
		bodyModel[12] = new ModelRendererTurbo(this, 0, 190, textureX, textureY); // Import ImportBox17
		bodyModel[13] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import ImportBox18
		bodyModel[14] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportBox19
		bodyModel[15] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import ImportBox20
		bodyModel[16] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import ImportBox22
		bodyModel[17] = new ModelRendererTurbo(this, 0, 520, textureX, textureY); // Import ImportBox23
		bodyModel[18] = new ModelRendererTurbo(this, 0, 580, textureX, textureY); // Import ImportBox24
		bodyModel[19] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import ImportBox25
		bodyModel[20] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import ImportBox26
		bodyModel[21] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import ImportBox27
		bodyModel[22] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import ImportBox28
		bodyModel[23] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import ImportBox29
		bodyModel[24] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import ImportBox30
		bodyModel[25] = new ModelRendererTurbo(this, 0, 740, textureX, textureY); // Import ImportBox31
		bodyModel[26] = new ModelRendererTurbo(this, 0, 780, textureX, textureY); // Import ImportBox32
		bodyModel[27] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Import ImportBox0
		bodyModel[28] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import ImportBox1
		bodyModel[29] = new ModelRendererTurbo(this, 81, 880, textureX, textureY); // Import ImportBox2
		bodyModel[30] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import ImportBox3
		bodyModel[31] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox4
		bodyModel[32] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import ImportBox5
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Import ImportBox6
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import ImportBox7
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import ImportBox8
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import ImportBox9
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import ImportBox10
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import ImportBox11
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox12
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox13
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import ImportBox14
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox15
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox17
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox18
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import ImportBox21
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import ImportBox22
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1330, textureX, textureY); // Import ImportBox23
		bodyModel[48] = new ModelRendererTurbo(this, 81, 880, textureX, textureY); // Import ImportBox24
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox25
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1140, textureX, textureY); // Import ImportBox26
		bodyModel[51] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Import ImportBox27
		bodyModel[52] = new ModelRendererTurbo(this, 0, 920, textureX, textureY); // Import ImportBox28
		bodyModel[53] = new ModelRendererTurbo(this, 0, 880, textureX, textureY); // Import ImportBox29
		bodyModel[54] = new ModelRendererTurbo(this, 0, 950, textureX, textureY); // Import ImportBox30
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox31
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1250, textureX, textureY); // Import ImportBox32
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1024, textureX, textureY); // Import ImportBox33
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1090, textureX, textureY); // Import ImportBox34
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import ImportBox35
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1120, textureX, textureY); // Import ImportBox36
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import ImportBox37
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1330, textureX, textureY); // Import ImportBox38
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1200, textureX, textureY); // Import ImportBox39
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import ImportBox41
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1300, textureX, textureY); // Import ImportBox42
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import ImportBox44
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1130, textureX, textureY); // Import ImportBox45
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Import ImportBox47
		bodyModel[69] = new ModelRendererTurbo(this, 81, 1520, textureX, textureY); // Import ImportBox48
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Import ImportBox49
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Import ImportBox50
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import ImportBox51
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Import ImportBox52
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import ImportBox53
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import ImportBox54
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1490, textureX, textureY); // Import ImportBox55
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1520, textureX, textureY); // Import ImportBox56
		bodyModel[78] = new ModelRendererTurbo(this, 81, 1520, textureX, textureY); // Import ImportBox57
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1600, textureX, textureY); // Import ImportBox58
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1640, textureX, textureY); // Import ImportBox59
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1680, textureX, textureY); // Import ImportBox60
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1720, textureX, textureY); // Import ImportBox61
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1550, textureX, textureY); // Import ImportBox62
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1750, textureX, textureY); // Import ImportBox63
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1810, textureX, textureY); // Import ImportBox64

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 4, 24, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox0
		bodyModel[0].setRotationPoint(-75F, -11F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 29, 24, 0F); // Import ImportBox1
		bodyModel[1].setRotationPoint(-27F, -36F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 30, 4, 0F, 0F, -15F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		bodyModel[2].setRotationPoint(-51F, -41F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 24, 15, 4, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import ImportBox3
		bodyModel[3].setRotationPoint(-75F, -26F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 27, 3, 2, 0F); // Import ImportBox4
		bodyModel[4].setRotationPoint(-54F, -41F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, -3F, 0F, 1F, 3F, 0F, 0.9F, 3F, 0F, 0F, -3F, 0F, 0F); // Import ImportBox5
		bodyModel[5].setRotationPoint(-54F, -38F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F); // Import ImportBox6
		bodyModel[6].setRotationPoint(-75F, -41F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 24, 4, 24, 0F); // Import ImportBox12
		bodyModel[7].setRotationPoint(-51F, -11F, -12F);

		bodyModel[8].addBox(0F, 0F, 0F, 27, 3, 2, 0F); // Import ImportBox13
		bodyModel[8].setRotationPoint(-54F, -41F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 12, 2, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.9F, -3F, 0F, 1F); // Import ImportBox14
		bodyModel[9].setRotationPoint(-54F, -38F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 1F); // Import ImportBox15
		bodyModel[10].setRotationPoint(-75F, -41F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 24, 15, 4, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox16
		bodyModel[11].setRotationPoint(-75F, -26F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 24, 30, 4, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox17
		bodyModel[12].setRotationPoint(-51F, -41F, 8F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 2, 12, 0F); // Import ImportBox18
		bodyModel[13].setRotationPoint(-54F, -41F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 21, 19, 18, 0F, 0F, -6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Import ImportBox19
		bodyModel[14].setRotationPoint(-96F, -26F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 3, 18, 0F, 0F, -8F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -8F, -4F, 0F, 6F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -4F); // Import ImportBox20
		bodyModel[15].setRotationPoint(-96F, -29F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 34, 16, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		bodyModel[16].setRotationPoint(-24F, -41F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 18, 26, 24, 0F); // Import ImportBox23
		bodyModel[17].setRotationPoint(-12F, -33F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 25, 6, 18, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox24
		bodyModel[18].setRotationPoint(-20F, -38F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox25
		bodyModel[19].setRotationPoint(-24F, -41F, -12F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox26
		bodyModel[20].setRotationPoint(-12F, -41F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 8, 24, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox27
		bodyModel[21].setRotationPoint(0F, -41F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 5, 24, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox28
		bodyModel[22].setRotationPoint(-27F, -41F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 12, 34, 4, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox29
		bodyModel[23].setRotationPoint(-24F, -41F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 34, 4, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		bodyModel[24].setRotationPoint(-24F, -41F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 8, 24, 0F, 0F, 0F, -6F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox31
		bodyModel[25].setRotationPoint(6F, -41F, -12F);

		bodyModel[26].addBox(0F, 0F, 0F, 104, 26, 24, 0F); // Import ImportBox32
		bodyModel[26].setRotationPoint(6F, -33F, -12F);

		bodyModel[27].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import ImportBox0
		bodyModel[27].setRotationPoint(-7F, -33F, -36F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import ImportBox1
		bodyModel[28].setRotationPoint(-7F, -30F, -36F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import ImportBox2
		bodyModel[29].setRotationPoint(-7F, -30F, -16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import ImportBox3
		bodyModel[30].setRotationPoint(-14F, -32F, -34F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox4
		bodyModel[31].setRotationPoint(18F, -11F, -32F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 87, 10, 24, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		bodyModel[32].setRotationPoint(23F, -43F, -12F);

		bodyModel[33].addBox(0F, 0F, 0F, 110, 26, 24, 0F); // Import ImportBox6
		bodyModel[33].setRotationPoint(23F, -33F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 45, 5, 16, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		bodyModel[34].setRotationPoint(0F, -38F, -33F);

		bodyModel[35].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import ImportBox8
		bodyModel[35].setRotationPoint(-7F, -37F, -30F);

		bodyModel[36].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import ImportBox9
		bodyModel[36].setRotationPoint(-24F, -36F, -29F);

		bodyModel[37].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import ImportBox10
		bodyModel[37].setRotationPoint(-24F, -36F, -22F);

		bodyModel[38].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import ImportBox11
		bodyModel[38].setRotationPoint(-7F, -37F, -23F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		bodyModel[39].setRotationPoint(-25F, -26F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		bodyModel[40].setRotationPoint(-16F, -17F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 4F, 0F, 6F, 4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F); // Import ImportBox14
		bodyModel[41].setRotationPoint(45F, -38F, -33F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 87, 26, 11, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox15
		bodyModel[42].setRotationPoint(23F, -33F, -47F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox17
		bodyModel[43].setRotationPoint(2F, -31F, -39F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox18
		bodyModel[44].setRotationPoint(13F, -17F, -39F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox21
		bodyModel[45].setRotationPoint(1F, -26F, -59F);

		bodyModel[46].addShapeBox(0F, -15F, 0F, 50, 15, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox22
		bodyModel[46].setRotationPoint(45F, -27F, -47F);
		bodyModel[46].rotateAngleX = 0.43633231F;

		bodyModel[47].addShapeBox(0F, -20F, 0F, 42, 21, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox23
		bodyModel[47].setRotationPoint(41F, -39F, -23F);
		bodyModel[47].rotateAngleX = 0.26179939F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import ImportBox24
		bodyModel[48].setRotationPoint(-7F, -30F, 32F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import ImportBox25
		bodyModel[49].setRotationPoint(-25F, -26F, 12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import ImportBox26
		bodyModel[50].setRotationPoint(-16F, -17F, 12F);

		bodyModel[51].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import ImportBox27
		bodyModel[51].setRotationPoint(-7F, -33F, 12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 2, 20, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Import ImportBox28
		bodyModel[52].setRotationPoint(-14F, -32F, 14F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F); // Import ImportBox29
		bodyModel[53].setRotationPoint(-7F, -30F, 12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox30
		bodyModel[54].setRotationPoint(18F, -11F, 16F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import ImportBox31
		bodyModel[55].setRotationPoint(13F, -17F, 36F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Import ImportBox32
		bodyModel[56].setRotationPoint(2F, -31F, 36F);

		bodyModel[57].addBox(0F, 0F, 0F, 110, 26, 24, 0F); // Import ImportBox33
		bodyModel[57].setRotationPoint(23F, -33F, 12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 45, 5, 16, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox34
		bodyModel[58].setRotationPoint(0F, -38F, 17F);

		bodyModel[59].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import ImportBox35
		bodyModel[59].setRotationPoint(-7F, -37F, 20F);

		bodyModel[60].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import ImportBox36
		bodyModel[60].setRotationPoint(-7F, -37F, 27F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 42, 5, 23, 0F, 6F, 4F, 0F, 0F, 4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox37
		bodyModel[61].setRotationPoint(45F, -38F, 10F);

		bodyModel[62].addShapeBox(0F, -20F, 0F, 42, 21, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox38
		bodyModel[62].setRotationPoint(41F, -39F, 19F);
		bodyModel[62].rotateAngleX = -0.26179939F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 87, 26, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F); // Import ImportBox39
		bodyModel[63].setRotationPoint(23F, -33F, 36F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 22, 4, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F); // Import ImportBox41
		bodyModel[64].setRotationPoint(1F, -26F, 36F);

		bodyModel[65].addShapeBox(0F, -15F, 0F, 50, 15, 4, 0F, -25F, 0F, -1.5F, -10F, 0F, -1.5F, -10F, 0F, -1.5F, -25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox42
		bodyModel[65].setRotationPoint(45F, -27F, 43F);
		bodyModel[65].rotateAngleX = -0.43633231F;

		bodyModel[66].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import ImportBox44
		bodyModel[66].setRotationPoint(-24F, -36F, 28F);

		bodyModel[67].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Import ImportBox45
		bodyModel[67].setRotationPoint(-24F, -36F, 21F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox47
		bodyModel[68].setRotationPoint(133F, -33F, -32F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox48
		bodyModel[69].setRotationPoint(133F, -33F, -16F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox49
		bodyModel[70].setRotationPoint(133F, -33F, -36F);

		bodyModel[71].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import ImportBox50
		bodyModel[71].setRotationPoint(133F, -10F, -36F);

		bodyModel[72].addBox(0F, 0F, 0F, 11, 2, 16, 0F); // Import ImportBox51
		bodyModel[72].setRotationPoint(133F, -27F, -32F);

		bodyModel[73].addBox(0F, 0F, 0F, 17, 2, 16, 0F); // Import ImportBox52
		bodyModel[73].setRotationPoint(133F, -22F, -32F);

		bodyModel[74].addBox(0F, 0F, 0F, 22, 2, 16, 0F); // Import ImportBox53
		bodyModel[74].setRotationPoint(133F, -17F, -32F);

		bodyModel[75].addBox(0F, 0F, 0F, 27, 2, 16, 0F); // Import ImportBox54
		bodyModel[75].setRotationPoint(133F, -13F, -32F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.3F, 0F, 0F, 4.3F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox55
		bodyModel[76].setRotationPoint(133F, -33F, 16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox56
		bodyModel[77].setRotationPoint(133F, -33F, 32F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 30, 23, 4, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox57
		bodyModel[78].setRotationPoint(133F, -33F, 12F);

		bodyModel[79].addBox(0F, 0F, 0F, 11, 2, 16, 0F); // Import ImportBox58
		bodyModel[79].setRotationPoint(133F, -27F, 16F);

		bodyModel[80].addBox(0F, 0F, 0F, 17, 2, 16, 0F); // Import ImportBox59
		bodyModel[80].setRotationPoint(133F, -22F, 16F);

		bodyModel[81].addBox(0F, 0F, 0F, 22, 2, 16, 0F); // Import ImportBox60
		bodyModel[81].setRotationPoint(133F, -17F, 16F);

		bodyModel[82].addBox(0F, 0F, 0F, 27, 2, 16, 0F); // Import ImportBox61
		bodyModel[82].setRotationPoint(133F, -13F, 16F);

		bodyModel[83].addBox(0F, 0F, 0F, 30, 3, 24, 0F); // Import ImportBox62
		bodyModel[83].setRotationPoint(133F, -10F, 12F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 10, 26, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Import ImportBox63
		bodyModel[84].setRotationPoint(111F, -33F, -12F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 10, 24, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox64
		bodyModel[85].setRotationPoint(110F, -43F, -12F);


		noseModel = new ModelRendererTurbo[8];
		noseModel[0] = new ModelRendererTurbo(this, 400, 0, textureX, textureY); // Import ImportBox0
		noseModel[1] = new ModelRendererTurbo(this, 400, 50, textureX, textureY); // Import ImportBox1
		noseModel[2] = new ModelRendererTurbo(this, 400, 70, textureX, textureY); // Import ImportBox2
		noseModel[3] = new ModelRendererTurbo(this, 400, 100, textureX, textureY); // Import ImportBox3
		noseModel[4] = new ModelRendererTurbo(this, 400, 140, textureX, textureY); // Import ImportBox4
		noseModel[5] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import ImportBox5
		noseModel[6] = new ModelRendererTurbo(this, 400, 210, textureX, textureY); // Import ImportBox7
		noseModel[7] = new ModelRendererTurbo(this, 400, 210, textureX, textureY); // Import ImportBox8

		noseModel[0].addShapeBox(0F, 0F, 0F, 6, 29, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import ImportBox0
		noseModel[0].setRotationPoint(-33F, -36F, -7F);

		noseModel[1].addBox(0F, 0F, 0F, 4, 6, 8, 0F); // Import ImportBox1
		noseModel[1].setRotationPoint(-34F, -38F, -4F);

		noseModel[2].addBox(0F, 0F, 0F, 14, 4, 14, 0F); // Import ImportBox2
		noseModel[2].setRotationPoint(-46F, -15F, -7F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 17, 11, 16, 0F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import ImportBox3
		noseModel[3].setRotationPoint(-75F, -23F, -8F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 3, 16, 0F, 0F, -2F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -6F, 0F, 2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F); // Import ImportBox4
		noseModel[4].setRotationPoint(-75F, -28F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox5
		noseModel[5].setRotationPoint(-58F, -19F, -2F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		noseModel[6].setRotationPoint(-58F, -19F, 2F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		noseModel[7].setRotationPoint(-58F, -19F, -8F);


		tailModel = new ModelRendererTurbo[9];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1860, textureX, textureY); // Import ImportBox65
		tailModel[1] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import ImportBox66
		tailModel[2] = new ModelRendererTurbo(this, 0, 1910, textureX, textureY); // Import ImportBox67
		tailModel[3] = new ModelRendererTurbo(this, 0, 1940, textureX, textureY); // Import ImportBox68
		tailModel[4] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Import ImportBox69
		tailModel[5] = new ModelRendererTurbo(this, 0, 1990, textureX, textureY); // Import ImportBox70
		tailModel[6] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import ImportBox71
		tailModel[7] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Import ImportBox73
		tailModel[8] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import ImportBox74

		tailModel[0].addBox(0F, 0F, 0F, 60, 18, 16, 0F); // Import ImportBox65
		tailModel[0].setRotationPoint(121F, -41F, -8F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 60, 18, 4, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox66
		tailModel[1].setRotationPoint(121F, -41F, -12F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 60, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Import ImportBox67
		tailModel[2].setRotationPoint(121F, -41F, 8F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 10, 18, 16, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Import ImportBox68
		tailModel[3].setRotationPoint(181F, -41F, -8F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 10, 18, 4, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Import ImportBox69
		tailModel[4].setRotationPoint(181F, -41F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 10, 18, 4, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -4F, -4F, 0F, -4F, 0F); // Import ImportBox70
		tailModel[5].setRotationPoint(181F, -41F, 8F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 48, 4, 38, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -6F, -1F, 0F, -24F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -24F, -1F, 0F); // Import ImportBox71
		tailModel[6].setRotationPoint(143F, -65F, 2F);
		tailModel[6].rotateAngleX = -0.26179939F;

		tailModel[7].addShapeBox(0F, 0F, -38F, 48, 4, 38, 0F, -24F, -1F, 0F, -6F, -1F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, -24F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox73
		tailModel[7].setRotationPoint(143F, -65F, -2F);
		tailModel[7].rotateAngleX = 0.26179939F;

		tailModel[8].addShapeBox(0F, 0F, 2F, 59, 4, 26, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -11F, 0F, -2F); // Import ImportBox74
		tailModel[8].setRotationPoint(132F, -39F, -2F);
		tailModel[8].rotateAngleX = 1.57079633F;


		leftWingModel = new ModelRendererTurbo[2];
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Import ImportBox19
		leftWingModel[1] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import ImportBox20

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 87, 13, 11, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportBox19
		leftWingModel[0].setRotationPoint(23F, -27F, -58F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 72, 13, 70, 0F, 25F, -26F, 0F, -75F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 16F, 0F, -75F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox20
		leftWingModel[1].setRotationPoint(23F, -27F, -128F);


		rightWingModel = new ModelRendererTurbo[2];
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 1360, textureX, textureY); // Import ImportBox40
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 1400, textureX, textureY); // Import ImportBox43

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 87, 13, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox40
		rightWingModel[0].setRotationPoint(23F, -27F, 47F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 72, 13, 70, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, -26F, 0F, 25F, -26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -75F, 16F, 0F, 25F, 16F, 0F); // Import ImportBox43
		rightWingModel[1].setRotationPoint(23F, -27F, 58F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 400, 300, textureX, textureY); // Import ImportBox6

		yawFlapModel[0].addBox(0F, 0F, -1F, 2, 7, 2, 0F); // Import ImportBox6
		yawFlapModel[0].setRotationPoint(-55F, -19F, 0F);
		yawFlapModel[0].rotateAngleZ = 3.14159265F;


		bodyWheelModel = new ModelRendererTurbo[12];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import ImportBox75
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 150, textureX, textureY); // Import ImportBox76
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import ImportBox77
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 170, textureX, textureY); // Import ImportBox78
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import ImportBox79
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox80
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox81
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 230, textureX, textureY); // Import ImportBox82
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 250, textureX, textureY); // Import ImportBox83
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import ImportBox88
		bodyWheelModel[10] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox89
		bodyWheelModel[11] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox90

		bodyWheelModel[0].addBox(0F, 0F, 0F, 10, 7, 4, 0F); // Import ImportBox75
		bodyWheelModel[0].setRotationPoint(-55F, -7F, -2F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 10, 7, 4, 0F); // Import ImportBox76
		bodyWheelModel[1].setRotationPoint(-37F, -7F, -2F);

		bodyWheelModel[2].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Import ImportBox77
		bodyWheelModel[2].setRotationPoint(-35F, 0F, -1.5F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 6, 7, 3, 0F); // Import ImportBox78
		bodyWheelModel[3].setRotationPoint(-53F, 0F, -1.5F);

		bodyWheelModel[4].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import ImportBox79
		bodyWheelModel[4].setRotationPoint(-55F, 7F, -5.5F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import ImportBox80
		bodyWheelModel[5].setRotationPoint(-61F, 7F, -5.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import ImportBox81
		bodyWheelModel[6].setRotationPoint(-26F, 7F, -5.5F);

		bodyWheelModel[7].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Import ImportBox82
		bodyWheelModel[7].setRotationPoint(-44F, -7F, -1F);

		bodyWheelModel[8].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import ImportBox83
		bodyWheelModel[8].setRotationPoint(-43.5F, 2F, -0.5F);

		bodyWheelModel[9].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import ImportBox88
		bodyWheelModel[9].setRotationPoint(35F, 7F, -83.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import ImportBox89
		bodyWheelModel[10].setRotationPoint(64F, 7F, -83.5F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import ImportBox90
		bodyWheelModel[11].setRotationPoint(29F, 7F, -83.5F);


		leftWingWheelModel = new ModelRendererTurbo[4];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import ImportBox84
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import ImportBox85
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import ImportBox86
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import ImportBox87

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import ImportBox84
		leftWingWheelModel[0].setRotationPoint(54F, -10F, -82F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import ImportBox85
		leftWingWheelModel[1].setRotationPoint(36F, -10F, -82F);

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import ImportBox86
		leftWingWheelModel[2].setRotationPoint(56F, 1F, -81F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import ImportBox87
		leftWingWheelModel[3].setRotationPoint(38F, 1F, -81F);


		rightWingWheelModel = new ModelRendererTurbo[7];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import ImportBox91
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 270, textureX, textureY); // Import ImportBox92
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import ImportBox93
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 290, textureX, textureY); // Import ImportBox94
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 190, textureX, textureY); // Import ImportBox95
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox96
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 210, textureX, textureY); // Import ImportBox97

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import ImportBox91
		rightWingWheelModel[0].setRotationPoint(54F, -10F, 76F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 10, 11, 6, 0F); // Import ImportBox92
		rightWingWheelModel[1].setRotationPoint(36F, -10F, 76F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import ImportBox93
		rightWingWheelModel[2].setRotationPoint(38F, 1F, 77F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 6, 6, 4, 0F); // Import ImportBox94
		rightWingWheelModel[3].setRotationPoint(56F, 1F, 77F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 29, 3, 11, 0F); // Import ImportBox95
		rightWingWheelModel[4].setRotationPoint(35F, 7F, 72.5F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, 0F, 0F); // Import ImportBox96
		rightWingWheelModel[5].setRotationPoint(64F, 7F, 72.5F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 6, 3, 11, 0F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F); // Import ImportBox97
		rightWingWheelModel[6].setRotationPoint(29F, 7F, 72.5F);


		hudModel = new ModelRendererTurbo[1];
		hudModel[0] = new ModelRendererTurbo(this, 400, 240, textureX, textureY); // Import ImportBox9

		hudModel[0].addShapeBox(0F, -4F, -4F, 0, 80, 80, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -72F, 0F, 0F, -72F, 0F, -72F, 0F, 0F, -72F, 0F, 0F, -72F, -72F, 0F, -72F, -72F); // Import ImportBox9
		hudModel[0].setRotationPoint(-57F, -32F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
