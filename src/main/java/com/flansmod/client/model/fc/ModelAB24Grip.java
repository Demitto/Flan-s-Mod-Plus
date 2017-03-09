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
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAB24Grip extends ModelAttachment 
{
	int textureX = 512;
	int textureY = 512;

	public ModelAB24Grip()	
	{



// Attachment
		attachmentModel = new ModelRendererTurbo[7];
		attachmentModel[0] = new ModelRendererTurbo(this,  300,  81, textureX, textureY); // Grip1
		attachmentModel[1] = new ModelRendererTurbo(this,  300,  81, textureX, textureY); // Grip2
		attachmentModel[2] = new ModelRendererTurbo(this,  300,  81, textureX, textureY); // Grip3
		attachmentModel[3] = new ModelRendererTurbo(this,  300,  100, textureX, textureY); // Grip4
		attachmentModel[4] = new ModelRendererTurbo(this,  300,  120, textureX, textureY); // Grip5
		attachmentModel[5] = new ModelRendererTurbo(this,  300,  120, textureX, textureY); // Grip6
		attachmentModel[6] = new ModelRendererTurbo(this,  300,  120, textureX, textureY); // Grip7

		attachmentModel[0].addBox(0F, -1F, -3F, 2, 4, 6, 0F); // Grip1

		attachmentModel[1].addBox(6F, -1F, -3F, 2, 4, 6, 0F); // Grip2

		attachmentModel[2].addBox(-6F, -1F, -3F, 2, 4, 6, 0F); // Grip3
		attachmentModel[3].addBox(-6F, -3F, -3F, 14, 2, 6, 0F); // Grip4

		attachmentModel[4].addBox(-1F, -15F, -3F, 2, 12, 6, 0F); // Grip5

		attachmentModel[5].addShapeBox(1F, -15F, -3F, 2, 12, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); //Test

		attachmentModel[6].addShapeBox(-3F, -15F, -3F, 2, 12, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); //Test
	renderOffset = 0F;
	}
}
