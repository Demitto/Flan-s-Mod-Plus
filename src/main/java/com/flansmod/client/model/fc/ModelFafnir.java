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

public class ModelFafnir extends ModelMecha
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelFafnir()	
	{


// Body
		bodyModel = new ModelRendererTurbo[83];
		bodyModel[0] = new ModelRendererTurbo(this,  160,  770, textureX, textureY); // Body1
		bodyModel[1] = new ModelRendererTurbo(this,  0,  209, textureX, textureY); // Body2
		bodyModel[2] = new ModelRendererTurbo(this,  79,  38, textureX, textureY); // Body3
		bodyModel[3] = new ModelRendererTurbo(this,  0,  60, textureX, textureY); // Body4
		bodyModel[4] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Body5
		bodyModel[5] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // Body6
		bodyModel[6] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // Body7
		bodyModel[7] = new ModelRendererTurbo(this,  126,  34, textureX, textureY); // Body8
		bodyModel[8] = new ModelRendererTurbo(this,  0,  32, textureX, textureY); // Body9
		bodyModel[9] = new ModelRendererTurbo(this,  0,  26, textureX, textureY); // Body10
		bodyModel[10] = new ModelRendererTurbo(this,  0,  21, textureX, textureY); // Body11
		bodyModel[11] = new ModelRendererTurbo(this,  9,  26, textureX, textureY); // Body12
		bodyModel[12] = new ModelRendererTurbo(this,  29,  29, textureX, textureY); // Body13
		bodyModel[13] = new ModelRendererTurbo(this,  600,  -100, textureX, textureY); // Body14Decal
		bodyModel[14] = new ModelRendererTurbo(this,  600,  108, textureX, textureY); // Body15Decal
		bodyModel[15] = new ModelRendererTurbo(this,  600,  8, textureX, textureY); // Body16Decal
		bodyModel[16] = new ModelRendererTurbo(this,  600,  208, textureX, textureY); // Body17Decal
		bodyModel[17] = new ModelRendererTurbo(this,  600,  308, textureX, textureY); // Body18Decal
		bodyModel[18] = new ModelRendererTurbo(this,  600,  408, textureX, textureY); // Body19Decal
		bodyModel[19] = new ModelRendererTurbo(this,  689,  511, textureX, textureY); // Body20Decal
		bodyModel[20] = new ModelRendererTurbo(this,  86,  14, textureX, textureY); // Body21
		bodyModel[21] = new ModelRendererTurbo(this,  86,  14, textureX, textureY); // Body22
		bodyModel[22] = new ModelRendererTurbo(this,  0,  10, textureX, textureY); // Body23
		bodyModel[23] = new ModelRendererTurbo(this,  0,  10, textureX, textureY); // Body24
		bodyModel[24] = new ModelRendererTurbo(this,  79,  38, textureX, textureY); // Body25
		bodyModel[25] = new ModelRendererTurbo(this,  0,  60, textureX, textureY); // Body26
		bodyModel[26] = new ModelRendererTurbo(this,  0,  84, textureX, textureY); // Body27
		bodyModel[27] = new ModelRendererTurbo(this,  79,  292, textureX, textureY); // Body28
		bodyModel[28] = new ModelRendererTurbo(this,  79,  308, textureX, textureY); // Body29SHAPE
		bodyModel[29] = new ModelRendererTurbo(this,  24,  308, textureX, textureY); // Body30SHAPE
		bodyModel[30] = new ModelRendererTurbo(this,  79,  338, textureX, textureY); // Body31
		bodyModel[31] = new ModelRendererTurbo(this,  110,  343, textureX, textureY); // Body32SHAPE
		bodyModel[32] = new ModelRendererTurbo(this,  79,  378, textureX, textureY); // Body33
		bodyModel[33] = new ModelRendererTurbo(this,  0,  292, textureX, textureY); // Body34
		bodyModel[34] = new ModelRendererTurbo(this,  0,  292, textureX, textureY); // Body35
		bodyModel[35] = new ModelRendererTurbo(this,  79,  292, textureX, textureY); // Body36
		bodyModel[36] = new ModelRendererTurbo(this,  79,  308, textureX, textureY); // Body37SHAPE
		bodyModel[37] = new ModelRendererTurbo(this,  24,  308, textureX, textureY); // Body38SHAPE
		bodyModel[38] = new ModelRendererTurbo(this,  79,  338, textureX, textureY); // Body39
		bodyModel[39] = new ModelRendererTurbo(this,  110,  343, textureX, textureY); // Body40SHAPE
		bodyModel[40] = new ModelRendererTurbo(this,  79,  378, textureX, textureY); // Body41
		bodyModel[41] = new ModelRendererTurbo(this,  0,  292, textureX, textureY); // Body42
		bodyModel[42] = new ModelRendererTurbo(this,  0,  292, textureX, textureY); // Body43
		bodyModel[43] = new ModelRendererTurbo(this,  172,  338, textureX, textureY); // Body44
		bodyModel[44] = new ModelRendererTurbo(this,  79,  384, textureX, textureY); // Body45
		bodyModel[45] = new ModelRendererTurbo(this,  79,  384, textureX, textureY); // Body46
		bodyModel[46] = new ModelRendererTurbo(this,  0,  431, textureX, textureY); // Body47
		bodyModel[47] = new ModelRendererTurbo(this,  0,  431, textureX, textureY); // Body48
		bodyModel[48] = new ModelRendererTurbo(this,  0,  500, textureX, textureY); // Body49
		bodyModel[49] = new ModelRendererTurbo(this,  0,  579, textureX, textureY); // Body50
		bodyModel[50] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body51
		bodyModel[51] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // Body52
		bodyModel[52] = new ModelRendererTurbo(this,  0,  636, textureX, textureY); // Body53
		bodyModel[53] = new ModelRendererTurbo(this,  0,  772, textureX, textureY); // Body54
		bodyModel[54] = new ModelRendererTurbo(this,  99,  584, textureX, textureY); // Body55
		bodyModel[55] = new ModelRendererTurbo(this,  99,  477, textureX, textureY); // Body56
		bodyModel[56] = new ModelRendererTurbo(this,  99,  477, textureX, textureY); // Body57
		bodyModel[57] = new ModelRendererTurbo(this,  99,  448, textureX, textureY); // Body58
		bodyModel[58] = new ModelRendererTurbo(this,  99,  448, textureX, textureY); // Body59
		bodyModel[59] = new ModelRendererTurbo(this,  99,  448, textureX, textureY); // Body60
		bodyModel[60] = new ModelRendererTurbo(this,  99,  448, textureX, textureY); // Body61
		bodyModel[61] = new ModelRendererTurbo(this,  247,  645, textureX, textureY); // Body62
		bodyModel[62] = new ModelRendererTurbo(this,  145,  431, textureX, textureY); // Body63
		bodyModel[63] = new ModelRendererTurbo(this,  145,  431, textureX, textureY); // Body64
		bodyModel[64] = new ModelRendererTurbo(this,  153,  32, textureX, textureY); // Body65
		bodyModel[65] = new ModelRendererTurbo(this,  210,  257, textureX, textureY); // Body66
		bodyModel[66] = new ModelRendererTurbo(this,  210,  257, textureX, textureY); // Body67
		bodyModel[67] = new ModelRendererTurbo(this,  0,  349, textureX, textureY); // Body68
		bodyModel[68] = new ModelRendererTurbo(this,  0,  349, textureX, textureY); // Body69
		bodyModel[69] = new ModelRendererTurbo(this,  0,  349, textureX, textureY); // Body70
		bodyModel[70] = new ModelRendererTurbo(this,  0,  349, textureX, textureY); // Body71
		bodyModel[71] = new ModelRendererTurbo(this,  22,  349, textureX, textureY); // Body72
		bodyModel[72] = new ModelRendererTurbo(this,  22,  349, textureX, textureY); // Body73
		bodyModel[73] = new ModelRendererTurbo(this,  22,  349, textureX, textureY); // Body74
		bodyModel[74] = new ModelRendererTurbo(this,  22,  349, textureX, textureY); // Body75
		bodyModel[75] = new ModelRendererTurbo(this,  13,  338, textureX, textureY); // Body76
		bodyModel[76] = new ModelRendererTurbo(this,  13,  338, textureX, textureY); // Body77
		bodyModel[77] = new ModelRendererTurbo(this,  13,  338, textureX, textureY); // Body78
		bodyModel[78] = new ModelRendererTurbo(this,  13,  338, textureX, textureY); // Body79
		bodyModel[79] = new ModelRendererTurbo(this,  300,  636, textureX, textureY); // Body80
		bodyModel[80] = new ModelRendererTurbo(this,  714,  787, textureX, textureY); // Body81
		bodyModel[81] = new ModelRendererTurbo(this,  830,  345, textureX, textureY); // Body81
		bodyModel[82] = new ModelRendererTurbo(this,  726,  497, textureX, textureY); // Body81


		bodyModel[0].addBox(0F, 0F, 0F, 100, 96, 64, 0F); // Body1
		bodyModel[0].setRotationPoint(-68F, -225F, -32F);

		bodyModel[1].addBox(0F, 0F, 0F, 48, 32, 48, 0F); // Body2
		bodyModel[1].setRotationPoint(32F, -193F, -24F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 25, 16, 0F); // Body3
		bodyModel[2].setRotationPoint(32F, -218F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Body4
		bodyModel[3].setRotationPoint(36F, -197F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 13, 4, 4, 0F); // Body5
		bodyModel[4].setRotationPoint(32F, -207F, -12F);

		bodyModel[5].addBox(0F, 0F, 0F, 13, 4, 4, 0F); // Body6
		bodyModel[5].setRotationPoint(32F, -207F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 22, 12, 0F); // Body7
		bodyModel[6].setRotationPoint(36F, -216F, -6F);

		bodyModel[7].addBox(1F, 5F, 0F, 17, 20, 20, 0F); // Body8
		bodyModel[7].setRotationPoint(64F, -211F, -10F);
		bodyModel[7].rotateAngleZ = -0.5934119F;

		bodyModel[8].addBox(0F, 0F, 0F, 4, 10, 4, 0F); // Body9
		bodyModel[8].setRotationPoint(53F, -203F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Body10
		bodyModel[9].setRotationPoint(53F, -206F, -1F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Body11
		bodyModel[10].setRotationPoint(53F, -208F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Body12
		bodyModel[11].setRotationPoint(53F, -209F, -1F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 4, 3, 0F); // Body13
		bodyModel[12].setRotationPoint(62F, -208F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -92F, 0F, 0F, -92F, 0F, -92F, 0F, 0F, -92F, 0F, 0F, -92F, -92F, 0F, -92F, -92F); //Test
		bodyModel[13].setRotationPoint(70F, -221F, -4F);

		bodyModel[14].addShapeBox(0F, -8F, -8F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -92F, 0F, 0F, -92F, 0F, -92F, 0F, 0F, -92F, 0F, 0F, -92F, -92F, 0F, -92F, -92F); //Test
		bodyModel[14].setRotationPoint(57F, -213F, -8F);
		bodyModel[14].rotateAngleY = -0.7504916F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -92F, 0F, 0F, -92F, 0F, -92F, 0F, 0F, -92F, 0F, 0F, -92F, -92F, 0F, -92F, -92F); //Test
		bodyModel[15].setRotationPoint(57F, -221F, 8F);
		bodyModel[15].rotateAngleY = 0.7504916F;

		bodyModel[16].addShapeBox(0.1F, 5F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -92F, 0F, 0F, -92F, 0F, -92F, 0F, 0F, -92F, 0F, 0F, -92F, -92F, 0F, -92F, -92F); //Test

		bodyModel[16].setRotationPoint(64F, -211F, -10F);
		bodyModel[16].rotateAngleZ = -0.5934119F;

		bodyModel[17].addShapeBox(0.1F, 5F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -92F, 0F, 0F, -92F, 0F, -92F, 0F, 0F, -92F, 0F, 0F, -92F, -92F, 0F, -92F, -92F); //Test

		bodyModel[17].setRotationPoint(64F, -211F, 2F);
		bodyModel[17].rotateAngleZ = -0.5934119F;

		bodyModel[18].addShapeBox(0.1F, 14F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, -94F, 0F, -94F, 0F, 0F, -94F, 0F, 0F, -94F, -94F, 0F, -94F, -94F); //Test
		bodyModel[18].setRotationPoint(64F, -211F, 3F);
		bodyModel[18].rotateAngleZ = -0.5934119F;

		bodyModel[19].addShapeBox(0.1F, 14F, 0F, 0, 100, 100, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -94F, 0F, 0F, -94F, 0F, -94F, 0F, 0F, -94F, 0F, 0F, -94F, -94F, 0F, -94F, -94F); //Test
		bodyModel[19].setRotationPoint(64F, -211F, -9F);
		bodyModel[19].rotateAngleZ = -0.5934119F;

		bodyModel[20].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Body21
		bodyModel[20].setRotationPoint(68F, -199F, -9F);

		bodyModel[21].addBox(0F, 0F, 0F, 8, 8, 8, 0F); // Body22
		bodyModel[21].setRotationPoint(68F, -199F, 1F);

		bodyModel[22].addBox(0F, 0F, 0F, 39, 17, 2, 0F); // Body23
		bodyModel[22].setRotationPoint(32F, -212F, -18F);
		bodyModel[22].rotateAngleZ = -0.5235988F;

		bodyModel[23].addBox(0F, 0F, 0F, 39, 17, 2, 0F); // Body24
		bodyModel[23].setRotationPoint(32F, -212F, 16F);
		bodyModel[23].rotateAngleZ = -0.5235988F;

		bodyModel[24].addBox(0F, 0F, 0F, 4, 25, 16, 0F); // Body25
		bodyModel[24].setRotationPoint(80F, -195F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 12, 4, 16, 0F); // Body26
		bodyModel[25].setRotationPoint(84F, -174F, -8F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 22, 12, 0F); // Body27
		bodyModel[26].setRotationPoint(84F, -193F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 36, 6, 6, 0F); // Body28
		bodyModel[27].setRotationPoint(32F, -225F, -24F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 29, 17, 6, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); //Test
		bodyModel[28].setRotationPoint(68F, -225F, -24F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 21, 6, 0F, 0F, -1F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -14F, 0F); //Test
		bodyModel[29].setRotationPoint(97F, -215F, -24F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 21, 6, 0F); // Body31
		bodyModel[30].setRotationPoint(108F, -194F, -24F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 34, 12, 6, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); //Test
		bodyModel[31].setRotationPoint(80F, -173F, -24F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 26, 6, 0F); // Body33
		bodyModel[32].setRotationPoint(62F, -219F, -24F);

		bodyModel[33].addBox(0F, 0F, 0F, 28, 6, 6, 0F); // Body34
		bodyModel[33].setRotationPoint(80F, -193F, -24F);

		bodyModel[34].addBox(0F, 0F, 0F, 28, 6, 6, 0F); // Body35
		bodyModel[34].setRotationPoint(80F, -179F, -24F);

		bodyModel[35].addBox(0F, 0F, 0F, 36, 6, 6, 0F); // Body36
		bodyModel[35].setRotationPoint(32F, -225F, 18F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 29, 17, 6, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F); //Test
		bodyModel[36].setRotationPoint(68F, -225F, 18F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 21, 6, 0F, 0F, -1F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, 0F, -1F, 0F, 0F, -14F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -14F, 0F); //Test
		bodyModel[37].setRotationPoint(97F, -215F, 18F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 21, 6, 0F); // Body39
		bodyModel[38].setRotationPoint(108F, -194F, 18F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 34, 12, 6, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F); //Test
		bodyModel[39].setRotationPoint(80F, -173F, 18F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 26, 6, 0F); // Body41
		bodyModel[40].setRotationPoint(62F, -219F, 18F);

		bodyModel[41].addBox(0F, 0F, 0F, 28, 6, 6, 0F); // Body42
		bodyModel[41].setRotationPoint(80F, -179F, 18F);

		bodyModel[42].addBox(0F, 0F, 0F, 28, 6, 6, 0F); // Body43
		bodyModel[42].setRotationPoint(80F, -193F, 18F);

		bodyModel[43].addBox(0F, 0F, 0F, 6, 2, 36, 0F); // Body44
		bodyModel[43].setRotationPoint(62F, -225F, -18F);

		bodyModel[44].addBox(0F, 0F, 0F, 6, 6, 36, 0F); // Body45
		bodyModel[44].setRotationPoint(108F, -193F, -18F);

		bodyModel[45].addBox(0F, 0F, 0F, 6, 6, 36, 0F); // Body46
		bodyModel[45].setRotationPoint(108F, -179F, -18F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 32, 32, 8, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[46].setRotationPoint(32F, -193F, -32F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 32, 32, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F); //Test
		bodyModel[47].setRotationPoint(32F, -193F, 24F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 74, 16, 60, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 2F, 16F, 0F, 2F, 16F, 0F, 2F, 10F, 0F, 2F); //Test
		bodyModel[48].setRotationPoint(-58F, -241F, -30F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 37, 40, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 0F, 0F, 0F); //Test
		bodyModel[49].setRotationPoint(-58F, -281F, -4F);

		bodyModel[50].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Body51
		bodyModel[50].setRotationPoint(-47F, -243F, -25F);

		bodyModel[51].addBox(0F, 0F, 0F, 16, 2, 8, 0F); // Body52
		bodyModel[51].setRotationPoint(-47F, -243F, 16F);

		bodyModel[52].addBox(-90F, 0F, 0F, 90, 69, 58, 0F); // Body53
		bodyModel[52].setRotationPoint(-68F, -225F, -29F);
		bodyModel[52].rotateAngleZ = 0.4537856F;

		bodyModel[53].addShapeBox(-106F, 0F, 0F, 16, 69, 58, 0F, 0F, -16F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -16F, 0F, -16F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -16F); //Test
		bodyModel[53].setRotationPoint(-68F, -225F, -29F);
		bodyModel[53].rotateAngleZ = 0.4537856F;

		bodyModel[54].addBox(-1F, 0F, 0F, 36, 16, 32, 0F); // Body55
		bodyModel[54].setRotationPoint(-89F, -225F, -16F);
		bodyModel[54].rotateAngleZ = 0.4537856F;

		bodyModel[55].addBox(-38F, 1F, 1F, 38, 8, 8, 0F); // Body56
		bodyModel[55].setRotationPoint(-89F, -225F, -16F);
		bodyModel[55].rotateAngleZ = 0.4537856F;

		bodyModel[56].addBox(-38F, 1F, 0F, 38, 8, 8, 0F); // Body57
		bodyModel[56].setRotationPoint(-89F, -225F, 7F);
		bodyModel[56].rotateAngleZ = 0.4537856F;

		bodyModel[57].addBox(-10F, 5F, 0F, 4, 4, 16, 0F); // Body58
		bodyModel[57].setRotationPoint(-89F, -225F, -8F);
		bodyModel[57].rotateAngleZ = 0.4537856F;

		bodyModel[58].addBox(-18F, 5F, 0F, 4, 4, 16, 0F); // Body59
		bodyModel[58].setRotationPoint(-89F, -225F, -8F);
		bodyModel[58].rotateAngleZ = 0.4537856F;

		bodyModel[59].addBox(-26F, 5F, 0F, 4, 4, 16, 0F); // Body60
		bodyModel[59].setRotationPoint(-89F, -225F, -8F);
		bodyModel[59].rotateAngleZ = 0.4537856F;

		bodyModel[60].addBox(-34F, 5F, 0F, 4, 4, 16, 0F); // Body61
		bodyModel[60].setRotationPoint(-89F, -225F, -8F);
		bodyModel[60].rotateAngleZ = 0.4537856F;

		bodyModel[61].addBox(-58F, 1F, 1F, 20, 8, 30, 0F); // Body62
		bodyModel[61].setRotationPoint(-89F, -225F, -16F);
		bodyModel[61].rotateAngleZ = 0.4537856F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 20, 20, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F); //Test
		bodyModel[62].setRotationPoint(32F, -161F, 12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 20, 20, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, 0F); //Test
		bodyModel[63].setRotationPoint(32F, -161F, -24F);

		bodyModel[64].addBox(0F, 0F, 0F, 62, 90, 128, 0F); // Body65
		bodyModel[64].setRotationPoint(-49F, -221F, -64F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 60, 128, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F); //Test
		bodyModel[65].setRotationPoint(-67F, -206F, -64F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 18, 60, 128, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F); //Test
		bodyModel[66].setRotationPoint(13F, -206F, -64F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 42, 4, 0F); // Body68
		bodyModel[67].setRotationPoint(31F, -199F, 37F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 42, 4, 0F); // Body69
		bodyModel[68].setRotationPoint(31F, -199F, 57F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 42, 4, 0F); // Body70
		bodyModel[69].setRotationPoint(31F, -199F, -61F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 42, 4, 0F); // Body71
		bodyModel[70].setRotationPoint(31F, -199F, -41F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // Body72
		bodyModel[71].setRotationPoint(31F, -203F, -61F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // Body73
		bodyModel[72].setRotationPoint(31F, -157F, -61F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // Body74
		bodyModel[73].setRotationPoint(31F, -203F, 37F);

		bodyModel[74].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // Body75
		bodyModel[74].setRotationPoint(31F, -157F, 37F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 10, 10, 0F); // Body76
		bodyModel[75].setRotationPoint(31F, -194F, -53F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 10, 10, 0F); // Body77
		bodyModel[76].setRotationPoint(31F, -174F, -53F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 10, 10, 0F); // Body78
		bodyModel[77].setRotationPoint(31F, -174F, 43F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 10, 10, 0F); // Body79
		bodyModel[78].setRotationPoint(31F, -194F, 43F);

		bodyModel[79].addBox(-50F, 23F, 0F, 50, 30, 80, 0F); // Body80
		bodyModel[79].setRotationPoint(-68F, -225F, -40F);
		bodyModel[79].rotateAngleZ = 0.4537856F;

		bodyModel[80].addBox(-50F, 0F, 0F, 50, 20, 40, 0F); // Body81
		bodyModel[80].setRotationPoint(-68F, -154F, -20F);

		bodyModel[81].addShapeBox(-82F, 23F, 10.9F, 100, 100, 1, 0F, 0F, 0F, 0F, -68F, 0F, 0F, -68F, 0F, 0F, 0F, 0F, 0F, 0F, -68F, 0F, -68F, -68F, 0F, -68F, -68F, 0F, 0F, -68F, 0F); //Test
		bodyModel[81].setRotationPoint(-68F, -225F, -40F);
		bodyModel[81].rotateAngleZ = 0.4537856F;

		bodyModel[82].addShapeBox(-82F, 23F, 69F, 100, 100, 1, 0F, 0F, 0F, 0F, -68F, 0F, 0F, -68F, 0F, 0F, 0F, 0F, 0F, 0F, -68F, 0F, -68F, -68F, 0F, -68F, -68F, 0F, 0F, -68F, 0F); //Test
		bodyModel[82].setRotationPoint(-68F, -225F, -40F);
		bodyModel[82].rotateAngleZ = 0.4537856F;




// Hips
		hipsModel = new ModelRendererTurbo[6];
		hipsModel[0] = new ModelRendererTurbo(this,  179,  936, textureX, textureY); // Hips1
		hipsModel[1] = new ModelRendererTurbo(this,  0,  907, textureX, textureY); // Hips2SHAPE
		hipsModel[2] = new ModelRendererTurbo(this,  0,  907, textureX, textureY); // Hips3SHAPE
		hipsModel[3] = new ModelRendererTurbo(this,  248,  525, textureX, textureY); // Hips4
		hipsModel[4] = new ModelRendererTurbo(this,  248,  447, textureX, textureY); // Hips5
		hipsModel[5] = new ModelRendererTurbo(this,  0,  960, textureX, textureY); // Hips6

		hipsModel[0].addBox(0F, 0F, 0F, 64, 32, 32, 0F); // Hips1
		hipsModel[0].setRotationPoint(-50F, -129F, -16F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 32, 32, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F); //Test
		hipsModel[1].setRotationPoint(-34F, -129F, -32F);

		hipsModel[2].addShapeBox(0F, 0F, 0F, 32, 32, 16, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		hipsModel[2].setRotationPoint(-34F, -129F, 16F);

		hipsModel[3].addBox(0F, 0F, 0F, 78, 32, 64, 0F); // Hips4
		hipsModel[3].setRotationPoint(-57F, -89F, -32F);

		hipsModel[4].addShapeBox(0F, 0F, 0F, 64, 8, 64, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); //Test
		hipsModel[4].setRotationPoint(-50F, -97F, -32F);

		hipsModel[5].addShapeBox(0F, 0F, 0F, 32, 16, 32, 0F, 22F, 0F, 15F, 24F, 0F, 15F, 24F, 0F, 15F, 22F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		hipsModel[5].setRotationPoint(-35F, -57F, -16F);

		leftLegModel = new ModelRendererTurbo[17];
		leftLegModel[0] = new ModelRendererTurbo(this, 377, 940, textureX, textureY); // LeftLeg1
		leftLegModel[1] = new ModelRendererTurbo(this, 552, 750, textureX, textureY); // LeftLeg2
		leftLegModel[2] = new ModelRendererTurbo(this, 861, 858, textureX, textureY); // LeftLeg4SHAPE
		leftLegModel[3] = new ModelRendererTurbo(this, 575, 869, textureX, textureY); // LeftLeg5
		leftLegModel[4] = new ModelRendererTurbo(this, 700, 960, textureX, textureY); // LeftLeg6
		leftLegModel[5] = new ModelRendererTurbo(this, 700, 960, textureX, textureY); // LeftLeg7
		leftLegModel[6] = new ModelRendererTurbo(this, 700, 959, textureX, textureY); // LeftLeg8
		leftLegModel[7] = new ModelRendererTurbo(this, 700, 959, textureX, textureY); // LeftLeg9
		leftLegModel[8] = new ModelRendererTurbo(this, 805, 959, textureX, textureY); // LeftLeg10
		leftLegModel[9] = new ModelRendererTurbo(this, 888, 959, textureX, textureY); // LeftLeg11
		leftLegModel[10] = new ModelRendererTurbo(this, 489, 806, textureX, textureY); // LeftLeg12SHAPE
		leftLegModel[11] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg13
		leftLegModel[12] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg14
		leftLegModel[13] = new ModelRendererTurbo(this, 574, 823, textureX, textureY); // LeftLeg15SHAPE
		leftLegModel[14] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg16
		leftLegModel[15] = new ModelRendererTurbo(this, 915, 1004, textureX, textureY); // LeftLeg17
		leftLegModel[16] = new ModelRendererTurbo(this, 807, 1004, textureX, textureY); // LeftLeg18
		leftLegModel[0].addBox(-8F, -8F, 0F, 98, 40, 32, 0F); // LeftLeg1
		leftLegModel[0].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[0].rotateAngleZ = -0.4363323F;

		leftLegModel[1].addBox(46F, -10F, 6F, 44, 45, 22, 0F); // LeftLeg2
		leftLegModel[1].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[1].rotateAngleZ = -0.8726646F;

		leftLegModel[2].addShapeBox(90F, -8F, 0F, 10, 40, 32, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F); //Test
		leftLegModel[2].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[2].rotateAngleZ = -0.4363323F;

		leftLegModel[3].addBox(43F, 26F, 1F, 100, 32, 32, 0F); // LeftLeg5
		leftLegModel[3].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[3].rotateAngleZ = -0.9599311F;

		leftLegModel[4].addShapeBox(43F, 127F, 1.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); //Test
		leftLegModel[4].setRotationPoint(-41F, -76F, 32F);

		leftLegModel[5].addShapeBox(63F, 127F, 1.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F); //Test
		leftLegModel[5].setRotationPoint(-41F, -76F, 32F);

		leftLegModel[6].addShapeBox(23F, 127F, 1.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F); //Test
		leftLegModel[6].setRotationPoint(-41F, -76F, 32F);

		leftLegModel[7].addShapeBox(-19F, 127F, 1.5F, 20, 24, 31, 0F, -2F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 8, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); //Test
		leftLegModel[7].setRotationPoint(-41F, -76F, 32F);

		leftLegModel[8].addBox(0F, 84F, 7F, 20, 27, 20, 0F); // LeftLeg10
		leftLegModel[8].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[8].rotateAngleZ = -0.1396263F;

		leftLegModel[9].addBox(2F, 111F, 9F, 16, 17, 16, 0F); // LeftLeg11
		leftLegModel[9].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[9].rotateAngleZ = -0.1396263F;

		leftLegModel[10].addShapeBox(-18F, -16F, 0F, 10, 48, 32, 0F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F); //Test
		leftLegModel[10].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[10].rotateAngleZ = -0.4363323F;

		leftLegModel[11].addBox(27F, -5F, 32F, 60, 8, 2, 0F); // LeftLeg13
		leftLegModel[11].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[11].rotateAngleZ = -0.4363323F;

		leftLegModel[12].addBox(27F, 14F, 32F, 60, 8, 2, 0F); // LeftLeg14
		leftLegModel[12].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[12].rotateAngleZ = -0.4363323F;

		leftLegModel[13].addShapeBox(-8F, -16F, 0F, 45, 8, 32, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		leftLegModel[13].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[13].rotateAngleZ = -0.4363323F;

		leftLegModel[14].addBox(15F, -5F, 32F, 12, 27, 2, 0F); // LeftLeg16
		leftLegModel[14].setRotationPoint(-41F, -76F, 32F);
		leftLegModel[14].rotateAngleZ = -0.4363323F;

		leftLegModel[15].addBox(73F, 22F, 1F, 39, 4, 16, 0F); // LeftLeg17
		leftLegModel[15].setRotationPoint(-41F, -76F, 40F);
		leftLegModel[15].rotateAngleZ = -0.9599311F;

		leftLegModel[16].addBox(112F, 24F, 1F, 39, 2, 8, 0F); // LeftLeg18
		leftLegModel[16].setRotationPoint(-41F, -76F, 44F);
		leftLegModel[16].rotateAngleZ = -0.9599311F;

		rightLegModel = new ModelRendererTurbo[17];
		rightLegModel[0] = new ModelRendererTurbo(this, 377, 940, textureX, textureY); // LeftLeg1
		rightLegModel[1] = new ModelRendererTurbo(this, 552, 750, textureX, textureY); // LeftLeg2
		rightLegModel[2] = new ModelRendererTurbo(this, 861, 858, textureX, textureY); // LeftLeg4SHAPE
		rightLegModel[3] = new ModelRendererTurbo(this, 575, 869, textureX, textureY); // LeftLeg5
		rightLegModel[4] = new ModelRendererTurbo(this, 700, 960, textureX, textureY); // LeftLeg6
		rightLegModel[5] = new ModelRendererTurbo(this, 700, 960, textureX, textureY); // LeftLeg7
		rightLegModel[6] = new ModelRendererTurbo(this, 700, 959, textureX, textureY); // LeftLeg8
		rightLegModel[7] = new ModelRendererTurbo(this, 700, 959, textureX, textureY); // LeftLeg9
		rightLegModel[8] = new ModelRendererTurbo(this, 805, 959, textureX, textureY); // LeftLeg10
		rightLegModel[9] = new ModelRendererTurbo(this, 888, 959, textureX, textureY); // LeftLeg11
		rightLegModel[10] = new ModelRendererTurbo(this, 489, 806, textureX, textureY); // LeftLeg12SHAPE
		rightLegModel[11] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg13
		rightLegModel[12] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg14
		rightLegModel[13] = new ModelRendererTurbo(this, 574, 823, textureX, textureY); // LeftLeg15SHAPE
		rightLegModel[14] = new ModelRendererTurbo(this, 650, 940, textureX, textureY); // LeftLeg16
		rightLegModel[15] = new ModelRendererTurbo(this, 915, 1004, textureX, textureY); // LeftLeg17
		rightLegModel[16] = new ModelRendererTurbo(this, 807, 1004, textureX, textureY); // LeftLeg18
		rightLegModel[0].addBox(-8F, -8F, -32F, 98, 40, 32, 0F); // RightLeg1
		rightLegModel[0].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[0].rotateAngleZ = -0.4363323F;

		rightLegModel[1].addBox(46F, -10F, -28F, 44, 45, 22, 0F); // RightLeg2
		rightLegModel[1].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[1].rotateAngleZ = -0.8726646F;

		rightLegModel[2].addShapeBox(90F, -8F, -32F, 10, 40, 32, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F); //Test
		rightLegModel[2].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[2].rotateAngleZ = -0.4363323F;

		rightLegModel[3].addBox(43F, 26F, -33F, 100, 32, 32, 0F); // RightLeg5
		rightLegModel[3].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[3].rotateAngleZ = -0.9599311F;

		rightLegModel[4].addShapeBox(43F, 127F, -32.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); //Test
		rightLegModel[4].setRotationPoint(-41F, -76F, -32F);

		rightLegModel[5].addShapeBox(63F, 127F, -32.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, -10F, -8F, 0F, -10F, -8F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F); //Test
		rightLegModel[5].setRotationPoint(-41F, -76F, -32F);

		rightLegModel[6].addShapeBox(23F, 127F, -32.5F, 20, 24, 31, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F); //Test
		rightLegModel[6].setRotationPoint(-41F, -76F, -32F);

		rightLegModel[7].addShapeBox(-19F, 127F, -32.5F, 20, 24, 31, 0F, -2F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -7F, -2F, 0F, -7F, 0F, 0F, 8, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); //Test
		rightLegModel[7].setRotationPoint(-41F, -76F, -32F);

		rightLegModel[8].addBox(0F, 84F, -27F, 20, 27, 20, 0F); // RightLeg10
		rightLegModel[8].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[8].rotateAngleZ = -0.1396263F;

		rightLegModel[9].addBox(2F, 111F, -25F, 16, 17, 16, 0F); // RightLeg11
		rightLegModel[9].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[9].rotateAngleZ = -0.1396263F;

		rightLegModel[10].addShapeBox(-18F, -16F, -32F, 10, 48, 32, 0F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -8F); //Test
		rightLegModel[10].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[10].rotateAngleZ = -0.4363323F;

		rightLegModel[11].addBox(27F, -5F, -34F, 60, 8, 2, 0F); // RightLeg13
		rightLegModel[11].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[11].rotateAngleZ = -0.4363323F;

		rightLegModel[12].addBox(27F, 14F, -34F, 60, 8, 2, 0F); // RightLeg14
		rightLegModel[12].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[12].rotateAngleZ = -0.4363323F;

		rightLegModel[13].addShapeBox(-8F, -16F, -32F, 45, 8, 32, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		rightLegModel[13].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[13].rotateAngleZ = -0.4363323F;

		rightLegModel[14].addBox(15F, -5F, -34F, 12, 27, 2, 0F); // RightLeg16
		rightLegModel[14].setRotationPoint(-41F, -76F, -32F);
		rightLegModel[14].rotateAngleZ = -0.4363323F;

		rightLegModel[15].addBox(73F, 22F, -17F, 39, 4, 16, 0F); // RightLeg17
		rightLegModel[15].setRotationPoint(-41F, -76F, -40F);
		rightLegModel[15].rotateAngleZ = -0.9599311F;

		rightLegModel[16].addBox(112F, 24F, -9F, 39, 2, 8, 0F); // RightLeg18
		rightLegModel[16].setRotationPoint(-41F, -76F, -44F);
		rightLegModel[16].rotateAngleZ = -0.9599311F;



// Left Arm
		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // Arm1
		leftArmModel[1] = new ModelRendererTurbo(this,  44,  113, textureX, textureY); // Arm2
		leftArmModel[2] = new ModelRendererTurbo(this,  44,  113, textureX, textureY); // Arm3
		leftArmModel[3] = new ModelRendererTurbo(this,  44,  82, textureX, textureY); // Arm4
		leftArmModel[4] = new ModelRendererTurbo(this,  44,  82, textureX, textureY); // Arm5

		leftArmModel[0].addBox(-24F, -16F, -12F, 2, 32, 24, 0F); // Arm1
		leftArmModel[0].setRotationPoint(-18F, 75F, 0F);
		leftArmModel[0].rotateAngleZ = -1.570796F;

		leftArmModel[1].addBox(-24F, -16F, -14F, 48, 32, 2, 0F); // Arm2
		leftArmModel[1].setRotationPoint(-18F, 75F, 0F);
		leftArmModel[1].rotateAngleZ = -1.570796F;

		leftArmModel[2].addBox(-24F, -16F, 12F, 48, 32, 2, 0F); // Arm3
		leftArmModel[2].setRotationPoint(-18F, 75F, 0F);
		leftArmModel[2].rotateAngleZ = -1.570796F;

		leftArmModel[3].addBox(-24F, -18F, -14F, 48, 2, 28, 0F); // Arm4
		leftArmModel[3].setRotationPoint(-18F, 75F, 0F);
		leftArmModel[3].rotateAngleZ = -1.570796F;

		leftArmModel[4].addBox(-24F, 15F, -14F, 48, 2, 28, 0F); // Arm5
		leftArmModel[4].setRotationPoint(-18F, 75F, 0F);
		leftArmModel[4].rotateAngleZ = -1.570796F;



// Right Arm
		rightArmModel = new ModelRendererTurbo[5];
		rightArmModel[0] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // Arm1
		rightArmModel[1] = new ModelRendererTurbo(this,  44,  113, textureX, textureY); // Arm2
		rightArmModel[2] = new ModelRendererTurbo(this,  44,  113, textureX, textureY); // Arm3
		rightArmModel[3] = new ModelRendererTurbo(this,  44,  82, textureX, textureY); // Arm4
		rightArmModel[4] = new ModelRendererTurbo(this,  44,  82, textureX, textureY); // Arm5

		rightArmModel[0].addBox(-24F, -16F, -12F, 2, 32, 24, 0F); // Arm1
		rightArmModel[0].setRotationPoint(-18F, 75F, 0F);
		rightArmModel[0].rotateAngleZ = -1.570796F;

		rightArmModel[1].addBox(-24F, -16F, -14F, 48, 32, 2, 0F); // Arm2
		rightArmModel[1].setRotationPoint(-18F, 75F, 0F);
		rightArmModel[1].rotateAngleZ = -1.570796F;

		rightArmModel[2].addBox(-24F, -16F, 12F, 48, 32, 2, 0F); // Arm3
		rightArmModel[2].setRotationPoint(-18F, 75F, 0F);
		rightArmModel[2].rotateAngleZ = -1.570796F;

		rightArmModel[3].addBox(-24F, -18F, -14F, 48, 2, 28, 0F); // Arm4
		rightArmModel[3].setRotationPoint(-18F, 75F, 0F);
		rightArmModel[3].rotateAngleZ = -1.570796F;

		rightArmModel[4].addBox(-24F, 15F, -14F, 48, 2, 28, 0F); // Arm5
		rightArmModel[4].setRotationPoint(-18F, 75F, 0F);
		rightArmModel[4].rotateAngleZ = -1.570796F;
		flipAll();

		translateAll (18F, 75F,0F);
	}
}