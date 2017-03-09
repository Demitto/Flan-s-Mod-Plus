package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMP5A5 extends ModelGun

{
public ModelMP5A5()
	{

	int textureX = 512;
	int textureY = 512;

		gunModel = new ModelRendererTurbo[1];

  		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/MP5A5.obj");
  		gunModel[0].setRotationPoint(3.5F, 2F, 0F);

		animationType = EnumAnimationType.RIFLE_TOP;
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.6F;
		untiltGunTime = 0.163F;

		translateAll(0F, 1F, 0F);

		//flipAll();
	}
}
