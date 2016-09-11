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

public class ModelAB24Stock extends ModelAttachment 
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB24Stock()	
	{



// Attachment
		attachmentModel = new ModelRendererTurbo[10];
		attachmentModel[0] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock1
		attachmentModel[1] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock2
		attachmentModel[2] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock3
		attachmentModel[3] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock4
		attachmentModel[4] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock5
		attachmentModel[5] = new ModelRendererTurbo(this,  400,  81, textureX, textureY); // Stock6
		attachmentModel[6] = new ModelRendererTurbo(this,  400,  112, textureX, textureY); // Stock7
		attachmentModel[7] = new ModelRendererTurbo(this,  400,  140, textureX, textureY); // Stock9
		attachmentModel[8] = new ModelRendererTurbo(this,  400,  160, textureX, textureY); // Stock10
		attachmentModel[9] = new ModelRendererTurbo(this,  400,  112, textureX, textureY); // Stock8

		attachmentModel[0].addShapeBox(-23F, 4F, -1.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test

		attachmentModel[1].addBox(-23F, 3F, -1.5F, 25, 1, 3, 0F); // Stock2

		attachmentModel[2].addShapeBox(-23F, 2F, -1.5F, 25, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		
		attachmentModel[3].addShapeBox(-23F, -6F, -1.5F, 25, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		
		attachmentModel[4].addBox(-23F, -5F, -1.5F, 25, 1, 3, 0F); // Stock5

		attachmentModel[5].addShapeBox(-23F, -4F, -1.5F, 25, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); //Test

		attachmentModel[6].addShapeBox(-22F, -7F, -2F, 2, 13, 4, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F); //Test

		attachmentModel[7].addShapeBox(-29F, 4F, -2F, 5, 5, 4, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); //Test

		attachmentModel[8].addShapeBox(-31F, -12F, -2F, 7, 7, 4, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F); //Test

		attachmentModel[9].addBox(-24F, -7F, -2F, 2, 13, 4, 0F); // Stock8
	renderOffset = 0F;
	}
}
