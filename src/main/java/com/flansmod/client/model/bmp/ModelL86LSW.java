//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelL86LSW extends ModelGun
{
	int textureX = 1024;
	int textureY = 1024;
	

	public ModelL86LSW()
	{
		gunModel = new ModelRendererTurbo[207];
		gunModel[0] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Import Body1
		gunModel[1] = new ModelRendererTurbo(this, 0, 74, textureX, textureY); // Import Body2
		gunModel[2] = new ModelRendererTurbo(this, 0, 99, textureX, textureY); // Import Body3
		gunModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Body4
		gunModel[4] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Body5
		gunModel[5] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Import Body6
		gunModel[6] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Body7
		gunModel[7] = new ModelRendererTurbo(this, 0, 250, textureX, textureY); // Import Body8
		gunModel[8] = new ModelRendererTurbo(this, 0, 270, textureX, textureY); // Import Body9
		gunModel[9] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import Body10
		gunModel[10] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Body11
		gunModel[11] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Body12
		gunModel[12] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Body13
		gunModel[13] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Body14
		gunModel[14] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Body15
		gunModel[15] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Body16
		gunModel[16] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Body17
		gunModel[17] = new ModelRendererTurbo(this, 0, 410, textureX, textureY); // Import Body18
		gunModel[18] = new ModelRendererTurbo(this, 0, 430, textureX, textureY); // Import Body19
		gunModel[19] = new ModelRendererTurbo(this, 0, 455, textureX, textureY); // Import Body20
		gunModel[20] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Import Body21
		gunModel[21] = new ModelRendererTurbo(this, 0, 510, textureX, textureY); // Import Body22
		gunModel[22] = new ModelRendererTurbo(this, 0, 535, textureX, textureY); // Import Body23
		gunModel[23] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import Body24
		gunModel[24] = new ModelRendererTurbo(this, 0, 610, textureX, textureY); // Import Body26
		gunModel[25] = new ModelRendererTurbo(this, 0, 620, textureX, textureY); // Import Body27
		gunModel[26] = new ModelRendererTurbo(this, 0, 630, textureX, textureY); // Import Body28
		gunModel[27] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import Body29
		gunModel[28] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Body30
		gunModel[29] = new ModelRendererTurbo(this, 0, 650, textureX, textureY); // Import Body31
		gunModel[30] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Body32
		gunModel[31] = new ModelRendererTurbo(this, 0, 640, textureX, textureY); // Import Body33
		gunModel[32] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body34
		gunModel[33] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body35
		gunModel[34] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body36
		gunModel[35] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body37
		gunModel[36] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body38
		gunModel[37] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body39
		gunModel[38] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import Body40
		gunModel[39] = new ModelRendererTurbo(this, 0, 700, textureX, textureY); // Import Body41
		gunModel[40] = new ModelRendererTurbo(this, 0, 720, textureX, textureY); // Import Body42
		gunModel[41] = new ModelRendererTurbo(this, 0, 745, textureX, textureY); // Import Body43
		gunModel[42] = new ModelRendererTurbo(this, 0, 770, textureX, textureY); // Import Body44
		gunModel[43] = new ModelRendererTurbo(this, 0, 800, textureX, textureY); // Import Body45
		gunModel[44] = new ModelRendererTurbo(this, 0, 820, textureX, textureY); // Import Body46
		gunModel[45] = new ModelRendererTurbo(this, 0, 840, textureX, textureY); // Import Body47
		gunModel[46] = new ModelRendererTurbo(this, 0, 860, textureX, textureY); // Import Body48
		gunModel[47] = new ModelRendererTurbo(this, 0, 885, textureX, textureY); // Import Body49
		gunModel[48] = new ModelRendererTurbo(this, 0, 910, textureX, textureY); // Import Body50
		gunModel[49] = new ModelRendererTurbo(this, 0, 940, textureX, textureY); // Import Body51
		gunModel[50] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import Body52
		gunModel[51] = new ModelRendererTurbo(this, 0, 999, textureX, textureY); // Import Body53
		gunModel[52] = new ModelRendererTurbo(this, 100, 100, textureX, textureY); // Import Body54
		gunModel[53] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body55
		gunModel[54] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body56
		gunModel[55] = new ModelRendererTurbo(this, 0, 670, textureX, textureY); // Import Body57
		gunModel[56] = new ModelRendererTurbo(this, 100, 130, textureX, textureY); // Import Body58
		gunModel[57] = new ModelRendererTurbo(this, 100, 220, textureX, textureY); // Import Body59
		gunModel[58] = new ModelRendererTurbo(this, 100, 260, textureX, textureY); // Import Body60
		gunModel[59] = new ModelRendererTurbo(this, 100, 290, textureX, textureY); // Import Body61
		gunModel[60] = new ModelRendererTurbo(this, 100, 360, textureX, textureY); // Import Body62
		gunModel[61] = new ModelRendererTurbo(this, 100, 390, textureX, textureY); // Import Body62
		gunModel[62] = new ModelRendererTurbo(this, 100, 410, textureX, textureY); // Import Body63
		gunModel[63] = new ModelRendererTurbo(this, 100, 460, textureX, textureY); // Import Body64
		gunModel[64] = new ModelRendererTurbo(this, 100, 460, textureX, textureY); // Import Body65
		gunModel[65] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body66
		gunModel[66] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body67
		gunModel[67] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body68
		gunModel[68] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body69
		gunModel[69] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body70
		gunModel[70] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Body71
		gunModel[71] = new ModelRendererTurbo(this, 100, 500, textureX, textureY); // Import Body72
		gunModel[72] = new ModelRendererTurbo(this, 100, 530, textureX, textureY); // Import Body73
		gunModel[73] = new ModelRendererTurbo(this, 100, 560, textureX, textureY); // Import Body74
		gunModel[74] = new ModelRendererTurbo(this, 100, 560, textureX, textureY); // Import Body75
		gunModel[75] = new ModelRendererTurbo(this, 100, 560, textureX, textureY); // Import Body76
		gunModel[76] = new ModelRendererTurbo(this, 100, 590, textureX, textureY); // Import Body77
		gunModel[77] = new ModelRendererTurbo(this, 100, 620, textureX, textureY); // Import Body78
		gunModel[78] = new ModelRendererTurbo(this, 100, 650, textureX, textureY); // Import Body79
		gunModel[79] = new ModelRendererTurbo(this, 100, 680, textureX, textureY); // Import Body80
		gunModel[80] = new ModelRendererTurbo(this, 100, 800, textureX, textureY); // Import Body81
		gunModel[81] = new ModelRendererTurbo(this, 100, 830, textureX, textureY); // Import Body82
		gunModel[82] = new ModelRendererTurbo(this, 100, 860, textureX, textureY); // Import Body83
		gunModel[83] = new ModelRendererTurbo(this, 100, 970, textureX, textureY); // Import Body84
		gunModel[84] = new ModelRendererTurbo(this, 100, 1000, textureX, textureY); // Import Body85
		gunModel[85] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Import Body86
		gunModel[86] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Body87
		gunModel[87] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Body88
		gunModel[88] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Import Body89
		gunModel[89] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Body90
		gunModel[90] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Body91
		gunModel[91] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Import Body92
		gunModel[92] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Import Body93
		gunModel[93] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Import Body94
		gunModel[94] = new ModelRendererTurbo(this, 200, 50, textureX, textureY); // Import Body95
		gunModel[95] = new ModelRendererTurbo(this, 400, 325, textureX, textureY); // Box 5
		gunModel[96] = new ModelRendererTurbo(this, 400, 370, textureX, textureY); // Box 7
		gunModel[97] = new ModelRendererTurbo(this, 400, 370, textureX, textureY); // Box 9
		gunModel[98] = new ModelRendererTurbo(this, 400, 395, textureX, textureY); // Box 10
		gunModel[99] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 11
		gunModel[100] = new ModelRendererTurbo(this, 400, 420, textureX, textureY); // Box 12
		gunModel[101] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Box 13
		gunModel[102] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Box 14
		gunModel[103] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 15
		gunModel[104] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 16
		gunModel[105] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 17
		gunModel[106] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 18
		gunModel[107] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 19
		gunModel[108] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 20
		gunModel[109] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 21
		gunModel[110] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 22
		gunModel[111] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 26
		gunModel[112] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 27
		gunModel[113] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 28
		gunModel[114] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 29
		gunModel[115] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 30
		gunModel[116] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 31
		gunModel[117] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 32
		gunModel[118] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 33
		gunModel[119] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 34
		gunModel[120] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 35
		gunModel[121] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 36
		gunModel[122] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 37
		gunModel[123] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 38
		gunModel[124] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 39
		gunModel[125] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 40
		gunModel[126] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 41
		gunModel[127] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 42
		gunModel[128] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 43
		gunModel[129] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 44
		gunModel[130] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 45
		gunModel[131] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 46
		gunModel[132] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 47
		gunModel[133] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 48
		gunModel[134] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 49
		gunModel[135] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 50
		gunModel[136] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 51
		gunModel[137] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 52
		gunModel[138] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 53
		gunModel[139] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 56
		gunModel[140] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 57
		gunModel[141] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 58
		gunModel[142] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 59
		gunModel[143] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 60
		gunModel[144] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 61
		gunModel[145] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 62
		gunModel[146] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 63
		gunModel[147] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 64
		gunModel[148] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 65
		gunModel[149] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 66
		gunModel[150] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 67
		gunModel[151] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 68
		gunModel[152] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 69
		gunModel[153] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 70
		gunModel[154] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 71
		gunModel[155] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 72
		gunModel[156] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 73
		gunModel[157] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 74
		gunModel[158] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 75
		gunModel[159] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 76
		gunModel[160] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 77
		gunModel[161] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 78
		gunModel[162] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 79
		gunModel[163] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 80
		gunModel[164] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 81
		gunModel[165] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 82
		gunModel[166] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 83
		gunModel[167] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 84
		gunModel[168] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 85
		gunModel[169] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 86
		gunModel[170] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 87
		gunModel[171] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 88
		gunModel[172] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 89
		gunModel[173] = new ModelRendererTurbo(this, 400, 460, textureX, textureY); // Box 90
		gunModel[174] = new ModelRendererTurbo(this, 400, 444, textureX, textureY); // Box 91
		gunModel[175] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Box 92
		gunModel[176] = new ModelRendererTurbo(this, 400, 440, textureX, textureY); // Box 93
		gunModel[177] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Box 94
		gunModel[178] = new ModelRendererTurbo(this, 400, 470, textureX, textureY); // Box 95
		gunModel[179] = new ModelRendererTurbo(this, 400, 490, textureX, textureY); // Box 96
		gunModel[180] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Box 97
		gunModel[181] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Box 98
		gunModel[182] = new ModelRendererTurbo(this, 400, 520, textureX, textureY); // Box 99
		gunModel[183] = new ModelRendererTurbo(this, 400, 540, textureX, textureY); // Box 100
		gunModel[184] = new ModelRendererTurbo(this, 400, 550, textureX, textureY); // Box 101
		gunModel[185] = new ModelRendererTurbo(this, 400, 570, textureX, textureY); // Box 102
		gunModel[186] = new ModelRendererTurbo(this, 400, 595, textureX, textureY); // Box 103
		gunModel[187] = new ModelRendererTurbo(this, 400, 615, textureX, textureY); // Box 104
		gunModel[188] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 105
		gunModel[189] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 106
		gunModel[190] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 107
		gunModel[191] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Box 108
		gunModel[192] = new ModelRendererTurbo(this, 400, 690, textureX, textureY); // Box 109
		gunModel[193] = new ModelRendererTurbo(this, 400, 690, textureX, textureY); // Box 110
		gunModel[194] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 111
		gunModel[195] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 112
		gunModel[196] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 113
		gunModel[197] = new ModelRendererTurbo(this, 400, 635, textureX, textureY); // Box 114
		gunModel[198] = new ModelRendererTurbo(this, 400, 650, textureX, textureY); // Box 115
		gunModel[199] = new ModelRendererTurbo(this, 400, 690, textureX, textureY); // Box 116
		gunModel[200] = new ModelRendererTurbo(this, 400, 690, textureX, textureY); // Box 117
		gunModel[201] = new ModelRendererTurbo(this, 400, 730, textureX, textureY); // Box 118
		gunModel[202] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Box 120
		gunModel[203] = new ModelRendererTurbo(this, 400, 760, textureX, textureY); // Box 121
		gunModel[204] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 122
		gunModel[205] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 123
		gunModel[206] = new ModelRendererTurbo(this, 400, 785, textureX, textureY); // Box 124

		gunModel[0].addBox(0F, -33F, -8F, 24, 7, 16, 0F); // Import Body1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(6F, -26F, -8F, 18, 7, 16, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,6F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(0F, -15F, -1F, 24, 24, 16, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,-8F, 0F, 0F,0F, 0F, 0F); // Import Body3
		gunModel[2].setRotationPoint(-4F, -4F, -7F);

		gunModel[3].addShapeBox(0F, 9F, -1F, 19, 7, 16, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -6F, 0F); // Import Body4
		gunModel[3].setRotationPoint(-4F, -4F, -7F);

		gunModel[4].addShapeBox(35F, -50F, 0F, 142, 22, 14, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -14F, 0F,0F, -14F, 0F,0F, 0F, 0F); // Import Body5
		gunModel[4].setRotationPoint(-142F, 11F, -7F);

		gunModel[5].addBox(0F, -29F, 0F, 7, 3, 16, 0F); // Import Body6
		gunModel[5].setRotationPoint(26F, -2.5F, -8F);

		gunModel[6].addBox(1F, -29F, 0F, 5, 2, 6, 0F); // Import Body7
		gunModel[6].setRotationPoint(26F, 0.5F, -3F);

		gunModel[7].addShapeBox(1F, -29F, 0F, 9, 9, 6, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Body8
		gunModel[7].setRotationPoint(26F, 2.5F, -3F);

		gunModel[8].addShapeBox(1F, -29F, 0F, 6, 6, 6, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, -2F, 0F,-6F, 0F, 0F,-6F, 0F, 0F,0F, -2F, 0F); // Import Body9
		gunModel[8].setRotationPoint(34F, 9.5F, -3F);

		gunModel[9].addBox(1F, -29F, 0F, 23, 2, 6, 0F); // Import Body10
		gunModel[9].setRotationPoint(11F, 13.5F, -3F);

		gunModel[10].addBox(5F, -29F, 0F, 2, 21, 6, 0F); // Import Body11
		gunModel[10].setRotationPoint(34F, -11.5F, -3F);

		gunModel[11].addBox(-16F, -39F, -8F, 50, 5, 16, 0F); // Import Body12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-18F, -39F, -8F, 2, 5, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Import Body13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addBox(-21F, -39F, -8F, 3, 3, 16, 0F); // Import Body14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-23F, -39F, -8F, 2, 5, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Import Body15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addBox(30F, -37F, -8.5F, 3, 1, 17, 0F); // Import Body16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(30F, -38F, -8.5F, 3, 1, 17, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(30F, -36F, -8.5F, 3, 1, 17, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Import Body18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addBox(-63F, -39F, -8F, 40, 5, 16, 0F); // Import Body19
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-64F, -39F, -8F, 1, 5, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Import Body20
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addBox(-68F, -39F, -8F, 4, 3, 16, 0F); // Import Body21
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(-71F, -39F, -8F, 3, 5, 16, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F); // Import Body22
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addBox(-93F, -39F, -8F, 22, 5, 16, 0F); // Import Body23
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addBox(-48F, -39F, -7.5F, 25, 25, 15, 0F); // Import Body24
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addBox(-44F, -35F, 15.5F, 6, 4, 2, 0F); // Import Body26
		gunModel[24].setRotationPoint(7F, 5F, -8F);

		gunModel[25].addBox(-38F, -35F, 15.5F, 1, 4, 2, 0F); // Import Body27
		gunModel[25].setRotationPoint(7F, 5F, -8F);

		gunModel[26].addBox(-43F, -35F, 15.5F, 10, 3, 1, 0F); // Import Body28
		gunModel[26].setRotationPoint(-4F, 5.5F, -8F);

		gunModel[27].addBox(-35F, -38F, 15.5F, 10, 1, 1, 0F); // Import Body29
		gunModel[27].setRotationPoint(-4F, 5.5F, -8F);

		gunModel[28].addShapeBox(-25F, -38F, 15.5F, 3, 3, 1, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F,0F, -2F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, -2F, 0F); // Import Body30
		gunModel[28].setRotationPoint(-4F, 5.5F, -8F);

		gunModel[29].addShapeBox(-25F, -37F, 15.5F, 3, 3, 1, 0F,0F, -2F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, -3F, 0F,0F, -3F, 0F,0F, 0F, 0F); // Import Body31
		gunModel[29].setRotationPoint(-4F, 10.5F, -8F);

		gunModel[30].addBox(-23F, -38F, 15.5F, 1, 3, 1, 0F); // Import Body32
		gunModel[30].setRotationPoint(-4F, 8.5F, -8F);

		gunModel[31].addBox(-35F, -37F, 15.5F, 10, 1, 1, 0F); // Import Body33
		gunModel[31].setRotationPoint(-4F, 12.5F, -8F);

		gunModel[32].addBox(-21F, -32F, -7.5F, 3, 1, 15, 0F); // Import Body34
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-21F, -33F, -7.5F, 3, 1, 15, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body35
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(-21F, -31F, -7.5F, 3, 1, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Import Body36
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addBox(-58F, -31F, -7.5F, 3, 1, 15, 0F); // Import Body37
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(-58F, -32F, -7.5F, 3, 1, 15, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body38
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(-58F, -30F, -7.5F, 3, 1, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Import Body39
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addBox(-93F, -37F, 15.5F, 1, 1, 1, 0F); // Import Body40
		gunModel[38].setRotationPoint(15F, -1F, -8F);

		gunModel[39].addBox(0F, -1F, 15F, 8, 3, 1, 0F); // Import Body41
		gunModel[39].setRotationPoint(-73F, -31F, -8F);
		gunModel[39].rotateAngleZ = -0.4153883F;

		gunModel[40].addBox(-47F, -35F, 0.5F, 82, 6, 15, 0F); // Import Body42
		gunModel[40].setRotationPoint(0F, -10F, -8F);

		gunModel[41].addShapeBox(-14F, -42F, -8F, 36, 3, 16, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body43
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addBox(-47F, -41F, 0.5F, 82, 4, 15, 0F); // Import Body44
		gunModel[42].setRotationPoint(0F, -10F, -8F);

		gunModel[43].addBox(26F, -41F, 0.5F, 9, 2, 15, 0F); // Import Body45
		gunModel[43].setRotationPoint(0F, -6F, -8F);

		gunModel[44].addBox(26F, -41F, 0.5F, 4, 2, 15, 0F); // Import Body46
		gunModel[44].setRotationPoint(-8F, -6F, -8F);

		gunModel[45].addBox(26F, -41F, 0.5F, 5, 2, 15, 0F); // Import Body47
		gunModel[45].setRotationPoint(-18F, -6F, -8F);

		gunModel[46].addBox(26F, -41F, 0.5F, 3, 2, 15, 0F); // Import Body48
		gunModel[46].setRotationPoint(-27F, -6F, -8F);

		gunModel[47].addBox(26F, -41F, 0.5F, 40, 2, 15, 0F); // Import Body49
		gunModel[47].setRotationPoint(-73F, -6F, -8F);

		gunModel[48].addBox(-47F, -41F, 1F, 60, 12, 14, 0F); // Import Body50
		gunModel[48].setRotationPoint(-60F, -10F, -8F);

		gunModel[49].addBox(-47F, -42F, 1.5F, 36, 12, 15, 0F); // Import Body51
		gunModel[49].setRotationPoint(-36F, -10F, -8F);

		gunModel[50].addBox(-47F, -42F, 1.5F, 4, 12, 15, 0F); // Import Body52
		gunModel[50].setRotationPoint(-40F, -10F, -8F);

		gunModel[51].addShapeBox(-47F, -42F, 1.5F, 7, 8, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F); // Import Body53
		gunModel[51].setRotationPoint(-47F, -10F, -8F);

		gunModel[52].addShapeBox(-47F, -42F, 1.5F, 2, 8, 15, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F); // Import Body54
		gunModel[52].setRotationPoint(-49F, -10F, -8F);

		gunModel[53].addShapeBox(-58F, -26F, 0.5F, 3, 1, 15, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body55
		gunModel[53].setRotationPoint(-45F, -22F, -8F);

		gunModel[54].addBox(-58F, -25F, 0.5F, 3, 1, 15, 0F); // Import Body56
		gunModel[54].setRotationPoint(-45F, -22F, -8F);

		gunModel[55].addShapeBox(-58F, -24F, 0.5F, 3, 1, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Import Body57
		gunModel[55].setRotationPoint(-45F, -22F, -8F);

		gunModel[56].addShapeBox(35F, -29F, 0.5F, 15, 10, 13, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-13F, 0F, 0F,-13F, 0F, 0F,0F, 0F, 0F); // Import Body58
		gunModel[56].setRotationPoint(-142F, 10F, -7F);

		gunModel[57].addShapeBox(35F, -35F, -0.5F, 6, 16, 15, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body59
		gunModel[57].setRotationPoint(-148F, 10F, -7F);

		gunModel[58].addBox(35F, -35F, -0.5F, 5, 12, 15, 0F); // Import Body60
		gunModel[58].setRotationPoint(-147F, -2F, -7F);

		gunModel[59].addShapeBox(31F, -49F, -0.5F, 9, 14, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F); // Import Body61
		gunModel[59].setRotationPoint(-147F, -2F, -7F);

		gunModel[60].addBox(26F, -41F, 0F, 49, 3, 16, 0F); // Import Body62
		gunModel[60].setRotationPoint(9F, -7F, -8F);

		gunModel[61].addBox(26F, -41F, 4F, 39, 3, 8, 0F); // Import Body62
		gunModel[61].setRotationPoint(19F, -13F, -8F);

		gunModel[62].addShapeBox(26F, -41F, 4F, 10, 6, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, 4F); // Import Body63
		gunModel[62].setRotationPoint(9F, -13F, -8F);

		gunModel[63].addShapeBox(26F, -41F, 12F, 5, 6, 4, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body64
		gunModel[63].setRotationPoint(53F, -13F, -8F);

		gunModel[64].addShapeBox(26F, -41F, 0F, 5, 6, 4, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body65
		gunModel[64].setRotationPoint(53F, -13F, -8F);

		gunModel[65].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body66
		gunModel[65].setRotationPoint(43F, -13F, -8F);

		gunModel[66].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body67
		gunModel[66].setRotationPoint(43F, -13F, -8F);

		gunModel[67].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body68
		gunModel[67].setRotationPoint(33F, -13F, -8F);

		gunModel[68].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body69
		gunModel[68].setRotationPoint(33F, -13F, -8F);

		gunModel[69].addShapeBox(26F, -41F, 12F, 3, 6, 4, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body70
		gunModel[69].setRotationPoint(23F, -13F, -8F);

		gunModel[70].addShapeBox(26F, -41F, 0F, 3, 6, 4, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body71
		gunModel[70].setRotationPoint(23F, -13F, -8F);

		gunModel[71].addBox(26F, -41F, -1F, 49, 2, 18, 0F); // Import Body72
		gunModel[71].setRotationPoint(9F, 0F, -8F);

		gunModel[72].addShapeBox(26F, -41F, -1F, 6, 6, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body73
		gunModel[72].setRotationPoint(52F, -4F, -8F);

		gunModel[73].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body74
		gunModel[73].setRotationPoint(42F, -4F, -8F);

		gunModel[74].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body75
		gunModel[74].setRotationPoint(32F, -4F, -8F);

		gunModel[75].addShapeBox(26F, -41F, -1F, 2, 4, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body76
		gunModel[75].setRotationPoint(22F, -4F, -8F);

		gunModel[76].addShapeBox(26F, -41F, -1F, 5, 4, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body77
		gunModel[76].setRotationPoint(9F, -4F, -8F);

		gunModel[77].addShapeBox(26F, -35F, -2F, 10, 2, 20, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body78
		gunModel[77].setRotationPoint(9F, -4F, -8F);

		gunModel[78].addBox(26F, -35F, -2F, 10, 4, 20, 0F); // Import Body79
		gunModel[78].setRotationPoint(9F, -2F, -8F);

		gunModel[79].addShapeBox(26F, -29F, -2F, 10, 2, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F); // Import Body80
		gunModel[79].setRotationPoint(9F, -4F, -8F);

		gunModel[80].addShapeBox(26F, -35F, -2F, 55, 2, 20, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body81
		gunModel[80].setRotationPoint(19F, -4F, -8F);

		gunModel[81].addBox(26F, -35F, -2F, 55, 4, 20, 0F); // Import Body82
		gunModel[81].setRotationPoint(19F, -2F, -8F);

		gunModel[82].addShapeBox(26F, -35F, -2F, 55, 9, 20, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F); // Import Body83
		gunModel[82].setRotationPoint(19F, 2F, -8F);

		gunModel[83].addShapeBox(26F, -41F, -1F, 16, 6, 18, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body84
		gunModel[83].setRotationPoint(58F, -4F, -8F);

		gunModel[84].addBox(26F, -41F, 0F, 6, 2, 16, 0F); // Import Body85
		gunModel[84].setRotationPoint(58F, -6F, -8F);

		gunModel[85].addShapeBox(26F, -41F, 2F, 4, 3, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F,0F, 0F, 2F); // Import Body86
		gunModel[85].setRotationPoint(70F, -7F, -8F);

		gunModel[86].addShapeBox(26F, -41F, 3.5F, 162, 3, 9, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body87
		gunModel[86].setRotationPoint(13F, -4F, -8F);

		gunModel[87].addBox(26F, -38F, 3.5F, 162, 3, 9, 0F); // Import Body88
		gunModel[87].setRotationPoint(13F, -4F, -8F);

		gunModel[88].addShapeBox(26F, -35F, 6.5F, 162, 3, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F); // Import Body89
		gunModel[88].setRotationPoint(13F, -4F, -11F);

		gunModel[89].addBox(26F, -38.5F, 2F, 3, 4, 12, 0F); // Import Body90
		gunModel[89].setRotationPoint(153F, -4F, -8F);

		gunModel[90].addShapeBox(26F, -42.5F, 2F, 3, 4, 12, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body91
		gunModel[90].setRotationPoint(153F, -4F, -8F);

		gunModel[91].addShapeBox(26F, -34.5F, 2F, 3, 4, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F); // Import Body92
		gunModel[91].setRotationPoint(153F, -4F, -8F);

		gunModel[92].addShapeBox(26F, -42.5F, 2F, 17, 4, 12, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Body93
		gunModel[92].setRotationPoint(174F, -4F, -8F);

		gunModel[93].addBox(26F, -38.5F, 2F, 17, 4, 12, 0F); // Import Body94
		gunModel[93].setRotationPoint(174F, -4F, -8F);

		gunModel[94].addShapeBox(26F, -34.5F, 2F, 17, 4, 12, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F); // Import Body95
		gunModel[94].setRotationPoint(174F, -4F, -8F);

		gunModel[95].addBox(35F, -50F, 0F, 18, 22, 12, 0F); // Box 5
		gunModel[95].setRotationPoint(-122F, 11F, -6F);

		gunModel[96].addBox(26F, -38.5F, 2F, 13, 5, 15, 0F); // Box 7
		gunModel[96].setRotationPoint(158F, -4.5F, -9.5F);

		gunModel[97].addShapeBox(26F, -38.5F, 2F, 13, 5, 15, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 9
		gunModel[97].setRotationPoint(158F, -9.5F, -9.5F);

		gunModel[98].addShapeBox(26F, -38.5F, 2F, 13, 4, 15, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F,0F, 0F, -1.5F); // Box 10
		gunModel[98].setRotationPoint(158F, 0.5F, -9.5F);

		gunModel[99].addBox(26F, -38.5F, 2F, 99, 1, 12, 0F); // Box 11
		gunModel[99].setRotationPoint(74F, 4.5F, -8F);

		gunModel[100].addBox(26F, -38.5F, 2F, 99, 1, 12, 0F); // Box 12
		gunModel[100].setRotationPoint(74F, 12.5F, -8F);

		gunModel[101].addBox(26F, -38.5F, 2F, 99, 1, 1, 0F); // Box 13
		gunModel[101].setRotationPoint(74F, 5.5F, -8F);

		gunModel[102].addBox(26F, -38.5F, 2F, 99, 1, 1, 0F); // Box 14
		gunModel[102].setRotationPoint(74F, 11.5F, -8F);

		gunModel[103].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 15
		gunModel[103].setRotationPoint(74F, 6.5F, -8F);

		gunModel[104].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 16
		gunModel[104].setRotationPoint(78F, 6.5F, -8F);

		gunModel[105].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 17
		gunModel[105].setRotationPoint(78F, 9.5F, -8F);

		gunModel[106].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		gunModel[106].setRotationPoint(94F, 9.5F, -8F);

		gunModel[107].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 19
		gunModel[107].setRotationPoint(94F, 6.5F, -8F);

		gunModel[108].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 20
		gunModel[108].setRotationPoint(90F, 6.5F, -8F);

		gunModel[109].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 21
		gunModel[109].setRotationPoint(88F, 6.5F, -8F);

		gunModel[110].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		gunModel[110].setRotationPoint(88F, 9.5F, -8F);

		gunModel[111].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 26
		gunModel[111].setRotationPoint(104F, 6.5F, -8F);

		gunModel[112].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 27
		gunModel[112].setRotationPoint(102F, 6.5F, -8F);

		gunModel[113].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 28
		gunModel[113].setRotationPoint(102F, 9.5F, -8F);

		gunModel[114].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 29
		gunModel[114].setRotationPoint(108F, 9.5F, -8F);

		gunModel[115].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 30
		gunModel[115].setRotationPoint(108F, 6.5F, -8F);

		gunModel[116].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 31
		gunModel[116].setRotationPoint(118F, 6.5F, -8F);

		gunModel[117].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 32
		gunModel[117].setRotationPoint(116F, 6.5F, -8F);

		gunModel[118].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 33
		gunModel[118].setRotationPoint(116F, 9.5F, -8F);

		gunModel[119].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 34
		gunModel[119].setRotationPoint(122F, 9.5F, -8F);

		gunModel[120].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 35
		gunModel[120].setRotationPoint(122F, 6.5F, -8F);

		gunModel[121].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 36
		gunModel[121].setRotationPoint(132F, 6.5F, -8F);

		gunModel[122].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 37
		gunModel[122].setRotationPoint(130F, 6.5F, -8F);

		gunModel[123].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 38
		gunModel[123].setRotationPoint(130F, 9.5F, -8F);

		gunModel[124].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 39
		gunModel[124].setRotationPoint(136F, 9.5F, -8F);

		gunModel[125].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 40
		gunModel[125].setRotationPoint(136F, 6.5F, -8F);

		gunModel[126].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 41
		gunModel[126].setRotationPoint(146F, 6.5F, -8F);

		gunModel[127].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 42
		gunModel[127].setRotationPoint(144F, 6.5F, -8F);

		gunModel[128].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 43
		gunModel[128].setRotationPoint(144F, 9.5F, -8F);

		gunModel[129].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 44
		gunModel[129].setRotationPoint(150F, 9.5F, -8F);

		gunModel[130].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 45
		gunModel[130].setRotationPoint(150F, 6.5F, -8F);

		gunModel[131].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 46
		gunModel[131].setRotationPoint(160F, 6.5F, -8F);

		gunModel[132].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 47
		gunModel[132].setRotationPoint(158F, 6.5F, -8F);

		gunModel[133].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 48
		gunModel[133].setRotationPoint(158F, 9.5F, -8F);

		gunModel[134].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 49
		gunModel[134].setRotationPoint(164F, 9.5F, -8F);

		gunModel[135].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 50
		gunModel[135].setRotationPoint(164F, 6.5F, -8F);

		gunModel[136].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 51
		gunModel[136].setRotationPoint(169F, 6.5F, -8F);

		gunModel[137].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 52
		gunModel[137].setRotationPoint(167F, 6.5F, -8F);

		gunModel[138].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 53
		gunModel[138].setRotationPoint(167F, 9.5F, -8F);

		gunModel[139].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 56
		gunModel[139].setRotationPoint(78F, 9.5F, 3F);

		gunModel[140].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 57
		gunModel[140].setRotationPoint(74F, 6.5F, 3F);

		gunModel[141].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 58
		gunModel[141].setRotationPoint(78F, 6.5F, 3F);

		gunModel[142].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 59
		gunModel[142].setRotationPoint(88F, 6.5F, 3F);

		gunModel[143].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 60
		gunModel[143].setRotationPoint(88F, 9.5F, 3F);

		gunModel[144].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 61
		gunModel[144].setRotationPoint(90F, 6.5F, 3F);

		gunModel[145].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 62
		gunModel[145].setRotationPoint(94F, 9.5F, 3F);

		gunModel[146].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 63
		gunModel[146].setRotationPoint(94F, 6.5F, 3F);

		gunModel[147].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 64
		gunModel[147].setRotationPoint(102F, 9.5F, 3F);

		gunModel[148].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 65
		gunModel[148].setRotationPoint(102F, 6.5F, 3F);

		gunModel[149].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 66
		gunModel[149].setRotationPoint(108F, 6.5F, 3F);

		gunModel[150].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 67
		gunModel[150].setRotationPoint(108F, 9.5F, 3F);

		gunModel[151].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 68
		gunModel[151].setRotationPoint(104F, 6.5F, 3F);

		gunModel[152].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 69
		gunModel[152].setRotationPoint(116F, 9.5F, 3F);

		gunModel[153].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 70
		gunModel[153].setRotationPoint(116F, 6.5F, 3F);

		gunModel[154].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 71
		gunModel[154].setRotationPoint(118F, 6.5F, 3F);

		gunModel[155].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 72
		gunModel[155].setRotationPoint(122F, 6.5F, 3F);

		gunModel[156].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 73
		gunModel[156].setRotationPoint(122F, 9.5F, 3F);

		gunModel[157].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 74
		gunModel[157].setRotationPoint(130F, 9.5F, 3F);

		gunModel[158].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 75
		gunModel[158].setRotationPoint(130F, 6.5F, 3F);

		gunModel[159].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 76
		gunModel[159].setRotationPoint(132F, 6.5F, 3F);

		gunModel[160].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 77
		gunModel[160].setRotationPoint(136F, 6.5F, 3F);

		gunModel[161].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 78
		gunModel[161].setRotationPoint(136F, 9.5F, 3F);

		gunModel[162].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 79
		gunModel[162].setRotationPoint(144F, 9.5F, 3F);

		gunModel[163].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 80
		gunModel[163].setRotationPoint(144F, 6.5F, 3F);

		gunModel[164].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 81
		gunModel[164].setRotationPoint(146F, 6.5F, 3F);

		gunModel[165].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 82
		gunModel[165].setRotationPoint(150F, 9.5F, 3F);

		gunModel[166].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 83
		gunModel[166].setRotationPoint(150F, 6.5F, 3F);

		gunModel[167].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 84
		gunModel[167].setRotationPoint(158F, 9.5F, 3F);

		gunModel[168].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 85
		gunModel[168].setRotationPoint(158F, 6.5F, 3F);

		gunModel[169].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 86
		gunModel[169].setRotationPoint(160F, 6.5F, 3F);

		gunModel[170].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Box 87
		gunModel[170].setRotationPoint(164F, 6.5F, 3F);

		gunModel[171].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 88
		gunModel[171].setRotationPoint(164F, 9.5F, 3F);

		gunModel[172].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 89
		gunModel[172].setRotationPoint(167F, 9.5F, 3F);

		gunModel[173].addShapeBox(26F, -38.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Box 90
		gunModel[173].setRotationPoint(167F, 6.5F, 3F);

		gunModel[174].addBox(26F, -38.5F, 2F, 4, 5, 1, 0F); // Box 91
		gunModel[174].setRotationPoint(169F, 6.5F, 3F);

		gunModel[175].addBox(26F, -38.5F, 2F, 99, 1, 1, 0F); // Box 92
		gunModel[175].setRotationPoint(74F, 11.5F, 3F);

		gunModel[176].addBox(26F, -38.5F, 2F, 99, 1, 1, 0F); // Box 93
		gunModel[176].setRotationPoint(74F, 5.5F, 3F);

		gunModel[177].addShapeBox(26F, -38.5F, 2F, 84, 11, 1, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 94
		gunModel[177].setRotationPoint(74F, -6.5F, -8F);

		gunModel[178].addShapeBox(26F, -38.5F, 2F, 84, 11, 1, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 95
		gunModel[178].setRotationPoint(74F, -6.5F, 3F);

		gunModel[179].addBox(26F, -38.5F, 2F, 2, 9, 12, 0F); // Box 96
		gunModel[179].setRotationPoint(173F, 4.5F, -8F);

		gunModel[180].addShapeBox(26F, -38.5F, 2F, 8, 3, 9, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 97
		gunModel[180].setRotationPoint(175F, 4.5F, -6.5F);

		gunModel[181].addBox(26F, -38.5F, 2F, 8, 3, 9, 0F); // Box 98
		gunModel[181].setRotationPoint(175F, 7.5F, -6.5F);

		gunModel[182].addShapeBox(26F, -38.5F, 2F, 8, 3, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F); // Box 99
		gunModel[182].setRotationPoint(175F, 10.5F, -6.5F);

		gunModel[183].addBox(26F, -38.5F, 2F, 3, 3, 3, 0F); // Box 100
		gunModel[183].setRotationPoint(178F, 13.5F, -3.5F);

		gunModel[184].addShapeBox(26F, -38.5F, 2F, 7, 2, 11, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 101
		gunModel[184].setRotationPoint(176F, 16.5F, -7.5F);

		gunModel[185].addBox(26F, -38.5F, 2F, 7, 6, 11, 0F); // Box 102
		gunModel[185].setRotationPoint(176F, 18.5F, -7.5F);

		gunModel[186].addShapeBox(26F, -38.5F, 2F, 7, 5, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F); // Box 103
		gunModel[186].setRotationPoint(176F, 24.5F, -7.5F);

		gunModel[187].addShapeBox(26F, -38.5F, 2F, 7, 3, 11, 0F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 104
		gunModel[187].setRotationPoint(176F, 29.5F, -7.5F);

		gunModel[188].addBox(0F, 9F, -1F, 6, 6, 2, 0F); // Box 105
		gunModel[188].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[188].rotateAngleX = 0.52359878F;

		gunModel[189].addShapeBox(0F, 9F, -3F, 6, 6, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 106
		gunModel[189].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[189].rotateAngleX = 0.52359878F;

		gunModel[190].addShapeBox(0F, 9F, 1F, 6, 6, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 107
		gunModel[190].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[190].rotateAngleX = 0.52359878F;

		gunModel[191].addBox(1F, 15F, -1F, 4, 32, 2, 0F); // Box 108
		gunModel[191].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[191].rotateAngleX = 0.52359878F;

		gunModel[192].addShapeBox(1F, 15F, 1F, 4, 32, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Box 109
		gunModel[192].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[192].rotateAngleX = 0.52359878F;

		gunModel[193].addShapeBox(1F, 15F, -2F, 4, 32, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 110
		gunModel[193].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[193].rotateAngleX = 0.52359878F;

		gunModel[194].addShapeBox(0F, 37F, -3F, 6, 16, 6, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 111
		gunModel[194].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[194].rotateAngleX = 0.52359878F;

		gunModel[195].addShapeBox(0F, 9F, 1F, 6, 6, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 112
		gunModel[195].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[195].rotateAngleX = -0.52359878F;

		gunModel[196].addBox(0F, 9F, -1F, 6, 6, 2, 0F); // Box 113
		gunModel[196].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[196].rotateAngleX = -0.52359878F;

		gunModel[197].addShapeBox(0F, 9F, -3F, 6, 6, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 114
		gunModel[197].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[197].rotateAngleX = -0.52359878F;

		gunModel[198].addBox(1F, 15F, -1F, 4, 32, 2, 0F); // Box 115
		gunModel[198].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[198].rotateAngleX = -0.52359878F;

		gunModel[199].addShapeBox(1F, 15F, -2F, 4, 32, 1, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 116
		gunModel[199].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[199].rotateAngleX = -0.52359878F;

		gunModel[200].addShapeBox(1F, 15F, 1F, 4, 32, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Box 117
		gunModel[200].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[200].rotateAngleX = -0.52359878F;

		gunModel[201].addShapeBox(0F, 37F, -3F, 6, 16, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -8F, 0F,0F, -8F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 118
		gunModel[201].setRotationPoint(202.5F, -15.5F, 0F);
		gunModel[201].rotateAngleX = -0.52359878F;

		gunModel[202].addBox(0F, 0F, 0F, 18, 4, 14, 0F); // Box 120
		gunModel[202].setRotationPoint(196.5F, 28.5F, 19F);

		gunModel[203].addBox(0F, 0F, 0F, 18, 4, 14, 0F); // Box 121
		gunModel[203].setRotationPoint(196.5F, 28.5F, -33F);

		gunModel[204].addShapeBox(35F, -50F, 0F, 3, 29, 9, 0F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F); // Box 122
		gunModel[204].setRotationPoint(-118F, 33F, -4.5F);

		gunModel[205].addBox(35F, -50F, 0F, 3, 29, 9, 0F); // Box 123
		gunModel[205].setRotationPoint(-115F, 33F, -4.5F);

		gunModel[206].addShapeBox(35F, -50F, 0F, 3, 29, 9, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F); // Box 124
		gunModel[206].setRotationPoint(-112F, 33F, -4.5F);


		defaultScopeModel = new ModelRendererTurbo[34];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Sight1
		defaultScopeModel[1] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Sight2
		defaultScopeModel[2] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Import Sight3
		defaultScopeModel[3] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Import Sight4
		defaultScopeModel[4] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Import Sight5
		defaultScopeModel[5] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Sight6
		defaultScopeModel[6] = new ModelRendererTurbo(this, 200, 390, textureX, textureY); // Import Sight7
		defaultScopeModel[7] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Sight8
		defaultScopeModel[8] = new ModelRendererTurbo(this, 200, 410, textureX, textureY); // Import Sight9
		defaultScopeModel[9] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Import Sight10
		defaultScopeModel[10] = new ModelRendererTurbo(this, 200, 430, textureX, textureY); // Import Sight11
		defaultScopeModel[11] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Sight12
		defaultScopeModel[12] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Sight13
		defaultScopeModel[13] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Sight14
		defaultScopeModel[14] = new ModelRendererTurbo(this, 200, 470, textureX, textureY); // Import Sight15
		defaultScopeModel[15] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Import Sight16
		defaultScopeModel[16] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Import Sight17
		defaultScopeModel[17] = new ModelRendererTurbo(this, 200, 550, textureX, textureY); // Import Sight18
		defaultScopeModel[18] = new ModelRendererTurbo(this, 200, 590, textureX, textureY); // Import Sight19
		defaultScopeModel[19] = new ModelRendererTurbo(this, 200, 610, textureX, textureY); // Import Sight20
		defaultScopeModel[20] = new ModelRendererTurbo(this, 200, 630, textureX, textureY); // Import Sight21
		defaultScopeModel[21] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import Sight22
		defaultScopeModel[22] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Import Sight23
		defaultScopeModel[23] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Sight24
		defaultScopeModel[24] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Import Sight25
		defaultScopeModel[25] = new ModelRendererTurbo(this, 200, 700, textureX, textureY); // Import Sight26
		defaultScopeModel[26] = new ModelRendererTurbo(this, 200, 720, textureX, textureY); // Import Sight27
		defaultScopeModel[27] = new ModelRendererTurbo(this, 200, 750, textureX, textureY); // Import Sight28
		defaultScopeModel[28] = new ModelRendererTurbo(this, 200, 770, textureX, textureY); // Import Sight29
		defaultScopeModel[29] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Import Sight30
		defaultScopeModel[30] = new ModelRendererTurbo(this, 200, 920, textureX, textureY); // Import Sight31
		defaultScopeModel[31] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Sight32
		defaultScopeModel[32] = new ModelRendererTurbo(this, 200, 940, textureX, textureY); // Import Sight33
		defaultScopeModel[33] = new ModelRendererTurbo(this, 200, 950, textureX, textureY); // Import Sight34

		defaultScopeModel[0].addBox(-47F, -41F, 1.5F, 47, 3, 13, 0F); // Import Sight1
		defaultScopeModel[0].setRotationPoint(13F, -13F, -8F);

		defaultScopeModel[1].addShapeBox(-47F, -41F, 1.5F, 5, 9, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F); // Import Sight2
		defaultScopeModel[1].setRotationPoint(13F, -22F, -8F);

		defaultScopeModel[2].addShapeBox(-47F, -41F, 12.5F, 5, 9, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,3F, 0F, 0F,3F, 0F, 0F,0F, 0F, 0F); // Import Sight3
		defaultScopeModel[2].setRotationPoint(13F, -22F, -8F);

		defaultScopeModel[3].addBox(-47F, -41F, 12.5F, 5, 5, 2, 0F); // Import Sight4
		defaultScopeModel[3].setRotationPoint(13F, -27F, -8F);

		defaultScopeModel[4].addBox(-47F, -41F, 1.5F, 5, 5, 2, 0F); // Import Sight5
		defaultScopeModel[4].setRotationPoint(13F, -27F, -8F);

		defaultScopeModel[5].addBox(-47F, -41F, 1.5F, 20, 3, 2, 0F); // Import Sight6
		defaultScopeModel[5].setRotationPoint(13F, -30F, -8F);

		defaultScopeModel[6].addBox(-47F, -41F, 12.5F, 20, 3, 2, 0F); // Import Sight7
		defaultScopeModel[6].setRotationPoint(13F, -30F, -8F);

		defaultScopeModel[7].addShapeBox(-47F, -41F, 12.5F, 9, 3, 2, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Sight8
		defaultScopeModel[7].setRotationPoint(13F, -33F, -8F);

		defaultScopeModel[8].addShapeBox(-47F, -41F, 1.5F, 9, 3, 2, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Sight9
		defaultScopeModel[8].setRotationPoint(13F, -33F, -8F);

		defaultScopeModel[9].addShapeBox(-47F, -41F, 12.5F, 8, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F,0F, 0F, 0F); // Import Sight10
		defaultScopeModel[9].setRotationPoint(18F, -27F, -8F);

		defaultScopeModel[10].addShapeBox(-47F, -41F, 1.5F, 8, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 0F,0F, 0F, 0F); // Import Sight11
		defaultScopeModel[10].setRotationPoint(18F, -27F, -8F);

		defaultScopeModel[11].addShapeBox(-47F, -41F, 12.5F, 25, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F); // Import Sight12
		defaultScopeModel[11].setRotationPoint(33F, -30F, -8F);

		defaultScopeModel[12].addShapeBox(-47F, -41F, 1.5F, 25, 2, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 1F, 0F); // Import Sight13
		defaultScopeModel[12].setRotationPoint(33F, -30F, -8F);

		defaultScopeModel[13].addShapeBox(-47F, -41F, 12.5F, 5, 5, 2, 0F,0F, -2F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, -2F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Import Sight14
		defaultScopeModel[13].setRotationPoint(58F, -30F, -8F);

		defaultScopeModel[14].addShapeBox(-47F, -41F, 1.5F, 5, 5, 2, 0F,0F, -2F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, -2F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Import Sight15
		defaultScopeModel[14].setRotationPoint(58F, -30F, -8F);

		defaultScopeModel[15].addShapeBox(-47F, -41F, 12.5F, 5, 12, 2, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F); // Import Sight16
		defaultScopeModel[15].setRotationPoint(58F, -25F, -8F);

		defaultScopeModel[16].addShapeBox(-47F, -41F, 1.5F, 5, 12, 2, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F); // Import Sight17
		defaultScopeModel[16].setRotationPoint(58F, -25F, -8F);

		defaultScopeModel[17].addBox(-47F, -41F, 3.5F, 1, 16, 9, 0F); // Import Sight18
		defaultScopeModel[17].setRotationPoint(14F, -29F, -8F);

		defaultScopeModel[18].addBox(-47F, -41F, 3.5F, 43, 1, 9, 0F); // Import Sight19
		defaultScopeModel[18].setRotationPoint(15F, -29F, -8F);

		defaultScopeModel[19].addShapeBox(-47F, -41F, 3.5F, 4, 4, 9, 0F,0F, -1F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, -1F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Import Sight20
		defaultScopeModel[19].setRotationPoint(58F, -29F, -8F);

		defaultScopeModel[20].addShapeBox(-47F, -41F, 3.5F, 4, 12, 9, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F); // Import Sight21
		defaultScopeModel[20].setRotationPoint(58F, -25F, -8F);

		defaultScopeModel[21].addBox(-47F, -41F, 5.5F, 1, 2, 1, 0F); // Import Sight22
		defaultScopeModel[21].setRotationPoint(14F, -31F, -8F);

		defaultScopeModel[22].addBox(-47F, -41F, 9.5F, 1, 2, 1, 0F); // Import Sight23
		defaultScopeModel[22].setRotationPoint(14F, -31F, -8F);

		defaultScopeModel[23].addShapeBox(-47F, -41F, 8.5F, 1, 2, 2, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -0.9F,0F, 0F, -0.9F,0F, 0F, 0F,0F, 0F, 0F); // Import Sight24
		defaultScopeModel[23].setRotationPoint(14F, -33F, -8F);

		defaultScopeModel[24].addShapeBox(-47F, -41F, 5.5F, 1, 2, 2, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.9F,0F, 0F, -0.9F); // Import Sight25
		defaultScopeModel[24].setRotationPoint(14F, -33F, -8F);

		defaultScopeModel[25].addBox(-47F, -43F, 7.5F, 1, 1, 1, 0F); // Import Sight26
		defaultScopeModel[25].setRotationPoint(14F, -31F, -8F);

		defaultScopeModel[26].addShapeBox(26F, -41F, 2F, 6, 8, 12, 0F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, -3F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Sight27
		defaultScopeModel[26].setRotationPoint(58F, -14F, -8F);

		defaultScopeModel[27].addBox(26F, -41F, 5F, 6, 8, 6, 0F); // Import Sight28
		defaultScopeModel[27].setRotationPoint(58F, -22F, -8F);

		defaultScopeModel[28].addShapeBox(26F, -41F, 5F, 6, 2, 6, 0F,0F, 0F, -2.5F,0F, 0F, -2.5F,0F, 0F, -2.5F,0F, 0F, -2.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Sight29
		defaultScopeModel[28].setRotationPoint(58F, -24F, -8F);

		defaultScopeModel[29].addBox(26F, -41F, 7.5F, 6, 4, 1, 0F); // Import Sight30
		defaultScopeModel[29].setRotationPoint(58F, -28F, -8F);

		defaultScopeModel[30].addBox(26F, -42F, 5.5F, 6, 1, 5, 0F); // Import Sight31
		defaultScopeModel[30].setRotationPoint(58F, -28F, -8F);

		defaultScopeModel[31].addBox(26F, -46F, 5.5F, 6, 4, 1, 0F); // Import Sight32
		defaultScopeModel[31].setRotationPoint(58F, -28F, -8F);

		defaultScopeModel[32].addBox(26F, -46F, 9.5F, 6, 4, 1, 0F); // Import Sight33
		defaultScopeModel[32].setRotationPoint(58F, -28F, -8F);

		defaultScopeModel[33].addBox(26F, -46F, 7.5F, 6, 3, 1, 0F); // Import Sight34
		defaultScopeModel[33].setRotationPoint(58F, -27F, -8F);


		ammoModel = new ModelRendererTurbo[6];
		ammoModel[0] = new ModelRendererTurbo(this, 202, 221, textureX, textureY); // Import Ammo1
		ammoModel[1] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import Ammo2
		ammoModel[2] = new ModelRendererTurbo(this, 400, 220, textureX, textureY); // Box 1
		ammoModel[3] = new ModelRendererTurbo(this, 400, 270, textureX, textureY); // Box 2
		ammoModel[4] = new ModelRendererTurbo(this, 400, 220, textureX, textureY); // Box 3
		ammoModel[5] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Box 4

		ammoModel[0].addBox(-47F, -35F, 1F, 23, 8, 12, 0F); // Import Ammo1
		ammoModel[0].setRotationPoint(0F, 21F, -7F);

		ammoModel[1].addShapeBox(-47F, -35F, 0F, 23, 4, 28, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Ammo2
		ammoModel[1].setRotationPoint(0F, 29F, -14F);

		ammoModel[2].addShapeBox(-47F, -35F, 0F, 23, 8, 36, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 1
		ammoModel[2].setRotationPoint(0F, 33F, -18F);

		ammoModel[3].addBox(-47F, -35F, 0F, 23, 12, 36, 0F); // Box 2
		ammoModel[3].setRotationPoint(0F, 41F, -18F);

		ammoModel[4].addShapeBox(-47F, -35F, 0F, 23, 8, 36, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -4F); // Box 3
		ammoModel[4].setRotationPoint(0F, 53F, -18F);

		ammoModel[5].addShapeBox(-47F, -35F, 0F, 23, 4, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F,0F, 0F, -8F); // Box 4
		ammoModel[5].setRotationPoint(0F, 61F, -14F);



		barrelAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		stockAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		scopeAttachPoint = new Vector3f(0F /16F, 0F /16F, 0F /16F);
		gripAttachPoint = new Vector3f(0 /16F, 0F /16F, 0F /16F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.ALT_PISTOL_CLIP;

		
		flashModel = new ModelRendererTurbo[3][];
		
		flashModel[0] = new ModelRendererTurbo[4];
		flashModel[0][0] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 247
		flashModel[0][1] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 248
		flashModel[0][2] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 249
		flashModel[0][3] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 250

		GL11.glPushMatrix();
		GL11.glScalef(0, 2, 2);
		flashModel[0][0].addBox(0F, -40F, -40F, 0, 80, 80, 0F); // Box 247
		flashModel[0][0].setRotationPoint(0F, 0F, 0F);
		GL11.glPopMatrix();

		flashModel[0][1].addTrapezoid(0F, -16F, -16F, 31, 32, 32, 0F, -13.00F, ModelRendererTurbo.MR_RIGHT); // Box 248
		flashModel[0][1].setRotationPoint(0F, 0F, 0F);

		flashModel[0][2].addTrapezoid(31F, -16F, -16F, 31, 32, 32, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 249
		flashModel[0][2].setRotationPoint(0F, 0F, 0F);

		flashModel[0][3].addTrapezoid(62F, -16F, -16F, 49, 32, 32, 0F, -12.00F, ModelRendererTurbo.MR_LEFT); // Box 250
		flashModel[0][3].setRotationPoint(0F, 0F, 0F);
					
		
		flashModel[1] = new ModelRendererTurbo[4];
		flashModel[1][0] = new ModelRendererTurbo(this, 650, 162, textureX, textureY); // Box 247
		flashModel[1][1] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 248
		flashModel[1][2] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 249
		flashModel[1][3] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 250

		GL11.glPushMatrix();
		GL11.glScalef(0, 2, 2);
		flashModel[1][0].addBox(0F, -40F, -40F, 0, 80, 80, 0F); // Box 247
		flashModel[1][0].setRotationPoint(0F, 0F, 0F);
		GL11.glPopMatrix();

		flashModel[1][1].addTrapezoid(0F, -16F, -16F, 31, 32, 32, 0F, -13.00F, ModelRendererTurbo.MR_RIGHT); // Box 248
		flashModel[1][1].setRotationPoint(0F, 0F, 0F);

		flashModel[1][2].addTrapezoid(31F, -16F, -16F, 31, 32, 32, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 249
		flashModel[1][2].setRotationPoint(0F, 0F, 0F);

		flashModel[1][3].addTrapezoid(62F, -16F, -16F, 49, 32, 32, 0F, -12.00F, ModelRendererTurbo.MR_LEFT); // Box 250
		flashModel[1][3].setRotationPoint(0F, 0F, 0F);
		
		
		
		flashModel[2] = new ModelRendererTurbo[4];
		flashModel[2][0] = new ModelRendererTurbo(this, 650, 322, textureX, textureY); // Box 247
		flashModel[2][1] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 248
		flashModel[2][2] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 249
		flashModel[2][3] = new ModelRendererTurbo(this, 650, 0, textureX, textureY); // Box 250

		GL11.glPushMatrix();
		GL11.glScalef(0, 2, 2);
		flashModel[2][0].addBox(0F, -40F, -40F, 0, 80, 80, 0F); // Box 247
		flashModel[2][0].setRotationPoint(0F, 0F, 0F);
		GL11.glPopMatrix();

		flashModel[2][1].addTrapezoid(0F, -16F, -16F, 31, 32, 32, 0F, -13.00F, ModelRendererTurbo.MR_RIGHT); // Box 248
		flashModel[2][1].setRotationPoint(0F, 0F, 0F);

		flashModel[2][2].addTrapezoid(31F, -16F, -16F, 31, 32, 32, 0F, 0F, ModelRendererTurbo.MR_TOP); // Box 249
		flashModel[2][2].setRotationPoint(0F, 0F, 0F);

		flashModel[2][3].addTrapezoid(62F, -16F, -16F, 49, 32, 32, 0F, -12.00F, ModelRendererTurbo.MR_LEFT); // Box 250
		flashModel[2][3].setRotationPoint(0F, 0F, 0F);
		
		
		//Defined the same way as attachment positions. Don't forget to divide by 16
		muzzleFlashPoint = new Vector3f(217F/16F, 38F/16F, 0F/16F);
		
		
		//Toggle booleans for arms and flash effects
		hasFlash = true;
		hasArms = true;
		
		
		//Left arm positions
		leftArmPos = new Vector3f(0F, -0.2F, 0F);
		leftArmRot = new Vector3f(90, 45, 0);
		
		//Left arm positions during reload
		leftArmReloadPos = new Vector3f(-0.6F, -0.7F, 0.1F);
		leftArmReloadRot = new Vector3f(90, 20, 0);
		
		
		//Right arm positions
		rightArmPos = new Vector3f(0.4F, -0.5F, 0F);
		rightArmRot = new Vector3f(0, 0, -90);
		
		//Right arm positions during reload
		rightArmReloadPos = new Vector3f(0.4F, -0.6F, 0F);
		rightArmReloadRot = new Vector3f(-40, 0, -90);

		
		//Toggle booleans to determine which arms gets animated as part of the ammo model. In this case only the left hand touches the ammo.
		rightHandAmmo = false;
		leftHandAmmo = true;


		translateAll (0F, 6F,0F);


		flipAll();
	}
	
	@Override
	public void renderGun(float f)
    {
		GL11.glPushMatrix();
		GL11.glColor3d(Math.random(), 1, 1);
		super.renderGun(f);
		GL11.glPopMatrix();
    }
}
