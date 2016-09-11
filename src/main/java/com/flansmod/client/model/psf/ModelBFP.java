//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.psf;

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBFP extends ModelMecha
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelBFP()	
	{


// Body
		bodyModel = new ModelRendererTurbo[103];
		bodyModel[0] = new ModelRendererTurbo(this,  111,  0, textureX, textureY); // head1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  56, textureX, textureY); // head3
		bodyModel[2] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // head4
		bodyModel[3] = new ModelRendererTurbo(this,  0,  109, textureX, textureY); // head5
		bodyModel[4] = new ModelRendererTurbo(this,  0,  139, textureX, textureY); // head7
		bodyModel[5] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // head8
		bodyModel[6] = new ModelRendererTurbo(this,  0,  180, textureX, textureY); // head9
		bodyModel[7] = new ModelRendererTurbo(this,  0,  195, textureX, textureY); // head10
		bodyModel[8] = new ModelRendererTurbo(this,  0,  212, textureX, textureY); // head11
		bodyModel[9] = new ModelRendererTurbo(this,  0,  212, textureX, textureY); // head12
		bodyModel[10] = new ModelRendererTurbo(this,  16,  212, textureX, textureY); // head13
		bodyModel[11] = new ModelRendererTurbo(this,  30,  212, textureX, textureY); // head14
		bodyModel[12] = new ModelRendererTurbo(this,  0,  228, textureX, textureY); // head15
		bodyModel[13] = new ModelRendererTurbo(this,  0,  232, textureX, textureY); // head16
		bodyModel[14] = new ModelRendererTurbo(this,  11,  222, textureX, textureY); // head17
		bodyModel[15] = new ModelRendererTurbo(this,  0,  251, textureX, textureY); // head19
		bodyModel[16] = new ModelRendererTurbo(this,  0,  281, textureX, textureY); // head21
		bodyModel[17] = new ModelRendererTurbo(this,  25,  223, textureX, textureY); // head22
		bodyModel[18] = new ModelRendererTurbo(this,  25,  233, textureX, textureY); // head23
		bodyModel[19] = new ModelRendererTurbo(this,  0,  294, textureX, textureY); // head24
		bodyModel[20] = new ModelRendererTurbo(this,  0,  294, textureX, textureY); // head25
		bodyModel[21] = new ModelRendererTurbo(this,  0,  303, textureX, textureY); // head26
		bodyModel[22] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // head27
		bodyModel[23] = new ModelRendererTurbo(this,  0,  320, textureX, textureY); // head28
		bodyModel[24] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // head29
		bodyModel[25] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // head30
		bodyModel[26] = new ModelRendererTurbo(this,  0,  340, textureX, textureY); // head31
		bodyModel[27] = new ModelRendererTurbo(this,  0,  357, textureX, textureY); // head32
		bodyModel[28] = new ModelRendererTurbo(this,  0,  373, textureX, textureY); // head33
		bodyModel[29] = new ModelRendererTurbo(this,  0,  395, textureX, textureY); // head34
		bodyModel[30] = new ModelRendererTurbo(this,  0,  415, textureX, textureY); // head35
		bodyModel[31] = new ModelRendererTurbo(this,  0,  439, textureX, textureY); // head36
		bodyModel[32] = new ModelRendererTurbo(this,  0,  472, textureX, textureY); // head37
		bodyModel[33] = new ModelRendererTurbo(this,  0,  495, textureX, textureY); // head6
		bodyModel[34] = new ModelRendererTurbo(this,  0,  536, textureX, textureY); // Lshoulder1
		bodyModel[35] = new ModelRendererTurbo(this,  59,  536, textureX, textureY); // Lshoulder2
		bodyModel[36] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Lshoulder3
		bodyModel[37] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Lshoulder4
		bodyModel[38] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Lshoulder5
		bodyModel[39] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Lshoulder6
		bodyModel[40] = new ModelRendererTurbo(this,  0,  558, textureX, textureY); // mid1
		bodyModel[41] = new ModelRendererTurbo(this,  0,  610, textureX, textureY); // Lshoulder7
		bodyModel[42] = new ModelRendererTurbo(this,  0,  640, textureX, textureY); // Lshoulder8
		bodyModel[43] = new ModelRendererTurbo(this,  23,  640, textureX, textureY); // Lshoulder9
		bodyModel[44] = new ModelRendererTurbo(this,  39,  640, textureX, textureY); // Lshoulder10
		bodyModel[45] = new ModelRendererTurbo(this,  51,  640, textureX, textureY); // Lshoulder11
		bodyModel[46] = new ModelRendererTurbo(this,  59,  640, textureX, textureY); // head38
		bodyModel[47] = new ModelRendererTurbo(this,  0,  665, textureX, textureY); // head39
		bodyModel[48] = new ModelRendererTurbo(this,  11,  662, textureX, textureY); // head40
		bodyModel[49] = new ModelRendererTurbo(this,  0,  683, textureX, textureY); // head41
		bodyModel[50] = new ModelRendererTurbo(this,  0,  704, textureX, textureY); // head42
		bodyModel[51] = new ModelRendererTurbo(this,  14,  706, textureX, textureY); // head43
		bodyModel[52] = new ModelRendererTurbo(this,  0,  724, textureX, textureY); // Lshoulder12
		bodyModel[53] = new ModelRendererTurbo(this,  0,  741, textureX, textureY); // Lshoulder13
		bodyModel[54] = new ModelRendererTurbo(this,  0,  752, textureX, textureY); // Lshoulder14
		bodyModel[55] = new ModelRendererTurbo(this,  0,  768, textureX, textureY); // Rshoulder1
		bodyModel[56] = new ModelRendererTurbo(this,  0,  792, textureX, textureY); // Rshoulder2
		bodyModel[57] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Rshoulder3
		bodyModel[58] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Rshoulder4
		bodyModel[59] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Rshoulder5
		bodyModel[60] = new ModelRendererTurbo(this,  0,  560, textureX, textureY); // Rshoulder6
		bodyModel[61] = new ModelRendererTurbo(this,  0,  810, textureX, textureY); // Rshoulder7
		bodyModel[62] = new ModelRendererTurbo(this,  0,  836, textureX, textureY); // Rshoulder8
		bodyModel[63] = new ModelRendererTurbo(this,  17,  836, textureX, textureY); // Lshoulder9
		bodyModel[64] = new ModelRendererTurbo(this,  0,  860, textureX, textureY); // Rshoulder10
		bodyModel[65] = new ModelRendererTurbo(this,  0,  878, textureX, textureY); // Rshoulder11
		bodyModel[66] = new ModelRendererTurbo(this,  0,  890, textureX, textureY); // Rshoulder12
		bodyModel[67] = new ModelRendererTurbo(this,  0,  907, textureX, textureY); // Lshoulder15
		bodyModel[68] = new ModelRendererTurbo(this,  0,  930, textureX, textureY); // Rshoulder13
		bodyModel[69] = new ModelRendererTurbo(this,  0,  955, textureX, textureY); // Lshoulder16
		bodyModel[70] = new ModelRendererTurbo(this,  0,  955, textureX, textureY); // Rshoulder14
		bodyModel[71] = new ModelRendererTurbo(this,  50,  56, textureX, textureY); // Lshoulder17
		bodyModel[72] = new ModelRendererTurbo(this,  50,  89, textureX, textureY); // body1
		bodyModel[73] = new ModelRendererTurbo(this,  50,  136, textureX, textureY); // body2
		bodyModel[74] = new ModelRendererTurbo(this,  50,  158, textureX, textureY); // body3
		bodyModel[75] = new ModelRendererTurbo(this,  50,  196, textureX, textureY); // body4
		bodyModel[76] = new ModelRendererTurbo(this,  50,  99, textureX, textureY); // body5
		bodyModel[77] = new ModelRendererTurbo(this,  50,  218, textureX, textureY); // body6
		bodyModel[78] = new ModelRendererTurbo(this,  50,  231, textureX, textureY); // body7
		bodyModel[79] = new ModelRendererTurbo(this,  63,  246, textureX, textureY); // Rshoulder15
		bodyModel[80] = new ModelRendererTurbo(this,  50,  282, textureX, textureY); // body8
		bodyModel[81] = new ModelRendererTurbo(this,  50,  308, textureX, textureY); // body9
		bodyModel[82] = new ModelRendererTurbo(this,  50,  356, textureX, textureY); // body10
		bodyModel[83] = new ModelRendererTurbo(this,  60,  413, textureX, textureY); // body11
		bodyModel[84] = new ModelRendererTurbo(this,  115,  591, textureX, textureY); // body16
		bodyModel[85] = new ModelRendererTurbo(this,  100,  629, textureX, textureY); // body17
		bodyModel[86] = new ModelRendererTurbo(this,  100,  661, textureX, textureY); // body18
		bodyModel[87] = new ModelRendererTurbo(this,  100,  697, textureX, textureY); // body19
		bodyModel[88] = new ModelRendererTurbo(this,  100,  723, textureX, textureY); // body20
		bodyModel[89] = new ModelRendererTurbo(this,  100,  761, textureX, textureY); // body21
		bodyModel[90] = new ModelRendererTurbo(this,  100,  791, textureX, textureY); // body22
		bodyModel[91] = new ModelRendererTurbo(this,  100,  819, textureX, textureY); // body23
		bodyModel[92] = new ModelRendererTurbo(this,  100,  884, textureX, textureY); // body25
		bodyModel[93] = new ModelRendererTurbo(this,  121,  880, textureX, textureY); // body26
		bodyModel[94] = new ModelRendererTurbo(this,  100,  900, textureX, textureY); // body27
		bodyModel[95] = new ModelRendererTurbo(this,  126,  900, textureX, textureY); // body28
		bodyModel[96] = new ModelRendererTurbo(this,  100,  914, textureX, textureY); // body29
		bodyModel[97] = new ModelRendererTurbo(this,  128,  930, textureX, textureY); // body32
		bodyModel[98] = new ModelRendererTurbo(this,  200,  35, textureX, textureY); // body39
		bodyModel[99] = new ModelRendererTurbo(this,  200,  237, textureX, textureY); // body44
		bodyModel[100] = new ModelRendererTurbo(this,  200,  250, textureX, textureY); // body45
		bodyModel[101] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // body46
		bodyModel[102] = new ModelRendererTurbo(this,  200,  296, textureX, textureY); // body47

		bodyModel[0].addBox(8F, -7F, -3F, 11, 1, 6, 0F); // head1
		bodyModel[0].setRotationPoint(0F, -103F, 0F);
		bodyModel[0].rotateAngleZ = -0.541052F;

		bodyModel[1].addBox(-11F, -2.3F, -6.5F, 6, 10, 13, 0F); // head3
		bodyModel[1].setRotationPoint(0F, -102.3F, 0F);
		bodyModel[1].rotateAngleZ = 0.1919862F;

		bodyModel[2].addBox(-15F, -4.5F, -6F, 5, 10, 12, 0F); // head4
		bodyModel[2].setRotationPoint(0F, -100.8F, 0F);
		bodyModel[2].rotateAngleZ = 0.296706F;

		bodyModel[3].addBox(-20F, -6.3F, -5.5F, 6, 15, 11, 0F); // head5
		bodyModel[3].setRotationPoint(0F, -98.4F, 0F);
		bodyModel[3].rotateAngleZ = 0.3141593F;

		bodyModel[4].addBox(13F, 0F, -3F, 13, 9, 6, 0F); // head7
		bodyModel[4].setRotationPoint(0F, -103F, 0F);
		bodyModel[4].rotateAngleZ = -0.2268928F;

		bodyModel[5].addShapeBox(12F, 0F, -4F, 12, 6, 8, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[5].setRotationPoint(0F, -103.5F, 0F);
		bodyModel[5].rotateAngleZ = -0.2094395F;

		bodyModel[6].addShapeBox(9F, 7F, -4F, 17, 3, 8, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[6].setRotationPoint(0F, -104.5F, 0F);
		bodyModel[6].rotateAngleZ = -0.1047198F;

		bodyModel[7].addShapeBox(8F, 10F, -4F, 15, 3, 8, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[7].setRotationPoint(0F, -104.5F, 0F);
		bodyModel[7].rotateAngleZ = -0.1047198F;

		bodyModel[8].addBox(33F, 1F, -3F, 1, 8, 1, 0F); // head11
		bodyModel[8].setRotationPoint(0F, -103F, 0F);
		bodyModel[8].rotateAngleZ = -0.2268928F;

		bodyModel[9].addBox(33F, 1F, 2F, 1, 8, 1, 0F); // head12
		bodyModel[9].setRotationPoint(0F, -103F, 0F);
		bodyModel[9].rotateAngleZ = -0.2268928F;

		bodyModel[10].addBox(33F, 1F, -2F, 1, 1, 4, 0F); // head13
		bodyModel[10].setRotationPoint(0F, -103F, 0F);
		bodyModel[10].rotateAngleZ = -0.2268928F;

		bodyModel[11].addBox(32.2F, 2.5F, -1.5F, 1, 3, 3, 0F); // head14
		bodyModel[11].setRotationPoint(0F, -103F, 0F);
		bodyModel[11].rotateAngleZ = -0.2268928F;

		bodyModel[12].addBox(32.4F, 2.7F, 0.3F, 1, 2, 1, 0F); // head15
		bodyModel[12].setRotationPoint(0F, -103F, 0F);
		bodyModel[12].rotateAngleZ = -0.2268928F;

		bodyModel[13].addShapeBox(26F, 0F, -3F, 7, 9, 6, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[13].setRotationPoint(0F, -103F, 0F);
		bodyModel[13].rotateAngleZ = -0.2268928F;

		bodyModel[14].addBox(27.2F, 5.5F, -1.5F, 1, 3, 3, 0F); // head17
		bodyModel[14].setRotationPoint(0F, -103F, 0F);
		bodyModel[14].rotateAngleZ = -0.2268928F;

		bodyModel[15].addShapeBox(0F, 0F, -6F, 13, 14, 12, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[15].setRotationPoint(0F, -104F, 0F);
		bodyModel[15].rotateAngleZ = -0.1919862F;

		bodyModel[16].addBox(1F, -2.88F, -1.5F, 3, 2, 3, 0F); // head21
		bodyModel[16].setRotationPoint(0F, -103F, 0F);
		bodyModel[16].rotateAngleZ = -0.418879F;

		bodyModel[17].addShapeBox(32.2F, -2.5F, 0.3F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[17].setRotationPoint(0F, -101F, 0F);
		bodyModel[17].rotateAngleZ = -0.5061455F;

		bodyModel[18].addShapeBox(32.2F, -2.5F, -2.3F, 3, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[18].setRotationPoint(0F, -101F, 0F);
		bodyModel[18].rotateAngleZ = -0.5061455F;

		bodyModel[19].addBox(38.2F, -17.5F, -1.8F, 5, 1, 1, 0F); // head24
		bodyModel[19].setRotationPoint(0F, -114F, 0F);
		bodyModel[19].rotateAngleZ = -1.169371F;

		bodyModel[20].addBox(38.2F, -17.5F, 0.8F, 5, 1, 1, 0F); // head25
		bodyModel[20].setRotationPoint(0F, -114F, 0F);
		bodyModel[20].rotateAngleZ = -1.169371F;

		bodyModel[21].addBox(16F, -24.5F, -4.5F, 4, 2, 9, 0F); // head26
		bodyModel[21].setRotationPoint(0F, -95F, 0F);
		bodyModel[21].rotateAngleZ = -1.099557F;

		bodyModel[22].addBox(27F, -13F, -4.2F, 3, 2, 1, 0F); // head27
		bodyModel[22].setRotationPoint(0F, -94F, 0F);
		bodyModel[22].rotateAngleZ = -0.5759587F;

		bodyModel[23].addBox(27F, -13F, 3.2F, 3, 2, 1, 0F); // head28
		bodyModel[23].setRotationPoint(0F, -94F, 0F);
		bodyModel[23].rotateAngleZ = -0.5759587F;

		bodyModel[24].addBox(-5F, -32F, 3.1F, 6, 1, 1, 0F); // head29
		bodyModel[24].setRotationPoint(0F, -94F, 0F);
		bodyModel[24].rotateAngleZ = -1.919862F;

		bodyModel[25].addBox(-5F, -32F, -4.1F, 6, 1, 1, 0F); // head30
		bodyModel[25].setRotationPoint(0F, -94F, 0F);
		bodyModel[25].rotateAngleZ = -1.919862F;

		bodyModel[26].addBox(27F, 0F, -3.5F, 3, 3, 7, 0F); // head31
		bodyModel[26].setRotationPoint(0F, -102F, 0F);
		bodyModel[26].rotateAngleZ = -0.2268928F;

		bodyModel[27].addBox(7F, 13F, -2.5F, 19, 5, 5, 0F); // head32
		bodyModel[27].setRotationPoint(0F, -102.5F, 0F);
		bodyModel[27].rotateAngleZ = 0.1047198F;

		bodyModel[28].addShapeBox(15F, 12.5F, -4F, 2, 6, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		bodyModel[28].setRotationPoint(0F, -102.3F, 0F);
		bodyModel[28].rotateAngleZ = 0.122173F;

		bodyModel[29].addShapeBox(12.8F, 13.5F, -4.5F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test
		bodyModel[29].setRotationPoint(0F, -102.1F, 0F);
		bodyModel[29].rotateAngleZ = 0.122173F;

		bodyModel[30].addShapeBox(5.6F, -101.4F, -5F, 7, 6, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test		 		 		bodyModel[30].setRotationPoint(0F, -101.4F, 0F);
		bodyModel[30].rotateAngleZ = 0.122173F;

		bodyModel[31].addShapeBox(-8F, 0F, -7.5F, 13, 14, 15, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[31].setRotationPoint(0F, -104F, 0F);

		bodyModel[32].addBox(-1F, 11F, -4.5F, 10, 7, 9, 0F); // head37
		bodyModel[32].setRotationPoint(0F, -102.9F, 0F);

		bodyModel[33].addBox(-43F, -6F, -5F, 23, 20, 10, 0F); // head6
		bodyModel[33].setRotationPoint(0F, -98.2F, 0F);
		bodyModel[33].rotateAngleZ = 0.3141593F;

		bodyModel[34].addBox(-8F, 2F, 8F, 14, 7, 11, 0F); // Lshoulder1
		bodyModel[34].setRotationPoint(0F, -99F, 0F);
		bodyModel[34].rotateAngleX = -0.1047198F;
		bodyModel[34].rotateAngleZ = 0.3490658F;

		bodyModel[35].addBox(-8F, 9F, 8F, 7, 3, 11, 0F); // Lshoulder2
		bodyModel[35].setRotationPoint(0F, -99F, 0F);
		bodyModel[35].rotateAngleZ = 0.3490658F;

		bodyModel[36].addBox(-2F, 9.5F, 8.5F, 7, 2, 2, 0F); // Lshoulder3
		bodyModel[36].setRotationPoint(0F, -99F, 0F);
		bodyModel[36].rotateAngleZ = 0.3490658F;

		bodyModel[37].addBox(-2F, 9.5F, 11F, 7, 2, 2, 0F); // Lshoulder4
		bodyModel[37].setRotationPoint(0F, -99F, 0F);
		bodyModel[37].rotateAngleZ = 0.3490658F;

		bodyModel[38].addBox(-2F, 9.5F, 13.5F, 7, 2, 2, 0F); // Lshoulder5
		bodyModel[38].setRotationPoint(0F, -99F, 0F);
		bodyModel[38].rotateAngleZ = 0.3490658F;

		bodyModel[39].addBox(-2F, 9.5F, 16F, 7, 2, 2, 0F); // Lshoulder6
		bodyModel[39].setRotationPoint(0F, -99F, 0F);
		bodyModel[39].rotateAngleZ = 0.3490658F;

		bodyModel[40].addBox(-14F, 2F, -19F, 14, 7, 38, 0F); // mid1
		bodyModel[40].setRotationPoint(0F, -93F, 0F);

		bodyModel[41].addBox(-9F, 3.5F, 6F, 11, 9, 11, 0F); // Lshoulder7
		bodyModel[41].setRotationPoint(0F, -99F, 0F);
		bodyModel[41].rotateAngleZ = 0.3490658F;

		bodyModel[42].addShapeBox(0F, -10F, 10F, 1, 13, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F); //Test
		bodyModel[42].setRotationPoint(0F, -98F, 0F);
		bodyModel[42].rotateAngleZ = 0.6283185F;

		bodyModel[43].addBox(-5F, -10F, 8F, 2, 13, 2, 0F); // Lshoulder9
		bodyModel[43].setRotationPoint(0F, -98F, 0F);
		bodyModel[43].rotateAngleZ = 0.03490658F;

		bodyModel[44].addBox(-4.5F, -22F, 8.5F, 1, 13, 1, 0F); // Lshoulder10
		bodyModel[44].setRotationPoint(0F, -98F, 0F);
		bodyModel[44].rotateAngleZ = 0.03490658F;

		bodyModel[45].addBox(3F, -16F, 12F, 1, 7, 1, 0F); // Lshoulder11
		bodyModel[45].setRotationPoint(0F, -98F, 0F);
		bodyModel[45].rotateAngleZ = 0.9815732F;

		bodyModel[46].addBox(-5F, -21F, 0F, 2, 18, 0, 0F); // head38
		bodyModel[46].setRotationPoint(0F, -104F, 0F);
		bodyModel[46].rotateAngleZ = 0.2268928F;

		bodyModel[47].addBox(-5F, -3F, -1F, 2, 4, 2, 0F); // head39
		bodyModel[47].setRotationPoint(0F, -104F, 0F);
		bodyModel[47].rotateAngleZ = 0.2268928F;

		bodyModel[48].addShapeBox(-46F, -6F, -5F, 3, 20, 10, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F); //Test
		bodyModel[48].setRotationPoint(0F, -98.2F, 0F);
		bodyModel[48].rotateAngleZ = 0.3141593F;

		bodyModel[49].addBox(-27F, -7F, -1F, 2, 13, 2, 0F); // head41
		bodyModel[49].setRotationPoint(0F, -98F, 0F);
		bodyModel[49].rotateAngleZ = -0.08726646F;

		bodyModel[50].addBox(-26.5F, -18F, -0.5F, 1, 11, 1, 0F); // head42
		bodyModel[50].setRotationPoint(0F, -98F, 0F);
		bodyModel[50].rotateAngleZ = -0.08726646F;

		bodyModel[51].addBox(-27F, -21F, -1F, 2, 3, 2, 0F); // head43
		bodyModel[51].setRotationPoint(0F, -98F, 0F);
		bodyModel[51].rotateAngleZ = -0.08726646F;

		bodyModel[52].addBox(-5F, 7F, 18F, 14, 5, 8, 0F); // Lshoulder12
		bodyModel[52].setRotationPoint(0F, -99F, 0F);
		bodyModel[52].rotateAngleY = 0.2094395F;
		bodyModel[52].rotateAngleZ = 0.3490658F;

		bodyModel[53].addBox(-5F, 4.5F, 20F, 11, 2, 5, 0F); // Lshoulder13
		bodyModel[53].setRotationPoint(0F, -99F, 0F);
		bodyModel[53].rotateAngleY = 0.122173F;
		bodyModel[53].rotateAngleZ = 0.3490658F;

		bodyModel[54].addBox(-5F, 5.5F, 17F, 9, 4, 7, 0F); // Lshoulder14
		bodyModel[54].setRotationPoint(0F, -99F, 0F);
		bodyModel[54].rotateAngleY = 0.122173F;
		bodyModel[54].rotateAngleZ = 0.3490658F;

		bodyModel[55].addBox(-8F, 2F, -19F, 14, 7, 11, 0F); // Rshoulder1
		bodyModel[55].setRotationPoint(0F, -99F, 0F);
		bodyModel[55].rotateAngleX = 0.1047198F;
		bodyModel[55].rotateAngleZ = 0.3490658F;

		bodyModel[56].addBox(-8F, 9F, -19F, 7, 3, 11, 0F); // Rshoulder2
		bodyModel[56].setRotationPoint(0F, -99F, 0F);
		bodyModel[56].rotateAngleZ = 0.3490658F;

		bodyModel[57].addBox(-2F, 9.5F, -10.5F, 7, 2, 2, 0F); // Rshoulder3
		bodyModel[57].setRotationPoint(0F, -99F, 0F);
		bodyModel[57].rotateAngleZ = 0.3490658F;

		bodyModel[58].addBox(-2F, 9.5F, -13F, 7, 2, 2, 0F); // Rshoulder4
		bodyModel[58].setRotationPoint(0F, -99F, 0F);
		bodyModel[58].rotateAngleZ = 0.3490658F;

		bodyModel[59].addBox(-2F, 9.5F, -15.5F, 7, 2, 2, 0F); // Rshoulder5
		bodyModel[59].setRotationPoint(0F, -99F, 0F);
		bodyModel[59].rotateAngleZ = 0.3490658F;

		bodyModel[60].addBox(-2F, 9.5F, -18F, 7, 2, 2, 0F); // Rshoulder6
		bodyModel[60].setRotationPoint(0F, -99F, 0F);
		bodyModel[60].rotateAngleZ = 0.3490658F;

		bodyModel[61].addBox(-9F, 3.5F, -17F, 11, 9, 11, 0F); // Rshoulder7
		bodyModel[61].setRotationPoint(0F, -99F, 0F);
		bodyModel[61].rotateAngleZ = 0.3490658F;

		bodyModel[62].addShapeBox(0F, -10F, -15F, 1, 13, 5, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F); //Test
		bodyModel[62].setRotationPoint(0F, -98F, 0F);
		bodyModel[62].rotateAngleZ = 0.6283185F;

		bodyModel[63].addBox(3F, -16F, -13F, 1, 7, 1, 0F); // Lshoulder9
		bodyModel[63].setRotationPoint(0F, -98F, 0F);
		bodyModel[63].rotateAngleZ = 0.9815732F;

		bodyModel[64].addBox(-5F, 7F, -26F, 14, 5, 8, 0F); // Rshoulder10
		bodyModel[64].setRotationPoint(0F, -99F, 0F);
		bodyModel[64].rotateAngleY = -0.2094395F;
		bodyModel[64].rotateAngleZ = 0.3490658F;

		bodyModel[65].addBox(-5F, 4.5F, -25F, 11, 2, 5, 0F); // Rshoulder11
		bodyModel[65].setRotationPoint(0F, -99F, 0F);
		bodyModel[65].rotateAngleY = -0.122173F;
		bodyModel[65].rotateAngleZ = 0.3490658F;

		bodyModel[66].addBox(-5F, 5.5F, -24F, 9, 4, 7, 0F); // Rshoulder12
		bodyModel[66].setRotationPoint(0F, -99F, 0F);
		bodyModel[66].rotateAngleY = -0.122173F;
		bodyModel[66].rotateAngleZ = 0.3490658F;

		bodyModel[67].addShapeBox(-17F, -8F, 5F, 14, 6, 14, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, -0.5F, 0F, 0F); //Test
		bodyModel[67].setRotationPoint(0F, -93F, 0F);
		bodyModel[67].rotateAngleZ = 0.4712389F;

		bodyModel[68].addShapeBox(-17F, -8F, -19F, 14, 6, 14, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -0.5F, 0F, 0F, 5F, 5F, 0F, 5F, 5F, 0F, -0.5F, 0F, 0F); //Test
		bodyModel[68].setRotationPoint(0F, -93F, 0F);
		bodyModel[68].rotateAngleZ = 0.4712389F;

		bodyModel[69].addBox(-16F, -8F, 5F, 3, 7, 18, 0F); // Lshoulder16
		bodyModel[69].setRotationPoint(0F, -80F, 0F);

		bodyModel[70].addBox(-16F, -6F, -23F, 3, 7, 18, 0F); // Rshoulder14
		bodyModel[70].setRotationPoint(0F, -82F, 0F);

		bodyModel[71].addBox(-16F, -3F, 13F, 12, 6, 14, 0F); // Lshoulder17
		bodyModel[71].setRotationPoint(0F, -93F, 0F);
		bodyModel[71].rotateAngleZ = 0.4712389F;

		bodyModel[72].addBox(-3F, 10.5F, -18F, 11, 6, 36, 0F); // body1
		bodyModel[72].setRotationPoint(0F, -99F, 0F);

		bodyModel[73].addBox(2F, 15.5F, -11F, 7, 4, 12, 0F); // body2
		bodyModel[73].setRotationPoint(0F, -99F, 0F);
		bodyModel[73].rotateAngleX = -0.3839724F;

		bodyModel[74].addBox(2F, 15.5F, -1F, 7, 4, 12, 0F); // body3
		bodyModel[74].setRotationPoint(0F, -99F, 0F);
		bodyModel[74].rotateAngleX = 0.3839724F;

		bodyModel[75].addBox(1.9F, 14.7F, -6.5F, 7, 4, 13, 0F); // body4
		bodyModel[75].setRotationPoint(0F, -99F, 0F);

		bodyModel[76].addBox(-0.4F, 13.5F, -2F, 7, 6, 4, 0F); // body5
		bodyModel[76].setRotationPoint(0F, -99.9F, 0F);
		bodyModel[76].rotateAngleZ = 0.4537856F;

		bodyModel[77].addBox(-19F, -12F, 5.5F, 23, 7, 3, 0F); // body6
		bodyModel[77].setRotationPoint(0F, -80F, 0F);
		bodyModel[77].rotateAngleZ = 0.3665192F;

		bodyModel[78].addBox(-19F, -12F, -8.5F, 23, 7, 3, 0F); // body7
		bodyModel[78].setRotationPoint(0F, -80F, 0F);
		bodyModel[78].rotateAngleZ = 0.3665192F;

		bodyModel[79].addBox(-16F, -3F, -27F, 12, 6, 14, 0F); // Rshoulder15
		bodyModel[79].setRotationPoint(0F, -93F, 0F);
		bodyModel[79].rotateAngleZ = 0.4712389F;

		bodyModel[80].addShapeBox(2F, 16.5F, 2F, 7, 8, 13, 0F, -4F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 3F, 0F, -4F, 2F, 1F, 0F, -1F, 0F, 0F, -1F, -1F, -4F, 2F, 0F); //Test
		bodyModel[80].setRotationPoint(0F, -96F, 0F);

		bodyModel[81].addShapeBox(2F, 16.5F, -15F, 7, 8, 13, 0F, -4F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 3F, 1F, -4F, 2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, -4F, 2F, 1F); //Test
		bodyModel[81].setRotationPoint(0F, -96F, 0F);

		bodyModel[82].addBox(2F, 12.5F, -15F, 4, 17, 30, 0F); // body10
		bodyModel[82].setRotationPoint(0F, -96F, 0F);

		bodyModel[83].addBox(-17F, 11.5F, -10F, 3, 19, 20, 0F); // body11
		bodyModel[83].setRotationPoint(0F, -96F, 0F);
		bodyModel[83].rotateAngleZ = 0.1396263F;

		bodyModel[84].addBox(-14F, 11.5F, -13F, 17, 19, 5, 0F); // body16
		bodyModel[84].setRotationPoint(0F, -96F, 0F);
		bodyModel[84].rotateAngleY = -0.2094395F;
		bodyModel[84].rotateAngleZ = 0.1396263F;

		bodyModel[85].addBox(-14F, 11.5F, 8F, 17, 19, 5, 0F); // body17
		bodyModel[85].setRotationPoint(0F, -96F, 0F);
		bodyModel[85].rotateAngleY = 0.2094395F;
		bodyModel[85].rotateAngleZ = 0.1396263F;

		bodyModel[86].addBox(-22F, 11.5F, 11F, 10, 19, 10, 0F); // body18
		bodyModel[86].setRotationPoint(7F, -98F, 0F);

		bodyModel[87].addBox(-22.5F, 17.5F, 10.5F, 11, 9, 11, 0F); // body19
		bodyModel[87].setRotationPoint(7F, -98F, 0F);

		bodyModel[88].addBox(-22F, 11.5F, -21F, 10, 19, 10, 0F); // body20
		bodyModel[88].setRotationPoint(7F, -98F, 0F);

		bodyModel[89].addBox(-22.5F, 17.5F, -21.5F, 11, 9, 11, 0F); // body21
		bodyModel[89].setRotationPoint(7F, -98F, 0F);

		bodyModel[90].addBox(-22F, 5.5F, -22.5F, 3, 9, 11, 0F); // body22
		bodyModel[90].setRotationPoint(7F, -98F, 0F);
		bodyModel[90].rotateAngleX = 0.5585054F;

		bodyModel[91].addBox(-22F, 5.5F, 11.5F, 3, 9, 11, 0F); // body23
		bodyModel[91].setRotationPoint(7F, -98F, 0F);
		bodyModel[91].rotateAngleX = -0.5585054F;

		bodyModel[92].addBox(-18.5F, 17.5F, -3F, 2, 2, 6, 0F); // body25
		bodyModel[92].setRotationPoint(0F, -97F, 0F);
		bodyModel[92].rotateAngleZ = 0.1396263F;

		bodyModel[93].addBox(-18.5F, 20F, -3F, 2, 2, 6, 0F); // body26
		bodyModel[93].setRotationPoint(0F, -97F, 0F);
		bodyModel[93].rotateAngleZ = 0.1396263F;

		bodyModel[94].addBox(-18.5F, 22.5F, -3F, 2, 2, 6, 0F); // body27
		bodyModel[94].setRotationPoint(0F, -97F, 0F);
		bodyModel[94].rotateAngleZ = 0.1396263F;

		bodyModel[95].addBox(-18.5F, 22.5F, 3F, 3, 5, 3, 0F); // body28
		bodyModel[95].setRotationPoint(0F, -94F, 0F);
		bodyModel[95].rotateAngleZ = 0.1396263F;

		bodyModel[96].addBox(-18.5F, 22.5F, -6F, 3, 5, 3, 0F); // body29
		bodyModel[96].setRotationPoint(0F, -94F, 0F);
		bodyModel[96].rotateAngleZ = 0.1396263F;

		bodyModel[97].addBox(-17.5F, 22.5F, -2F, 2, 5, 4, 0F); // body32
		bodyModel[97].setRotationPoint(0F, -94F, 0F);
		bodyModel[97].rotateAngleZ = 0.1396263F;

		bodyModel[98].addBox(-12F, 13.5F, -10F, 17, 3, 20, 0F); // body39
		bodyModel[98].setRotationPoint(0F, -81F, 0F);

		bodyModel[99].addBox(-11.5F, 16.5F, 15.5F, 11, 4, 4, 0F); // body44
		bodyModel[99].setRotationPoint(7F, -98F, 0F);

		bodyModel[100].addBox(-11.5F, 16.5F, -19.5F, 11, 4, 4, 0F); // body45
		bodyModel[100].setRotationPoint(7F, -98F, 0F);

		bodyModel[101].addBox(-1.5F, 14.5F, 6.5F, 5, 7, 15, 0F); // body46
		bodyModel[101].setRotationPoint(0F, -98F, 0F);
		bodyModel[101].rotateAngleX = 0.4014257F;

		bodyModel[102].addBox(-1.5F, 14.5F, -21.5F, 5, 7, 15, 0F); // body47
		bodyModel[102].setRotationPoint(0F, -98F, 0F);
		bodyModel[102].rotateAngleX = -0.4014257F;



// Left Arm
		leftArmModel = new ModelRendererTurbo[35];
		leftArmModel[0] = new ModelRendererTurbo(this,  200,  326, textureX, textureY); // LeftArm1
		leftArmModel[1] = new ModelRendererTurbo(this,  200,  340, textureX, textureY); // LeftArm2
		leftArmModel[2] = new ModelRendererTurbo(this,  200,  362, textureX, textureY); // LeftArm3
		leftArmModel[3] = new ModelRendererTurbo(this,  200,  383, textureX, textureY); // LeftArm4
		leftArmModel[4] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // LeftArm5
		leftArmModel[5] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // LeftArm6
		leftArmModel[6] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // LeftArm7
		leftArmModel[7] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // LeftArm8
		leftArmModel[8] = new ModelRendererTurbo(this,  200,  490, textureX, textureY); // LeftArm9
		leftArmModel[9] = new ModelRendererTurbo(this,  200,  505, textureX, textureY); // LeftArm10
		leftArmModel[10] = new ModelRendererTurbo(this,  200,  515, textureX, textureY); // LeftArm11
		leftArmModel[11] = new ModelRendererTurbo(this,  200,  535, textureX, textureY); // LeftArm12
		leftArmModel[12] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // LeftArm13
		leftArmModel[13] = new ModelRendererTurbo(this,  200,  580, textureX, textureY); // LeftArm14
		leftArmModel[14] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // LeftArm15
		leftArmModel[15] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // LeftArm16
		leftArmModel[16] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // LeftArm17
		leftArmModel[17] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // LeftArm18
		leftArmModel[18] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // LeftArm19
		leftArmModel[19] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // LeftArm20
		leftArmModel[20] = new ModelRendererTurbo(this,  200,  620, textureX, textureY); // LeftArm21
		leftArmModel[21] = new ModelRendererTurbo(this,  200,  635, textureX, textureY); // LeftArm22
		leftArmModel[22] = new ModelRendererTurbo(this,  200,  650, textureX, textureY); // LeftArm23
		leftArmModel[23] = new ModelRendererTurbo(this,  200,  670, textureX, textureY); // LeftArm24
		leftArmModel[24] = new ModelRendererTurbo(this,  200,  685, textureX, textureY); // LeftArm25
		leftArmModel[25] = new ModelRendererTurbo(this,  200,  685, textureX, textureY); // LeftArm26
		leftArmModel[26] = new ModelRendererTurbo(this,  200,  685, textureX, textureY); // LeftArm27
		leftArmModel[27] = new ModelRendererTurbo(this,  200,  685, textureX, textureY); // LeftArm28
		leftArmModel[28] = new ModelRendererTurbo(this,  200,  685, textureX, textureY); // LeftArm29
		leftArmModel[29] = new ModelRendererTurbo(this,  200,  695, textureX, textureY); // LeftArm30
		leftArmModel[30] = new ModelRendererTurbo(this,  200,  710, textureX, textureY); // LeftArm31
		leftArmModel[31] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // LeftArm32
		leftArmModel[32] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // LeftArm33
		leftArmModel[33] = new ModelRendererTurbo(this,  200,  730, textureX, textureY); // LeftArm34
		leftArmModel[34] = new ModelRendererTurbo(this,  200,  750, textureX, textureY); // LeftArm35
		leftArmModel[0].addShapeBox(-5F, 0F, 0F, 10, 4, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftArmModel[0].setRotationPoint(0F, 11F, 0F);
		leftArmModel[0].rotateAngleZ = -0.3316126F;

		leftArmModel[1].addBox(-4F, -8F, -0.5F, 8, 8, 6, 0F); // LeftArm2
		leftArmModel[1].setRotationPoint(0F, 11F, 0F);
		leftArmModel[1].rotateAngleZ = -0.3316126F;

		leftArmModel[2].addShapeBox(-5F, 4F, 0F, 10, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); //Test
		leftArmModel[2].setRotationPoint(0F, 11F, 0F);
		leftArmModel[2].rotateAngleZ = -0.3316126F;

		leftArmModel[3].addBox(-1F, 6F, 1F, 3, 14, 3, 0F); // LeftArm4
		leftArmModel[3].setRotationPoint(0F, 11F, 0F);

		leftArmModel[4].addBox(-4F, 12F, 0F, 6, 5, 5, 0F); // LeftArm5
		leftArmModel[4].setRotationPoint(0F, 11F, 0F);
		leftArmModel[4].rotateAngleZ = -0.3316126F;

		leftArmModel[5].addBox(-0.5F, 20F, 1.5F, 2, 13, 2, 0F); // LeftArm6
		leftArmModel[5].setRotationPoint(0F, 11F, 0F);

		leftArmModel[6].addBox(-2F, 17F, 0F, 4, 13, 5, 0F); // LeftArm7
		leftArmModel[6].setRotationPoint(0F, 11F, 0F);
		leftArmModel[6].rotateAngleZ = -0.3316126F;

		leftArmModel[7].addBox(-4F, 17F, 2F, 2, 5, 2, 0F); // LeftArm8
		leftArmModel[7].setRotationPoint(0F, 11F, 0F);
		leftArmModel[7].rotateAngleZ = -0.3316126F;

		leftArmModel[8].addBox(-3.5F, 22F, 2.5F, 1, 6, 1, 0F); // LeftArm9
		leftArmModel[8].setRotationPoint(0F, 11F, 0F);
		leftArmModel[8].rotateAngleZ = -0.3316126F;

		leftArmModel[9].addBox(-4F, 26F, 2F, 2, 2, 2, 0F); // LeftArm10
		leftArmModel[9].setRotationPoint(0F, 11F, 0F);
		leftArmModel[9].rotateAngleZ = -0.3316126F;

		leftArmModel[10].addBox(-5F, 28F, -0.5F, 8, 8, 6, 0F); // LeftArm11
		leftArmModel[10].setRotationPoint(0F, 11F, 0F);
		leftArmModel[10].rotateAngleZ = -0.3316126F;

		leftArmModel[11].addBox(-9F, 29.2F, 0.5F, 11, 4, 4, 0F); // LeftArm12
		leftArmModel[11].setRotationPoint(0F, 11F, 0F);

		leftArmModel[12].addShapeBox(-9F, 33.2F, 0.5F, 10, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		leftArmModel[12].setRotationPoint(0F, 11F, 0F);

		leftArmModel[13].addBox(-6F, 53.2F, 0.5F, 5, 5, 4, 0F); // LeftArm14
		leftArmModel[13].setRotationPoint(0F, 11F, 0F);

		leftArmModel[14].addBox(-24F, 53.2F, 1F, 2, 5, 1, 0F); // LeftArm15
		leftArmModel[14].setRotationPoint(0F, 11F, 0F);
		leftArmModel[14].rotateAngleZ = 0.3665192F;

		leftArmModel[15].addBox(-24F, 53.2F, 3F, 2, 5, 1, 0F); // LeftArm16
		leftArmModel[15].setRotationPoint(0F, 11F, 0F);
		leftArmModel[15].rotateAngleZ = 0.3665192F;

		leftArmModel[16].addBox(15F, 55.2F, 2F, 2, 5, 1, 0F); // LeftArm17
		leftArmModel[16].setRotationPoint(0F, 11F, 0F);
		leftArmModel[16].rotateAngleZ = -0.3665192F;

		leftArmModel[17].addBox(8F, 61.2F, 2.9F, 1, 5, 1, 0F); // LeftArm18
		leftArmModel[17].setRotationPoint(0F, 11F, 0F);
		leftArmModel[17].rotateAngleZ = -0.1570796F;

		leftArmModel[18].addBox(8F, 61.2F, 1.1F, 1, 5, 1, 0F); // LeftArm19
		leftArmModel[18].setRotationPoint(0F, 11F, 0F);
		leftArmModel[18].rotateAngleZ = -0.1570796F;

		leftArmModel[19].addBox(-16F, 59.2F, 2F, 1, 5, 1, 0F); // LeftArm20
		leftArmModel[19].setRotationPoint(0F, 11F, 0F);
		leftArmModel[19].rotateAngleZ = 0.1570796F;

		leftArmModel[20].addBox(1F, 35.2F, 1.5F, 1, 10, 2, 0F); // LeftArm21
		leftArmModel[20].setRotationPoint(0F, 11F, 0F);

		leftArmModel[21].addBox(30F, 34.2F, 4.833333F, 5, 2, 2, 0F); // LeftArm22
		leftArmModel[21].setRotationPoint(0F, 11F, 0F);
		leftArmModel[21].rotateAngleZ = -0.7853982F;

		leftArmModel[22].addBox(-7F, 33.2F, 4.5F, 6, 14, 3, 0F); // LeftArm23
		leftArmModel[22].setRotationPoint(0F, 11F, 0F);

		leftArmModel[23].addBox(21F, 41.2F, 4.5F, 2, 5, 2, 0F); // LeftArm24
		leftArmModel[23].setRotationPoint(0F, 11F, 0F);
		leftArmModel[23].rotateAngleZ = -0.6283185F;

		leftArmModel[24].addBox(-38F, 24F, 4.5F, 1, 4, 1, 0F); // LeftArm25
		leftArmModel[24].setRotationPoint(0F, 11F, 0F);
		leftArmModel[24].rotateAngleZ = 0.7853982F;

		leftArmModel[25].addBox(-36.5F, 22.5F, 4.5F, 1, 4, 1, 0F); // LeftArm26
		leftArmModel[25].setRotationPoint(0F, 11F, 0F);
		leftArmModel[25].rotateAngleZ = 0.7853982F;

		leftArmModel[26].addBox(-35F, 21F, 4.5F, 1, 4, 1, 0F); // LeftArm27
		leftArmModel[26].setRotationPoint(0F, 11F, 0F);
		leftArmModel[26].rotateAngleZ = 0.7853982F;

		leftArmModel[27].addBox(-33.5F, 19.5F, 4.5F, 1, 4, 1, 0F); // LeftArm28
		leftArmModel[27].setRotationPoint(0F, 11F, 0F);
		leftArmModel[27].rotateAngleZ = 0.7853982F;

		leftArmModel[28].addBox(-32F, 18F, 4.5F, 1, 4, 1, 0F); // LeftArm29
		leftArmModel[28].setRotationPoint(0F, 11F, 0F);
		leftArmModel[28].rotateAngleZ = 0.7853982F;

		leftArmModel[29].addBox(-31F, 15F, 4F, 3, 6, 3, 0F); // LeftArm30
		leftArmModel[29].setRotationPoint(0F, 11F, 0F);
		leftArmModel[29].rotateAngleZ = 0.7853982F;

		leftArmModel[30].addBox(-5F, 24.2F, 4.5F, 4, 9, 3, 0F); // LeftArm31
		leftArmModel[30].setRotationPoint(0F, 11F, 0F);

		leftArmModel[31].addBox(-6F, 24.7F, 5F, 6, 2, 2, 0F); // LeftArm32
		leftArmModel[31].setRotationPoint(0F, 11F, 0F);

		leftArmModel[32].addBox(-6F, 27.2F, 5F, 6, 2, 2, 0F); // LeftArm33
		leftArmModel[32].setRotationPoint(0F, 11F, 0F);

		leftArmModel[33].addBox(-6F, 29.7F, 5F, 6, 2, 2, 0F); // LeftArm34
		leftArmModel[33].setRotationPoint(0F, 11F, 0F);

		leftArmModel[34].addBox(-1F, 33.2F, 4.5F, 1, 12, 2, 0F); // LeftArm35
		leftArmModel[34].setRotationPoint(0F, 11F, 0F);



// Right Arm
		rightArmModel = new ModelRendererTurbo[33];
		rightArmModel[0] = new ModelRendererTurbo(this,  200,  326, textureX, textureY); // RightArm1
		rightArmModel[1] = new ModelRendererTurbo(this,  200,  340, textureX, textureY); // RightArm2
		rightArmModel[2] = new ModelRendererTurbo(this,  200,  362, textureX, textureY); // RightArm3
		rightArmModel[3] = new ModelRendererTurbo(this,  200,  383, textureX, textureY); // RightArm4
		rightArmModel[4] = new ModelRendererTurbo(this,  200,  410, textureX, textureY); // RightArm5
		rightArmModel[5] = new ModelRendererTurbo(this,  200,  430, textureX, textureY); // RightArm6
		rightArmModel[6] = new ModelRendererTurbo(this,  200,  450, textureX, textureY); // RightArm7
		rightArmModel[7] = new ModelRendererTurbo(this,  200,  480, textureX, textureY); // RightArm8
		rightArmModel[8] = new ModelRendererTurbo(this,  200,  490, textureX, textureY); // RightArm9
		rightArmModel[9] = new ModelRendererTurbo(this,  200,  505, textureX, textureY); // RightArm10
		rightArmModel[10] = new ModelRendererTurbo(this,  200,  515, textureX, textureY); // RightArm11
		rightArmModel[11] = new ModelRendererTurbo(this,  200,  535, textureX, textureY); // RightArm12
		rightArmModel[12] = new ModelRendererTurbo(this,  200,  550, textureX, textureY); // RightArm13
		rightArmModel[13] = new ModelRendererTurbo(this,  200,  580, textureX, textureY); // RightArm14
		rightArmModel[14] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // RightArm15
		rightArmModel[15] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // RightArm16
		rightArmModel[16] = new ModelRendererTurbo(this,  200,  595, textureX, textureY); // RightArm17
		rightArmModel[17] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // RightArm18
		rightArmModel[18] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // RightArm19
		rightArmModel[19] = new ModelRendererTurbo(this,  200,  610, textureX, textureY); // RoghtArm20
		rightArmModel[20] = new ModelRendererTurbo(this,  200,  770, textureX, textureY); // RightArm21
		rightArmModel[21] = new ModelRendererTurbo(this,  200,  800, textureX, textureY); // RightArm22
		rightArmModel[22] = new ModelRendererTurbo(this,  200,  820, textureX, textureY); // RightArm23
		rightArmModel[23] = new ModelRendererTurbo(this,  200,  840, textureX, textureY); // RightArm24
		rightArmModel[24] = new ModelRendererTurbo(this,  200,  860, textureX, textureY); // RightArm25
		rightArmModel[25] = new ModelRendererTurbo(this,  200,  880, textureX, textureY); // RightArm26
		rightArmModel[26] = new ModelRendererTurbo(this,  200,  895, textureX, textureY); // RightArm27
		rightArmModel[27] = new ModelRendererTurbo(this,  215,  910, textureX, textureY); // RightArm28
		rightArmModel[28] = new ModelRendererTurbo(this,  200,  920, textureX, textureY); // RightArm29
		rightArmModel[29] = new ModelRendererTurbo(this,  200,  930, textureX, textureY); // RightArm30
		rightArmModel[30] = new ModelRendererTurbo(this,  200,  940, textureX, textureY); // RightArm31
		rightArmModel[31] = new ModelRendererTurbo(this,  200,  950, textureX, textureY); // RightArm32
		rightArmModel[32] = new ModelRendererTurbo(this,  200,  960, textureX, textureY); // RightArm33
		rightArmModel[0].addShapeBox(-5F, 0F, -5F, 10, 4, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightArmModel[0].setRotationPoint(0F, 11F, 0F);
		rightArmModel[0].rotateAngleZ = -0.3316126F;

		rightArmModel[1].addBox(-4F, -8F, -5.5F, 8, 8, 6, 0F); // RightArm2
		rightArmModel[1].setRotationPoint(0F, 11F, 0F);
		rightArmModel[1].rotateAngleZ = -0.3316126F;

		rightArmModel[2].addShapeBox(-5F, 4F, -5F, 10, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); //Test
		rightArmModel[2].setRotationPoint(0F, 11F, 0F);
		rightArmModel[2].rotateAngleZ = -0.3316126F;

		rightArmModel[3].addBox(-1F, 6F, -4F, 3, 14, 3, 0F); // RightArm4
		rightArmModel[3].setRotationPoint(0F, 11F, 0F);

		rightArmModel[4].addBox(-4F, 12F, -5F, 6, 5, 5, 0F); // RightArm5
		rightArmModel[4].setRotationPoint(0F, 11F, 0F);
		rightArmModel[4].rotateAngleZ = -0.3316126F;

		rightArmModel[5].addBox(-0.5F, 20F, -3.5F, 2, 13, 2, 0F); // RightArm6
		rightArmModel[5].setRotationPoint(0F, 11F, 0F);

		rightArmModel[6].addBox(-2F, 17F, -5F, 4, 13, 5, 0F); // RightArm7
		rightArmModel[6].setRotationPoint(0F, 11F, 0F);
		rightArmModel[6].rotateAngleZ = -0.3316126F;

		rightArmModel[7].addBox(-4F, 17F, -4F, 2, 5, 2, 0F); // RightArm8
		rightArmModel[7].setRotationPoint(0F, 11F, 0F);
		rightArmModel[7].rotateAngleZ = -0.3316126F;

		rightArmModel[8].addBox(-3.5F, 22F, -3.5F, 1, 6, 1, 0F); // RightArm9
		rightArmModel[8].setRotationPoint(0F, 11F, 0F);
		rightArmModel[8].rotateAngleZ = -0.3316126F;

		rightArmModel[9].addBox(-4F, 26F, -4F, 2, 2, 2, 0F); // RightArm10
		rightArmModel[9].setRotationPoint(0F, 11F, 0F);
		rightArmModel[9].rotateAngleZ = -0.3316126F;

		rightArmModel[10].addBox(-5F, 28F, -5.5F, 8, 8, 6, 0F); // RightArm11
		rightArmModel[10].setRotationPoint(0F, 11F, 0F);
		rightArmModel[10].rotateAngleZ = -0.3316126F;

		rightArmModel[11].addBox(-9F, 29.2F, -4.5F, 11, 4, 4, 0F); // RightArm12
		rightArmModel[11].setRotationPoint(0F, 11F, 0F);

		rightArmModel[12].addShapeBox(-9F, 33.2F, -4.5F, 10, 20, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); //Test
		rightArmModel[12].setRotationPoint(0F, 11F, 0F);

		rightArmModel[13].addBox(-6F, 53.2F, -4.5F, 5, 5, 4, 0F); // RightArm14
		rightArmModel[13].setRotationPoint(0F, 11F, 0F);

		rightArmModel[14].addBox(-24F, 53.2F, -2F, 2, 5, 1, 0F); // RightArm15
		rightArmModel[14].setRotationPoint(0F, 11F, 0F);
		rightArmModel[14].rotateAngleZ = 0.3665192F;

		rightArmModel[15].addBox(-24F, 53.2F, -4F, 2, 5, 1, 0F); // RightArm16
		rightArmModel[15].setRotationPoint(0F, 11F, 0F);
		rightArmModel[15].rotateAngleZ = 0.3665192F;

		rightArmModel[16].addBox(15F, 55.2F, -3F, 2, 5, 1, 0F); // RightArm17
		rightArmModel[16].setRotationPoint(0F, 11F, 0F);
		rightArmModel[16].rotateAngleZ = -0.3665192F;

		rightArmModel[17].addBox(8F, 61.2F, -3.9F, 1, 5, 1, 0F); // RightArm18
		rightArmModel[17].setRotationPoint(0F, 11F, 0F);
		rightArmModel[17].rotateAngleZ = -0.1570796F;

		rightArmModel[18].addBox(8F, 61.2F, -2.1F, 1, 5, 1, 0F); // RightArm19
		rightArmModel[18].setRotationPoint(0F, 11F, 0F);
		rightArmModel[18].rotateAngleZ = -0.1570796F;

		rightArmModel[19].addBox(-16F, 59.2F, -3F, 1, 5, 1, 0F); // RoghtArm20
		rightArmModel[19].setRotationPoint(0F, 11F, 0F);
		rightArmModel[19].rotateAngleZ = 0.1570796F;

		rightArmModel[20].addBox(-2F, 34F, -6.5F, 4, 20, 3, 0F); // RightArm21
		rightArmModel[20].setRotationPoint(0F, 11F, 0F);

		rightArmModel[21].addBox(-4F, 43F, -6.5F, 2, 9, 2, 0F); // RightArm22
		rightArmModel[21].setRotationPoint(0F, 11F, 0F);

		rightArmModel[22].addBox(-5.5F, 38.74667F, -5F, 2, 14, 0, 0F); // RightArm23
		rightArmModel[22].setRotationPoint(0F, 11F, 0F);
		rightArmModel[22].rotateAngleY = -0.5235988F;

		rightArmModel[23].addBox(-36F, 23F, -6F, 2, 9, 2, 0F); // RightArm24
		rightArmModel[23].setRotationPoint(0F, 11F, 0F);
		rightArmModel[23].rotateAngleZ = 0.7853982F;

		rightArmModel[24].addBox(-10F, 33F, -6.1F, 3, 9, 2, 0F); // RightArm25
		rightArmModel[24].setRotationPoint(0F, 11F, 0F);

		rightArmModel[25].addBox(-10F, 34F, -6.5F, 8, 4, 3, 0F); // RightArm26
		rightArmModel[25].setRotationPoint(0F, 11F, 0F);

		rightArmModel[26].addBox(-7.5F, 43F, -5.7F, 1, 12, 1, 0F); // RightArm27
		rightArmModel[26].setRotationPoint(0F, 11F, 0F);

		rightArmModel[27].addBox(-1.5F, 54F, -5.5F, 1, 2, 1, 0F); // RightArm28
		rightArmModel[27].setRotationPoint(0F, 11F, 0F);

		rightArmModel[28].addBox(0.5F, 54F, -5.5F, 1, 2, 1, 0F); // RightArm29
		rightArmModel[28].setRotationPoint(0F, 11F, 0F);

		rightArmModel[29].addBox(32F, 28F, -6F, 2, 4, 2, 0F); // RightArm30
		rightArmModel[29].setRotationPoint(0F, 11F, 0F);
		rightArmModel[29].rotateAngleZ = -0.7853982F;

		rightArmModel[30].addBox(31.5F, 24F, -6.5F, 3, 4, 3, 0F); // RightArm31
		rightArmModel[30].setRotationPoint(0F, 11F, 0F);
		rightArmModel[30].rotateAngleZ = -0.7853982F;

		rightArmModel[31].addBox(29F, 24F, -5F, 1, 5, 2, 0F); // RightArm32
		rightArmModel[31].setRotationPoint(0F, 11F, 0F);
		rightArmModel[31].rotateAngleY = 0.03490658F;
		rightArmModel[31].rotateAngleZ = -0.7853982F;

		rightArmModel[32].addBox(24F, 24F, -5F, 5, 1, 2, 0F); // RightArm33
		rightArmModel[32].setRotationPoint(0F, 11F, 0F);
		rightArmModel[32].rotateAngleY = 0.03490658F;
		rightArmModel[32].rotateAngleZ = -0.7853982F;



// Hips
		hipsModel = new ModelRendererTurbo[17];
		hipsModel[0] = new ModelRendererTurbo(this,  83,  461, textureX, textureY); // Hbody12
		hipsModel[1] = new ModelRendererTurbo(this,  100,  512, textureX, textureY); // Hbody13
		hipsModel[2] = new ModelRendererTurbo(this,  100,  555, textureX, textureY); // Hbody14
		hipsModel[3] = new ModelRendererTurbo(this,  105,  575, textureX, textureY); // Hbody15
		hipsModel[4] = new ModelRendererTurbo(this,  100,  849, textureX, textureY); // Hbody24
		hipsModel[5] = new ModelRendererTurbo(this,  128,  916, textureX, textureY); // Hbody30
		hipsModel[6] = new ModelRendererTurbo(this,  100,  930, textureX, textureY); // Hbody31
		hipsModel[7] = new ModelRendererTurbo(this,  100,  945, textureX, textureY); // Hbody33
		hipsModel[8] = new ModelRendererTurbo(this,  131,  945, textureX, textureY); // Hbody34
		hipsModel[9] = new ModelRendererTurbo(this,  100,  959, textureX, textureY); // Hbody35
		hipsModel[10] = new ModelRendererTurbo(this,  118,  958, textureX, textureY); // Hbody36
		hipsModel[11] = new ModelRendererTurbo(this,  100,  970, textureX, textureY); // Hbody37
		hipsModel[12] = new ModelRendererTurbo(this,  200,  0, textureX, textureY); // Hbody38
		hipsModel[13] = new ModelRendererTurbo(this,  200,  78, textureX, textureY); // Hbody40
		hipsModel[14] = new ModelRendererTurbo(this,  200,  130, textureX, textureY); // Hbody41
		hipsModel[15] = new ModelRendererTurbo(this,  200,  173, textureX, textureY); // Hbody42
		hipsModel[16] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Hbody43
		hipsModel[0].addBox(-6F, 25.5F, -10F, 2, 19, 20, 0F); // Hbody12
		hipsModel[0].setRotationPoint(0F, -90F, 0F);
		hipsModel[0].rotateAngleZ = 0.4363323F;

		hipsModel[1].addBox(-5F, 26.5F, -9.5F, 2, 13, 19, 0F); // Hbody13
		hipsModel[1].setRotationPoint(0F, -90F, 0F);
		hipsModel[1].rotateAngleZ = 0.4363323F;

		hipsModel[2].addBox(-5F, 39.5F, -9.5F, 2, 3, 7, 0F); // Hbody14
		hipsModel[2].setRotationPoint(0F, -90F, 0F);
		hipsModel[2].rotateAngleZ = 0.4363323F;

		hipsModel[3].addBox(-5F, 39.5F, 2.5F, 2, 3, 7, 0F); // Hbody15
		hipsModel[3].setRotationPoint(0F, -90F, 0F);
		hipsModel[3].rotateAngleZ = 0.4363323F;

		hipsModel[4].addBox(-12F, 32.5F, -10F, 3, 8, 20, 0F); // Hbody24
		hipsModel[4].setRotationPoint(0F, -96F, 0F);

		hipsModel[5].addBox(-15F, 30.5F, 3F, 3, 5, 3, 0F); // Hbody30
		hipsModel[5].setRotationPoint(0F, -94F, 0F);

		hipsModel[6].addBox(-15F, 30.5F, -6F, 3, 5, 3, 0F); // Hbody31
		hipsModel[6].setRotationPoint(0F, -94F, 0F);

		hipsModel[7].addBox(-24F, 25.5F, -2F, 5, 5, 4, 0F); // Hbody33
		hipsModel[7].setRotationPoint(0F, -94F, 0F);
		hipsModel[7].rotateAngleZ = 0.2792527F;

		hipsModel[8].addBox(-26F, 29.5F, -2F, 5, 5, 4, 0F); // Hbody34
		hipsModel[8].setRotationPoint(0F, -94F, 0F);
		hipsModel[8].rotateAngleZ = 0.3665192F;

		hipsModel[9].addBox(-14F, 36.5F, -5F, 2, 3, 2, 0F); // Hbody35
		hipsModel[9].setRotationPoint(0F, -94F, 0F);

		hipsModel[10].addBox(-14F, 36.5F, 3F, 2, 3, 2, 0F); // Hbody36
		hipsModel[10].setRotationPoint(0F, -94F, 0F);

		hipsModel[11].addBox(-9F, 31.5F, -9.8F, 14, 14, 10, 0F); // Hbody37
		hipsModel[11].setRotationPoint(0F, -96F, 0F);

		hipsModel[12].addBox(-9F, 31.5F, -0.2F, 14, 14, 10, 0F); // Hbody38
		hipsModel[12].setRotationPoint(0F, -96F, 0F);

		hipsModel[13].addBox(-25F, 25.5F, -9.5F, 19, 25, 19, 0F); // Hbody40
		hipsModel[13].setRotationPoint(0F, -90F, 0F);
		hipsModel[13].rotateAngleZ = 0.4363323F;

		hipsModel[14].addBox(-41F, -1.02F, -10F, 15, 15, 20, 0F); // Hbody41
		hipsModel[14].setRotationPoint(0F, -75F, 0F);
		hipsModel[14].rotateAngleZ = 1.570796F;

		hipsModel[15].addShapeBox(-40F, 25.5F, -4F, 9, 11, 8, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); //Test
		hipsModel[15].setRotationPoint(0F, -75F, 0F);
		hipsModel[15].rotateAngleZ = 1.570796F;

		hipsModel[16].addShapeBox(-56F, 14F, -10F, 13, 12, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -3F, 0F, -4F, -3F, 0F, -4F, -1F, 0F, -4F); //Test
		hipsModel[16].setRotationPoint(0F, -90F, 0F);
		hipsModel[16].rotateAngleZ = 1.570796F;

//LeftLeg

		leftLegModel = new ModelRendererTurbo[38];
		leftLegModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // leftleg1
		leftLegModel[1] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // leftleg2
		leftLegModel[2] = new ModelRendererTurbo(this, 300, 40, textureX, textureY); // leftleg3
		leftLegModel[3] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // leftleg4
		leftLegModel[4] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // leftleg5
		leftLegModel[5] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // leftleg6
		leftLegModel[6] = new ModelRendererTurbo(this, 300, 120, textureX, textureY); // leftleg7
		leftLegModel[7] = new ModelRendererTurbo(this, 300, 140, textureX, textureY); // leftleg8
		leftLegModel[8] = new ModelRendererTurbo(this, 300, 170, textureX, textureY); // leftleg9
		leftLegModel[9] = new ModelRendererTurbo(this, 300, 190, textureX, textureY); // leftleg10
		leftLegModel[10] = new ModelRendererTurbo(this, 300, 210, textureX, textureY); // leftleg11
		leftLegModel[11] = new ModelRendererTurbo(this, 300, 240, textureX, textureY); // leftleg12
		leftLegModel[12] = new ModelRendererTurbo(this, 300, 260, textureX, textureY); // leftleg13
		leftLegModel[13] = new ModelRendererTurbo(this, 300, 280, textureX, textureY); // leftleg14
		leftLegModel[14] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // leftleg15
		leftLegModel[15] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // leftleg16
		leftLegModel[16] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // leftleg17
		leftLegModel[17] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // leftleg18
		leftLegModel[18] = new ModelRendererTurbo(this, 300, 380, textureX, textureY); // leftleg19
		leftLegModel[19] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // leftleg20
		leftLegModel[20] = new ModelRendererTurbo(this, 300, 420, textureX, textureY); // leftleg21
		leftLegModel[21] = new ModelRendererTurbo(this, 300, 440, textureX, textureY); // leftleg22
		leftLegModel[22] = new ModelRendererTurbo(this, 300, 460, textureX, textureY); // leftleg23
		leftLegModel[23] = new ModelRendererTurbo(this, 300, 480, textureX, textureY); // leftleg24
		leftLegModel[24] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // leftleg25
		leftLegModel[25] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // leftleg26
		leftLegModel[26] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // leftleg27
		leftLegModel[27] = new ModelRendererTurbo(this, 300, 560, textureX, textureY); // leftleg28
		leftLegModel[28] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // leftleg30
		leftLegModel[29] = new ModelRendererTurbo(this, 300, 600, textureX, textureY); // leftleg31
		leftLegModel[30] = new ModelRendererTurbo(this, 300, 620, textureX, textureY); // leftleg32
		leftLegModel[31] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // leftleg33
		leftLegModel[32] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg34
		leftLegModel[33] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg35
		leftLegModel[34] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg36
		leftLegModel[35] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg37
		leftLegModel[36] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg38
		leftLegModel[37] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // leftleg39

		leftLegModel[0].addBox(-5F, -5F, -1F, 10, 10, 4, 0F); // leftleg1
		leftLegModel[0].setRotationPoint(0F, -51F, 10F);

		leftLegModel[1].addBox(-5F, -5F, 3F, 33, 10, 4, 0F); // leftleg2
		leftLegModel[1].setRotationPoint(0F, -51F, 10F);
		leftLegModel[1].rotateAngleZ = -0.4363323F;

		leftLegModel[2].addBox(-5.1F, -6F, 3.5F, 20, 12, 3, 0F); // leftleg3
		leftLegModel[2].setRotationPoint(0F, -51F, 10F);
		leftLegModel[2].rotateAngleZ = -0.4363323F;

		leftLegModel[3].addBox(-8.2F, -7F, 4F, 35, 14, 2, 0F); // leftleg4
		leftLegModel[3].setRotationPoint(0F, -51F, 10F);
		leftLegModel[3].rotateAngleZ = -0.4363323F;

		leftLegModel[4].addShapeBox(-10.2F, -7F, 4F, 2, 14, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); //Test
		leftLegModel[4].setRotationPoint(0F, -51F, 10F);
		leftLegModel[4].rotateAngleZ = -0.4363323F;

		leftLegModel[5].addBox(-5.3F, -3.5F, 4F, 33, 7, 4, 0F); // leftleg6
		leftLegModel[5].setRotationPoint(0F, -51F, 10F);
		leftLegModel[5].rotateAngleZ = -0.4363323F;

		leftLegModel[6].addShapeBox(27F, 17.5F, 0F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F); //Test
		leftLegModel[6].setRotationPoint(0F, -51F, 10F);

		leftLegModel[7].addBox(27F, 3.5F, 0F, 2, 14, 12, 0F); // leftleg8
		leftLegModel[7].setRotationPoint(0F, -51F, 10F);

		leftLegModel[8].addBox(27F, 21.5F, 3F, 2, 6, 5, 0F); // leftleg9
		leftLegModel[8].setRotationPoint(0F, -51F, 10F);

		leftLegModel[9].addBox(23F, -15.5F, 3F, 5, 6, 5, 0F); // leftleg10
		leftLegModel[9].setRotationPoint(0F, -51F, 10F);
		leftLegModel[9].rotateAngleZ = -1.27409F;

		leftLegModel[10].addBox(20F, 5.5F, 1.5F, 7, 13, 9, 0F); // leftleg11
		leftLegModel[10].setRotationPoint(0F, -51F, 10F);

		leftLegModel[11].addBox(20F, 16.5F, 2.5F, 7, 7, 6, 0F); // leftleg12
		leftLegModel[11].setRotationPoint(0F, -51F, 10F);

		leftLegModel[12].addBox(23.5F, -9.5F, 4F, 3, 6, 3, 0F); // leftleg13
		leftLegModel[12].setRotationPoint(0F, -51F, 10F);
		leftLegModel[12].rotateAngleZ = -1.27409F;

		leftLegModel[13].addBox(23F, -3.5F, 3.5F, 7, 6, 4, 0F); // leftleg14
		leftLegModel[13].setRotationPoint(0F, -51F, 10F);
		leftLegModel[13].rotateAngleZ = -1.27409F;

		leftLegModel[14].addBox(23F, 23.5F, 4.5F, 2, 5, 2, 0F); // leftleg15
		leftLegModel[14].setRotationPoint(0F, -51F, 10F);

		leftLegModel[15].addBox(-2F, 31.5F, 4F, 2, 7, 3, 0F); // leftleg16
		leftLegModel[15].setRotationPoint(0F, -51F, 10F);
		leftLegModel[15].rotateAngleZ = 0.7330383F;

		leftLegModel[16].addBox(7F, 34.5F, 5F, 5, 1, 1, 0F); // leftleg17
		leftLegModel[16].setRotationPoint(0F, -51F, 10F);
		leftLegModel[16].rotateAngleZ = 0.3839724F;

		leftLegModel[17].addBox(-10F, 32.5F, 5F, 4, 1, 1, 0F); // leftleg18
		leftLegModel[17].setRotationPoint(0F, -51F, 10F);
		leftLegModel[17].rotateAngleZ = 0.8531169F;

		leftLegModel[18].addBox(31F, -10.5F, 4.5F, 4, 12, 2, 0F); // leftleg19
		leftLegModel[18].setRotationPoint(0F, -51F, 10F);
		leftLegModel[18].rotateAngleZ = -1.27409F;

		leftLegModel[19].addBox(22F, -1.5F, 2F, 27, 8, 7, 0F); // leftleg20
		leftLegModel[19].setRotationPoint(0F, -51F, 10F);
		leftLegModel[19].rotateAngleZ = -1.361357F;

		leftLegModel[20].addBox(49F, -1F, 2.5F, 13, 7, 6, 0F); // leftleg21
		leftLegModel[20].setRotationPoint(0F, -51F, 10F);
		leftLegModel[20].rotateAngleZ = -1.361357F;

		leftLegModel[21].addBox(1F, 59.5F, 1F, 17, 3, 9, 0F); // leftleg22
		leftLegModel[21].setRotationPoint(0F, -51F, 10F);

		leftLegModel[22].addBox(23F, -5.5F, 3F, 9, 5, 5, 0F); // leftleg23
		leftLegModel[22].setRotationPoint(0F, -51F, 10F);
		leftLegModel[22].rotateAngleZ = -1.710423F;

		leftLegModel[23].addBox(30F, 7.5F, 4.5F, 11, 2, 2, 0F); // leftleg24
		leftLegModel[23].setRotationPoint(0F, -51F, 10F);
		leftLegModel[23].rotateAngleZ = -1.361357F;

		leftLegModel[24].addBox(41F, 8F, 5F, 19, 1, 1, 0F); // leftleg25
		leftLegModel[24].setRotationPoint(0F, -51F, 10F);
		leftLegModel[24].rotateAngleZ = -1.361357F;

		leftLegModel[25].addBox(-1F, 53.5F, 4.5F, 2, 9, 2, 0F); // leftleg26
		leftLegModel[25].setRotationPoint(0F, -51F, 10F);

		leftLegModel[26].addBox(59F, 9F, 1F, 3, 6, 2, 0F); // leftleg27
		leftLegModel[26].setRotationPoint(0F, -51F, 10F);
		leftLegModel[26].rotateAngleY = 0.03490658F;
		leftLegModel[26].rotateAngleZ = -1.099557F;

		leftLegModel[27].addBox(59F, 9F, 7F, 3, 6, 2, 0F); // leftleg28
		leftLegModel[27].setRotationPoint(0F, -51F, 10F);
		leftLegModel[27].rotateAngleY = 0.03490658F;
		leftLegModel[27].rotateAngleZ = -1.099557F;

		leftLegModel[28].addBox(18F, 55.5F, 0F, 3, 7, 3, 0F); // leftleg30
		leftLegModel[28].setRotationPoint(0F, -51F, 10F);

		leftLegModel[29].addBox(18F, 55.5F, 7F, 3, 7, 3, 0F); // leftleg31
		leftLegModel[29].setRotationPoint(0F, -51F, 10F);

		leftLegModel[30].addBox(42F, 6.5F, 3F, 8, 2, 1, 0F); // leftleg32
		leftLegModel[30].setRotationPoint(0F, -51F, 10F);
		leftLegModel[30].rotateAngleZ = -1.361357F;

		leftLegModel[31].addBox(42F, 6.5F, 7F, 8, 2, 1, 0F); // leftleg33
		leftLegModel[31].setRotationPoint(0F, -51F, 10F);
		leftLegModel[31].rotateAngleZ = -1.361357F;

		leftLegModel[32].addBox(43F, 6.5F, 8F, 1, 1, 2, 0F); // leftleg34
		leftLegModel[32].setRotationPoint(0F, -51F, 10F);
		leftLegModel[32].rotateAngleZ = -1.361357F;

		leftLegModel[33].addBox(45F, 6.5F, 8F, 1, 1, 2, 0F); // leftleg35
		leftLegModel[33].setRotationPoint(0F, -51F, 10F);
		leftLegModel[33].rotateAngleZ = -1.361357F;

		leftLegModel[34].addBox(47F, 6.5F, 8F, 1, 1, 2, 0F); // leftleg36
		leftLegModel[34].setRotationPoint(0F, -51F, 10F);
		leftLegModel[34].rotateAngleZ = -1.361357F;

		leftLegModel[35].addBox(43F, 6.5F, 1F, 1, 1, 2, 0F); // leftleg37
		leftLegModel[35].setRotationPoint(0F, -51F, 10F);
		leftLegModel[35].rotateAngleZ = -1.361357F;

		leftLegModel[36].addBox(45F, 6.5F, 1F, 1, 1, 2, 0F); // leftleg38
		leftLegModel[36].setRotationPoint(0F, -51F, 10F);
		leftLegModel[36].rotateAngleZ = -1.361357F;

		leftLegModel[37].addBox(47F, 6.5F, 1F, 1, 1, 2, 0F); // leftleg39
		leftLegModel[37].setRotationPoint(0F, -51F, 10F);
		leftLegModel[37].rotateAngleZ = -1.361357F;

//Rightleg

		rightLegModel = new ModelRendererTurbo[38];
		rightLegModel[0] = new ModelRendererTurbo(this, 300, 0, textureX, textureY); // Rightleg1
		rightLegModel[1] = new ModelRendererTurbo(this, 300, 20, textureX, textureY); // Rightleg2
		rightLegModel[2] = new ModelRendererTurbo(this, 300, 40, textureX, textureY); // Rightleg3
		rightLegModel[3] = new ModelRendererTurbo(this, 300, 60, textureX, textureY); // Rightleg4
		rightLegModel[4] = new ModelRendererTurbo(this, 300, 80, textureX, textureY); // Righteg5
		rightLegModel[5] = new ModelRendererTurbo(this, 300, 100, textureX, textureY); // Rightleg6
		rightLegModel[6] = new ModelRendererTurbo(this, 300, 120, textureX, textureY); // Rightleg7
		rightLegModel[7] = new ModelRendererTurbo(this, 300, 140, textureX, textureY); // Righteg8
		rightLegModel[8] = new ModelRendererTurbo(this, 300, 170, textureX, textureY); // Rightleg9
		rightLegModel[9] = new ModelRendererTurbo(this, 300, 190, textureX, textureY); // Rightleg10
		rightLegModel[10] = new ModelRendererTurbo(this, 300, 210, textureX, textureY); // Rightleg11
		rightLegModel[11] = new ModelRendererTurbo(this, 300, 240, textureX, textureY); // Rightleg12
		rightLegModel[12] = new ModelRendererTurbo(this, 300, 260, textureX, textureY); // Rightleg13
		rightLegModel[13] = new ModelRendererTurbo(this, 300, 280, textureX, textureY); // Rightleg14
		rightLegModel[14] = new ModelRendererTurbo(this, 300, 300, textureX, textureY); // Rightleg15
		rightLegModel[15] = new ModelRendererTurbo(this, 300, 320, textureX, textureY); // Rightleg16
		rightLegModel[16] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // Rightleg17
		rightLegModel[17] = new ModelRendererTurbo(this, 300, 360, textureX, textureY); // Rightleg18
		rightLegModel[18] = new ModelRendererTurbo(this, 300, 380, textureX, textureY); // Rightleg19
		rightLegModel[19] = new ModelRendererTurbo(this, 300, 400, textureX, textureY); // Rightleg20
		rightLegModel[20] = new ModelRendererTurbo(this, 300, 420, textureX, textureY); // Rightleg21
		rightLegModel[21] = new ModelRendererTurbo(this, 300, 440, textureX, textureY); // Rightleg22
		rightLegModel[22] = new ModelRendererTurbo(this, 300, 460, textureX, textureY); // Rightleg23
		rightLegModel[23] = new ModelRendererTurbo(this, 300, 480, textureX, textureY); // Rightleg24
		rightLegModel[24] = new ModelRendererTurbo(this, 300, 500, textureX, textureY); // Righteg25
		rightLegModel[25] = new ModelRendererTurbo(this, 300, 520, textureX, textureY); // Rightleg26
		rightLegModel[26] = new ModelRendererTurbo(this, 300, 540, textureX, textureY); // Rightleg27
		rightLegModel[27] = new ModelRendererTurbo(this, 300, 560, textureX, textureY); // Rightleg28
		rightLegModel[28] = new ModelRendererTurbo(this, 300, 580, textureX, textureY); // Righteg30
		rightLegModel[29] = new ModelRendererTurbo(this, 300, 600, textureX, textureY); // Rightleg31
		rightLegModel[30] = new ModelRendererTurbo(this, 300, 620, textureX, textureY); // Rightleg32
		rightLegModel[31] = new ModelRendererTurbo(this, 300, 640, textureX, textureY); // Rightleg33
		rightLegModel[32] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg34
		rightLegModel[33] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg35
		rightLegModel[34] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg36
		rightLegModel[35] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg37
		rightLegModel[36] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg38
		rightLegModel[37] = new ModelRendererTurbo(this, 300, 660, textureX, textureY); // Rightleg39
		rightLegModel[0].addBox(-5F, -5F, -3F, 10, 10, 4, 0F); // Rightleg1
		rightLegModel[0].setRotationPoint(0F, -51F, -10F);

		rightLegModel[1].addBox(-5F, -5F, -7F, 33, 10, 4, 0F); // Rightleg2
		rightLegModel[1].setRotationPoint(0F, -51F, -10F);
		rightLegModel[1].rotateAngleZ = -0.4363323F;

		rightLegModel[2].addBox(-5.1F, -6F, -6.5F, 20, 12, 3, 0F); // Rightleg3
		rightLegModel[2].setRotationPoint(0F, -51F, -10F);
		rightLegModel[2].rotateAngleZ = -0.4363323F;

		rightLegModel[3].addBox(-8.2F, -7F, -6F, 35, 14, 2, 0F); // Rightleg4
		rightLegModel[3].setRotationPoint(0F, -51F, -10F);
		rightLegModel[3].rotateAngleZ = -0.4363323F;

		rightLegModel[4].addShapeBox(-10.2F, -7F, -6F, 2, 14, 2, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); //Test
		rightLegModel[4].setRotationPoint(0F, -51F, -10F);
		rightLegModel[4].rotateAngleZ = -0.4363323F;

		rightLegModel[5].addBox(-5.3F, -3.5F, -8F, 33, 7, 4, 0F); // Rightleg6
		rightLegModel[5].setRotationPoint(0F, -51F, -10F);
		rightLegModel[5].rotateAngleZ = -0.4363323F;

		rightLegModel[6].addShapeBox(27F, 17.5F, -12F, 2, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		rightLegModel[6].setRotationPoint(0F, -51F, -10F);

		rightLegModel[7].addBox(27F, 3.5F, -12F, 2, 14, 12, 0F); // Righteg8
		rightLegModel[7].setRotationPoint(0F, -51F, -10F);

		rightLegModel[8].addBox(27F, 21.5F, -8F, 2, 6, 5, 0F); // Rightleg9
		rightLegModel[8].setRotationPoint(0F, -51F, -10F);

		rightLegModel[9].addBox(23F, -15.5F, -8F, 5, 6, 5, 0F); // Rightleg10
		rightLegModel[9].setRotationPoint(0F, -51F, -10F);
		rightLegModel[9].rotateAngleZ = -1.27409F;

		rightLegModel[10].addBox(20F, 5.5F, -10.5F, 7, 13, 9, 0F); // Rightleg11
		rightLegModel[10].setRotationPoint(0F, -51F, -10F);

		rightLegModel[11].addBox(20F, 16.5F, -8.5F, 7, 7, 6, 0F); // Rightleg12
		rightLegModel[11].setRotationPoint(0F, -51F, -10F);

		rightLegModel[12].addBox(23.5F, -9.5F, -7F, 3, 6, 3, 0F); // Rightleg13
		rightLegModel[12].setRotationPoint(0F, -51F, -10F);
		rightLegModel[12].rotateAngleZ = -1.27409F;

		rightLegModel[13].addBox(23F, -3.5F, -8.5F, 7, 6, 4, 0F); // Rightleg14
		rightLegModel[13].setRotationPoint(0F, -51F, -10F);
		rightLegModel[13].rotateAngleZ = -1.27409F;

		rightLegModel[14].addBox(23F, 23.5F, -6.5F, 2, 5, 2, 0F); // Rightleg15
		rightLegModel[14].setRotationPoint(0F, -51F, -10F);

		rightLegModel[15].addBox(-2F, 31.5F, -7F, 2, 7, 3, 0F); // Rightleg16
		rightLegModel[15].setRotationPoint(0F, -51F, -10F);
		rightLegModel[15].rotateAngleZ = 0.7330383F;

		rightLegModel[16].addBox(7F, 34.5F, -6F, 5, 1, 1, 0F); // Rightleg17
		rightLegModel[16].setRotationPoint(0F, -51F, -10F);
		rightLegModel[16].rotateAngleZ = 0.3839724F;

		rightLegModel[17].addBox(-10F, 32.5F, -6F, 4, 1, 1, 0F); // Rightleg18
		rightLegModel[17].setRotationPoint(0F, -51F, -10F);
		rightLegModel[17].rotateAngleZ = 0.8531169F;

		rightLegModel[18].addBox(31F, -10.5F, -6.5F, 4, 12, 2, 0F); // Rightleg19
		rightLegModel[18].setRotationPoint(0F, -51F, -10F);
		rightLegModel[18].rotateAngleZ = -1.27409F;

		rightLegModel[19].addBox(22F, -1.5F, -9F, 27, 8, 7, 0F); // Rightleg20
		rightLegModel[19].setRotationPoint(0F, -51F, -10F);
		rightLegModel[19].rotateAngleZ = -1.361357F;

		rightLegModel[20].addBox(49F, -1F, -8.5F, 13, 7, 6, 0F); // Rightleg21
		rightLegModel[20].setRotationPoint(0F, -51F, -10F);
		rightLegModel[20].rotateAngleZ = -1.361357F;

		rightLegModel[21].addBox(1F, 59.5F, -10F, 17, 3, 9, 0F); // Rightleg22
		rightLegModel[21].setRotationPoint(0F, -51F, -10F);

		rightLegModel[22].addBox(23F, -5.5F, -8F, 9, 5, 5, 0F); // Rightleg23
		rightLegModel[22].setRotationPoint(0F, -51F, -10F);
		rightLegModel[22].rotateAngleZ = -1.710423F;

		rightLegModel[23].addBox(30F, 7.5F, -6.5F, 11, 2, 2, 0F); // Rightleg24
		rightLegModel[23].setRotationPoint(0F, -51F, -10F);
		rightLegModel[23].rotateAngleZ = -1.361357F;

		rightLegModel[24].addBox(41F, 8F, -6F, 19, 1, 1, 0F); // Righteg25
		rightLegModel[24].setRotationPoint(0F, -51F, -10F);
		rightLegModel[24].rotateAngleZ = -1.361357F;

		rightLegModel[25].addBox(-1F, 53.5F, -6.5F, 2, 9, 2, 0F); // Rightleg26
		rightLegModel[25].setRotationPoint(0F, -51F, -10F);

		rightLegModel[26].addBox(59F, 9F, -3.5F, 3, 6, 2, 0F); // Rightleg27
		rightLegModel[26].setRotationPoint(0F, -51F, -10F);
		rightLegModel[26].rotateAngleY = 0.03490658F;
		rightLegModel[26].rotateAngleZ = -1.099557F;

		rightLegModel[27].addBox(59F, 9F, -10F, 3, 6, 2, 0F); // Rightleg28
		rightLegModel[27].setRotationPoint(0F, -51F, -10F);
		rightLegModel[27].rotateAngleY = 0.03490658F;
		rightLegModel[27].rotateAngleZ = -1.099557F;

		rightLegModel[28].addBox(18F, 55.5F, -2.5F, 3, 7, 3, 0F); // Righteg30
		rightLegModel[28].setRotationPoint(0F, -51F, -10F);

		rightLegModel[29].addBox(18F, 55.5F, -10F, 3, 7, 3, 0F); // Rightleg31
		rightLegModel[29].setRotationPoint(0F, -51F, -10F);

		rightLegModel[30].addBox(42F, 6.5F, -4F, 8, 2, 1, 0F); // Rightleg32
		rightLegModel[30].setRotationPoint(0F, -51F, -10F);
		rightLegModel[30].rotateAngleZ = -1.361357F;

		rightLegModel[31].addBox(42F, 6.5F, -8F, 8, 2, 1, 0F); // Rightleg33
		rightLegModel[31].setRotationPoint(0F, -51F, -10F);
		rightLegModel[31].rotateAngleZ = -1.361357F;

		rightLegModel[32].addBox(43F, 6.5F, -10F, 1, 1, 2, 0F); // Rightleg34
		rightLegModel[32].setRotationPoint(0F, -51F, -10F);
		rightLegModel[32].rotateAngleZ = -1.361357F;

		rightLegModel[33].addBox(45F, 6.5F, -10F, 1, 1, 2, 0F); // Rightleg35
		rightLegModel[33].setRotationPoint(0F, -51F, -10F);
		rightLegModel[33].rotateAngleZ = -1.361357F;

		rightLegModel[34].addBox(47F, 6.5F, -10F, 1, 1, 2, 0F); // Rightleg36
		rightLegModel[34].setRotationPoint(0F, -51F, -10F);
		rightLegModel[34].rotateAngleZ = -1.361357F;

		rightLegModel[35].addBox(43F, 6.5F, -3F, 1, 1, 2, 0F); // Rightleg37
		rightLegModel[35].setRotationPoint(0F, -51F, -10F);
		rightLegModel[35].rotateAngleZ = -1.361357F;

		rightLegModel[36].addBox(45F, 6.5F, -3F, 1, 1, 2, 0F); // Rightleg38
		rightLegModel[36].setRotationPoint(0F, -51F, -10F);
		rightLegModel[36].rotateAngleZ = -1.361357F;

		rightLegModel[37].addBox(47F, 6.5F, -3F, 1, 1, 2, 0F); // Rightleg39
		rightLegModel[37].setRotationPoint(0F, -51F, -10F);
		rightLegModel[37].rotateAngleZ = -1.361357F;

		flipAll();

		translateAll (0F, 11F,0F);
	}
}