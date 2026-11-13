package mb.vavilov_engine;

import mb.vavilov_engine.utils.PacketModInfo;
import net.fabricmc.api.ModInitializer;

public class StartServer implements ModInitializer {

	@Override
	public void onInitialize() {
		PacketModInfo.LOGGER.info("Привет, это старт сервера");
	}

}
