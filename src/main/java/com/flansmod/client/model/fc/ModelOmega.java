//This File was created with the Minecraft-SMP Modelling Toolbox 1.5.2.0
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
import com.flansmod.common.vector.Vector3f;

public class ModelOmega extends ModelMecha
{
	int textureX = 512;
	int textureY = 512;

	public ModelOmega()	
	{

		hipsAttachmentPoint = new Vector3f(-8F / 16F, 86F / 16F, 0F);

// Body
		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Bodybase
		bodyModel[1] = new ModelRendererTurbo(this, 0, 64, textureX, textureY); // Bodyfrontlower
		bodyModel[2] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Bodybackmid
		bodyModel[3] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); // Bodywsbottom
		bodyModel[4] = new ModelRendererTurbo(this, 0, 45, textureX, textureY); // Bodywsleft
		bodyModel[5] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Bodywsright
		bodyModel[6] = new ModelRendererTurbo(this, 0, 104, textureX, textureY); // Bodywstop
		bodyModel[7] = new ModelRendererTurbo(this, 0, 109, textureX, textureY); // Bodywsfront
		bodyModel[8] = new ModelRendererTurbo(this, 28, 117, textureX, textureY); // Bodyneckfront
		bodyModel[9] = new ModelRendererTurbo(this, 0, 148, textureX, textureY); // Bodybackleft
		bodyModel[10] = new ModelRendererTurbo(this, 26, 148, textureX, textureY); // Bodybackright
		bodyModel[11] = new ModelRendererTurbo(this, 27, 106, textureX, textureY); // Bodybackrightjet
		bodyModel[12] = new ModelRendererTurbo(this, 54, 117, textureX, textureY); // Bodybacklefttjet
		bodyModel[13] = new ModelRendererTurbo(this, 0, 183, textureX, textureY); // Bodybackneck1
		bodyModel[14] = new ModelRendererTurbo(this, 0, 210, textureX, textureY); // Bodybackneck2
		bodyModel[15] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Bodyshoulderleft
		bodyModel[16] = new ModelRendererTurbo(this, 0, 310, textureX, textureY); // Bodyshoulderright
		bodyModel[17] = new ModelRendererTurbo(this, 0, 360, textureX, textureY); // Bodybackspine
		bodyModel[18] = new ModelRendererTurbo(this, 0, 397, textureX, textureY); // Bodyrightside1
		bodyModel[19] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Bodyrightside2
		bodyModel[20] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Bodyrightside3
		bodyModel[21] = new ModelRendererTurbo(this, 0, 397, textureX, textureY); // Bodyleftside1
		bodyModel[22] = new ModelRendererTurbo(this, 0, 428, textureX, textureY); // Bodyleftside2
		bodyModel[23] = new ModelRendererTurbo(this, 0, 435, textureX, textureY); // Bodyleftside3
		bodyModel[24] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[25] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[26] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[27] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[28] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[29] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[30] = new ModelRendererTurbo(this, 0, 445, textureX, textureY); // Bodyspinejag
		bodyModel[31] = new ModelRendererTurbo(this, 0, 454, textureX, textureY); // Bodybackrightjet2
		bodyModel[32] = new ModelRendererTurbo(this, 0, 454, textureX, textureY); // Bodybackleftjet2
		bodyModel[33] = new ModelRendererTurbo(this, 240, 60, textureX, textureY); // BodyfrontDec1
		bodyModel[34] = new ModelRendererTurbo(this, 240, 0, textureX, textureY); // LeftShoulder
		bodyModel[35] = new ModelRendererTurbo(this, 240, 20, textureX, textureY); // LeftShoulder1
		bodyModel[36] = new ModelRendererTurbo(this, 240, 40, textureX, textureY); // LeftShoulder2
		bodyModel[37] = new ModelRendererTurbo(this, 240, 0, textureX, textureY); // RightShoulder
		bodyModel[38] = new ModelRendererTurbo(this, 240, 20, textureX, textureY); // RightShoulder1
		bodyModel[39] = new ModelRendererTurbo(this, 240, 40, textureX, textureY); // RightShoulder2
		bodyModel[40] = new ModelRendererTurbo(this, 290, 0, textureX, textureY); // Bodyhead

		bodyModel[0].addBox(0F, 0F, 0F, 15, 1, 24, 0F); // Bodybase
		bodyModel[0].setRotationPoint(-8F, -61F, -12F);

		bodyModel[1].addBox(0F, -1F, 0F, 16, 1, 24, 0F); // Bodyfrontlower
		bodyModel[1].setRotationPoint(7F, -60F, -12F);
		bodyModel[1].rotateAngleZ = 1.256637F;

		bodyModel[2].addBox(0F, -25F, 0F, 1, 25, 6, 0F); // Bodybackmid
		bodyModel[2].setRotationPoint(-8F, -61F, -3F);

		bodyModel[3].addBox(0F, -1F, 0F, 1, 1, 24, 0F); // Bodywsbottom
		bodyModel[3].setRotationPoint(11F, -74F, -12F);

		bodyModel[4].addBox(-4F, -1F, 0F, 5, 10, 1, 0F); // Bodywsleft
		bodyModel[4].setRotationPoint(11F, -84F, 11F);

		bodyModel[5].addBox(-4F, -1F, 0F, 5, 10, 1, 0F); // Bodywsright
		bodyModel[5].setRotationPoint(11F, -84F, -12F);

		bodyModel[6].addBox(0F, -1F, 0F, 1, 1, 24, 0F); // Bodywstop
		bodyModel[6].setRotationPoint(11F, -85F, -12F);

		bodyModel[7].addBox(-1F, -1F, 0F, 0, 10, 22, 0F); // Bodywsfront
		bodyModel[7].setRotationPoint(12F, -84F, -11F);

		bodyModel[8].addBox(0F, -6F, 0F, 1, 7, 24, 0F); // Bodyneckfront
		bodyModel[8].setRotationPoint(11F, -86F, -12F);
		bodyModel[8].rotateAngleZ = 1.064651F;

		bodyModel[9].addBox(0F, -25F, 0F, 3, 25, 9, 0F); // Bodybackleft
		bodyModel[9].setRotationPoint(-8F, -61F, 3F);
		bodyModel[9].rotateAngleZ = 0.08726646F;

		bodyModel[10].addBox(0F, -25F, 0F, 3, 25, 9, 0F); // Bodybackright
		bodyModel[10].setRotationPoint(-8F, -61F, -12F);
		bodyModel[10].rotateAngleZ = 0.08726646F;

		bodyModel[11].addBox(0F, 0F, 0F, 5, 14, 7, 0F); // Bodybackrightjet
		bodyModel[11].setRotationPoint(-10F, -83F, -11F);
		bodyModel[11].rotateAngleZ = -0.2443461F;

		bodyModel[12].addBox(0F, 0F, 0F, 5, 14, 7, 0F); // Bodybacklefttjet
		bodyModel[12].setRotationPoint(-10F, -83F, 4F);
		bodyModel[12].rotateAngleZ = -0.2443461F;

		bodyModel[13].addBox(0F, 0F, 0F, 10, 2, 24, 0F); // Bodybackneck1
		bodyModel[13].setRotationPoint(-10F, -86F, -12F);
		bodyModel[13].rotateAngleZ = 1.169371F;

		bodyModel[14].addBox(0F, 0F, 0F, 7, 2, 24, 0F); // Bodybackneck2
		bodyModel[14].setRotationPoint(-6F, -95F, -12F);
		bodyModel[14].rotateAngleZ = 0.5235988F;

		bodyModel[15].addBox(2F, -7F, 0F, 10, 11, 6, 0F); // Bodyshoulderleft
		bodyModel[15].setRotationPoint(-6F, -95F, 6.1F);
		bodyModel[15].rotateAngleZ = -0.9948377F;

		bodyModel[16].addBox(2F, -7F, 0F, 10, 11, 6, 0F); // Bodyshoulderright
		bodyModel[16].setRotationPoint(-6F, -95F, -12.1F);
		bodyModel[16].rotateAngleZ = -0.9948377F;

		bodyModel[17].addBox(0F, 0F, 0F, 3, 14, 5, 0F); // Bodybackspine
		bodyModel[17].setRotationPoint(-5F, -96F, -2.5F);
		bodyModel[17].rotateAngleZ = -0.5934119F;

		bodyModel[18].addBox(0F, 0F, 0F, 15, 28, 1, 0F); // Bodyrightside1
		bodyModel[18].setRotationPoint(-8F, -89F, -12.2F);

		bodyModel[19].addBox(0F, -6F, 0F, 16, 5, 1, 0F); // Bodyrightside2
		bodyModel[19].setRotationPoint(7F, -60F, -12.1F);
		bodyModel[19].rotateAngleZ = 1.256637F;

		bodyModel[20].addBox(-5F, -6F, 0F, 5, 7, 1, 0F); // Bodyrightside3
		bodyModel[20].setRotationPoint(11F, -86F, -12.1F);
		bodyModel[20].rotateAngleZ = 1.064651F;

		bodyModel[21].addBox(0F, 0F, 0F, 15, 28, 1, 0F); // Bodyleftside1
		bodyModel[21].setRotationPoint(-8F, -89F, 11.2F);

		bodyModel[22].addBox(0F, -6F, 0F, 16, 5, 1, 0F); // Bodyleftside2
		bodyModel[22].setRotationPoint(7F, -60F, 11.1F);
		bodyModel[22].rotateAngleZ = 1.256637F;

		bodyModel[23].addBox(-5F, -6F, 0F, 5, 7, 1, 0F); // Bodyleftside3
		bodyModel[23].setRotationPoint(11F, -86F, 11.1F);
		bodyModel[23].rotateAngleZ = 1.064651F;

		bodyModel[24].addBox(0F, -7F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[24].setRotationPoint(-8F, -58F, -3F);
		bodyModel[24].rotateAngleZ = 0.03490658F;

		bodyModel[25].addBox(0F, -25F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[25].setRotationPoint(-8F, -58F, -3F);
		bodyModel[25].rotateAngleZ = 0.03490658F;

		bodyModel[26].addBox(0F, -22F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[26].setRotationPoint(-8F, -58F, -3F);
		bodyModel[26].rotateAngleZ = 0.03490658F;

		bodyModel[27].addBox(0F, -19F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[27].setRotationPoint(-8F, -58F, -3F);
		bodyModel[27].rotateAngleZ = 0.03490658F;

		bodyModel[28].addBox(0F, -16F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[28].setRotationPoint(-8F, -58F, -3F);
		bodyModel[28].rotateAngleZ = 0.03490658F;

		bodyModel[29].addBox(0F, -13F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[29].setRotationPoint(-8F, -58F, -3F);
		bodyModel[29].rotateAngleZ = 0.03490658F;

		bodyModel[30].addBox(0F, -10F, 0F, 1, 1, 6, 0F); // Bodyspinejag
		bodyModel[30].setRotationPoint(-8F, -58F, -3F);
		bodyModel[30].rotateAngleZ = 0.03490658F;

		bodyModel[31].addBox(-0.5F, -3F, 0F, 5, 14, 5, 0F); // Bodybackrightjet2
		bodyModel[31].setRotationPoint(-10F, -83F, -10F);
		bodyModel[31].rotateAngleZ = -0.2094395F;

		bodyModel[32].addBox(-0.5F, -3F, 0F, 5, 14, 5, 0F); // Bodybackleftjet2
		bodyModel[32].setRotationPoint(-10F, -83F, 5F);
		bodyModel[32].rotateAngleZ = -0.2094395F;

		bodyModel[33].addBox(0F, -0.9F, 0F, 16, 1, 4, 0F); // BodyfrontDec1
		bodyModel[33].setRotationPoint(7F, -60F, -2F);
		bodyModel[33].rotateAngleZ = 1.204277F;

		bodyModel[34].addBox(-6F, -6F, 0F, 10, 10, 7, 0F); // LeftShoulder
		bodyModel[34].setRotationPoint(0F, -83F, 12F);

		bodyModel[35].addBox(-6F, -6F, 0F, 12, 4, 7, 0F); // LeftShoulder1
		bodyModel[35].setRotationPoint(-1F, -80F, 11.9F);

		bodyModel[36].addBox(-2F, -1F, -5F, 8, 9, 5, 0F); // LeftShoulder2
		bodyModel[36].setRotationPoint(-3F, -79F, 19F);
		bodyModel[36].rotateAngleX = -0.9773844F;

		bodyModel[37].addBox(-6F, -6F, 0F, 10, 10, 7, 0F); // RightShoulder
		bodyModel[37].setRotationPoint(0F, -83F, -19F);

		bodyModel[38].addBox(-6F, -6F, 0F, 12, 4, 7, 0F); // RightShoulder1
		bodyModel[38].setRotationPoint(-1F, -80F, -18.9F);

		bodyModel[39].addBox(-2F, -1F, 0F, 8, 9, 5, 0F); // RightShoulder2
		bodyModel[39].setRotationPoint(-3F, -79F, -18F);
		bodyModel[39].rotateAngleX = 0.9773844F;

		bodyModel[40].addShapeBox(9F, 0F, 1F, 11, 9, 10, 0F, 0F, 0F, -3F, 0F, -5F, -4F, 0F, -5F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //Test
		bodyModel[40].setRotationPoint(7F, -100F, -6F);
		bodyModel[40].rotateAngleZ = -0.296706F;



//Head

		headModel = new ModelRendererTurbo[18];
		headModel[0] = new ModelRendererTurbo(this, 0, 237, textureX, textureY); // Bodyheadconnect
		headModel[1] = new ModelRendererTurbo(this, 0, 262, textureX, textureY); // Bodyheadconnect2
		headModel[2] = new ModelRendererTurbo(this, 0, 288, textureX, textureY); // Bodyheadconnect3
		headModel[3] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Bodyheadspikeright
		headModel[4] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Bodyheadspikeleft
		headModel[5] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // BodyHSright1
		headModel[6] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // BodyHSleft1
		headModel[7] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // BodyHSright2
		headModel[8] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // BodyHSleft2
		headModel[9] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRLeft1
		headModel[10] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRLeft2
		headModel[11] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRLeft3
		headModel[12] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRLeft4
		headModel[13] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRright1
		headModel[14] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRright3
		headModel[15] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRright2
		headModel[16] = new ModelRendererTurbo(this, 0, 357, textureX, textureY); // BodyHSRright4
		headModel[17] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Bodyheadconnect

		headModel[0].addShapeBox(0F, 0F, 0F, 7, 11, 12, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); //Test
		headModel[0].setRotationPoint(9F, -100F, -6F);
		headModel[0].rotateAngleZ = -0.1745329F;

		headModel[1].addShapeBox(0F, 0F, 0F, 10, 11, 13, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[1].setRotationPoint(0F, -102F, -6.5F);
		headModel[1].rotateAngleZ = -0.1919862F;

		headModel[2].addShapeBox(-9F, 0F, 0F, 9, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); //Test
		headModel[2].setRotationPoint(0F, -102F, -8F);
		headModel[2].rotateAngleZ = 0.8726646F;

		headModel[3].addBox(-7F, -7F, 0F, 8, 7, 5, 0F); // Bodyheadspikeright
		headModel[3].setRotationPoint(0F, -100F, -7.5F);
		headModel[3].rotateAngleZ = 0.7679449F;

		headModel[4].addBox(-7F, -7F, 0F, 8, 7, 5, 0F); // Bodyheadspikeleft
		headModel[4].setRotationPoint(0F, -100F, 2.5F);
		headModel[4].rotateAngleZ = 0.7679449F;

		headModel[5].addBox(-6F, -9F, 0F, 6, 3, 3, 0F); // BodyHSright1
		headModel[5].setRotationPoint(0F, -100F, -6.5F);
		headModel[5].rotateAngleZ = 1.553343F;

		headModel[6].addBox(-6F, -9F, 0F, 6, 3, 3, 0F); // BodyHSleft1
		headModel[6].setRotationPoint(0F, -100F, 3.5F);
		headModel[6].rotateAngleZ = 1.553343F;

		headModel[7].addBox(-12F, -9F, 0F, 6, 2, 2, 0F); // BodyHSright2
		headModel[7].setRotationPoint(0.5F, -100F, -6F);
		headModel[7].rotateAngleZ = 1.553343F;

		headModel[8].addBox(-12F, -9F, 0F, 6, 2, 2, 0F); // BodyHSleft2
		headModel[8].setRotationPoint(0.5F, -100F, 4F);
		headModel[8].rotateAngleZ = 1.553343F;

		headModel[9].addBox(1F, -6F, 0F, 1, 1, 1, 0F); // BodyHSRLeft1
		headModel[9].setRotationPoint(0F, -100F, 3.5F);
		headModel[9].rotateAngleZ = 0.7679449F;

		headModel[10].addBox(1F, -6F, 0F, 1, 1, 1, 0F); // BodyHSRLeft2
		headModel[10].setRotationPoint(0F, -100F, 5.5F);
		headModel[10].rotateAngleZ = 0.7679449F;

		headModel[11].addBox(1F, -4F, 0F, 1, 1, 1, 0F); // BodyHSRLeft3
		headModel[11].setRotationPoint(0F, -100F, 5.5F);
		headModel[11].rotateAngleZ = 0.7679449F;

		headModel[12].addBox(1F, -4F, 0F, 1, 1, 1, 0F); // BodyHSRLeft4
		headModel[12].setRotationPoint(0F, -100F, 3.5F);
		headModel[12].rotateAngleZ = 0.7679449F;

		headModel[13].addBox(1F, -6F, 0F, 1, 1, 1, 0F); // BodyHSRright1
		headModel[13].setRotationPoint(0F, -100F, -4.5F);
		headModel[13].rotateAngleZ = 0.7679449F;

		headModel[14].addBox(1F, -4F, 0F, 1, 1, 1, 0F); // BodyHSRright3
		headModel[14].setRotationPoint(0F, -100F, -6.5F);
		headModel[14].rotateAngleZ = 0.7679449F;

		headModel[15].addBox(1F, -6F, 0F, 1, 1, 1, 0F); // BodyHSRright2
		headModel[15].setRotationPoint(0F, -100F, -6.5F);
		headModel[15].rotateAngleZ = 0.7679449F;

		headModel[16].addBox(1F, -4F, 0F, 1, 1, 1, 0F); // BodyHSRright4
		headModel[16].setRotationPoint(0F, -100F, -4.5F);
		headModel[16].rotateAngleZ = 0.7679449F;

		headModel[17].addShapeBox(-6F, 9F, 0F, 7, 4, 10, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); //Test
		headModel[17].setRotationPoint(9F, -100F, -5F);
		headModel[17].rotateAngleZ = 0.296706F;	
		


// Left Arm
		leftArmModel = new ModelRendererTurbo[18];
		leftArmModel[0] = new ModelRendererTurbo(this,  170,  170, textureX, textureY); // LeftArmP1
		leftArmModel[1] = new ModelRendererTurbo(this,  170,  170, textureX, textureY); // LeftArmP2
		leftArmModel[2] = new ModelRendererTurbo(this,  170,  180, textureX, textureY); // LeftArmwrist1
		leftArmModel[3] = new ModelRendererTurbo(this,  170,  203, textureX, textureY); // LeftArmwrist2
		leftArmModel[4] = new ModelRendererTurbo(this,  290,  30, textureX, textureY); // LeftArmreplace
		leftArmModel[5] = new ModelRendererTurbo(this,  170,  26, textureX, textureY); // LeftArmFA1
		leftArmModel[6] = new ModelRendererTurbo(this,  170,  44, textureX, textureY); // LeftArmFA2
		leftArmModel[7] = new ModelRendererTurbo(this,  170,  44, textureX, textureY); // LeftArmFA3
		leftArmModel[8] = new ModelRendererTurbo(this,  170,  55, textureX, textureY); // LeftArmFA4
		leftArmModel[9] = new ModelRendererTurbo(this,  170,  65, textureX, textureY); // LeftArmFA5
		leftArmModel[10] = new ModelRendererTurbo(this,  170,  73, textureX, textureY); // LeftArmreplaceE
		leftArmModel[11] = new ModelRendererTurbo(this,  170,  95, textureX, textureY); // LeftArmrig1
		leftArmModel[12] = new ModelRendererTurbo(this,  170,  110, textureX, textureY); // LeftArmrig2
		leftArmModel[13] = new ModelRendererTurbo(this,  170,  120, textureX, textureY); // LeftArmrig3
		leftArmModel[14] = new ModelRendererTurbo(this,  170,  125, textureX, textureY); // LeftArmrig4
		leftArmModel[15] = new ModelRendererTurbo(this,  170,  133, textureX, textureY); // LeftArmrig5
		leftArmModel[16] = new ModelRendererTurbo(this,  170,  153, textureX, textureY); // LeftArmrig6
		leftArmModel[17] = new ModelRendererTurbo(this,  170,  161, textureX, textureY); // LeftArmrig7

		leftArmModel[0].addBox(14F, 18F, 0.1F, 22, 5, 4, 0F); // LeftArmP1
		leftArmModel[0].setRotationPoint(0F, 0F, -6F);
		leftArmModel[0].rotateAngleZ = -1.117011F;

		leftArmModel[1].addBox(14F, 18F, 7.9F, 22, 5, 4, 0F); // LeftArmP2
		leftArmModel[1].setRotationPoint(0F, 0F, -6F);
		leftArmModel[1].rotateAngleZ = -1.117011F;

		leftArmModel[2].addBox(36F, -5F, 1F, 9, 11, 10, 0F); // LeftArmwrist1
		leftArmModel[2].setRotationPoint(0F, 0F, -6F);
		leftArmModel[2].rotateAngleZ = -1.570796F;

		leftArmModel[3].addBox(34F, -3F, 3F, 2, 9, 6, 0F); // LeftArmwrist2
		leftArmModel[3].setRotationPoint(0F, 0F, -6F);
		leftArmModel[3].rotateAngleZ = -1.570796F;

		leftArmModel[4].addShape3D(7, -7, -12, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4) } ), 12, 14, 14, 48, 12, ModelRendererTurbo.MR_FRONT, new float[] {6, 6, 6, 6, 6, 6, 6, 6});
		leftArmModel[4].setRotationPoint(0F, 0F, -6F);
		leftArmModel[4].rotateAngleZ = -1.570796F;

		leftArmModel[5].addBox(1F, -8F, 0.5F, 23, 5, 11, 0F); // LeftArmFA1
		leftArmModel[5].setRotationPoint(0F, 0F, -6F);
		leftArmModel[5].rotateAngleZ = -2.268928F;

		leftArmModel[6].addBox(5F, -2F, 0.6F, 17, 5, 3, 0F); // LeftArmFA2
		leftArmModel[6].setRotationPoint(0F, 0F, -6F);
		leftArmModel[6].rotateAngleZ = -1.989675F;

		leftArmModel[7].addBox(5F, -2F, 8.4F, 17, 5, 3, 0F); // LeftArmFA3
		leftArmModel[7].setRotationPoint(0F, 0F, -6F);
		leftArmModel[7].rotateAngleZ = -1.989675F;

		leftArmModel[8].addBox(1F, -2F, 4F, 15, 4, 4, 0F); // LeftArmFA4
		leftArmModel[8].setRotationPoint(0F, 0F, -6F);
		leftArmModel[8].rotateAngleZ = -2.268928F;

		leftArmModel[9].addBox(16F, -1.5F, 4.5F, 8, 3, 3, 0F); // LeftArmFA5
		leftArmModel[9].setRotationPoint(0F, 0F, -6F);
		leftArmModel[9].rotateAngleZ = -2.268928F;

		leftArmModel[10].addBox(16F, 9F, 0F, 8, 8, 12, 0F); // LeftArmreplaceE
		leftArmModel[10].setRotationPoint(0F, 0F, -6F);
		leftArmModel[10].rotateAngleZ = -1.570796F;

		leftArmModel[11].addBox(45F, -5F, 3F, 15, 7, 6, 0F); // LeftArmrig1
		leftArmModel[11].setRotationPoint(0F, 0F, -6F);
		leftArmModel[11].rotateAngleZ = -1.570796F;

		leftArmModel[12].addBox(45F, 3F, 4.5F, 7, 3, 3, 0F); // LeftArmrig2
		leftArmModel[12].setRotationPoint(0F, 0F, -6F);
		leftArmModel[12].rotateAngleZ = -1.570796F;

		leftArmModel[13].addBox(50F, 4F, 5.5F, 5, 1, 1, 0F); // LeftArmrig3
		leftArmModel[13].setRotationPoint(0F, 0F, -6F);
		leftArmModel[13].rotateAngleZ = -1.570796F;

		leftArmModel[14].addBox(55F, 3F, 5F, 2, 3, 2, 0F); // LeftArmrig4
		leftArmModel[14].setRotationPoint(0F, 0F, -6F);
		leftArmModel[14].rotateAngleZ = -1.570796F;

		leftArmModel[15].addBox(55F, -6F, 2F, 2, 9, 8, 0F); // LeftArmrig5
		leftArmModel[15].setRotationPoint(0F, 0F, -6F);
		leftArmModel[15].rotateAngleZ = -1.570796F;

		leftArmModel[16].addBox(60F, -5F, 4.5F, 4, 3, 3, 0F); // LeftArmrig6
		leftArmModel[16].setRotationPoint(0F, 0F, -6F);
		leftArmModel[16].rotateAngleZ = -1.570796F;

		leftArmModel[17].addBox(60F, -1F, 5F, 2, 2, 2, 0F); // LeftArmrig7
		leftArmModel[17].setRotationPoint(0F, 0F, -6F);
		leftArmModel[17].rotateAngleZ = -1.570796F;		
		


// Right Arm
		rightArmModel = new ModelRendererTurbo[18];
		rightArmModel[0] = new ModelRendererTurbo(this,  170,  170, textureX, textureY); // LeftArmP1
		rightArmModel[1] = new ModelRendererTurbo(this,  170,  170, textureX, textureY); // LeftArmP2
		rightArmModel[2] = new ModelRendererTurbo(this,  170,  180, textureX, textureY); // LeftArmwrist1
		rightArmModel[3] = new ModelRendererTurbo(this,  170,  203, textureX, textureY); // LeftArmwrist2
		rightArmModel[4] = new ModelRendererTurbo(this,  290,  30, textureX, textureY); // LeftArmreplace
		rightArmModel[5] = new ModelRendererTurbo(this,  170,  26, textureX, textureY); // LeftArmFA1
		rightArmModel[6] = new ModelRendererTurbo(this,  170,  44, textureX, textureY); // LeftArmFA2
		rightArmModel[7] = new ModelRendererTurbo(this,  170,  44, textureX, textureY); // LeftArmFA3
		rightArmModel[8] = new ModelRendererTurbo(this,  170,  55, textureX, textureY); // LeftArmFA4
		rightArmModel[9] = new ModelRendererTurbo(this,  170,  65, textureX, textureY); // LeftArmFA5
		rightArmModel[10] = new ModelRendererTurbo(this,  170,  73, textureX, textureY); // LeftArmreplaceE
		rightArmModel[11] = new ModelRendererTurbo(this,  170,  95, textureX, textureY); // LeftArmrig1
		rightArmModel[12] = new ModelRendererTurbo(this,  170,  110, textureX, textureY); // LeftArmrig2
		rightArmModel[13] = new ModelRendererTurbo(this,  170,  120, textureX, textureY); // LeftArmrig3
		rightArmModel[14] = new ModelRendererTurbo(this,  170,  125, textureX, textureY); // LeftArmrig4
		rightArmModel[15] = new ModelRendererTurbo(this,  170,  133, textureX, textureY); // LeftArmrig5
		rightArmModel[16] = new ModelRendererTurbo(this,  170,  153, textureX, textureY); // LeftArmrig6
		rightArmModel[17] = new ModelRendererTurbo(this,  170,  161, textureX, textureY); // LeftArmrig7

		rightArmModel[0].addBox(14F, 18F, 0.1F, 22, 5, 4, 0F); // LeftArmP1
		rightArmModel[0].setRotationPoint(0F, 0F, -4F);
		rightArmModel[0].rotateAngleZ = -1.117011F;

		rightArmModel[1].addBox(14F, 18F, 7.9F, 22, 5, 4, 0F); // LeftArmP2
		rightArmModel[1].setRotationPoint(0F, 0F, -4F);
		rightArmModel[1].rotateAngleZ = -1.117011F;

		rightArmModel[2].addBox(36F, -5F, 1F, 9, 11, 10, 0F); // LeftArmwrist1
		rightArmModel[2].setRotationPoint(0F, 0F, -4F);
		rightArmModel[2].rotateAngleZ = -1.570796F;

		rightArmModel[3].addBox(34F, -3F, 3F, 2, 9, 6, 0F); // LeftArmwrist2
		rightArmModel[3].setRotationPoint(0F, 0F, -4F);
		rightArmModel[3].rotateAngleZ = -1.570796F;

		rightArmModel[4].addShape3D(7, -7, -12, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4) } ), 12, 14, 14, 48, 12, ModelRendererTurbo.MR_FRONT, new float[] {6, 6, 6, 6, 6, 6, 6, 6});
		rightArmModel[4].setRotationPoint(0F, 0F, -4F);
		rightArmModel[4].rotateAngleZ = -1.570796F;

		rightArmModel[5].addBox(1F, -8F, 0.5F, 23, 5, 11, 0F); // LeftArmFA1
		rightArmModel[5].setRotationPoint(0F, 0F, -4F);
		rightArmModel[5].rotateAngleZ = -2.268928F;

		rightArmModel[6].addBox(5F, -2F, 0.6F, 17, 5, 3, 0F); // LeftArmFA2
		rightArmModel[6].setRotationPoint(0F, 0F, -4F);
		rightArmModel[6].rotateAngleZ = -1.989675F;

		rightArmModel[7].addBox(5F, -2F, 8.4F, 17, 5, 3, 0F); // LeftArmFA3
		rightArmModel[7].setRotationPoint(0F, 0F, -4F);
		rightArmModel[7].rotateAngleZ = -1.989675F;

		rightArmModel[8].addBox(1F, -2F, 4F, 15, 4, 4, 0F); // LeftArmFA4
		rightArmModel[8].setRotationPoint(0F, 0F, -4F);
		rightArmModel[8].rotateAngleZ = -2.268928F;

		rightArmModel[9].addBox(16F, -1.5F, 4.5F, 8, 3, 3, 0F); // LeftArmFA5
		rightArmModel[9].setRotationPoint(0F, 0F, -4F);
		rightArmModel[9].rotateAngleZ = -2.268928F;

		rightArmModel[10].addBox(16F, 9F, 0F, 8, 8, 12, 0F); // LeftArmreplaceE
		rightArmModel[10].setRotationPoint(0F, 0F, -4F);
		rightArmModel[10].rotateAngleZ = -1.570796F;

		rightArmModel[11].addBox(45F, -5F, 3F, 15, 7, 6, 0F); // LeftArmrig1
		rightArmModel[11].setRotationPoint(0F, 0F, -4F);
		rightArmModel[11].rotateAngleZ = -1.570796F;

		rightArmModel[12].addBox(45F, 3F, 4.5F, 7, 3, 3, 0F); // LeftArmrig2
		rightArmModel[12].setRotationPoint(0F, 0F, -4F);
		rightArmModel[12].rotateAngleZ = -1.570796F;

		rightArmModel[13].addBox(50F, 4F, 5.5F, 5, 1, 1, 0F); // LeftArmrig3
		rightArmModel[13].setRotationPoint(0F, 0F, -4F);
		rightArmModel[13].rotateAngleZ = -1.570796F;

		rightArmModel[14].addBox(55F, 3F, 5F, 2, 3, 2, 0F); // LeftArmrig4
		rightArmModel[14].setRotationPoint(0F, 0F, -4F);
		rightArmModel[14].rotateAngleZ = -1.570796F;

		rightArmModel[15].addBox(55F, -6F, 2F, 2, 9, 8, 0F); // LeftArmrig5
		rightArmModel[15].setRotationPoint(0F, 0F, -4F);
		rightArmModel[15].rotateAngleZ = -1.570796F;

		rightArmModel[16].addBox(60F, -5F, 4.5F, 4, 3, 3, 0F); // LeftArmrig6
		rightArmModel[16].setRotationPoint(0F, 0F, -4F);
		rightArmModel[16].rotateAngleZ = -1.570796F;

		rightArmModel[17].addBox(60F, -1F, 5F, 2, 2, 2, 0F); // LeftArmrig7
		rightArmModel[17].setRotationPoint(0F, 0F, -4F);
		rightArmModel[17].rotateAngleZ = -1.570796F;	

//LeftLeg

		leftLegModel = new ModelRendererTurbo[28];
		leftLegModel[0] = new ModelRendererTurbo(this, 290, 30, textureX, textureY); // Leftlegreplace
		leftLegModel[1] = new ModelRendererTurbo(this, 117, 0, textureX, textureY); // Leftlegthigh1
		leftLegModel[2] = new ModelRendererTurbo(this, 117, 30, textureX, textureY); // Leftlegthigh2
		leftLegModel[3] = new ModelRendererTurbo(this, 117, 47, textureX, textureY); // Leftlegthigh4
		leftLegModel[4] = new ModelRendererTurbo(this, 117, 30, textureX, textureY); // Leftlegthigh3
		leftLegModel[5] = new ModelRendererTurbo(this, 117, 93, textureX, textureY); // Leftlegknee2
		leftLegModel[6] = new ModelRendererTurbo(this, 117, 116, textureX, textureY); // Leftlegknee3
		leftLegModel[7] = new ModelRendererTurbo(this, 117, 137, textureX, textureY); // Leftlegshin2
		leftLegModel[8] = new ModelRendererTurbo(this, 117, 145, textureX, textureY); // Leftlegshin3
		leftLegModel[9] = new ModelRendererTurbo(this, 117, 152, textureX, textureY); // Leftlegankle
		leftLegModel[10] = new ModelRendererTurbo(this, 117, 172, textureX, textureY); // Leftlegankle1
		leftLegModel[11] = new ModelRendererTurbo(this, 117, 60, textureX, textureY); // Leftlegthigh5
		leftLegModel[12] = new ModelRendererTurbo(this, 117, 210, textureX, textureY); // Leftlegankle3
		leftLegModel[13] = new ModelRendererTurbo(this, 117, 225, textureX, textureY); // Leftlegankle4
		leftLegModel[14] = new ModelRendererTurbo(this, 117, 242, textureX, textureY); // Leftlegankle5
		leftLegModel[15] = new ModelRendererTurbo(this, 117, 295, textureX, textureY); // Leftfoot2
		leftLegModel[16] = new ModelRendererTurbo(this, 117, 71, textureX, textureY); // Leftlegknee1
		leftLegModel[17] = new ModelRendererTurbo(this, 117, 137, textureX, textureY); // Leftlegshin1
		leftLegModel[18] = new ModelRendererTurbo(this, 117, 315, textureX, textureY); // Leftfoot2
		leftLegModel[19] = new ModelRendererTurbo(this, 117, 330, textureX, textureY); // Leftfoot3
		leftLegModel[20] = new ModelRendererTurbo(this, 117, 336, textureX, textureY); // Leftfoot4
		leftLegModel[21] = new ModelRendererTurbo(this, 117, 315, textureX, textureY); // Leftfoot5
		leftLegModel[22] = new ModelRendererTurbo(this, 117, 345, textureX, textureY); // Leftfoot6
		leftLegModel[23] = new ModelRendererTurbo(this, 117, 345, textureX, textureY); // Leftfoot7
		leftLegModel[24] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Leftfoot8
		leftLegModel[25] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Leftfoot9
		leftLegModel[26] = new ModelRendererTurbo(this, 117, 210, textureX, textureY); // Leftlegankle2
		leftLegModel[27] = new ModelRendererTurbo(this, 117, 261, textureX, textureY); // Leftlegankle6

		leftLegModel[0].addShape3D(7, -13, -11, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4) } ), 12, 14, 14, 48, 12, ModelRendererTurbo.MR_FRONT, new float[] {6, 6, 6, 6, 6, 6, 6, 6});
		leftLegModel[0].setRotationPoint(0F, -57F, 6F);

		leftLegModel[1].addBox(-2F, 3F, 1F, 5, 18, 9, 0F); // Leftlegthigh1
		leftLegModel[1].setRotationPoint(0F, -57F, 6F);
		leftLegModel[1].rotateAngleZ = 0.715585F;

		leftLegModel[2].addBox(-10F, 2F, 1.1F, 4, 12, 2, 0F); // Leftlegthigh2
		leftLegModel[2].setRotationPoint(0F, -57F, 6F);
		leftLegModel[2].rotateAngleZ = 1.27409F;

		leftLegModel[3].addBox(-6F, 7F, 4F, 3, 8, 3, 0F); // Leftlegthigh4
		leftLegModel[3].setRotationPoint(0F, -57F, 6F);
		leftLegModel[3].rotateAngleZ = 0.715585F;

		leftLegModel[4].addBox(-10F, 2F, 7.9F, 4, 12, 2, 0F); // Leftlegthigh3
		leftLegModel[4].setRotationPoint(0F, -57F, 6F);
		leftLegModel[4].rotateAngleZ = 1.27409F;

		leftLegModel[5].addBox(22F, 15F, 0.5F, 2, 11, 10, 0F); // Leftlegknee2
		leftLegModel[5].setRotationPoint(0F, -57F, 6F);
		leftLegModel[5].rotateAngleZ = -0.2268928F;

		leftLegModel[6].addBox(3F, 18F, 0.5F, 8, 9, 10, 0F); // Leftlegknee3
		leftLegModel[6].setRotationPoint(0F, -57F, 6F);
		leftLegModel[6].rotateAngleZ = 0.296706F;

		leftLegModel[7].addBox(-15F, 19F, 6.5F, 20, 3, 3, 0F); // Leftlegshin2
		leftLegModel[7].setRotationPoint(0F, -57F, 6F);
		leftLegModel[7].rotateAngleZ = 0.296706F;

		leftLegModel[8].addBox(-10F, 24F, 4.5F, 17, 2, 2, 0F); // Leftlegshin3
		leftLegModel[8].setRotationPoint(0F, -57F, 6F);
		leftLegModel[8].rotateAngleZ = 0.1919862F;

		leftLegModel[9].addBox(-16F, 18F, 0.5F, 8, 8, 10, 0F); // Leftlegankle
		leftLegModel[9].setRotationPoint(0F, -57F, 6F);
		leftLegModel[9].rotateAngleZ = 0.296706F;

		leftLegModel[10].addBox(-13F, 23.46667F, 1F, 3, 27, 9, 0F); // Leftlegankle1
		leftLegModel[10].setRotationPoint(0F, -57F, 6F);
		leftLegModel[10].rotateAngleZ = 0.3490658F;

		leftLegModel[11].addBox(-5.5F, 12F, 4.5F, 2, 8, 2, 0F); // Leftlegthigh5
		leftLegModel[11].setRotationPoint(0F, -57F, 6F);
		leftLegModel[11].rotateAngleZ = 0.715585F;

		leftLegModel[12].addBox(-22F, 19.93333F, 7.9F, 3, 12, 2, 0F); // Leftlegankle3
		leftLegModel[12].setRotationPoint(0F, -57F, 6F);
		leftLegModel[12].rotateAngleZ = 0.6108652F;

		leftLegModel[13].addBox(-17F, 23.46667F, 4F, 3, 12, 3, 0F); // Leftlegankle4
		leftLegModel[13].setRotationPoint(0F, -57F, 6F);
		leftLegModel[13].rotateAngleZ = 0.3490658F;

		leftLegModel[14].addBox(-16.5F, 35.5F, 4.5F, 2, 15, 2, 0F); // Leftlegankle5
		leftLegModel[14].setRotationPoint(0F, -57F, 6F);
		leftLegModel[14].rotateAngleZ = 0.3490658F;

		leftLegModel[15].addBox(-5F, 50F, 0.5F, 13, 7, 10, 0F); // Leftfoot2
		leftLegModel[15].setRotationPoint(0F, -57F, 6F);

		leftLegModel[16].addBox(11F, 15F, 0.5F, 2, 10, 10, 0F); // Leftlegknee1
		leftLegModel[16].setRotationPoint(0F, -57F, 6F);
		leftLegModel[16].rotateAngleZ = 0.296706F;

		leftLegModel[17].addBox(-15F, 19F, 1.5F, 20, 3, 3, 0F); // Leftlegshin1
		leftLegModel[17].setRotationPoint(0F, -57F, 6F);
		leftLegModel[17].rotateAngleZ = 0.296706F;

		leftLegModel[18].addBox(9F, 53F, 1.5F, 5, 4, 8, 0F); // Leftfoot2
		leftLegModel[18].setRotationPoint(0F, -57F, 6F);

		leftLegModel[19].addBox(-6F, 54F, 2.5F, 15, 2, 2, 0F); // Leftfoot3
		leftLegModel[19].setRotationPoint(0F, -57F, 6F);

		leftLegModel[20].addBox(-6F, 54F, 6.5F, 15, 2, 2, 0F); // Leftfoot4
		leftLegModel[20].setRotationPoint(0F, -57F, 6F);

		leftLegModel[21].addBox(-11F, 53F, 1.5F, 5, 4, 8, 0F); // Leftfoot5
		leftLegModel[21].setRotationPoint(0F, -57F, 6F);

		leftLegModel[22].addBox(-3F, 54F, -2.5F, 9, 3, 2, 0F); // Leftfoot6
		leftLegModel[22].setRotationPoint(0F, -57F, 6F);

		leftLegModel[23].addBox(-3F, 54F, 11.5F, 9, 3, 2, 0F); // Leftfoot7
		leftLegModel[23].setRotationPoint(0F, -57F, 6F);

		leftLegModel[24].addBox(-2F, 54.5F, -0.5F, 2, 2, 12, 0F); // Leftfoot8
		leftLegModel[24].setRotationPoint(0F, -57F, 6F);

		leftLegModel[25].addBox(3F, 54.5F, -0.5F, 2, 2, 12, 0F); // Leftfoot9
		leftLegModel[25].setRotationPoint(0F, -57F, 6F);

		leftLegModel[26].addBox(-22F, 19.93333F, 1.1F, 3, 12, 2, 0F); // Leftlegankle2
		leftLegModel[26].setRotationPoint(0F, -57F, 6F);
		leftLegModel[26].rotateAngleZ = 0.6108652F;

		leftLegModel[27].addBox(-12F, 23.46667F, 3F, 3, 27, 5, 0F); // Leftlegankle6
		leftLegModel[27].setRotationPoint(0F, -57F, 6F);
		leftLegModel[27].rotateAngleZ = 0.3316126F;

//Rightleg

		rightLegModel = new ModelRendererTurbo[28];
		rightLegModel[0] = new ModelRendererTurbo(this, 117, 30, textureX, textureY); // Rightlegthigh2
		rightLegModel[1] = new ModelRendererTurbo(this, 290, 30, textureX, textureY); // Rightlegreplace
		rightLegModel[2] = new ModelRendererTurbo(this, 117, 0, textureX, textureY); // Rightlegthigh1
		rightLegModel[3] = new ModelRendererTurbo(this, 117, 30, textureX, textureY); // Rightlegthigh3
		rightLegModel[4] = new ModelRendererTurbo(this, 117, 47, textureX, textureY); // Rightlegthigh4
		rightLegModel[5] = new ModelRendererTurbo(this, 117, 60, textureX, textureY); // Rightlegthigh5
		rightLegModel[6] = new ModelRendererTurbo(this, 117, 116, textureX, textureY); // Rightlegknee3
		rightLegModel[7] = new ModelRendererTurbo(this, 117, 71, textureX, textureY); // Rightlegknee1
		rightLegModel[8] = new ModelRendererTurbo(this, 117, 93, textureX, textureY); // Rightlegknee2
		rightLegModel[9] = new ModelRendererTurbo(this, 117, 137, textureX, textureY); // Rightlegshin2
		rightLegModel[10] = new ModelRendererTurbo(this, 117, 137, textureX, textureY); // RIghtlegshin1
		rightLegModel[11] = new ModelRendererTurbo(this, 117, 145, textureX, textureY); // Rightlegshin3
		rightLegModel[12] = new ModelRendererTurbo(this, 117, 152, textureX, textureY); // Rightlegankle
		rightLegModel[13] = new ModelRendererTurbo(this, 117, 172, textureX, textureY); // Rightlegankle1
		rightLegModel[14] = new ModelRendererTurbo(this, 117, 210, textureX, textureY); // Rightlegankle2
		rightLegModel[15] = new ModelRendererTurbo(this, 117, 210, textureX, textureY); // Rightlegankle3
		rightLegModel[16] = new ModelRendererTurbo(this, 117, 225, textureX, textureY); // Rightlegankle4
		rightLegModel[17] = new ModelRendererTurbo(this, 117, 242, textureX, textureY); // Rightlegankle5
		rightLegModel[18] = new ModelRendererTurbo(this, 117, 261, textureX, textureY); // Rightlegankle6
		rightLegModel[19] = new ModelRendererTurbo(this, 117, 295, textureX, textureY); // Rightfoot2
		rightLegModel[20] = new ModelRendererTurbo(this, 117, 315, textureX, textureY); // Rightfoot2
		rightLegModel[21] = new ModelRendererTurbo(this, 117, 330, textureX, textureY); // Rightfoot3
		rightLegModel[22] = new ModelRendererTurbo(this, 117, 336, textureX, textureY); // Rightfoot4
		rightLegModel[23] = new ModelRendererTurbo(this, 117, 315, textureX, textureY); // Rightfoot5
		rightLegModel[24] = new ModelRendererTurbo(this, 117, 345, textureX, textureY); // Rightfoot6
		rightLegModel[25] = new ModelRendererTurbo(this, 117, 345, textureX, textureY); // Rightfoot7
		rightLegModel[26] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Rightfoot8
		rightLegModel[27] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Rightfoot9

		rightLegModel[0].addBox(-10F, 2F, -9.9F, 4, 12, 2, 0F); // Rightlegthigh2
		rightLegModel[0].setRotationPoint(0F, -57F, -6F);
		rightLegModel[0].rotateAngleZ = 1.27409F;

		rightLegModel[1].addShape3D(7, -13, -1, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(10, 0, 10, 0), new Coord2D(14, 4, 14, 4), new Coord2D(14, 10, 14, 10), new Coord2D(10, 14, 10, 14), new Coord2D(4, 14, 4, 14), new Coord2D(0, 10, 0, 10), new Coord2D(0, 4, 0, 4) } ), 12, 14, 14, 48, 12, ModelRendererTurbo.MR_FRONT, new float[] {6, 6, 6, 6, 6, 6, 6, 6});
		rightLegModel[1].setRotationPoint(0F, -57F, -6F);

		rightLegModel[2].addBox(-2F, 3F, -10F, 5, 18, 9, 0F); // Rightlegthigh1
		rightLegModel[2].setRotationPoint(0F, -57F, -6F);
		rightLegModel[2].rotateAngleZ = 0.715585F;

		rightLegModel[3].addBox(-10F, 2F, -3.1F, 4, 12, 2, 0F); // Rightlegthigh3
		rightLegModel[3].setRotationPoint(0F, -57F, -6F);
		rightLegModel[3].rotateAngleZ = 1.27409F;

		rightLegModel[4].addBox(-6F, 7F, -7F, 3, 8, 3, 0F); // Rightlegthigh4
		rightLegModel[4].setRotationPoint(0F, -57F, -6F);
		rightLegModel[4].rotateAngleZ = 0.715585F;

		rightLegModel[5].addBox(-5.5F, 12F, -6.5F, 2, 8, 2, 0F); // Rightlegthigh5
		rightLegModel[5].setRotationPoint(0F, -57F, -6F);
		rightLegModel[5].rotateAngleZ = 0.715585F;

		rightLegModel[6].addBox(3F, 18F, -10.5F, 8, 9, 10, 0F); // Rightlegknee3
		rightLegModel[6].setRotationPoint(0F, -57F, -6F);
		rightLegModel[6].rotateAngleZ = 0.296706F;

		rightLegModel[7].addBox(11F, 15F, -10.5F, 2, 10, 10, 0F); // Rightlegknee1
		rightLegModel[7].setRotationPoint(0F, -57F, -6F);
		rightLegModel[7].rotateAngleZ = 0.296706F;

		rightLegModel[8].addBox(22F, 15F, -10.5F, 2, 11, 10, 0F); // Rightlegknee2
		rightLegModel[8].setRotationPoint(0F, -57F, -6F);
		rightLegModel[8].rotateAngleZ = -0.2268928F;

		rightLegModel[9].addBox(-15F, 19F, -4.5F, 20, 3, 3, 0F); // Rightlegshin2
		rightLegModel[9].setRotationPoint(0F, -57F, -6F);
		rightLegModel[9].rotateAngleZ = 0.296706F;

		rightLegModel[10].addBox(-15F, 19F, -9.5F, 20, 3, 3, 0F); // RIghtlegshin1
		rightLegModel[10].setRotationPoint(0F, -57F, -6F);
		rightLegModel[10].rotateAngleZ = 0.296706F;

		rightLegModel[11].addBox(-10F, 24F, -6.5F, 17, 2, 2, 0F); // Rightlegshin3
		rightLegModel[11].setRotationPoint(0F, -57F, -6F);
		rightLegModel[11].rotateAngleZ = 0.1919862F;

		rightLegModel[12].addBox(-16F, 18F, -10.5F, 8, 8, 10, 0F); // Rightlegankle
		rightLegModel[12].setRotationPoint(0F, -57F, -6F);
		rightLegModel[12].rotateAngleZ = 0.296706F;

		rightLegModel[13].addBox(-13F, 23.46667F, -10F, 3, 27, 9, 0F); // Rightlegankle1
		rightLegModel[13].setRotationPoint(0F, -57F, -6F);
		rightLegModel[13].rotateAngleZ = 0.3490658F;

		rightLegModel[14].addBox(-22F, 19.93333F, -9.9F, 3, 12, 2, 0F); // Rightlegankle2
		rightLegModel[14].setRotationPoint(0F, -57F, -6F);
		rightLegModel[14].rotateAngleZ = 0.6108652F;

		rightLegModel[15].addBox(-22F, 19.93333F, -3.1F, 3, 12, 2, 0F); // Rightlegankle3
		rightLegModel[15].setRotationPoint(0F, -57F, -6F);
		rightLegModel[15].rotateAngleZ = 0.6108652F;

		rightLegModel[16].addBox(-17F, 23.46667F, -7F, 3, 12, 3, 0F); // Rightlegankle4
		rightLegModel[16].setRotationPoint(0F, -57F, -6F);
		rightLegModel[16].rotateAngleZ = 0.3490658F;

		rightLegModel[17].addBox(-16.5F, 35.5F, -6.5F, 2, 15, 2, 0F); // Rightlegankle5
		rightLegModel[17].setRotationPoint(0F, -57F, -6F);
		rightLegModel[17].rotateAngleZ = 0.3490658F;

		rightLegModel[18].addBox(-11F, 23.46667F, -8F, 3, 27, 5, 0F); // Rightlegankle6
		rightLegModel[18].setRotationPoint(-1F, -57F, -6F);
		rightLegModel[18].rotateAngleZ = 0.3316126F;

		rightLegModel[19].addBox(-5F, 50F, -10.5F, 13, 7, 10, 0F); // Rightfoot2
		rightLegModel[19].setRotationPoint(0F, -57F, -6F);

		rightLegModel[20].addBox(9F, 53F, -9.5F, 5, 4, 8, 0F); // Rightfoot2
		rightLegModel[20].setRotationPoint(0F, -57F, -6F);

		rightLegModel[21].addBox(-6F, 54F, -6.5F, 15, 2, 2, 0F); // Rightfoot3
		rightLegModel[21].setRotationPoint(0F, -57F, -8F);

		rightLegModel[22].addBox(-6F, 54F, -4.5F, 15, 2, 2, 0F); // Rightfoot4
		rightLegModel[22].setRotationPoint(0F, -57F, -6F);

		rightLegModel[23].addBox(-11F, 53F, -9.5F, 5, 4, 8, 0F); // Rightfoot5
		rightLegModel[23].setRotationPoint(0F, -57F, -6F);

		rightLegModel[24].addBox(-3F, 54F, -13.5F, 9, 3, 2, 0F); // Rightfoot6
		rightLegModel[24].setRotationPoint(0F, -57F, -6F);

		rightLegModel[25].addBox(-3F, 54F, 0.5F, 9, 3, 2, 0F); // Rightfoot7
		rightLegModel[25].setRotationPoint(0F, -57F, -6F);

		rightLegModel[26].addBox(-2F, 54.5F, -23.5F, 2, 2, 12, 0F); // Rightfoot8
		rightLegModel[26].setRotationPoint(0F, -57F, 6F);

		rightLegModel[27].addBox(3F, 54.5F, -23.5F, 2, 2, 12, 0F); // Rightfoot9
		rightLegModel[27].setRotationPoint(0F, -57F, 6F);	
		


// Hips
		hipsModel = new ModelRendererTurbo[5];
		hipsModel[0] = new ModelRendererTurbo(this,  240,  70, textureX, textureY); // Hip2
		hipsModel[1] = new ModelRendererTurbo(this,  240,  90, textureX, textureY); // Hip3
		hipsModel[2] = new ModelRendererTurbo(this,  240,  107, textureX, textureY); // Hip4
		hipsModel[3] = new ModelRendererTurbo(this,  240,  107, textureX, textureY); // Hip5
		hipsModel[4] = new ModelRendererTurbo(this,  0,  475, textureX, textureY); // Hip

		hipsModel[0].addBox(0F, 0F, 0F, 13, 5, 12, 0F); // Hip2
		hipsModel[0].setRotationPoint(-7.5F, -57F, -6F);

		hipsModel[1].addBox(0F, 0F, 0F, 12, 2, 12, 0F); // Hip3
		hipsModel[1].setRotationPoint(-7.5F, -52F, -6F);

		hipsModel[2].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Hip4
		hipsModel[2].setRotationPoint(-4.5F, -50F, -6F);

		hipsModel[3].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Hip5
		hipsModel[3].setRotationPoint(1.5F, -50F, -6F);

		hipsModel[4].addBox(0F, 0F, 0F, 15, 3, 24, 0F); // Hip
		hipsModel[4].setRotationPoint(-8F, -60F, -12F);		
		


		flipAll();
	}
}