//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelAAGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAcannon extends ModelAAGun
{
	int textureX = 512;
	int textureY = 512;

	public ModelAcannon()	
	{


// Base
		baseModel = new ModelRendererTurbo[41];
		baseModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base1
		baseModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base2
		baseModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base3
		baseModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base4
		baseModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base5
		baseModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base6
		baseModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base7
		baseModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base8
		baseModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base9
		baseModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base10
		baseModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base11
		baseModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base12
		baseModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base13
		baseModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base14
		baseModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base15
		baseModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base16
		baseModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base17
		baseModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base18
		baseModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base19
		baseModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base20
		baseModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base21
		baseModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base22
		baseModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base23
		baseModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base24
		baseModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base25
		baseModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base26
		baseModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base27
		baseModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base28
		baseModel[28] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base29
		baseModel[29] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base30
		baseModel[30] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base31
		baseModel[31] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base32
		baseModel[32] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base33
		baseModel[33] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base34
		baseModel[34] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base35
		baseModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base36
		baseModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base37
		baseModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base38
		baseModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base39
		baseModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base40
		baseModel[40] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Base41


		baseModel[0].addShapeBox(0F, 0F, 0F, 32, 6, 8, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Base1
		baseModel[0].setRotationPoint(4F, -9F, -4F);

		baseModel[1].addShapeBox(-32F, 0F, 0F, 32, 6, 8, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Base2

		baseModel[1].setRotationPoint(-4F, -9F, -4F);

		baseModel[2].addBox(0F, 0F, 0F, 8, 6, 32, 0F); // Base3
		baseModel[2].setRotationPoint(-4F, -9F, 4F);

		baseModel[3].addBox(0F, 0F, -32F, 8, 6, 32, 0F); // Base4
		baseModel[3].setRotationPoint(-4F, -9F, -4F);

		baseModel[4].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Base5
		baseModel[4].setRotationPoint(36F, -5F, -4F);

		baseModel[5].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Base6
		baseModel[5].setRotationPoint(-44F, -5F, -4F);

		baseModel[6].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Base7
		baseModel[6].setRotationPoint(-4F, -5F, 36F);

		baseModel[7].addBox(0F, 0F, 0F, 8, 2, 8, 0F); // Base8
		baseModel[7].setRotationPoint(-4F, -5F, -44F);

		baseModel[8].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Base9
		baseModel[8].setRotationPoint(4F, -5F, 4F);

		baseModel[9].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Base10
		baseModel[9].setRotationPoint(4F, -5F, -20F);

		baseModel[10].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Base11
		baseModel[10].setRotationPoint(-20F, -5F, -20F);

		baseModel[11].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Base12
		baseModel[11].setRotationPoint(-20F, -5F, 4F);

		baseModel[12].addBox(0F, 0F, 0F, 8, 16, 8, 0F); // Base13
		baseModel[12].setRotationPoint(-4F, -19F, -4F);

		baseModel[13].addBox(0F, 0F, 0F, 8, 14, 4, 0F); // Base14
		baseModel[13].setRotationPoint(-12F, -19F, -2F);

		baseModel[14].addBox(0F, 0F, 0F, 8, 14, 4, 0F); // Base15
		baseModel[14].setRotationPoint(4F, -19F, -2F);

		baseModel[15].addBox(0F, 0F, 0F, 4, 14, 8, 0F); // Base16
		baseModel[15].setRotationPoint(-2F, -19F, 4F);

		baseModel[16].addBox(0F, 0F, 0F, 4, 14, 8, 0F); // Base17
		baseModel[16].setRotationPoint(-2F, -19F, -12F);

		baseModel[17].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base18
		baseModel[17].setRotationPoint(36F, -3F, -4F);

		baseModel[18].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base19
		baseModel[18].setRotationPoint(36F, -3F, -1F);

		baseModel[19].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base20
		baseModel[19].setRotationPoint(36F, -3F, 2F);

		baseModel[20].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base21
		baseModel[20].setRotationPoint(39F, -7F, -3F);

		baseModel[21].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base22
		baseModel[21].setRotationPoint(37F, -7F, -3F);

		baseModel[22].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base23
		baseModel[22].setRotationPoint(41F, -7F, -3F);

		baseModel[23].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base24
		baseModel[23].setRotationPoint(-48F, -3F, -4F);

		baseModel[24].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base25
		baseModel[24].setRotationPoint(-48F, -3F, -1F);

		baseModel[25].addBox(0F, 0F, 0F, 12, 2, 2, 0F); // Base26
		baseModel[25].setRotationPoint(-48F, -3F, 2F);

		baseModel[26].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base27
		baseModel[26].setRotationPoint(-43F, -7F, -3F);

		baseModel[27].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base28
		baseModel[27].setRotationPoint(-41F, -7F, -3F);

		baseModel[28].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base29
		baseModel[28].setRotationPoint(-39F, -7F, -3F);

		baseModel[29].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base30
		baseModel[29].setRotationPoint(-4F, -3F, 36F);

		baseModel[30].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base31
		baseModel[30].setRotationPoint(-1F, -3F, 36F);

		baseModel[31].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base32
		baseModel[31].setRotationPoint(2F, -3F, 36F);

		baseModel[32].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base33
		baseModel[32].setRotationPoint(-1F, -7F, 37F);

		baseModel[33].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base34
		baseModel[33].setRotationPoint(1F, -7F, 37F);

		baseModel[34].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base35
		baseModel[34].setRotationPoint(-3F, -7F, 37F);

		baseModel[35].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base36
		baseModel[35].setRotationPoint(2F, -3F, -48F);

		baseModel[36].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base37
		baseModel[36].setRotationPoint(-1F, -3F, -48F);

		baseModel[37].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Base38
		baseModel[37].setRotationPoint(-4F, -3F, -48F);

		baseModel[38].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base39
		baseModel[38].setRotationPoint(-1F, -7F, -43F);

		baseModel[39].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base40
		baseModel[39].setRotationPoint(1F, -7F, -43F);

		baseModel[40].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Base41
		baseModel[40].setRotationPoint(-3F, -7F, -43F);		
		


// Seat
		seatModel = new ModelRendererTurbo[14];
		seatModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat1
		seatModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat2
		seatModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat3
		seatModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat4
		seatModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat5
		seatModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat6
		seatModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat7
		seatModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat8
		seatModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat9
		seatModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat10
		seatModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat11
		seatModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat12
		seatModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat13
		seatModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Seat14


		seatModel[0].addBox(0F, 0F, 0F, 24, 2, 8, 0F); // Seat1
		seatModel[0].setRotationPoint(-12F, -21F, -4F);

		seatModel[1].addBox(0F, 0F, 0F, 8, 2, 12, 0F); // Seat2
		seatModel[1].setRotationPoint(-4F, -21F, -16F);

		seatModel[2].addBox(0F, 0F, 0F, 8, 2, 11, 0F); // Seat3
		seatModel[2].setRotationPoint(-4F, -21F, 4F);

		seatModel[3].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat4
		seatModel[3].setRotationPoint(-4F, -45F, -16F);

		seatModel[4].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat5
		seatModel[4].setRotationPoint(-4F, -45F, 13F);

		seatModel[5].addBox(0F, 0F, 0F, 16, 2, 16, 0F); // Seat6
		seatModel[5].setRotationPoint(-8F, -26F, -32F);

		seatModel[6].addBox(0F, 0F, 0F, 2, 24, 16, 0F); // Seat7
		seatModel[6].setRotationPoint(-8F, -50F, -32F);

		seatModel[7].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Seat8
		seatModel[7].setRotationPoint(-4F, -24F, -26F);

		seatModel[8].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Seat9
		seatModel[8].setRotationPoint(2F, -24F, -26F);

		seatModel[9].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Seat10
		seatModel[9].setRotationPoint(-1F, -24F, -26F);

		seatModel[10].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat11
		seatModel[10].setRotationPoint(4F, -45F, -16F);

		seatModel[11].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat12
		seatModel[11].setRotationPoint(-12F, -45F, -16F);

		seatModel[12].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat13
		seatModel[12].setRotationPoint(-12F, -45F, 13F);

		seatModel[13].addBox(0F, 0F, 0F, 8, 24, 2, 0F); // Seat14
		seatModel[13].setRotationPoint(4F, -45F, 13F);		
		


// Gun
		gunModel = new ModelRendererTurbo[41];
		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun1
		gunModel[1] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun2
		gunModel[2] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun3
		gunModel[3] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun4
		gunModel[4] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun5
		gunModel[5] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun6
		gunModel[6] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun7
		gunModel[7] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun8
		gunModel[8] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun9
		gunModel[9] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun10
		gunModel[10] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun11
		gunModel[11] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun12
		gunModel[12] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun13
		gunModel[13] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun14
		gunModel[14] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun15
		gunModel[15] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun16
		gunModel[16] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun17
		gunModel[17] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun18
		gunModel[18] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun19
		gunModel[19] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun20
		gunModel[20] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun21
		gunModel[21] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun22
		gunModel[22] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun23
		gunModel[23] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun24
		gunModel[24] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun25
		gunModel[25] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun26
		gunModel[26] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun27
		gunModel[27] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun28
		gunModel[28] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun29
		gunModel[29] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun30
		gunModel[30] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun31
		gunModel[31] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun32
		gunModel[32] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun33
		gunModel[33] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun34
		gunModel[34] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun35
		gunModel[35] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun36
		gunModel[36] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun37
		gunModel[37] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun38
		gunModel[38] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun39
		gunModel[39] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun40
		gunModel[40] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // Gun41


		gunModel[0].addBox(-12F, -8F, -14F, 24, 16, 27, 0F); // Gun1
		gunModel[0].setRotationPoint(0F, -33F, 0F);

		gunModel[1].addBox(-12F, -16F, -7F, 32, 8, 14, 0F); // Gun2
		gunModel[1].setRotationPoint(0F, -33F, 0F);

		gunModel[2].addBox(-10F, -24F, -5F, 20, 8, 10, 0F); // Gun3
		gunModel[2].setRotationPoint(0F, -33F, 0F);

		gunModel[3].addBox(-9F, -23F, -6F, 2, 7, 12, 0F); // Gun4
		gunModel[3].setRotationPoint(0F, -33F, 0F);

		gunModel[4].addBox(-5F, -23F, -6F, 2, 7, 12, 0F); // Gun5
		gunModel[4].setRotationPoint(0F, -33F, 0F);

		gunModel[5].addBox(-1F, -23F, -6F, 2, 7, 12, 0F); // Gun6
		gunModel[5].setRotationPoint(0F, -33F, 0F);

		gunModel[6].addBox(3F, -23F, -6F, 2, 7, 12, 0F); // Gun7
		gunModel[6].setRotationPoint(0F, -33F, 0F);

		gunModel[7].addBox(7F, -22F, -6F, 2, 7, 12, 0F); // Gun8
		gunModel[7].setRotationPoint(0F, -33F, 0F);

		gunModel[8].addBox(-11F, -23F, -4F, 22, 7, 2, 0F); // Gun9
		gunModel[8].setRotationPoint(0F, -33F, 0F);

		gunModel[9].addBox(-11F, -23F, -1F, 22, 7, 2, 0F); // Gun10
		gunModel[9].setRotationPoint(0F, -33F, 0F);

		gunModel[10].addBox(-11F, -23F, 2F, 22, 7, 2, 0F); // Gun11
		gunModel[10].setRotationPoint(0F, -33F, 0F);

		gunModel[11].addBox(-7F, -26F, -3F, 6, 2, 6, 0F); // Gun12
		gunModel[11].setRotationPoint(0F, -33F, 0F);

		gunModel[12].addBox(2F, -26F, -3F, 6, 2, 6, 0F); // Gun13
		gunModel[12].setRotationPoint(0F, -33F, 0F);

		gunModel[13].addBox(-1F, -25F, -2F, 3, 1, 1, 0F); // Gun14
		gunModel[13].setRotationPoint(0F, -33F, 0F);

		gunModel[14].addBox(-1F, -25F, 1F, 3, 1, 1, 0F); // Gun15
		gunModel[14].setRotationPoint(0F, -33F, 0F);

		gunModel[15].addBox(-36F, -16F, -7F, 24, 13, 14, 0F); // Gun16
		gunModel[15].setRotationPoint(0F, -33F, 0F);

		gunModel[16].addBox(-20F, -3F, -4F, 8, 8, 8, 0F); // Gun17
		gunModel[16].setRotationPoint(0F, -33F, 0F);

		gunModel[17].addBox(-28F, -3F, -3F, 8, 6, 6, 0F); // Gun18
		gunModel[17].setRotationPoint(0F, -33F, 0F);

		gunModel[18].addBox(-36F, -3F, -2F, 8, 4, 4, 0F); // Gun19
		gunModel[18].setRotationPoint(0F, -33F, 0F);

		gunModel[19].addBox(-37F, -15F, -6F, 1, 11, 12, 0F); // Gun20
		gunModel[19].setRotationPoint(0F, -33F, 0F);

		gunModel[20].addBox(-33F, -17F, -4F, 22, 1, 2, 0F); // Gun21
		gunModel[20].setRotationPoint(0F, -33F, 0F);

		gunModel[21].addBox(-33F, -17F, 2F, 22, 1, 2, 0F); // Gun22
		gunModel[21].setRotationPoint(0F, -33F, 0F);

		gunModel[22].addBox(12F, -8F, -7F, 8, 16, 14, 0F); // Gun23
		gunModel[22].setRotationPoint(0F, -33F, 0F);

		gunModel[23].addBox(20F, -16F, -7F, 40, 4, 14, 0F); // Gun24
		gunModel[23].setRotationPoint(0F, -33F, 0F);

		gunModel[24].addBox(20F, 4F, -7F, 40, 4, 14, 0F); // Gun25
		gunModel[24].setRotationPoint(0F, -33F, 0F);

		gunModel[25].addBox(20F, -12F, -7F, 40, 6, 4, 0F); // Gun26
		gunModel[25].setRotationPoint(0F, -31F, 0F);

		gunModel[26].addBox(20F, -12F, 3F, 40, 6, 4, 0F); // Gun27
		gunModel[26].setRotationPoint(0F, -31F, 0F);

		gunModel[27].addBox(20F, -2F, 3F, 40, 6, 4, 0F); // Gun28
		gunModel[27].setRotationPoint(0F, -33F, 0F);

		gunModel[28].addBox(20F, -2F, -7F, 40, 6, 4, 0F); // Gun29
		gunModel[28].setRotationPoint(0F, -33F, 0F);

		gunModel[29].addBox(20F, -6F, 3F, 8, 4, 2, 0F); // Gun30
		gunModel[29].setRotationPoint(0F, -33F, 0F);

		gunModel[30].addBox(36F, -6F, 3F, 8, 4, 2, 0F); // Gun31
		gunModel[30].setRotationPoint(0F, -33F, 0F);

		gunModel[31].addBox(51F, -6F, 3F, 8, 4, 2, 0F); // Gun32
		gunModel[31].setRotationPoint(0F, -33F, 0F);

		gunModel[32].addBox(20F, -6F, -5F, 8, 4, 2, 0F); // Gun33
		gunModel[32].setRotationPoint(0F, -33F, 0F);

		gunModel[33].addBox(36F, -6F, -5F, 8, 4, 2, 0F); // Gun34
		gunModel[33].setRotationPoint(0F, -33F, 0F);

		gunModel[34].addBox(51F, -6F, -5F, 8, 4, 2, 0F); // Gun35
		gunModel[34].setRotationPoint(0F, -33F, 0F);

		gunModel[35].addBox(20F, -17F, -5F, 8, 1, 10, 0F); // Gun36
		gunModel[35].setRotationPoint(0F, -33F, 0F);

		gunModel[36].addBox(36F, -17F, -5F, 8, 1, 10, 0F); // Gun37
		gunModel[36].setRotationPoint(0F, -33F, 0F);

		gunModel[37].addBox(51F, -17F, -5F, 8, 1, 10, 0F); // Gun38
		gunModel[37].setRotationPoint(0F, -33F, 0F);

		gunModel[38].addBox(51F, 8F, -5F, 8, 1, 10, 0F); // Gun39
		gunModel[38].setRotationPoint(0F, -33F, 0F);

		gunModel[39].addBox(36F, 8F, -5F, 8, 1, 10, 0F); // Gun40
		gunModel[39].setRotationPoint(0F, -33F, 0F);

		gunModel[40].addBox(20F, 8F, -5F, 8, 1, 10, 0F); // Gun41
		gunModel[40].setRotationPoint(0F, -33F, 0F);		
		
// Barrel
		barrelModel = new ModelRendererTurbo[0][0];
		
		
// Ammo
		ammoModel = new ModelRendererTurbo[0][0];
		
		
		barrelX = 0;
		barrelY = 33;
		barrelZ = 0;
		
		
		flipAll();
	}
}