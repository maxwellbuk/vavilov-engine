package mb.vavilov_engine.client.handlers;

import java.nio.file.Path;

import mb.vavilov_engine.client.mod.utils.PacketStructure;
import mb.vavilov_engine.utils.PacketModInfo;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.util.WorldSavePath;

public class HandlerStructure {

    public static Path root;

    public static void initHandlerSaveStructure() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {

            if (server == null) {
                PacketModInfo.LOGGER.error("При заходе в мир, не удалось получить серверные полномочия");
                return;
            }

            root = server.getSavePath(
                WorldSavePath.ROOT
            );

            PacketStructure.initSaveStructure(
                root.resolve(PacketModInfo.MOD_ID)
            );

        });
    }

}
