package mb.vavilov_engine.utils.packets;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PacketModInfo {

    public static final String MOD_ID = "vavilov-engine";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier createIDWithPath(String path) {
		return Identifier.of(MOD_ID, path);
	}
    
}
