//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.1
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.bmp;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelTSR2 extends ModelPlane
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelTSR2()
	{
		bodyModel = new ModelRendererTurbo[54];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 84, textureX, textureY); // Import ImportImportCore1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import ImportImportCore2
		bodyModel[2] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Import ImportImportCore3
		bodyModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import ImportImportCore4
		bodyModel[4] = new ModelRendererTurbo(this, 0, 214, textureX, textureY); // Import ImportImportCore5
		bodyModel[5] = new ModelRendererTurbo(this, 0, 265, textureX, textureY); // Import ImportImportCore
		bodyModel[6] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import ImportImportCore
		bodyModel[7] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import ImportImportCore
		bodyModel[8] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import ImportImportCore
		bodyModel[9] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import ImportImportCore
		bodyModel[10] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import ImportImportCore
		bodyModel[11] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import ImportImportCore
		bodyModel[12] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import ImportImportCore
		bodyModel[13] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import ImportImportCore
		bodyModel[14] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Import ImportImportCore
		bodyModel[15] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import ImportImportCore
		bodyModel[16] = new ModelRendererTurbo(this, 0, 465, textureX, textureY); // Import ImportImportCore
		bodyModel[17] = new ModelRendererTurbo(this, 2, 520, textureX, textureY); // Import ImportImportCore
		bodyModel[18] = new ModelRendererTurbo(this, 0, 525, textureX, textureY); // Import ImportImportCore
		bodyModel[19] = new ModelRendererTurbo(this, 0, 560, textureX, textureY); // Import ImportImportCore
		bodyModel[20] = new ModelRendererTurbo(this, 0, 595, textureX, textureY); // Import ImportImportCore
		bodyModel[21] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Import ImportImportCore
		bodyModel[22] = new ModelRendererTurbo(this, 0, 615, textureX, textureY); // Import ImportImportCore
		bodyModel[23] = new ModelRendererTurbo(this, 0, 637, textureX, textureY); // Import ImportImportCore
		bodyModel[24] = new ModelRendererTurbo(this, 0, 637, textureX, textureY); // Import ImportImportCore
		bodyModel[25] = new ModelRendererTurbo(this, 0, 657, textureX, textureY); // Import ImportImportCore
		bodyModel[26] = new ModelRendererTurbo(this, 0, 675, textureX, textureY); // Import ImportImportCore
		bodyModel[27] = new ModelRendererTurbo(this, 0, 690, textureX, textureY); // Import ImportImportCore
		bodyModel[28] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import ImportImportCore
		bodyModel[29] = new ModelRendererTurbo(this, 0, 725, textureX, textureY); // Import ImportImportCore
		bodyModel[30] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Import ImportImportCore
		bodyModel[31] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Import ImportImportCore
		bodyModel[32] = new ModelRendererTurbo(this, 0, 790, textureX, textureY); // Import ImportImportCore
		bodyModel[33] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import ImportImportCore
		bodyModel[34] = new ModelRendererTurbo(this, 0, 815, textureX, textureY); // Import ImportImportCore
		bodyModel[35] = new ModelRendererTurbo(this, 0, 845, textureX, textureY); // Import ImportImportCore
		bodyModel[36] = new ModelRendererTurbo(this, 2, 520, textureX, textureY); // Import ImportImportCore
		bodyModel[37] = new ModelRendererTurbo(this, 0, 805, textureX, textureY); // Import ImportImportCore
		bodyModel[38] = new ModelRendererTurbo(this, 0, 916, textureX, textureY); // Import ImportImportCore
		bodyModel[39] = new ModelRendererTurbo(this, 0, 970, textureX, textureY); // Import ImportImportCore
		bodyModel[40] = new ModelRendererTurbo(this, 0, 980, textureX, textureY); // Import ImportImportCore
		bodyModel[41] = new ModelRendererTurbo(this, 0, 995, textureX, textureY); // Import ImportBox0
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1030, textureX, textureY); // Import Box26
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1107, textureX, textureY); // Import Box27
		bodyModel[44] = new ModelRendererTurbo(this, 0, 365, textureX, textureY); // Import Box39
		bodyModel[45] = new ModelRendererTurbo(this, 0, 707, textureX, textureY); // Import Box40
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Import Box0
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1060, textureX, textureY); // Import Box1
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1107, textureX, textureY); // Import Box2
		bodyModel[49] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box133
		bodyModel[50] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Import Box137
		bodyModel[51] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box138
		bodyModel[52] = new ModelRendererTurbo(this, 0, 195, textureX, textureY); // Import Box139
		bodyModel[53] = new ModelRendererTurbo(this, 0, 900, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 96, 31, 20, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportCore1
		bodyModel[0].setRotationPoint(-113F, -55F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F, 0F, -8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -9F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F); // Import ImportImportCore2
		bodyModel[1].setRotationPoint(-40F, -49F, -15F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 16, 37, 10, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import ImportImportCore3
		bodyModel[2].setRotationPoint(-23F, -59F, -20F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -5F); // Import ImportImportCore4
		bodyModel[3].setRotationPoint(-40F, -49F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 16, 37, 10, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import ImportImportCore5
		bodyModel[4].setRotationPoint(-23F, -59F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 43, 35, 20, 0F); // Import ImportImportCore
		bodyModel[5].setRotationPoint(79F, -57F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 25, 10, 20, 0F); // Import ImportImportCore
		bodyModel[6].setRotationPoint(-138F, -34F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportCore
		bodyModel[7].setRotationPoint(-172F, -48F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import ImportImportCore
		bodyModel[8].setRotationPoint(-160F, -36F, -0.5F);
		bodyModel[8].rotateAngleZ = 0.78539816F;

		bodyModel[9].addBox(0F, 0F, 0F, 34, 7, 20, 0F); // Import ImportImportCore
		bodyModel[9].setRotationPoint(-172F, -31F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 20, 4, 10, 0F); // Import ImportImportCore
		bodyModel[10].setRotationPoint(-117F, -34F, -5F);
		bodyModel[10].rotateAngleZ = 1.48352986F;

		bodyModel[11].addBox(0F, 0F, 0F, 20, 4, 10, 0F); // Import ImportImportCore
		bodyModel[11].setRotationPoint(-142F, -31F, -5F);
		bodyModel[11].rotateAngleZ = 1.48352986F;

		bodyModel[12].addBox(0F, 0F, 0F, 17, 10, 2, 0F); // Import ImportImportCore
		bodyModel[12].setRotationPoint(-132F, -44F, 5F);

		bodyModel[13].addBox(0F, 0F, 0F, 17, 10, 2, 0F); // Import ImportImportCore
		bodyModel[13].setRotationPoint(-157F, -41F, 5F);

		bodyModel[14].addBox(0F, 0F, 0F, 17, 2, 10, 0F); // Import ImportImportCore
		bodyModel[14].setRotationPoint(-157F, -33F, -5F);

		bodyModel[15].addBox(0F, 0F, 0F, 17, 10, 2, 0F); // Import ImportImportCore
		bodyModel[15].setRotationPoint(-157F, -41F, -7F);

		bodyModel[16].addBox(0F, 0F, 0F, 17, 10, 2, 0F); // Import ImportImportCore
		bodyModel[16].setRotationPoint(-132F, -44F, -7F);

		bodyModel[17].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import ImportImportCore
		bodyModel[17].setRotationPoint(-172F, -45F, 2F);
		bodyModel[17].rotateAngleZ = 0.68067841F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 15, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportCore
		bodyModel[18].setRotationPoint(-139F, -46F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 10, 14, 14, 0F); // Import ImportImportCore
		bodyModel[19].setRotationPoint(-172F, -45F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Import ImportImportCore
		bodyModel[20].setRotationPoint(-162F, -36F, -3F);

		bodyModel[21].addBox(0F, 0F, 0F, 34, 14, 3, 0F); // Import ImportImportCore
		bodyModel[21].setRotationPoint(-172F, -45F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 34, 14, 3, 0F); // Import ImportImportCore
		bodyModel[22].setRotationPoint(-172F, -45F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 25, 11, 3, 0F); // Import ImportImportCore
		bodyModel[23].setRotationPoint(-138F, -45F, 7F);

		bodyModel[24].addBox(0F, 0F, 0F, 25, 11, 3, 0F); // Import ImportImportCore
		bodyModel[24].setRotationPoint(-138F, -45F, -10F);

		bodyModel[25].addBox(0F, 0F, 0F, 17, 2, 10, 0F); // Import ImportImportCore
		bodyModel[25].setRotationPoint(-132F, -36F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportCore
		bodyModel[26].setRotationPoint(-127F, -58F, -3F);
		bodyModel[26].rotateAngleZ = 0.01745329F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Import ImportImportCore
		bodyModel[27].setRotationPoint(-143F, -56.5F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 16, 10, 2, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Import ImportImportCore
		bodyModel[28].setRotationPoint(-143F, -56.5F, -7F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 9, 14, 0F); // Import ImportImportCore
		bodyModel[29].setRotationPoint(-138F, -45F, -7F);
		bodyModel[29].rotateAngleZ = 0.31415927F;

		bodyModel[30].addBox(0F, 0F, 0F, 10, 12, 14, 0F); // Import ImportImportCore
		bodyModel[30].setRotationPoint(-172F, -45F, -7F);
		bodyModel[30].rotateAngleZ = 0.2443461F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, -6F, -8F, 0F, 6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 8F, 0F, 6F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportCore
		bodyModel[31].setRotationPoint(-162F, -53F, -9.9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 24, 0, 8, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -4F, 0F, 0F, -4F); // Import ImportImportCore
		bodyModel[32].setRotationPoint(-171.5F, -45F, -2F);
		bodyModel[32].rotateAngleZ = 0.68067841F;

		bodyModel[33].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Import ImportImportCore
		bodyModel[33].setRotationPoint(-127F, -58F, -5F);
		bodyModel[33].rotateAngleZ = 0.01745329F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Import ImportImportCore
		bodyModel[34].setRotationPoint(-139F, -56F, -5F);

		bodyModel[35].addBox(0F, 0F, 0F, 129, 37, 10, 0F); // Import ImportImportCore
		bodyModel[35].setRotationPoint(-7F, -59F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import ImportImportCore
		bodyModel[36].setRotationPoint(-172F, -45F, -3F);
		bodyModel[36].rotateAngleZ = 0.68067841F;

		bodyModel[37].addBox(0F, 0F, 0F, 14, 2, 2, 0F); // Import ImportImportCore
		bodyModel[37].setRotationPoint(-127F, -58F, 3F);
		bodyModel[37].rotateAngleZ = 0.01745329F;

		bodyModel[38].addBox(0F, 0F, 0F, 129, 37, 10, 0F); // Import ImportImportCore
		bodyModel[38].setRotationPoint(-7F, -59F, -20F);

		bodyModel[39].addBox(0F, 0F, 0F, 20, 1, 2, 0F); // Import ImportImportCore
		bodyModel[39].setRotationPoint(-162F, -53F, -1F);
		bodyModel[39].rotateAngleZ = 0.17453293F;

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Import ImportImportCore
		bodyModel[40].setRotationPoint(-162F, -53F, -3F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 96, 4, 20, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import ImportBox0
		bodyModel[41].setRotationPoint(-113F, -59F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 155, 2, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box26
		bodyModel[42].setRotationPoint(-172F, -24F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 37, 4, 0F, 0F, -7F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Import Box27
		bodyModel[43].setRotationPoint(-23F, -59F, -24F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 59, 3, 3, 0F, 0F, -2.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[44].setRotationPoint(-172F, -48F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 16, 10, 2, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Import Box40
		bodyModel[45].setRotationPoint(-143F, -56.5F, 5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 129, 37, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		bodyModel[46].setRotationPoint(-7F, -59F, -24F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 129, 37, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Import Box1
		bodyModel[47].setRotationPoint(-7F, -59F, 20F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 37, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -9F, 0F); // Import Box2
		bodyModel[48].setRotationPoint(-23F, -59F, 20F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 17, 17, 2, 0F, 0F, -8F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -8F, -7F, 0F, -9F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -9F, -7F); // Import Box133
		bodyModel[49].setRotationPoint(-40F, -49F, 15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 17, 15, 1, 0F, 0F, -7F, 7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, -8F, 0F, -8F, 7F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, -8F); // Import Box137
		bodyModel[50].setRotationPoint(-40F, -48F, 17F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 17, 2, 0F, 0F, -8F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -8F, 5F, 0F, -9F, -7F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, 5F); // Import Box138
		bodyModel[51].setRotationPoint(-40F, -49F, -17F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 17, 15, 1, 0F, 0F, -7F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 7F, 0F, -8F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8F, 7F); // Import Box139
		bodyModel[52].setRotationPoint(-40F, -48F, -18F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -8F, 0F, -6F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 8F, 0F, -6F, 8F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-162F, -53F, 2.9F);


		noseModel = new ModelRendererTurbo[7];
		noseModel[0] = new ModelRendererTurbo(this, 0, 1160, textureX, textureY); // Import ImportImportNose1
		noseModel[1] = new ModelRendererTurbo(this, 0, 1170, textureX, textureY); // Import ImportImportNose2
		noseModel[2] = new ModelRendererTurbo(this, 0, 1220, textureX, textureY); // Import ImportImportNose3
		noseModel[3] = new ModelRendererTurbo(this, 0, 1263, textureX, textureY); // Import Box22
		noseModel[4] = new ModelRendererTurbo(this, 0, 1288, textureX, textureY); // Import Box23
		noseModel[5] = new ModelRendererTurbo(this, 0, 1320, textureX, textureY); // Import Box24
		noseModel[6] = new ModelRendererTurbo(this, 0, 1350, textureX, textureY); // Import Box25

		noseModel[0].addTrapezoid(0F, 0F, 0F, 23, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Import ImportImportNose1
		noseModel[0].setRotationPoint(-225F, -30F, -0.5F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 26, 17, 18, 0F, 0F, -12F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -8.5F, 0F, -4F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -8.5F); // Import ImportImportNose2
		noseModel[1].setRotationPoint(-204F, -42F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 6, 19, 20, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Import ImportImportNose3
		noseModel[2].setRotationPoint(-178F, -43F, -10F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 26, 2, 18, 0F, 0F, -13.9F, -8.6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -14F, -8.5F, 0F, 12F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, -8.5F); // Import Box22
		noseModel[3].setRotationPoint(-204F, -44F, -9F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 26, 2, 18, 0F, 0F, 4F, -8.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -8.5F, 0F, -6F, -8.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, -8.5F); // Import Box23
		noseModel[4].setRotationPoint(-204F, -25F, -9F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 20, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Import Box24
		noseModel[5].setRotationPoint(-178F, -45F, -10F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 2, 20, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F); // Import Box25
		noseModel[6].setRotationPoint(-178F, -24F, -10F);


		tailModel = new ModelRendererTurbo[15];
		tailModel[0] = new ModelRendererTurbo(this, 0, 1380, textureX, textureY); // Import ImportImportTail1
		tailModel[1] = new ModelRendererTurbo(this, 0, 1465, textureX, textureY); // Import ImportImportTail2
		tailModel[2] = new ModelRendererTurbo(this, 0, 1527, textureX, textureY); // Import ImportImportTail3
		tailModel[3] = new ModelRendererTurbo(this, 0, 1527, textureX, textureY); // Import ImportImportTail4
		tailModel[4] = new ModelRendererTurbo(this, 0, 1575, textureX, textureY); // Import ImportImportTail5
		tailModel[5] = new ModelRendererTurbo(this, 0, 1608, textureX, textureY); // Import ImportImportTail6
		tailModel[6] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import Box3
		tailModel[7] = new ModelRendererTurbo(this, 0, 1620, textureX, textureY); // Import Box4
		tailModel[8] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Import Box5
		tailModel[9] = new ModelRendererTurbo(this, 0, 1707, textureX, textureY); // Import Box6
		tailModel[10] = new ModelRendererTurbo(this, 0, 1667, textureX, textureY); // Import Box7
		tailModel[11] = new ModelRendererTurbo(this, 0, 1707, textureX, textureY); // Import Box8
		tailModel[12] = new ModelRendererTurbo(this, 0, 1746, textureX, textureY); // Import Box13
		tailModel[13] = new ModelRendererTurbo(this, 0, 1812, textureX, textureY); // Import Box14
		tailModel[14] = new ModelRendererTurbo(this, 80, 1535, textureX, textureY); // Box 256

		tailModel[0].addShapeBox(0F, 0F, 0F, 65, 37, 40, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -7F, -2F, 0F, 0F, 0F); // Import ImportImportTail1
		tailModel[0].setRotationPoint(122F, -59F, -20F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 89, 52, 2, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportTail2
		tailModel[1].setRotationPoint(113F, -109F, -1F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 16, 28, 12, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F); // Import ImportImportTail3
		tailModel[2].setRotationPoint(187F, -57F, -18F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 16, 28, 12, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, 0F, 0F); // Import ImportImportTail4
		tailModel[3].setRotationPoint(187F, -57F, 6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 17, 24, 4, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 3F); // Import ImportImportTail5
		tailModel[4].setRotationPoint(186F, -53F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 20, 4, 4, 0F, 0F, 0F, 3F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Import ImportImportTail6
		tailModel[5].setRotationPoint(187F, -57F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 65, 37, 4, 0F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -11F, -2F, 0F, -7F, 2F, 0F, 0F, 0F); // Import Box3
		tailModel[6].setRotationPoint(122F, -59F, -24F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 65, 37, 4, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 0F, -11F, -2F, 0F, -4F, 0F); // Import Box4
		tailModel[7].setRotationPoint(122F, -59F, 20F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 16, 28, 4, 0F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, -2F, 0F, -6F, 2F, 0F, 0F, 0F); // Import Box5
		tailModel[8].setRotationPoint(187F, -57F, -22F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 16, 28, 4, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 2F, 0F, -10F, -2F, 0F, -4F, 0F); // Import Box6
		tailModel[9].setRotationPoint(187F, -57F, -6F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 16, 28, 4, 0F, 0F, -4F, 0F, 0F, -6F, -2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, -2F, 0F, -6F, 2F, 0F, 0F, 0F); // Import Box7
		tailModel[10].setRotationPoint(187F, -57F, 2F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 16, 28, 4, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -6F, 2F, 0F, -10F, -2F, 0F, -4F, 0F); // Import Box8
		tailModel[11].setRotationPoint(187F, -57F, 18F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 2, 52, 2, 0F, -80F, 0F, -0.5F, 80F, 0F, 0F, 80F, 0F, 0F, -80F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box13
		tailModel[12].setRotationPoint(111F, -109F, -1F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 5, 52, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, 4F, 0F, 0F); // Import Box14
		tailModel[13].setRotationPoint(202F, -109F, -1F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 12, 8, 2, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 4F, 0.2F, 0F, 4F, 0.2F, 0F, 4F, 0.2F, 0F, 4F, 0.2F); // Box 256
		tailModel[14].setRotationPoint(181F, -82F, -1F);


		bayModel = new ModelRendererTurbo[41];
		bayModel[0] = new ModelRendererTurbo(this, 0, 1871, textureX, textureY); // Box 43
		bayModel[1] = new ModelRendererTurbo(this, 0, 1917, textureX, textureY); // Box 44
		bayModel[2] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 45
		bayModel[3] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 46
		bayModel[4] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 47
		bayModel[5] = new ModelRendererTurbo(this, 0, 1917, textureX, textureY); // Box 48
		bayModel[6] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 49
		bayModel[7] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 50
		bayModel[8] = new ModelRendererTurbo(this, 0, 1917, textureX, textureY); // Box 51
		bayModel[9] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 52
		bayModel[10] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 53
		bayModel[11] = new ModelRendererTurbo(this, 0, 1917, textureX, textureY); // Box 54
		bayModel[12] = new ModelRendererTurbo(this, 0, 1932, textureX, textureY); // Box 55
		bayModel[13] = new ModelRendererTurbo(this, 0, 1945, textureX, textureY); // Box 56
		bayModel[14] = new ModelRendererTurbo(this, 0, 1945, textureX, textureY); // Box 57
		bayModel[15] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 58
		bayModel[16] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 59
		bayModel[17] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 60
		bayModel[18] = new ModelRendererTurbo(this, 0, 1953, textureX, textureY); // Box 61
		bayModel[19] = new ModelRendererTurbo(this, 0, 1970, textureX, textureY); // Box 64
		bayModel[20] = new ModelRendererTurbo(this, 0, 2005, textureX, textureY); // Box 65
		bayModel[21] = new ModelRendererTurbo(this, 0, 2005, textureX, textureY); // Box 66
		bayModel[22] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 67
		bayModel[23] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 68
		bayModel[24] = new ModelRendererTurbo(this, 0, 2020, textureX, textureY); // Box 69
		bayModel[25] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 70
		bayModel[26] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 71
		bayModel[27] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Box 72
		bayModel[28] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 73
		bayModel[29] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 74
		bayModel[30] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 75
		bayModel[31] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 76
		bayModel[32] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 77
		bayModel[33] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 78
		bayModel[34] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 79
		bayModel[35] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 80
		bayModel[36] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 81
		bayModel[37] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 82
		bayModel[38] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Box 83
		bayModel[39] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 84
		bayModel[40] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 85

		bayModel[0].addBox(0F, 0F, 0F, 139, 17, 20, 0F); // Box 43
		bayModel[0].setRotationPoint(-17F, -59F, -10F);

		bayModel[1].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 44
		bayModel[1].setRotationPoint(-10F, -42F, -5F);

		bayModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bayModel[2].setRotationPoint(-10F, -42F, -10F);

		bayModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 46
		bayModel[3].setRotationPoint(-10F, -42F, 5F);

		bayModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 47
		bayModel[4].setRotationPoint(0F, -42F, 5F);

		bayModel[5].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 48
		bayModel[5].setRotationPoint(0F, -42F, -5F);

		bayModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bayModel[6].setRotationPoint(0F, -42F, -10F);

		bayModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 50
		bayModel[7].setRotationPoint(10F, -42F, 5F);

		bayModel[8].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 51
		bayModel[8].setRotationPoint(10F, -42F, -5F);

		bayModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bayModel[9].setRotationPoint(10F, -42F, -10F);

		bayModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 53
		bayModel[10].setRotationPoint(25F, -42F, 5F);

		bayModel[11].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Box 54
		bayModel[11].setRotationPoint(25F, -42F, -5F);

		bayModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bayModel[12].setRotationPoint(25F, -42F, -10F);

		bayModel[13].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 56
		bayModel[13].setRotationPoint(12F, -42F, -5F);

		bayModel[14].addBox(0F, 0F, 0F, 13, 2, 2, 0F); // Box 57
		bayModel[14].setRotationPoint(12F, -42F, 3F);

		bayModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bayModel[15].setRotationPoint(35F, -42F, -10F);

		bayModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 59
		bayModel[16].setRotationPoint(35F, -42F, 0F);

		bayModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 60
		bayModel[17].setRotationPoint(45F, -42F, 0F);

		bayModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bayModel[18].setRotationPoint(45F, -42F, -10F);

		bayModel[19].addBox(0F, 0F, 0F, 29, 12, 20, 0F); // Box 64
		bayModel[19].setRotationPoint(49F, -42F, -10F);

		bayModel[20].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 65
		bayModel[20].setRotationPoint(51F, -30F, -10F);

		bayModel[21].addShapeBox(0F, 0F, 0F, 25, 2, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 66
		bayModel[21].setRotationPoint(51F, -30F, 0F);

		bayModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 67
		bayModel[22].setRotationPoint(49F, -30F, -10F);

		bayModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 68
		bayModel[23].setRotationPoint(76F, -30F, -10F);

		bayModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 69
		bayModel[24].setRotationPoint(61F, -30F, -10F);

		bayModel[25].addBox(0F, 0F, 0F, 25, 8, 8, 0F); // Box 70
		bayModel[25].setRotationPoint(3F, -38F, 1F);

		bayModel[26].addTrapezoid(0F, 0F, 0F, 10, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 71
		bayModel[26].setRotationPoint(-7F, -38F, 1F);

		bayModel[27].addTrapezoid(0F, 0F, 0F, 5, 6, 6, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 72
		bayModel[27].setRotationPoint(-12F, -37F, 2F);

		bayModel[28].addTrapezoid(0F, 0F, 0F, 3, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 73
		bayModel[28].setRotationPoint(-15F, -36F, 3F);

		bayModel[29].addTrapezoid(0F, 0F, 0F, 10, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 74
		bayModel[29].setRotationPoint(28F, -38F, 1F);

		bayModel[30].addTrapezoid(0F, 0F, 0F, 10, 6, 6, 0F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 75
		bayModel[30].setRotationPoint(38F, -37F, 2F);

		bayModel[31].addShapeBox(0F, -0.5F, -4F, 9, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 76
		bayModel[31].setRotationPoint(38F, -34F, 5F);

		bayModel[32].addShapeBox(0F, -0.5F, -4F, 9, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 77
		bayModel[32].setRotationPoint(38F, -34F, 5F);
		bayModel[32].rotateAngleX = 1.57079633F;

		bayModel[33].addShapeBox(0F, -0.5F, -4F, 9, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 78
		bayModel[33].setRotationPoint(38F, -34F, -5F);
		bayModel[33].rotateAngleX = 1.57079633F;

		bayModel[34].addShapeBox(0F, -0.5F, -4F, 9, 1, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 79
		bayModel[34].setRotationPoint(38F, -34F, -5F);

		bayModel[35].addTrapezoid(0F, 0F, 0F, 10, 6, 6, 0F, -2.00F, ModelRendererTurbo.MR_LEFT); // Box 80
		bayModel[35].setRotationPoint(38F, -37F, -8F);

		bayModel[36].addBox(0F, 0F, 0F, 25, 8, 8, 0F); // Box 81
		bayModel[36].setRotationPoint(3F, -38F, -9F);

		bayModel[37].addTrapezoid(0F, 0F, 0F, 10, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_LEFT); // Box 82
		bayModel[37].setRotationPoint(28F, -38F, -9F);

		bayModel[38].addTrapezoid(0F, 0F, 0F, 5, 6, 6, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 83
		bayModel[38].setRotationPoint(-12F, -37F, -8F);

		bayModel[39].addTrapezoid(0F, 0F, 0F, 10, 8, 8, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 84
		bayModel[39].setRotationPoint(-7F, -38F, -9F);

		bayModel[40].addTrapezoid(0F, 0F, 0F, 3, 4, 4, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 85
		bayModel[40].setRotationPoint(-15F, -36F, -7F);


		leftWingModel = new ModelRendererTurbo[43];
		leftWingModel[0] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import ImportImportLeftWing1
		leftWingModel[1] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Import ImportImportLeftWing2
		leftWingModel[2] = new ModelRendererTurbo(this, 200, 385, textureX, textureY); // Import Box29
		leftWingModel[3] = new ModelRendererTurbo(this, 200, 450, textureX, textureY); // Import Box30
		leftWingModel[4] = new ModelRendererTurbo(this, 200, 477, textureX, textureY); // Import Box31
		leftWingModel[5] = new ModelRendererTurbo(this, 200, 540, textureX, textureY); // Import Box32
		leftWingModel[6] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 44
		leftWingModel[7] = new ModelRendererTurbo(this, 200, 585, textureX, textureY); // Box 45
		leftWingModel[8] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 46
		leftWingModel[9] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 47
		leftWingModel[10] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 48
		leftWingModel[11] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 49
		leftWingModel[12] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 50
		leftWingModel[13] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 51
		leftWingModel[14] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 52
		leftWingModel[15] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 53
		leftWingModel[16] = new ModelRendererTurbo(this, 200, 612, textureX, textureY); // Box 54
		leftWingModel[17] = new ModelRendererTurbo(this, 200, 625, textureX, textureY); // Box 55
		leftWingModel[18] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Box 56
		leftWingModel[19] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Box 57
		leftWingModel[20] = new ModelRendererTurbo(this, 200, 640, textureX, textureY); // Box 58
		leftWingModel[21] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 59
		leftWingModel[22] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 60
		leftWingModel[23] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 61
		leftWingModel[24] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 62
		leftWingModel[25] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 63
		leftWingModel[26] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 64
		leftWingModel[27] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 65
		leftWingModel[28] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 66
		leftWingModel[29] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 67
		leftWingModel[30] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 68
		leftWingModel[31] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 69
		leftWingModel[32] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 70
		leftWingModel[33] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 71
		leftWingModel[34] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 72
		leftWingModel[35] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 73
		leftWingModel[36] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 74
		leftWingModel[37] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 75
		leftWingModel[38] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Box 76
		leftWingModel[39] = new ModelRendererTurbo(this, 200, 705, textureX, textureY); // Box 77
		leftWingModel[40] = new ModelRendererTurbo(this, 200, 718, textureX, textureY); // Box 78
		leftWingModel[41] = new ModelRendererTurbo(this, 200, 718, textureX, textureY); // Box 79
		leftWingModel[42] = new ModelRendererTurbo(this, 200, 640, textureX, textureY); // Box 80

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 122, 3, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -81F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -81F, 0F, 0F); // Import ImportImportLeftWing1
		leftWingModel[0].setRotationPoint(-5F, -59F, 20F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 41, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -22F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -22F, 7F, 0F); // Import ImportImportLeftWing2
		leftWingModel[1].setRotationPoint(76F, -59F, 74F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 54, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		leftWingModel[2].setRotationPoint(117F, -59F, 20F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F); // Import Box30
		leftWingModel[3].setRotationPoint(117F, -59F, 74F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 54, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 81F, 0F, 0F, -81F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 81F, 0F, 0F, -81F, -1F, 0F); // Import Box31
		leftWingModel[4].setRotationPoint(-8F, -59F, 20F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 22F, -8F, 0F, -22F, -8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 22F, 7F, 0F, -22F, 6F, 0F); // Import Box32
		leftWingModel[5].setRotationPoint(73F, -59F, 74F);

		leftWingModel[6].addBox(0F, 0F, 0F, 51, 7, 7, 0F); // Box 44
		leftWingModel[6].setRotationPoint(40F, -50F, 33F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 44, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 45
		leftWingModel[7].setRotationPoint(47F, -56F, 35F);

		leftWingModel[8].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 46
		leftWingModel[8].setRotationPoint(86F, -46.5F, 36.5F);
		leftWingModel[8].rotateAngleX = -2.35619449F;

		leftWingModel[9].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 47
		leftWingModel[9].setRotationPoint(86F, -46.5F, 36.5F);
		leftWingModel[9].rotateAngleX = -0.78539816F;

		leftWingModel[10].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 48
		leftWingModel[10].setRotationPoint(86F, -46.5F, 36.5F);
		leftWingModel[10].rotateAngleX = 0.78539816F;

		leftWingModel[11].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 49
		leftWingModel[11].setRotationPoint(86F, -46.5F, 36.5F);
		leftWingModel[11].rotateAngleX = 2.35619449F;

		leftWingModel[12].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 50
		leftWingModel[12].setRotationPoint(40F, -46.5F, 36.5F);
		leftWingModel[12].rotateAngleX = -2.35619449F;

		leftWingModel[13].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 51
		leftWingModel[13].setRotationPoint(40F, -46.5F, 36.5F);
		leftWingModel[13].rotateAngleX = -0.78539816F;

		leftWingModel[14].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 52
		leftWingModel[14].setRotationPoint(40F, -46.5F, 36.5F);
		leftWingModel[14].rotateAngleX = 2.35619449F;

		leftWingModel[15].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 53
		leftWingModel[15].setRotationPoint(40F, -46.5F, 36.5F);
		leftWingModel[15].rotateAngleX = 0.78539816F;

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 54
		leftWingModel[16].setRotationPoint(69F, -56F, 62F);

		leftWingModel[17].addBox(0F, 0F, 0F, 39, 1, 4, 0F); // Box 55
		leftWingModel[17].setRotationPoint(62F, -50F, 61F);

		leftWingModel[18].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 56
		leftWingModel[18].setRotationPoint(62F, -50F, 65F);

		leftWingModel[19].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 57
		leftWingModel[19].setRotationPoint(62F, -50F, 60F);

		leftWingModel[20].addBox(0F, 0F, 0F, 50, 3, 3, 0F); // Box 58
		leftWingModel[20].setRotationPoint(55F, -50.5F, 66F);

		leftWingModel[21].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 59
		leftWingModel[21].setRotationPoint(91F, -49F, 67.5F);
		leftWingModel[21].rotateAngleX = -0.78539816F;

		leftWingModel[22].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 60
		leftWingModel[22].setRotationPoint(91F, -49F, 67.5F);
		leftWingModel[22].rotateAngleX = -2.35619449F;

		leftWingModel[23].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 61
		leftWingModel[23].setRotationPoint(91F, -49F, 67.5F);
		leftWingModel[23].rotateAngleX = 2.35619449F;

		leftWingModel[24].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 62
		leftWingModel[24].setRotationPoint(91F, -49F, 67.5F);
		leftWingModel[24].rotateAngleX = 0.78539816F;

		leftWingModel[25].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 63
		leftWingModel[25].setRotationPoint(91F, -49F, 58.5F);
		leftWingModel[25].rotateAngleX = -0.78539816F;

		leftWingModel[26].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 64
		leftWingModel[26].setRotationPoint(91F, -49F, 58.5F);
		leftWingModel[26].rotateAngleX = -2.35619449F;

		leftWingModel[27].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 65
		leftWingModel[27].setRotationPoint(91F, -49F, 58.5F);
		leftWingModel[27].rotateAngleX = 2.35619449F;

		leftWingModel[28].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 66
		leftWingModel[28].setRotationPoint(91F, -49F, 58.5F);
		leftWingModel[28].rotateAngleX = 0.78539816F;

		leftWingModel[29].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 67
		leftWingModel[29].setRotationPoint(55F, -49F, 67.5F);
		leftWingModel[29].rotateAngleX = 0.78539816F;

		leftWingModel[30].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 68
		leftWingModel[30].setRotationPoint(55F, -49F, 67.5F);
		leftWingModel[30].rotateAngleX = -0.78539816F;

		leftWingModel[31].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 69
		leftWingModel[31].setRotationPoint(55F, -49F, 67.5F);
		leftWingModel[31].rotateAngleX = -2.35619449F;

		leftWingModel[32].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 70
		leftWingModel[32].setRotationPoint(55F, -49F, 58.5F);
		leftWingModel[32].rotateAngleX = -0.78539816F;

		leftWingModel[33].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 71
		leftWingModel[33].setRotationPoint(55F, -49F, 58.5F);
		leftWingModel[33].rotateAngleX = 0.78539816F;

		leftWingModel[34].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 72
		leftWingModel[34].setRotationPoint(55F, -49F, 58.5F);
		leftWingModel[34].rotateAngleX = 2.35619449F;

		leftWingModel[35].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 73
		leftWingModel[35].setRotationPoint(55F, -49F, 58.5F);
		leftWingModel[35].rotateAngleX = -2.35619449F;

		leftWingModel[36].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 74
		leftWingModel[36].setRotationPoint(55F, -49F, 67.5F);
		leftWingModel[36].rotateAngleX = 2.35619449F;

		leftWingModel[37].addTrapezoid(0F, 0F, 0F, 10, 7, 7, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 75
		leftWingModel[37].setRotationPoint(30F, -50F, 33F);

		leftWingModel[38].addTrapezoid(0F, 0F, 0F, 8, 5, 5, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 76
		leftWingModel[38].setRotationPoint(22F, -49F, 34F);

		leftWingModel[39].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 77
		leftWingModel[39].setRotationPoint(20F, -48F, 35F);

		leftWingModel[40].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 78
		leftWingModel[40].setRotationPoint(50F, -50.5F, 57F);

		leftWingModel[41].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 79
		leftWingModel[41].setRotationPoint(50F, -50.5F, 66F);

		leftWingModel[42].addBox(0F, 0F, 0F, 50, 3, 3, 0F); // Box 80
		leftWingModel[42].setRotationPoint(55F, -50.5F, 57F);


		rightWingModel = new ModelRendererTurbo[43];
		rightWingModel[0] = new ModelRendererTurbo(this, 200, 715, textureX, textureY); // Import Box33
		rightWingModel[1] = new ModelRendererTurbo(this, 200, 780, textureX, textureY); // Import Box34
		rightWingModel[2] = new ModelRendererTurbo(this, 200, 1120, textureX, textureY); // Import Box35
		rightWingModel[3] = new ModelRendererTurbo(this, 200, 1185, textureX, textureY); // Import Box36
		rightWingModel[4] = new ModelRendererTurbo(this, 200, 1215, textureX, textureY); // Import Box37
		rightWingModel[5] = new ModelRendererTurbo(this, 200, 1240, textureX, textureY); // Import Box38
		rightWingModel[6] = new ModelRendererTurbo(this, 200, 585, textureX, textureY); // Box 0
		rightWingModel[7] = new ModelRendererTurbo(this, 200, 565, textureX, textureY); // Box 1
		rightWingModel[8] = new ModelRendererTurbo(this, 200, 670, textureX, textureY); // Box 2
		rightWingModel[9] = new ModelRendererTurbo(this, 200, 690, textureX, textureY); // Box 3
		rightWingModel[10] = new ModelRendererTurbo(this, 200, 705, textureX, textureY); // Box 4
		rightWingModel[11] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 7
		rightWingModel[12] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 8
		rightWingModel[13] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 9
		rightWingModel[14] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 13
		rightWingModel[15] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 14
		rightWingModel[16] = new ModelRendererTurbo(this, 200, 597, textureX, textureY); // Box 15
		rightWingModel[17] = new ModelRendererTurbo(this, 200, 612, textureX, textureY); // Box 16
		rightWingModel[18] = new ModelRendererTurbo(this, 200, 625, textureX, textureY); // Box 17
		rightWingModel[19] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Box 18
		rightWingModel[20] = new ModelRendererTurbo(this, 200, 635, textureX, textureY); // Box 19
		rightWingModel[21] = new ModelRendererTurbo(this, 200, 640, textureX, textureY); // Box 20
		rightWingModel[22] = new ModelRendererTurbo(this, 200, 718, textureX, textureY); // Box 21
		rightWingModel[23] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 24
		rightWingModel[24] = new ModelRendererTurbo(this, 200, 604, textureX, textureY); // Box 25
		rightWingModel[25] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 26
		rightWingModel[26] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 27
		rightWingModel[27] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 28
		rightWingModel[28] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 29
		rightWingModel[29] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 30
		rightWingModel[30] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 31
		rightWingModel[31] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 32
		rightWingModel[32] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 33
		rightWingModel[33] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 34
		rightWingModel[34] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 35
		rightWingModel[35] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 36
		rightWingModel[36] = new ModelRendererTurbo(this, 200, 650, textureX, textureY); // Box 37
		rightWingModel[37] = new ModelRendererTurbo(this, 200, 640, textureX, textureY); // Box 38
		rightWingModel[38] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 39
		rightWingModel[39] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 40
		rightWingModel[40] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 41
		rightWingModel[41] = new ModelRendererTurbo(this, 200, 660, textureX, textureY); // Box 42
		rightWingModel[42] = new ModelRendererTurbo(this, 200, 718, textureX, textureY); // Box 43

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 122, 3, 54, 0F, -81F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -81F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		rightWingModel[0].setRotationPoint(-5F, -59F, -74F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 41, 3, 17, 0F, -22F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		rightWingModel[1].setRotationPoint(76F, -59F, -91F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 54, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		rightWingModel[2].setRotationPoint(117F, -59F, -74F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 17, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		rightWingModel[3].setRotationPoint(117F, -59F, -91F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 17, 0F, -22F, -8F, 0F, 22F, -8F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -22F, 6F, 0F, 22F, 7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box37
		rightWingModel[4].setRotationPoint(73F, -59F, -91F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 54, 0F, -81F, -1F, 0F, 81F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -81F, -1F, 0F, 81F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box38
		rightWingModel[5].setRotationPoint(-8F, -59F, -74F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 44, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 0
		rightWingModel[6].setRotationPoint(47F, -56F, -38F);

		rightWingModel[7].addBox(0F, 0F, 0F, 51, 7, 7, 0F); // Box 1
		rightWingModel[7].setRotationPoint(40F, -50F, -40F);

		rightWingModel[8].addTrapezoid(0F, 0F, 0F, 10, 7, 7, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 2
		rightWingModel[8].setRotationPoint(30F, -50F, -40F);

		rightWingModel[9].addTrapezoid(0F, 0F, 0F, 8, 5, 5, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 3
		rightWingModel[9].setRotationPoint(22F, -49F, -39F);

		rightWingModel[10].addTrapezoid(0F, 0F, 0F, 2, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 4
		rightWingModel[10].setRotationPoint(20F, -48F, -38F);

		rightWingModel[11].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 7
		rightWingModel[11].setRotationPoint(40F, -46.5F, -36.5F);
		rightWingModel[11].rotateAngleX = -2.35619449F;

		rightWingModel[12].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 8
		rightWingModel[12].setRotationPoint(40F, -46.5F, -36.5F);
		rightWingModel[12].rotateAngleX = 2.35619449F;

		rightWingModel[13].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 9
		rightWingModel[13].setRotationPoint(86F, -46.5F, -36.5F);
		rightWingModel[13].rotateAngleX = 2.35619449F;

		rightWingModel[14].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 13
		rightWingModel[14].setRotationPoint(86F, -46.5F, -36.5F);
		rightWingModel[14].rotateAngleX = -2.35619449F;

		rightWingModel[15].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 14
		rightWingModel[15].setRotationPoint(86F, -46.5F, -36.5F);
		rightWingModel[15].rotateAngleX = -0.78539816F;

		rightWingModel[16].addShapeBox(0F, 4F, -0.5F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 15
		rightWingModel[16].setRotationPoint(86F, -46.5F, -36.5F);
		rightWingModel[16].rotateAngleX = 0.78539816F;

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F); // Box 16
		rightWingModel[17].setRotationPoint(69F, -56F, -64F);

		rightWingModel[18].addBox(0F, 0F, 0F, 39, 1, 4, 0F); // Box 17
		rightWingModel[18].setRotationPoint(62F, -50F, -65F);

		rightWingModel[19].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 18
		rightWingModel[19].setRotationPoint(62F, -50F, -66F);

		rightWingModel[20].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 19
		rightWingModel[20].setRotationPoint(62F, -50F, -61F);

		rightWingModel[21].addBox(0F, 0F, 0F, 50, 3, 3, 0F); // Box 20
		rightWingModel[21].setRotationPoint(55F, -50.5F, -69F);

		rightWingModel[22].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 21
		rightWingModel[22].setRotationPoint(50F, -50.5F, -69F);

		rightWingModel[23].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 24
		rightWingModel[23].setRotationPoint(40F, -46.5F, -36.5F);
		rightWingModel[23].rotateAngleX = -0.78539816F;

		rightWingModel[24].addShapeBox(0F, 4F, -0.5F, 20, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 25
		rightWingModel[24].setRotationPoint(40F, -46.5F, -36.5F);
		rightWingModel[24].rotateAngleX = 0.78539816F;

		rightWingModel[25].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 26
		rightWingModel[25].setRotationPoint(55F, -49F, -67.5F);
		rightWingModel[25].rotateAngleX = 0.78539816F;

		rightWingModel[26].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 27
		rightWingModel[26].setRotationPoint(55F, -49F, -67.5F);
		rightWingModel[26].rotateAngleX = -0.78539816F;

		rightWingModel[27].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 28
		rightWingModel[27].setRotationPoint(55F, -49F, -67.5F);
		rightWingModel[27].rotateAngleX = -2.35619449F;

		rightWingModel[28].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 29
		rightWingModel[28].setRotationPoint(55F, -49F, -67.5F);
		rightWingModel[28].rotateAngleX = 2.35619449F;

		rightWingModel[29].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 30
		rightWingModel[29].setRotationPoint(91F, -49F, -67.5F);
		rightWingModel[29].rotateAngleX = 0.78539816F;

		rightWingModel[30].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 31
		rightWingModel[30].setRotationPoint(91F, -49F, -67.5F);
		rightWingModel[30].rotateAngleX = -0.78539816F;

		rightWingModel[31].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 32
		rightWingModel[31].setRotationPoint(91F, -49F, -67.5F);
		rightWingModel[31].rotateAngleX = -2.35619449F;

		rightWingModel[32].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 33
		rightWingModel[32].setRotationPoint(91F, -49F, -67.5F);
		rightWingModel[32].rotateAngleX = 2.35619449F;

		rightWingModel[33].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 34
		rightWingModel[33].setRotationPoint(91F, -49F, -58.5F);
		rightWingModel[33].rotateAngleX = 0.78539816F;

		rightWingModel[34].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 35
		rightWingModel[34].setRotationPoint(91F, -49F, -58.5F);
		rightWingModel[34].rotateAngleX = -0.78539816F;

		rightWingModel[35].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 36
		rightWingModel[35].setRotationPoint(91F, -49F, -58.5F);
		rightWingModel[35].rotateAngleX = -2.35619449F;

		rightWingModel[36].addShapeBox(0F, 1F, -0.5F, 13, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 37
		rightWingModel[36].setRotationPoint(91F, -49F, -58.5F);
		rightWingModel[36].rotateAngleX = 2.35619449F;

		rightWingModel[37].addBox(0F, 0F, 0F, 50, 3, 3, 0F); // Box 38
		rightWingModel[37].setRotationPoint(55F, -50.5F, -60F);

		rightWingModel[38].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 39
		rightWingModel[38].setRotationPoint(55F, -49F, -58.5F);
		rightWingModel[38].rotateAngleX = 2.35619449F;

		rightWingModel[39].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 40
		rightWingModel[39].setRotationPoint(55F, -49F, -58.5F);
		rightWingModel[39].rotateAngleX = -2.35619449F;

		rightWingModel[40].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 41
		rightWingModel[40].setRotationPoint(55F, -49F, -58.5F);
		rightWingModel[40].rotateAngleX = 0.78539816F;

		rightWingModel[41].addShapeBox(0F, 1F, -0.5F, 8, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 42
		rightWingModel[41].setRotationPoint(55F, -49F, -58.5F);
		rightWingModel[41].rotateAngleX = -0.78539816F;

		rightWingModel[42].addTrapezoid(0F, 0F, 0F, 5, 3, 3, 0F, -1.00F, ModelRendererTurbo.MR_RIGHT); // Box 43
		rightWingModel[42].setRotationPoint(50F, -50.5F, -60F);


		pitchFlapLeftModel = new ModelRendererTurbo[3];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 200, 1310, textureX, textureY); // Import ImportImportLeftPitchFlap
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 200, 1360, textureX, textureY); // Import Box9
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 200, 1465, textureX, textureY); // Import Box11

		pitchFlapLeftModel[0].addShapeBox(3F, 0F, 0F, 58, 2, 41, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, 0F); // Import ImportImportLeftPitchFlap
		pitchFlapLeftModel[0].setRotationPoint(137F, -38F, 18F);
		pitchFlapLeftModel[0].rotateAngleX = -0.03490659F;

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 41, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 56F, 0F, 0F, -56F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 56F, 0F, 0F, -56F, -0.5F, 0F); // Import Box9
		pitchFlapLeftModel[1].setRotationPoint(137F, -38F, 18F);
		pitchFlapLeftModel[1].rotateAngleX = -0.03490659F;

		pitchFlapLeftModel[2].addShapeBox(59F, 0F, 0F, 5, 2, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, 0F, 0F); // Import Box11
		pitchFlapLeftModel[2].setRotationPoint(137F, -38F, 18F);
		pitchFlapLeftModel[2].rotateAngleX = -0.03490659F;


		pitchFlapRightModel = new ModelRendererTurbo[3];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 200, 1360, textureX, textureY); // Import Box10
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 200, 1465, textureX, textureY); // Import Box12
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 498, 665, textureX, textureY); // Import ImportImportRightPitchFlap

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 3, 2, 41, 0F, -56F, -0.5F, 0F, 56F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -56F, -0.5F, 0F, 56F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box10
		pitchFlapRightModel[0].setRotationPoint(137F, -37F, -59F);
		pitchFlapRightModel[0].rotateAngleX = 0.03490659F;

		pitchFlapRightModel[1].addShapeBox(59F, 0F, 0F, 5, 2, 41, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		pitchFlapRightModel[1].setRotationPoint(137F, -37F, -59F);
		pitchFlapRightModel[1].rotateAngleX = 0.03490659F;

		pitchFlapRightModel[2].addShapeBox(3F, 0F, 0F, 58, 2, 41, 0F, -56F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportRightPitchFlap
		pitchFlapRightModel[2].setRotationPoint(137F, -37F, -59F);
		pitchFlapRightModel[2].rotateAngleX = 0.03490659F;


		bodyWheelModel = new ModelRendererTurbo[12];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 200, 1515, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[1] = new ModelRendererTurbo(this, 200, 1530, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[2] = new ModelRendererTurbo(this, 200, 1515, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[3] = new ModelRendererTurbo(this, 200, 1550, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[4] = new ModelRendererTurbo(this, 200, 1560, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[5] = new ModelRendererTurbo(this, 200, 1580, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[6] = new ModelRendererTurbo(this, 200, 1600, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[7] = new ModelRendererTurbo(this, 200, 1550, textureX, textureY); // Import ImportImportCoreWheel
		bodyWheelModel[8] = new ModelRendererTurbo(this, 200, 1632, textureX, textureY); // Import ImportBox1
		bodyWheelModel[9] = new ModelRendererTurbo(this, 200, 1632, textureX, textureY); // Import ImportBox2
		bodyWheelModel[10] = new ModelRendererTurbo(this, 200, 1645, textureX, textureY); // Import ImportBox4
		bodyWheelModel[11] = new ModelRendererTurbo(this, 200, 1645, textureX, textureY); // Import ImportBox5

		bodyWheelModel[0].addBox(0F, 0F, 0F, 12, 8, 5, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[0].setRotationPoint(-78F, -2F, 1F);

		bodyWheelModel[1].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[1].setRotationPoint(-61F, -5F, -0.5F);
		bodyWheelModel[1].rotateAngleZ = -1.02974426F;

		bodyWheelModel[2].addBox(0F, 0F, 0F, 12, 8, 5, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[2].setRotationPoint(-78F, -2F, -6F);

		bodyWheelModel[3].addBox(0F, 0F, 0F, 10, 5, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[3].setRotationPoint(-74F, -21.5F, 0.5F);
		bodyWheelModel[3].rotateAngleX = 0.43633231F;

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 12, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import ImportImportCoreWheel
		bodyWheelModel[4].setRotationPoint(-62F, -23F, -1F);
		bodyWheelModel[4].rotateAngleZ = -0.78539816F;

		bodyWheelModel[5].addBox(0F, 0F, 0F, 1, 12, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[5].setRotationPoint(-72F, -10F, -0.5F);
		bodyWheelModel[5].rotateAngleZ = 1.06465084F;

		bodyWheelModel[6].addBox(0F, 0F, 0F, 4, 25, 2, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[6].setRotationPoint(-73F, -22F, -1F);

		bodyWheelModel[7].addBox(0F, 0F, -1F, 10, 5, 1, 0F); // Import ImportImportCoreWheel
		bodyWheelModel[7].setRotationPoint(-74F, -21.5F, -0.5F);
		bodyWheelModel[7].rotateAngleX = -0.43633231F;

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox1
		bodyWheelModel[8].setRotationPoint(-78F, -4F, -6F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox2
		bodyWheelModel[9].setRotationPoint(-78F, -4F, 1F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox4
		bodyWheelModel[10].setRotationPoint(-78F, 6F, -6F);

		bodyWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox5
		bodyWheelModel[11].setRotationPoint(-78F, 6F, 1F);


		leftWingWheelModel = new ModelRendererTurbo[16];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1656, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1675, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportLeftWingWheel
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox10
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox11
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox12
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox13
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox18
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox19
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox20
		leftWingWheelModel[14] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox21
		leftWingWheelModel[15] = new ModelRendererTurbo(this, 200, 1745, textureX, textureY); // Import Box1

		leftWingWheelModel[0].addBox(0F, -3F, 0F, 25, 12, 2, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[0].setRotationPoint(-3F, -23.5F, 23F);
		leftWingWheelModel[0].rotateAngleX = 0.41887902F;

		leftWingWheelModel[1].addBox(0F, -2F, 0F, 5, 15, 5, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[1].setRotationPoint(37F, -22.5F, 20F);
		leftWingWheelModel[1].rotateAngleX = 0.45378561F;

		leftWingWheelModel[2].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[2].setRotationPoint(27F, -1F, 32F);

		leftWingWheelModel[3].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[3].setRotationPoint(21F, -6F, 36F);

		leftWingWheelModel[4].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[4].setRotationPoint(21F, -6F, 27F);

		leftWingWheelModel[5].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[5].setRotationPoint(41F, -6F, 27F);

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportLeftWingWheel
		leftWingWheelModel[6].setRotationPoint(41F, -6F, 36F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		leftWingWheelModel[7].setRotationPoint(41F, -8F, 27F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		leftWingWheelModel[8].setRotationPoint(41F, -8F, 36F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox12
		leftWingWheelModel[9].setRotationPoint(21F, -8F, 27F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox13
		leftWingWheelModel[10].setRotationPoint(21F, -8F, 36F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox18
		leftWingWheelModel[11].setRotationPoint(41F, 6F, 27F);

		leftWingWheelModel[12].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox19
		leftWingWheelModel[12].setRotationPoint(41F, 6F, 36F);

		leftWingWheelModel[13].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox20
		leftWingWheelModel[13].setRotationPoint(21F, 6F, 27F);

		leftWingWheelModel[14].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox21
		leftWingWheelModel[14].setRotationPoint(21F, 6F, 36F);

		leftWingWheelModel[15].addBox(0.5F, 11F, 0.5F, 4, 15, 4, 0F); // Import Box1
		leftWingWheelModel[15].setRotationPoint(37F, -22.5F, 20F);
		leftWingWheelModel[15].rotateAngleX = 0.45378561F;


		rightWingWheelModel = new ModelRendererTurbo[16];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 200, 1700, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 200, 1715, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 200, 1675, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 200, 1656, textureX, textureY); // Import ImportImportRightWingWheel
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox6
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox7
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox8
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox9
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox14
		rightWingWheelModel[12] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox15
		rightWingWheelModel[13] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox16
		rightWingWheelModel[14] = new ModelRendererTurbo(this, 200, 1735, textureX, textureY); // Import ImportBox17
		rightWingWheelModel[15] = new ModelRendererTurbo(this, 200, 1745, textureX, textureY); // Import Box0

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[0].setRotationPoint(41F, -6F, -39F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[1].setRotationPoint(21F, -6F, -39F);

		rightWingWheelModel[2].addBox(0F, 0F, 0F, 24, 4, 4, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[2].setRotationPoint(27F, -1F, -34F);

		rightWingWheelModel[3].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[3].setRotationPoint(21F, -6F, -31F);

		rightWingWheelModel[4].addBox(0F, 0F, 0F, 16, 12, 5, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[4].setRotationPoint(41F, -6F, -31F);

		rightWingWheelModel[5].addBox(0F, -2F, 0F, 5, 14, 5, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[5].setRotationPoint(37F, -23.5F, -24F);
		rightWingWheelModel[5].rotateAngleX = -0.41887902F;

		rightWingWheelModel[6].addBox(0F, -3F, 0F, 25, 12, 2, 0F); // Import ImportImportRightWingWheel
		rightWingWheelModel[6].setRotationPoint(-3F, -23.5F, -25F);
		rightWingWheelModel[6].rotateAngleX = -0.41887902F;

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		rightWingWheelModel[7].setRotationPoint(21F, -8F, -39F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox7
		rightWingWheelModel[8].setRotationPoint(21F, -8F, -31F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox8
		rightWingWheelModel[9].setRotationPoint(41F, -8F, -31F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		rightWingWheelModel[10].setRotationPoint(41F, -8F, -39F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox14
		rightWingWheelModel[11].setRotationPoint(21F, 6F, -39F);

		rightWingWheelModel[12].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox15
		rightWingWheelModel[12].setRotationPoint(21F, 6F, -31F);

		rightWingWheelModel[13].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox16
		rightWingWheelModel[13].setRotationPoint(41F, 6F, -31F);

		rightWingWheelModel[14].addShapeBox(0F, 0F, 0F, 16, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import ImportBox17
		rightWingWheelModel[14].setRotationPoint(41F, 6F, -39F);

		rightWingWheelModel[15].addBox(0.5F, 11F, 0.5F, 4, 14, 4, 0F); // Import Box0
		rightWingWheelModel[15].setRotationPoint(37F, -23.5F, -24F);
		rightWingWheelModel[15].rotateAngleX = -0.41887902F;


		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 200, 1772, textureX, textureY); // Box 88
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 200, 1772, textureX, textureY); // Box 89

		bodyDoorOpenModel[0].addBox(0F, -2F, 0F, 96, 2, 10, 0F); // Box 88
		bodyDoorOpenModel[0].setRotationPoint(-17F, -24F, -10F);
		bodyDoorOpenModel[0].rotateAngleX = -2.00712864F;

		bodyDoorOpenModel[1].addBox(0F, -2F, -10F, 96, 2, 10, 0F); // Box 89
		bodyDoorOpenModel[1].setRotationPoint(-17F, -24F, 10F);
		bodyDoorOpenModel[1].rotateAngleX = 2.00712864F;


		bodyDoorCloseModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 200, 1772, textureX, textureY); // Box 86
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 200, 1772, textureX, textureY); // Box 87

		bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 96, 2, 10, 0F); // Box 86
		bodyDoorCloseModel[0].setRotationPoint(-17F, -24F, -10F);

		bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 96, 2, 10, 0F); // Box 87
		bodyDoorCloseModel[1].setRotationPoint(-17F, -24F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}