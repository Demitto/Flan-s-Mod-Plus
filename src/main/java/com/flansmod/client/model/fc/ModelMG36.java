//This File was created with the Minecraft-SMP Modelling Toolbox
// Copyright (C) 2013 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 1.4.6+

// Model Checklist
//    Model: 
//    - Hitbox              [ ]
//    - Check Left/Right    [ ]  Left = + / Right = -
//    - Code Cleaned        [ ]  
//    - Coverted to Version [ ]

package com.flansmod.client.model.fc;

import com.flansmod.client.model.ModelMG;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMG36 extends ModelMG
{
	int textureX = 512;
	int textureY = 512;
	
	public ModelMG36()	
	{


		bipodModel = new ModelRendererTurbo[7];
		bipodModel[0] = new ModelRendererTurbo(this,  67,  0, textureX, textureY); // 
		bipodModel[1] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // 
		bipodModel[2] = new ModelRendererTurbo(this,  0,  50, textureX, textureY); // 
		bipodModel[3] = new ModelRendererTurbo(this,  0,  36, textureX, textureY); // 
		bipodModel[4] = new ModelRendererTurbo(this,  0,  36, textureX, textureY); // 
		bipodModel[5] = new ModelRendererTurbo(this,  0,  58, textureX, textureY); // 
		bipodModel[6] = new ModelRendererTurbo(this,  0,  69, textureX, textureY); // 


		bipodModel[0].addBox(0F, 0F, 0F, 2, 1, 16); // 
		bipodModel[0].setRotationPoint(-1F, 1F, -8F);

		bipodModel[1].addBox(0F, 0F, 0F, 8, 1, 2); // 
		bipodModel[1].setRotationPoint(-4F, 0F, -8F);

		bipodModel[2].addBox(0F, 0F, 0F, 8, 1, 2); // 
		bipodModel[2].setRotationPoint(-4F, 0F, 6F);

		bipodModel[3].addBox(0F, 0F, 0F, 2, 1, 6); // 
		bipodModel[3].setRotationPoint(-1F, 2F, -6F);

		bipodModel[4].addBox(0F, 0F, 0F, 2, 1, 6); // 
		bipodModel[4].setRotationPoint(-1F, 2F, 0F);

		bipodModel[5].addBox(0F, 0F, 0F, 2, 1, 5); // 
		bipodModel[5].setRotationPoint(-1F, 3F, -3F);

		bipodModel[6].addBox(0F, 0F, 0F, 2, 3, 2); // 
		bipodModel[6].setRotationPoint(-1F, 4F, -1F);


		gunModel = new ModelRendererTurbo[20];
		gunModel[0] = new ModelRendererTurbo(this,  0,  204, textureX, textureY); // 
		gunModel[1] = new ModelRendererTurbo(this,  0,  224, textureX, textureY); // 
		gunModel[2] = new ModelRendererTurbo(this,  27,  174, textureX, textureY); // 
		gunModel[3] = new ModelRendererTurbo(this,  27,  174, textureX, textureY); // 
		gunModel[4] = new ModelRendererTurbo(this,  20,  153, textureX, textureY); // 
		gunModel[5] = new ModelRendererTurbo(this,  20,  153, textureX, textureY); // 
		gunModel[6] = new ModelRendererTurbo(this,  0,  244, textureX, textureY); // 
		gunModel[7] = new ModelRendererTurbo(this,  0,  143, textureX, textureY); // 
		gunModel[8] = new ModelRendererTurbo(this,  0,  244, textureX, textureY); // 
		gunModel[9] = new ModelRendererTurbo(this,  0,  143, textureX, textureY); // 
		gunModel[10] = new ModelRendererTurbo(this,  0,  168, textureX, textureY); // 
		gunModel[11] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // 
		gunModel[12] = new ModelRendererTurbo(this,  0,  150, textureX, textureY); // 
		gunModel[13] = new ModelRendererTurbo(this,  50,  174, textureX, textureY); // 
		gunModel[14] = new ModelRendererTurbo(this,  0,  174, textureX, textureY); // 
		gunModel[15] = new ModelRendererTurbo(this,  0,  174, textureX, textureY); // 
		gunModel[16] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // 
		gunModel[17] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // 
		gunModel[18] = new ModelRendererTurbo(this,  0,  160, textureX, textureY); // 
		gunModel[19] = new ModelRendererTurbo(this,  0,  164, textureX, textureY); // 


		gunModel[0].addBox(-2F, 0F, -1F, 4, 5, 9); // 
		gunModel[0].setRotationPoint(0F, 7F, 0F);

		gunModel[1].addBox(-1.5F, 0F, -7F, 3, 4, 8); // 
		gunModel[1].setRotationPoint(0F, 7F, 0F);

		gunModel[2].addBox(-1F, 0F, -15F, 2, 1, 8); // 
		gunModel[2].setRotationPoint(0F, 7F, 0F);

		gunModel[3].addBox(-1F, 3F, -15F, 2, 1, 8); // 
		gunModel[3].setRotationPoint(0F, 7F, 0F);

		gunModel[4].addBox(1F, 0F, -15F, 1, 4, 3); // 
		gunModel[4].setRotationPoint(0F, 7F, 0F);

		gunModel[5].addBox(-2F, 0F, -15F, 1, 4, 3); // 
		gunModel[5].setRotationPoint(0F, 7F, 0F);

		gunModel[6].addBox(1.5F, 0F, -5F, 1, 2, 4); // 
		gunModel[6].setRotationPoint(0F, 7F, 0F);

		gunModel[7].addBox(1.5F, 2F, -4F, 1, 2, 2); // 
		gunModel[7].setRotationPoint(0F, 7F, 0F);

		gunModel[8].addBox(-2.5F, 0F, -5F, 1, 2, 4); // 
		gunModel[8].setRotationPoint(0F, 7F, 0F);

		gunModel[9].addBox(-2.5F, 2F, -4F, 1, 2, 2); // 
		gunModel[9].setRotationPoint(0F, 7F, 0F);

		gunModel[10].addBox(-2F, 0F, 8F, 4, 3, 1); // 
		gunModel[10].setRotationPoint(0F, 7F, 0F);

		gunModel[11].addBox(-2F, 0F, 9F, 1, 2, 2); // 
		gunModel[11].setRotationPoint(0F, 7F, 0F);

		gunModel[12].addBox(1F, 0F, 9F, 1, 2, 2); // 
		gunModel[12].setRotationPoint(0F, 7F, 0F);

		gunModel[13].addBox(-1.5F, 4.2F, 4.2F, 3, 1, 4); // 
		gunModel[13].setRotationPoint(0F, 7F, 0F);

		gunModel[14].addBox(-6F, 3F, 2F, 4, 1, 1); // 
		gunModel[14].setRotationPoint(0F, 7F, 0F);

		gunModel[15].addBox(-6F, 3F, 4F, 4, 1, 1); // 
		gunModel[15].setRotationPoint(0F, 7F, 0F);

		gunModel[16].addBox(-1F, 5F, 3F, 0, 2, 1); // 
		gunModel[16].setRotationPoint(0F, 7F, 0F);

		gunModel[17].addBox(0F, 4F, -15F, 0, 2, 1); // 
		gunModel[17].setRotationPoint(0F, 7F, 0F);

		gunModel[18].addBox(1F, 5F, 3F, 0, 2, 1); // 
		gunModel[18].setRotationPoint(0F, 7F, 0F);

		gunModel[19].addBox(-1F, 7F, 3F, 2, 0, 1); // 
		gunModel[19].setRotationPoint(0F, 7F, 0F);


		ammoModel = new ModelRendererTurbo[1];

		ammoModel[0] = new ModelRendererTurbo(this,  0,  193, textureX, textureY); // 

		ammoModel[0].addBox(-6F, 0.5F, 1F, 4, 3, 5); // 
		ammoModel[0].setRotationPoint(0F, 7F, 0F);	}
}