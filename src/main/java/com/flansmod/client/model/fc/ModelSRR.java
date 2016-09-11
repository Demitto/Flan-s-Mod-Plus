//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSRR extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelSRR()
	{
		gunModel = new ModelRendererTurbo[36];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 0, 60, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 0, 180, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 0, 220, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Box 14
		gunModel[15] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 15
		gunModel[16] = new ModelRendererTurbo(this, 0, 280, textureX, textureY); // Box 16
		gunModel[17] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 17
		gunModel[18] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Box 18
		gunModel[19] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 19
		gunModel[20] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Box 20
		gunModel[21] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 21
		gunModel[22] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Box 22
		gunModel[23] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Box 23
		gunModel[24] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 24
		gunModel[25] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Box 29
		gunModel[30] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Box 30
		gunModel[31] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Box 31
		gunModel[32] = new ModelRendererTurbo(this, 0, 480, textureX, textureY); // Box 32
		gunModel[33] = new ModelRendererTurbo(this, 0, 500, textureX, textureY); // Box 33
		gunModel[34] = new ModelRendererTurbo(this, 50, 0, textureX, textureY); // Box 34
		gunModel[35] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Box 37

		gunModel[0].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 0
		gunModel[0].setRotationPoint(2F, -4F, -2F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 1
		gunModel[1].setRotationPoint(6F, -1F, -1F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 2
		gunModel[2].setRotationPoint(8F, -4F, -1F);

		gunModel[3].addBox(0F, 0F, 0F, 9, 4, 5, 0F); // Box 3
		gunModel[3].setRotationPoint(-1F, -8F, -2.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-1F, -9F, -2.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(6F, -9F, -2.5F);

		gunModel[6].addBox(0F, 0F, 0F, 7, 1, 4, 0F); // Box 6
		gunModel[6].setRotationPoint(0F, -8.5F, -2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-4F, -9F, -2.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 8
		gunModel[8].setRotationPoint(-5F, -9F, -2.5F);

		gunModel[9].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Box 9
		gunModel[9].setRotationPoint(8F, -9F, -2.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(13F, -9F, -2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 5, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(17F, -9F, -2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-3F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(13F, -5F, -1.5F);

		gunModel[13].addBox(0F, 0F, 0F, 3, 6, 3, 0F); // Box 13
		gunModel[13].setRotationPoint(16F, -2F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 14
		gunModel[14].setRotationPoint(0F, -10.5F, -1.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 15
		gunModel[15].setRotationPoint(2F, -12.5F, -1.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F); // Box 16
		gunModel[16].setRotationPoint(2F, -12.5F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F,-0.5F, 0F, 0F); // Box 17
		gunModel[17].setRotationPoint(1.5F, -13.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 18
		gunModel[18].setRotationPoint(12F, -10.5F, -1.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 19
		gunModel[19].setRotationPoint(14F, -10.5F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 20
		gunModel[20].setRotationPoint(15F, -9.5F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 21
		gunModel[21].setRotationPoint(20F, -10.5F, -1.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		gunModel[22].setRotationPoint(21F, -10.5F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 23
		gunModel[23].setRotationPoint(23F, -10.5F, -1.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-4F, 0F, -0.5F,0F, -1F, -0.5F,0F, -1F, 0F,-4F, 0F, 0F,0F, 0F, -0.5F,-2F, 0F, -0.5F,-2F, 0F, 0F,0F, 0F, 0F); // Box 24
		gunModel[24].setRotationPoint(12F, -12.5F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F); // Box 25
		gunModel[25].setRotationPoint(16F, -12.5F, 0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, -1F, 0F,-3F, 0F, 0F,-3F, 0F, -0.5F,-1F, -1F, -0.5F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,-2F, 0F, -0.5F); // Box 26
		gunModel[26].setRotationPoint(19F, -12.5F, 1F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-4F, 0F, 0F,0F, -1F, 0F,0F, -1F, -0.5F,-4F, 0F, -0.5F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, -0.5F,0F, 0F, -0.5F); // Box 27
		gunModel[27].setRotationPoint(12F, -12.5F, -1.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.5F,0F, 0F, -0.5F); // Box 28
		gunModel[28].setRotationPoint(16F, -12.5F, -1.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, -1F, -0.5F,-3F, 0F, -0.5F,-3F, 0F, 0F,-1F, -1F, 0F,-2F, 0F, -0.5F,0F, 0F, -0.5F,0F, 0F, 0F,-2F, 0F, 0F); // Box 29
		gunModel[29].setRotationPoint(19F, -12.5F, -2F);

		gunModel[30].addBox(0F, 0F, 0F, 4, 3, 3, 0F); // Box 30
		gunModel[30].setRotationPoint(28F, -8.5F, -1.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		gunModel[31].setRotationPoint(24F, -9.5F, -1F);

		gunModel[32].addBox(0F, 0F, 0F, 9, 2, 2, 0F); // Box 32
		gunModel[32].setRotationPoint(20F, -5.5F, -1F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Box 33
		gunModel[33].setRotationPoint(23F, -3.5F, -1F);

		gunModel[34].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 34
		gunModel[34].setRotationPoint(5F, -7F, 2F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, -0.5F, 0F,-0.5F, -0.5F, 0F,-0.5F, -0.5F, 0F,-0.5F, -0.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		gunModel[35].setRotationPoint(1.5F, -14.5F, -1.5F);


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 50, 20, textureX, textureY); // Box 35
		ammoModel[1] = new ModelRendererTurbo(this, 50, 40, textureX, textureY); // Box 36

		ammoModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F); // Box 35
		ammoModel[0].setRotationPoint(5.5F, -7F, 3F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,-1F, -0.25F, 0F,-1F, -0.25F, 0F,0F, -0.25F, 0F,0F, -0.25F, 0F,-1F, -0.25F, 0F,-1F, -0.25F, 0F); // Box 36
		ammoModel[1].setRotationPoint(5.5F, -7F, 9F);



		barrelAttachPoint = new Vector3f(0F, 0F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(0F, 0F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.SIDE_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
