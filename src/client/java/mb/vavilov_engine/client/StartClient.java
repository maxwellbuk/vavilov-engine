package mb.vavilov_engine.client;

import mb.vavilov_engine.client.handlers.HandlerStructure;
import mb.vavilov_engine.utils.PacketModInfo;
import net.fabricmc.api.ClientModInitializer;

public class StartClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		PacketModInfo.LOGGER.info("Привет, это старт клиента");
		HandlerStructure.initHandlerSaveStructure();
	}

}