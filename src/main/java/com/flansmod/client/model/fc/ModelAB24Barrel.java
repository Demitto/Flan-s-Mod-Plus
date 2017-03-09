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
public class ModelAB24Barrel extends ModelAttachment 
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB24Barrel()	
	{



// Attachment
		attachmentModel = new ModelRendererTurbo[3];
		attachmentModel[0] = new ModelRendererTurbo(this,  120,  250, textureX, textureY); // Barrel1
		attachmentModel[1] = new ModelRendererTurbo(this,  120,  250, textureX, textureY); // Barrel2
		attachmentModel[2] = new ModelRendererTurbo(this,  120,  250, textureX, textureY); // Barrel3

		attachmentModel[0].addBox(-22F, -1.5F, -4.5F, 8, 3, 9, 0F); // Barrel1

		attachmentModel[1].addShapeBox(-22F, -4.5F, -4.5F, 8, 3, 9, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test

		attachmentModel[2].addShapeBox(-22F, 1.5F, -4.5F, 8, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); //Test
		renderOffset = 0F;
	}
}
