
package com.flansmod.client.model.bmp;

import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelJaguar2 extends ModelPlane
{
	
	public ModelJaguar2()
	{
		int textureX = 1024;
		int textureY = 1024;
		
		
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Body1	

		
		bodyModel[0].addObj("/British Military Pack/assets/flansmod/models/Jaguar3.obj");
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
		


	}
	

	}
	
