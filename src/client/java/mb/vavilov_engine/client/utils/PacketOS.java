package mb.vavilov_engine.client.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class PacketOS {
    
    public static boolean existsPath(Path path) {
        return Files.exists(path);
    }

    public static void deletePath(Path path) throws IOException {
        Files.deleteIfExists(path);
    }

}
