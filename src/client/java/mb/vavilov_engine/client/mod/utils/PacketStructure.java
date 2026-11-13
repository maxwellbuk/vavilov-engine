package mb.vavilov_engine.client.mod.utils;

import java.io.IOException;

import java.nio.file.Path;
import java.util.Map;

import mb.vavilov_engine.client.utils.explorer.PacketDirs;
import mb.vavilov_engine.utils.PacketModInfo;

public class PacketStructure {

    public static final Map<String, Path> SAVE_STRUCTURE = Map.of(
        "scripts", Path.of("scripts")
    );

    public static void initSaveStructure(Path root) {

        for (Path path : SAVE_STRUCTURE.values()) {
            try {
                Path dir = root.resolve(path);
                PacketDirs.create(dir);
                PacketModInfo.LOGGER.info(
                    "Была создана папка по пути: " +
                    dir
                );
            }
            catch (IOException error) {
                PacketModInfo.LOGGER.error(
                    "Не удалось создать папку, по причине: " +
                    error
                );
            }
        }

        PacketModInfo.LOGGER.info(
            "Была создана структура для работы мода по пути: " +
            root.toString()
        );
        
    }

}
