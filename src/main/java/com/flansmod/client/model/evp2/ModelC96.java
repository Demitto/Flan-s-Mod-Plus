package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelC96 extends ModelGun

{
public ModelC96()
	{

	int textureX = 1000;
	int textureY = 1000;

		gunModel = new ModelRendererTurbo[1];

  		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/C96.obj");
  		gunModel[0].setRotationPoint(3.5F, 2F, 0F);

		animationType = EnumAnimationType.RIFLE_TOP;
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.6F;
		untiltGunTime = 0.163F;

		//translateAll(0F, 2F, 0F);
		//translateAll(-3.2F, -1.8F, 0F);
		translateAll(-3.5F, -1.8F, 0F);

		//flipAll();
	}
}
