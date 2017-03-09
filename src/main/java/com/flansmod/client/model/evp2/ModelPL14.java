package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPL14 extends ModelGun

{
public ModelPL14()
	{

	int textureX = 1024;
	int textureY = 1024;

		gunModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[1];
		slideModel = new ModelRendererTurbo[1];

  		gunModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		gunModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_body.obj");
  		gunModel[0].setRotationPoint(3.5F, 2F, 0F);

  		ammoModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		ammoModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_magazine.obj");
  		ammoModel[0].setRotationPoint(3.5F, 2F, 0F);

  		slideModel[0] = new ModelRendererTurbo(this,  0,  0, textureX, textureY); // barrel1
  		slideModel[0].addObj("/Modern Weapons Pack/assets/flansmod/models/pl14_slide.obj");
  		slideModel[0].setRotationPoint(3.5F, 2F, 0F);

		animationType = EnumAnimationType.PISTOL_CLIP;
		/*numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.6F;
		untiltGunTime = 0.163F;*/
		gunSlideDistance = 0.20F;
		numBulletsInReloadAnimation = 1;
		tiltGunTime = 0.10F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.625F;
		untiltGunTime = 0.275F;


		//translateAll(-3.5F, -2F, 0F);
		translateAll(-3.5F, -1.8F, 0F);

		//flipAll();
	}
}
