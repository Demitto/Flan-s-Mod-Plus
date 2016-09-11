package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelUKM2013 extends ModelGun

{
public ModelUKM2013()
	{

	int textureX = 256;
	int textureY = 128;

		gunModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[1];

  		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013.obj");
  		gunModel[0].setRotationPoint(3.5F, 2F, 0F);

  		ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/UKM2013_magazine.obj");
  		ammoModel[0].setRotationPoint(3.5F, 2F, 0F);

		animationType = EnumAnimationType.BOTTOM_CLIP;
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.6F;
		untiltGunTime = 0.163F;

		translateAll(-3.5F, -1.8F, 0F);

		//flipAll();
	}
}
