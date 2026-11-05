package mb.vavilov_engine.client;

import mb.vavilov_engine.utils.packets.PacketModInfo;
import net.fabricmc.api.ClientModInitializer;

public class VavilovEngineClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		PacketModInfo.LOGGER.info("Привет! Это запуск клиента");
	}

}