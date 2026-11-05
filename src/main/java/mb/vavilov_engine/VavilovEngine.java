package mb.vavilov_engine;

import mb.vavilov_engine.utils.packets.PacketModInfo;

import net.fabricmc.api.ModInitializer;

public class VavilovEngine implements ModInitializer {

	@Override
	public void onInitialize() {
		PacketModInfo.LOGGER.info("Привет! Это запуск сервера");
	}

}
