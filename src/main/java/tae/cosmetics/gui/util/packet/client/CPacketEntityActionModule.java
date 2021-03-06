package tae.cosmetics.gui.util.packet.client;

import java.awt.Color;

import net.minecraft.network.play.client.CPacketEntityAction;
import tae.cosmetics.gui.util.packet.AbstractPacketModule;

public class CPacketEntityActionModule extends AbstractPacketModule {

	private CPacketEntityAction packet;
	
	public CPacketEntityActionModule(CPacketEntityAction packet, long timestamp) {
		
		super("Sent to indicate a client action.", timestamp, packet);
		this.packet = packet;
	}

	@Override
	public void drawText(int x, int y) {
		fontRenderer.drawString("CPacketEntityAction", x, y, Color.WHITE.getRGB());
		if(!minimized) {
			fontRenderer.drawString("Action: " + packet.getAction(), x, y + 14, Color.WHITE.getRGB());
			fontRenderer.drawString("Aux data: " + packet.getAuxData(), x, y + 28, Color.WHITE.getRGB());
		}
	}

	@Override
	public boolean type() {
		return true;
	}

}
