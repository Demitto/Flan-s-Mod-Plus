//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.3.0
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 3.0.x+

// Model Checklist
//    Model: 
//    - Check Left/Right    [ ]  (Left = + / Right = -)
//    - Code Cleaned        [ ]
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelAB24Sight extends ModelAttachment 
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB24Sight()	
	{


// Attachment
		attachmentModel = new ModelRendererTurbo[29];
		attachmentModel[0] = new ModelRendererTurbo(this,  200,  100, textureX, textureY); // Scope1
		attachmentModel[1] = new ModelRendererTurbo(this,  200,  120, textureX, textureY); // Scope2
		attachmentModel[2] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // Scope3
		attachmentModel[3] = new ModelRendererTurbo(this,  200,  140, textureX, textureY); // Scope4
		attachmentModel[4] = new ModelRendererTurbo(this,  200,  160, textureX, textureY); // Scope5
		attachmentModel[5] = new ModelRendererTurbo(this,  200,  180, textureX, textureY); // Scope6
		attachmentModel[6] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // Scope7
		attachmentModel[7] = new ModelRendererTurbo(this,  200,  220, textureX, textureY); // Scope8
		attachmentModel[8] = new ModelRendererTurbo(this,  200,  240, textureX, textureY); // Scope9
		attachmentModel[9] = new ModelRendererTurbo(this,  200,  240, textureX, textureY); // Scope10
		attachmentModel[10] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // Scope11
		attachmentModel[11] = new ModelRendererTurbo(this,  200,  260, textureX, textureY); // Scope12
		attachmentModel[12] = new ModelRendererTurbo(this,  200,  280, textureX, textureY); // Scope13
		attachmentModel[13] = new ModelRendererTurbo(this,  200,  300, textureX, textureY); // Scope14
		attachmentModel[14] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Scope15
		attachmentModel[15] = new ModelRendererTurbo(this,  200,  320, textureX, textureY); // Scope16
		attachmentModel[16] = new ModelRendererTurbo(this,  200,  330, textureX, textureY); // Scope17
		attachmentModel[17] = new ModelRendererTurbo(this,  200,  340, textureX, textureY); // Scope18
		attachmentModel[18] = new ModelRendererTurbo(this,  200,  350, textureX, textureY); // Scope19
		attachmentModel[19] = new ModelRendererTurbo(this,  200,  360, textureX, textureY); // Scope20
		attachmentModel[20] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // Scope21
		attachmentModel[21] = new ModelRendererTurbo(this,  200,  380, textureX, textureY); // Scope22
		attachmentModel[22] = new ModelRendererTurbo(this,  200,  330, textureX, textureY); // Scope23
		attachmentModel[23] = new ModelRendererTurbo(this,  200,  340, textureX, textureY); // Scope24
		attachmentModel[24] = new ModelRendererTurbo(this,  200,  350, textureX, textureY); // Scope25
		attachmentModel[25] = new ModelRendererTurbo(this,  200,  360, textureX, textureY); // Scope26
		attachmentModel[26] = new ModelRendererTurbo(this,  200,  370, textureX, textureY); // Scope27
		attachmentModel[27] = new ModelRendererTurbo(this,  200,  380, textureX, textureY); // Scope28
		attachmentModel[28] = new ModelRendererTurbo(this,  200,  390, textureX, textureY); // Scope29

		attachmentModel[0].addShapeBox(-14F, 0F, -3F, 21, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); //Test


		attachmentModel[1].addBox(-14F, 2F, -4.5F, 21, 2, 9, 0F); // Scope2


		attachmentModel[2].addBox(-14F, 4F, -4F, 21, 7, 1, 0F); // Scope3


		attachmentModel[3].addBox(-14F, 4F, 3F, 21, 7, 1, 0F); // Scope4


		attachmentModel[4].addBox(-14F, 10F, -3F, 21, 1, 6, 0F); // Scope5


		attachmentModel[5].addBox(6F, 9F, -3F, 5, 1, 6, 0F); // Scope6


		attachmentModel[6].addBox(-13F, 9F, -3F, 1, 1, 6, 0F); // Scope7


		attachmentModel[7].addBox(6F, 4F, -3F, 10, 1, 6, 0F); // Scope8


		attachmentModel[8].addBox(6F, 5F, -3F, 5, 4, 1, 0F); // Scope9


		attachmentModel[9].addBox(6F, 5F, 2F, 5, 4, 1, 0F); // Scope10


		attachmentModel[10].addShapeBox(11F, 5F, 2F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); //Test


		attachmentModel[11].addShapeBox(11F, 5F, -3F, 5, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); //Test


		attachmentModel[12].addBox(-9F, 10.5F, -4.5F, 10, 1, 9, 0F); // Scope13


		attachmentModel[13].addShapeBox(-9F, 11.5F, -4.5F, 10, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); //Test


		attachmentModel[14].addBox(-8F, 4F, -4.4F, 2, 7, 1, 0F); // Scope15


		attachmentModel[15].addBox(-8F, 4F, 3.4F, 2, 7, 1, 0F); // Scope16


		attachmentModel[16].addBox(0F, 9F, -4.4F, 2, 2, 1, 0F); // Scope17


		attachmentModel[17].addBox(-1F, 8F, -4.4F, 4, 1, 1, 0F); // Scope18


		attachmentModel[18].addBox(-1F, 6F, -4.4F, 1, 2, 1, 0F); // Scope19


		attachmentModel[19].addBox(2F, 6F, -4.4F, 1, 2, 1, 0F); // Scope20


		attachmentModel[20].addBox(0F, 4F, -4.4F, 2, 1, 1, 0F); // Scope21


		attachmentModel[21].addBox(-1F, 5F, -4.4F, 4, 1, 1, 0F); // Scope22


		attachmentModel[22].addBox(0F, 9F, 3.4F, 2, 2, 1, 0F); // Scope23


		attachmentModel[23].addBox(-1F, 8F, 3.4F, 4, 1, 1, 0F); // Scope24


		attachmentModel[24].addBox(-1F, 6F, 3.4F, 1, 2, 1, 0F); // Scope25


		attachmentModel[25].addBox(2F, 6F, 3.4F, 1, 2, 1, 0F); // Scope26


		attachmentModel[26].addBox(0F, 4F, 3.4F, 2, 1, 1, 0F); // Scope27


		attachmentModel[27].addBox(-1F, 5F, 3.4F, 4, 1, 1, 0F); // Scope28


		attachmentModel[28].addBox(6F, 6.5F, -0.5F, 1, 1, 1, 0F); // Scope29

		renderOffset = 0F;
	}
}
