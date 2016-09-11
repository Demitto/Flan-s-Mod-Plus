//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2014 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.fc
;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAB9 extends ModelGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB9()
	{
		gunModel = new ModelRendererTurbo[68];
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Gun1
		gunModel[1] = new ModelRendererTurbo(this, 0, 42, textureX, textureY); // Import Gun2
		gunModel[2] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Import Gun3
		gunModel[3] = new ModelRendererTurbo(this, 0, 80, textureX, textureY); // Import Gun4
		gunModel[4] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Import Gun5
		gunModel[5] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Import Gun6
		gunModel[6] = new ModelRendererTurbo(this, 0, 160, textureX, textureY); // Import Gun7
		gunModel[7] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Gun8
		gunModel[8] = new ModelRendererTurbo(this, 0, 240, textureX, textureY); // Import Gun9
		gunModel[9] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Gun10
		gunModel[10] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Gun12
		gunModel[11] = new ModelRendererTurbo(this, 0, 279, textureX, textureY); // Import Gun13
		gunModel[12] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Gun14
		gunModel[13] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Gun15
		gunModel[14] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Gun16
		gunModel[15] = new ModelRendererTurbo(this, 0, 320, textureX, textureY); // Import Gun17
		gunModel[16] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Gun18
		gunModel[17] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Gun19
		gunModel[18] = new ModelRendererTurbo(this, 0, 340, textureX, textureY); // Import Gun20
		gunModel[19] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Import Gun21
		gunModel[20] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Gun22
		gunModel[21] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Gun23
		gunModel[22] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Gun24
		gunModel[23] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun25
		gunModel[24] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun26
		gunModel[25] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun27
		gunModel[26] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun28
		gunModel[27] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun29
		gunModel[28] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun30
		gunModel[29] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun31
		gunModel[30] = new ModelRendererTurbo(this, 0, 420, textureX, textureY); // Import Gun31
		gunModel[31] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Gun32
		gunModel[32] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun33
		gunModel[33] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun34
		gunModel[34] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun35
		gunModel[35] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun36
		gunModel[36] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun37
		gunModel[37] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Gun38
		gunModel[38] = new ModelRendererTurbo(this, 100, 20, textureX, textureY); // Import Gun38.mirror
		gunModel[39] = new ModelRendererTurbo(this, 100, 60, textureX, textureY); // Import Gun40
		gunModel[40] = new ModelRendererTurbo(this, 100, 120, textureX, textureY); // Box 0
		gunModel[41] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Box 1
		gunModel[42] = new ModelRendererTurbo(this, 100, 170, textureX, textureY); // Box 2
		gunModel[43] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 3
		gunModel[44] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 4
		gunModel[45] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 5
		gunModel[46] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 6
		gunModel[47] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 7
		gunModel[48] = new ModelRendererTurbo(this, 100, 200, textureX, textureY); // Box 8
		gunModel[49] = new ModelRendererTurbo(this, 100, 220, textureX, textureY); // Box 9
		gunModel[50] = new ModelRendererTurbo(this, 100, 240, textureX, textureY); // Box 10
		gunModel[51] = new ModelRendererTurbo(this, 100, 260, textureX, textureY); // Box 11
		gunModel[52] = new ModelRendererTurbo(this, 100, 300, textureX, textureY); // Box 12
		gunModel[53] = new ModelRendererTurbo(this, 100, 340, textureX, textureY); // Box 13
		gunModel[54] = new ModelRendererTurbo(this, 100, 360, textureX, textureY); // Box 14
		gunModel[55] = new ModelRendererTurbo(this, 100, 380, textureX, textureY); // Box 15
		gunModel[56] = new ModelRendererTurbo(this, 100, 400, textureX, textureY); // Box 16
		gunModel[57] = new ModelRendererTurbo(this, 100, 420, textureX, textureY); // Box 17
		gunModel[58] = new ModelRendererTurbo(this, 100, 420, textureX, textureY); // Box 18
		gunModel[59] = new ModelRendererTurbo(this, 100, 440, textureX, textureY); // Box 19
		gunModel[60] = new ModelRendererTurbo(this, 100, 460, textureX, textureY); // Box 51
		gunModel[61] = new ModelRendererTurbo(this, 100, 460, textureX, textureY); // Box 52
		gunModel[62] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Box 53
		gunModel[63] = new ModelRendererTurbo(this, 120, 480, textureX, textureY); // Box 54
		gunModel[64] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Box 55
		gunModel[65] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Box 56
		gunModel[66] = new ModelRendererTurbo(this, 0, 120, textureX, textureY); // Box 57
		gunModel[67] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Box 58

		gunModel[0].addShapeBox(0F, -12F, -4F, 13, 10, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Import Gun1
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(3F, -2F, -4F, 10, 12, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,9F, 0F, 0F,-9F, 0F, 0F,-9F, 0F, 0F,9F, 0F, 0F); // Import Gun2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(13F, -12F, -2F, 6, 6, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Import Gun3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(13F, -6F, -2F, 4, 4, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F); // Import Gun4
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addBox(0F, 22F, -4F, 35, 4, 8, 0F); // Import Gun5
		gunModel[4].setRotationPoint(-6F, -12F, 0F);

		gunModel[5].addBox(0F, -12F, -4.5F, 35, 12, 9, 0F); // Import Gun6
		gunModel[5].setRotationPoint(-6F, -12F, 0F);

		gunModel[6].addBox(0F, -15F, -4.5F, 20, 15, 9, 0F); // Import Gun7
		gunModel[6].setRotationPoint(29F, -12F, 0F);

		gunModel[7].addShapeBox(0F, 0F, -4F, 27, 26, 8, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-25F, 0F, 0F,-25F, 0F, 0F,0F, 0F, 0F); // Import Gun8
		gunModel[7].setRotationPoint(29F, -12F, 0F);

		gunModel[8].addBox(0F, -13F, -2.5F, 9, 11, 5, 0F); // Import Gun9
		gunModel[8].setRotationPoint(49F, -12F, 0F);

		gunModel[9].addBox(0F, -15F, -4.5F, 9, 2, 2, 0F); // Import Gun10
		gunModel[9].setRotationPoint(49F, -12F, 0F);

		gunModel[10].addBox(0F, -15F, 2.5F, 9, 2, 2, 0F); // Import Gun12
		gunModel[10].setRotationPoint(49F, -12F, 0F);

		gunModel[11].addBox(0F, -2F, -4.5F, 9, 2, 9, 0F); // Import Gun13
		gunModel[11].setRotationPoint(49F, -12F, 0F);

		gunModel[12].addBox(0F, -15F, -4.5F, 2, 2, 9, 0F); // Import Gun14
		gunModel[12].setRotationPoint(58F, -12F, 0F);

		gunModel[13].addBox(0F, -2F, -4.5F, 2, 2, 9, 0F); // Import Gun15
		gunModel[13].setRotationPoint(58F, -12F, 0F);

		gunModel[14].addBox(0F, -13F, -4.5F, 2, 11, 2, 0F); // Import Gun16
		gunModel[14].setRotationPoint(58F, -12F, 0F);

		gunModel[15].addBox(0F, -13F, 2.5F, 2, 11, 2, 0F); // Import Gun17
		gunModel[15].setRotationPoint(58F, -12F, 0F);

		gunModel[16].addShapeBox(0F, -12F, -1.5F, 1, 1, 3, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun18
		gunModel[16].setRotationPoint(58F, -12F, 0F);
		gunModel[16].glow = true;

		gunModel[17].addBox(0F, -11F, -1.5F, 1, 1, 3, 0F); // Import Gun19
		gunModel[17].setRotationPoint(58F, -12F, 0F);
		gunModel[17].glow = true;

		gunModel[18].addShapeBox(0F, -10F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Import Gun20
		gunModel[18].setRotationPoint(58F, -12F, 0F);
		gunModel[18].glow = true;

		gunModel[19].addBox(0F, -6F, -2.5F, 1, 1, 5, 0F); // Import Gun21
		gunModel[19].setRotationPoint(58F, -12F, 0F);

		gunModel[20].addBox(0F, -5F, -1.5F, 1, 3, 1, 0F); // Import Gun22
		gunModel[20].setRotationPoint(58F, -12F, 0F);

		gunModel[21].addBox(0F, -5F, 0.5F, 1, 3, 1, 0F); // Import Gun23
		gunModel[21].setRotationPoint(58F, -12F, 0F);

		gunModel[22].addBox(-25.5F, -10F, -5.5F, 16, 5, 11, 0F); // Import Gun24
		gunModel[22].setRotationPoint(58F, -12F, 0F);

		gunModel[23].addBox(-25F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun25
		gunModel[23].setRotationPoint(58F, -12F, 0F);

		gunModel[24].addBox(-23F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun26
		gunModel[24].setRotationPoint(58F, -12F, 0F);

		gunModel[25].addBox(-21F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun27
		gunModel[25].setRotationPoint(58F, -12F, 0F);

		gunModel[26].addBox(-19F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun28
		gunModel[26].setRotationPoint(58F, -12F, 0F);

		gunModel[27].addBox(-17F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun29
		gunModel[27].setRotationPoint(58F, -12F, 0F);

		gunModel[28].addBox(-15F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun30
		gunModel[28].setRotationPoint(58F, -12F, 0F);

		gunModel[29].addBox(-13F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun31
		gunModel[29].setRotationPoint(58F, -12F, 0F);

		gunModel[30].addBox(-11F, -9F, -6.5F, 1, 3, 13, 0F); // Import Gun31
		gunModel[30].setRotationPoint(58F, -12F, 0F);

		gunModel[31].addShapeBox(-4F, -15F, -4.5F, 4, 3, 9, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun32
		gunModel[31].setRotationPoint(29F, -12F, 0F);

		gunModel[32].addShapeBox(0F, 1F, -3F, 23, 2, 6, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun33
		gunModel[32].setRotationPoint(34F, -12F, 0F);

		gunModel[33].addBox(0F, 3F, -3F, 23, 2, 6, 0F); // Import Gun34
		gunModel[33].setRotationPoint(34F, -12F, 0F);

		gunModel[34].addShapeBox(0F, 5F, -3F, 23, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Import Gun35
		gunModel[34].setRotationPoint(34F, -12F, 0F);

		gunModel[35].addShapeBox(0F, 8F, -3F, 23, 2, 6, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Gun36
		gunModel[35].setRotationPoint(34F, -12F, 0F);

		gunModel[36].addBox(0F, 10F, -3F, 23, 2, 6, 0F); // Import Gun37
		gunModel[36].setRotationPoint(34F, -12F, 0F);

		gunModel[37].addShapeBox(0F, 12F, -3F, 23, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Import Gun38
		gunModel[37].setRotationPoint(34F, -12F, 0F);

		gunModel[38].addBox(2F, -10F, -5F, 9, 7, 10, 0F); // Import Gun38.mirror
		gunModel[38].setRotationPoint(-6F, -12F, 0F);

		gunModel[39].addBox(19F, -10F, -5F, 9, 7, 10, 0F); // Import Gun40
		gunModel[39].setRotationPoint(-6F, -12F, 0F);

		gunModel[40].addBox(0F, -12F, -4.5F, 27, 12, 9, 0F); // Box 0
		gunModel[40].setRotationPoint(-33F, -12F, 0F);

		gunModel[41].addBox(0F, -12F, -4.5F, 20, 4, 9, 0F); // Box 1
		gunModel[41].setRotationPoint(-33F, 0F, 0F);

		gunModel[42].addShapeBox(0F, -14F, -4.5F, 20, 4, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,-4F, 0F, 0F,0F, 0F, 0F); // Box 2
		gunModel[42].setRotationPoint(-33F, 6F, 0F);

		gunModel[43].addShapeBox(1F, -10F, -6.5F, 6, 15, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 3
		gunModel[43].setRotationPoint(-33F, -12F, 0F);

		gunModel[44].addShapeBox(7F, -10F, -6.5F, 6, 15, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 4
		gunModel[44].setRotationPoint(-33F, -12F, 0F);

		gunModel[45].addShapeBox(13F, -10F, -6.5F, 6, 15, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 5
		gunModel[45].setRotationPoint(-33F, -12F, 0F);

		gunModel[46].addShapeBox(13F, -10F, -6.5F, 6, 15, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 6
		gunModel[46].setRotationPoint(-33F, -12F, 11F);

		gunModel[47].addShapeBox(7F, -10F, -6.5F, 6, 15, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 7
		gunModel[47].setRotationPoint(-33F, -12F, 11F);

		gunModel[48].addShapeBox(1F, -10F, -6.5F, 6, 15, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Box 8
		gunModel[48].setRotationPoint(-33F, -12F, 11F);

		gunModel[49].addBox(0F, -11F, -3.5F, 3, 4, 7, 0F); // Box 9
		gunModel[49].setRotationPoint(-36F, -12F, 0F);

		gunModel[50].addBox(0F, -7F, -3.5F, 3, 2, 7, 0F); // Box 10
		gunModel[50].setRotationPoint(-36F, -11F, 0F);

		gunModel[51].addBox(-3F, -12F, -4.5F, 5, 28, 9, 0F); // Box 11
		gunModel[51].setRotationPoint(-37F, -12F, 0F);

		gunModel[52].addBox(-3F, -10F, -2.5F, 2, 20, 5, 0F); // Box 12
		gunModel[52].setRotationPoint(-39F, -12F, 0F);

		gunModel[53].addBox(-4F, -12F, -3.5F, 3, 4, 7, 0F); // Box 13
		gunModel[53].setRotationPoint(-39F, -12F, 0F);

		gunModel[54].addBox(-4F, -7F, -3.5F, 3, 10, 7, 0F); // Box 14
		gunModel[54].setRotationPoint(-39F, -12F, 0F);

		gunModel[55].addBox(-4F, 5F, -3.5F, 3, 6, 7, 0F); // Box 15
		gunModel[55].setRotationPoint(-39F, -8F, 0F);

		gunModel[56].addBox(0F, 22F, -3F, 14, 3, 6, 0F); // Box 16
		gunModel[56].setRotationPoint(-20F, -12F, 0F);

		gunModel[57].addShapeBox(0F, 22F, -3F, 11, 2, 2, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 10F, 0F,0F, 10F, 0F,0F, 0F, 0F); // Box 17
		gunModel[57].setRotationPoint(-31F, -22F, 0F);

		gunModel[58].addShapeBox(0F, 22F, -3F, 11, 2, 2, 0F,0F, 0F, 0F,0F, -10F, 0F,0F, -10F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 10F, 0F,0F, 10F, 0F,0F, 0F, 0F); // Box 18
		gunModel[58].setRotationPoint(-31F, -22F, 4F);

		gunModel[59].addShapeBox(-3F, -12F, -3.5F, 5, 9, 7, 0F,0F, 0F, 0F,0F, 4F, 0F,0F, 4F, 0F,0F, 0F, 0F,0F, -4F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -4F, 0F); // Box 19
		gunModel[59].setRotationPoint(-33F, 5F, 0F);

		gunModel[60].addBox(0F, -13F, -1F, 2, 1, 2, 0F); // Box 51
		gunModel[60].setRotationPoint(-20F, 9F, 0F);

		gunModel[61].addBox(0F, -13F, -1F, 2, 1, 2, 0F); // Box 52
		gunModel[61].setRotationPoint(-26F, 9F, 0F);

		gunModel[62].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,-4F, 0F, 0F); // Box 53
		gunModel[62].setRotationPoint(-20F, 9F, 0F);

		gunModel[63].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,8F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Box 54
		gunModel[63].setRotationPoint(-16F, 14F, 0F);

		gunModel[64].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F); // Box 55
		gunModel[64].setRotationPoint(-8F, 19F, 0F);

		gunModel[65].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,2F, 0F, 0F,2F, 0F, 0F,-2F, 0F, 0F); // Box 56
		gunModel[65].setRotationPoint(-14F, 19F, 0F);

		gunModel[66].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-4F, 0F, 0F,4F, 0F, 0F,4F, 0F, 0F,-4F, 0F, 0F); // Box 57
		gunModel[66].setRotationPoint(-26F, 9F, 0F);

		gunModel[67].addShapeBox(0.5F, -12F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-8F, 0F, 0F,8F, 0F, 0F,8F, 0F, 0F,-8F, 0F, 0F); // Box 58
		gunModel[67].setRotationPoint(-22F, 14F, 0F);


		defaultScopeModel = new ModelRendererTurbo[30];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 200, 0, textureX, textureY); // Box 20
		defaultScopeModel[1] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 21
		defaultScopeModel[2] = new ModelRendererTurbo(this, 200, 20, textureX, textureY); // Box 22
		defaultScopeModel[3] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Box 23
		defaultScopeModel[4] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Box 25
		defaultScopeModel[5] = new ModelRendererTurbo(this, 200, 80, textureX, textureY); // Box 26
		defaultScopeModel[6] = new ModelRendererTurbo(this, 200, 80, textureX, textureY); // Box 27
		defaultScopeModel[7] = new ModelRendererTurbo(this, 200, 60, textureX, textureY); // Box 28
		defaultScopeModel[8] = new ModelRendererTurbo(this, 200, 40, textureX, textureY); // Box 29
		defaultScopeModel[9] = new ModelRendererTurbo(this, 200, 100, textureX, textureY); // Box 30
		defaultScopeModel[10] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 31
		defaultScopeModel[11] = new ModelRendererTurbo(this, 200, 120, textureX, textureY); // Box 32
		defaultScopeModel[12] = new ModelRendererTurbo(this, 200, 140, textureX, textureY); // Box 33
		defaultScopeModel[13] = new ModelRendererTurbo(this, 200, 160, textureX, textureY); // Box 34
		defaultScopeModel[14] = new ModelRendererTurbo(this, 200, 180, textureX, textureY); // Box 35
		defaultScopeModel[15] = new ModelRendererTurbo(this, 200, 200, textureX, textureY); // Box 36
		defaultScopeModel[16] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 37
		defaultScopeModel[17] = new ModelRendererTurbo(this, 200, 220, textureX, textureY); // Box 38
		defaultScopeModel[18] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 39
		defaultScopeModel[19] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 40
		defaultScopeModel[20] = new ModelRendererTurbo(this, 200, 240, textureX, textureY); // Box 41
		defaultScopeModel[21] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 42
		defaultScopeModel[22] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 43
		defaultScopeModel[23] = new ModelRendererTurbo(this, 200, 260, textureX, textureY); // Box 44
		defaultScopeModel[24] = new ModelRendererTurbo(this, 200, 280, textureX, textureY); // Box 45
		defaultScopeModel[25] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Box 46
		defaultScopeModel[26] = new ModelRendererTurbo(this, 200, 320, textureX, textureY); // Box 47
		defaultScopeModel[27] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 48
		defaultScopeModel[28] = new ModelRendererTurbo(this, 200, 340, textureX, textureY); // Box 49
		defaultScopeModel[29] = new ModelRendererTurbo(this, 200, 360, textureX, textureY); // Box 50

		defaultScopeModel[0].addShapeBox(0F, -13F, -3.5F, 27, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F); // Box 20
		defaultScopeModel[0].setRotationPoint(-6F, -12F, 0F);

		defaultScopeModel[1].addShapeBox(0F, -13F, -4.5F, 4, 3, 9, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 21
		defaultScopeModel[1].setRotationPoint(-5F, -14F, 0F);

		defaultScopeModel[2].addShapeBox(0F, -13F, -4.5F, 4, 3, 9, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 22
		defaultScopeModel[2].setRotationPoint(7F, -14F, 0F);

		defaultScopeModel[3].addShapeBox(0F, -15F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 23
		defaultScopeModel[3].setRotationPoint(-4F, -13F, 0F);

		defaultScopeModel[4].addBox(0F, -20F, -3.5F, 2, 5, 7, 0F); // Box 25
		defaultScopeModel[4].setRotationPoint(-4F, -13F, 0F);

		defaultScopeModel[5].addShapeBox(0F, -21F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 26
		defaultScopeModel[5].setRotationPoint(-4F, -13F, 0F);

		defaultScopeModel[6].addShapeBox(0F, -21F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 27
		defaultScopeModel[6].setRotationPoint(8F, -13F, 0F);

		defaultScopeModel[7].addBox(0F, -20F, -3.5F, 2, 5, 7, 0F); // Box 28
		defaultScopeModel[7].setRotationPoint(8F, -13F, 0F);

		defaultScopeModel[8].addShapeBox(0F, -15F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 29
		defaultScopeModel[8].setRotationPoint(8F, -13F, 0F);

		defaultScopeModel[9].addBox(0F, -19F, -2.5F, 20, 3, 5, 0F); // Box 30
		defaultScopeModel[9].setRotationPoint(-7F, -13F, 0F);

		defaultScopeModel[10].addShapeBox(0F, -19F, -2.5F, 20, 1, 5, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 31
		defaultScopeModel[10].setRotationPoint(-7F, -14F, 0F);

		defaultScopeModel[11].addShapeBox(0F, -19F, -2.5F, 20, 1, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 32
		defaultScopeModel[11].setRotationPoint(-7F, -10F, 0F);

		defaultScopeModel[12].addShapeBox(0F, -21F, -3.5F, 8, 1, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F); // Box 33
		defaultScopeModel[12].setRotationPoint(12F, -13F, 0F);

		defaultScopeModel[13].addShapeBox(0F, -20F, -3.5F, 7, 5, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-5F, 0F, 0F,-5F, 0F, 0F,0F, 0F, 0F); // Box 34
		defaultScopeModel[13].setRotationPoint(12F, -13F, 0F);

		defaultScopeModel[14].addShapeBox(0F, -15F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,-1F, 0F, -1F,-1F, 0F, -1F,0F, 0F, -1F); // Box 35
		defaultScopeModel[14].setRotationPoint(12F, -13F, 0F);

		defaultScopeModel[15].addBox(-1F, -18.5F, -2F, 1, 2, 4, 0F); // Box 36
		defaultScopeModel[15].setRotationPoint(-7F, -13F, 0F);

		defaultScopeModel[16].addShapeBox(-1F, -18.5F, -2F, 1, 1, 4, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 37
		defaultScopeModel[16].setRotationPoint(-7F, -14F, 0F);

		defaultScopeModel[17].addShapeBox(-1F, -18.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 38
		defaultScopeModel[17].setRotationPoint(-7F, -11F, 0F);

		defaultScopeModel[18].addBox(0F, -19F, -2.5F, 3, 1, 5, 0F); // Box 39
		defaultScopeModel[18].setRotationPoint(1F, -12F, 1F);

		defaultScopeModel[19].addShapeBox(0F, -19F, -2.5F, 3, 1, 5, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 40
		defaultScopeModel[19].setRotationPoint(1F, -13F, 1F);

		defaultScopeModel[20].addShapeBox(0F, -19F, -2.5F, 3, 1, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F,-1F, 0F, 0F); // Box 41
		defaultScopeModel[20].setRotationPoint(1F, -11F, 1F);

		defaultScopeModel[21].addBox(0F, -19F, -1.5F, 1, 1, 3, 0F); // Box 42
		defaultScopeModel[21].setRotationPoint(2F, -15F, 0F);

		defaultScopeModel[22].addShapeBox(0F, -19F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F); // Box 43
		defaultScopeModel[22].setRotationPoint(3F, -15F, 0F);

		defaultScopeModel[23].addShapeBox(0F, -19F, -1.5F, 1, 1, 3, 0F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F); // Box 44
		defaultScopeModel[23].setRotationPoint(1F, -15F, 0F);

		defaultScopeModel[24].addShapeBox(0F, -15F, -4.5F, 10, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F,0F, 0F, 1F); // Box 45
		defaultScopeModel[24].setRotationPoint(31F, -13F, 1F);

		defaultScopeModel[25].addBox(0F, -15F, -4.5F, 1, 4, 7, 0F); // Box 46
		defaultScopeModel[25].setRotationPoint(39F, -17F, 1F);

		defaultScopeModel[26].addShapeBox(0F, -15F, -4.5F, 1, 1, 7, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Box 47
		defaultScopeModel[26].setRotationPoint(39F, -18F, 1F);

		defaultScopeModel[27].addShapeBox(0F, -15F, -3.5F, 11, 3, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-3F, 0F, 0F); // Box 48
		defaultScopeModel[27].setRotationPoint(31F, -16F, 1F);

		defaultScopeModel[28].addShapeBox(0F, -16F, -3.5F, 12, 1, 5, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,-1F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, 0F); // Box 49
		defaultScopeModel[28].setRotationPoint(30F, -16F, 1F);

		defaultScopeModel[29].addShapeBox(0F, -16F, -3.5F, 1, 1, 5, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F,0F, 0F, -1F); // Box 50
		defaultScopeModel[29].setRotationPoint(41F, -12F, 1F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Ammo1
		ammoModel[1] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Ammo2
		ammoModel[2] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Ammo3

		ammoModel[0].addShapeBox(0F, 15F, -3F, 23, 2, 6, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Ammo1
		ammoModel[0].setRotationPoint(34F, -12F, 0F);

		ammoModel[1].addBox(0F, 17F, -3F, 23, 2, 6, 0F); // Import Ammo2
		ammoModel[1].setRotationPoint(34F, -12F, 0F);

		ammoModel[2].addShapeBox(0F, 19F, -3F, 23, 2, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -2F); // Import Ammo3
		ammoModel[2].setRotationPoint(34F, -12F, 0F);



		barrelAttachPoint = new Vector3f(58F, 12F, 0F);
		stockAttachPoint = new Vector3f(0F, 0F, 0F);
		scopeAttachPoint = new Vector3f(0F, 0F, 0F);
		gripAttachPoint = new Vector3f(0F, 0F, 0F);

		gunSlideDistance = 0F;
		animationType = EnumAnimationType.END_LOADED;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}
