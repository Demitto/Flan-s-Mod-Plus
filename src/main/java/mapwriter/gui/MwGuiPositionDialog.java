package mapwriter.gui;

import mapwriter.Mw;
import mapwriter.map.MapView;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MwGuiPositionDialog{


	final Mw mw;
	final MapView mapView;

    public MwGuiPositionDialog(GuiScreen parentScreen, Mw mw, MapView mapView, int x, int y, int z) {
    	this.mw = mw;
    	this.mapView = mapView;
    	this.mw.impactToMapPos(mapView, x, y, z);
    }
}
