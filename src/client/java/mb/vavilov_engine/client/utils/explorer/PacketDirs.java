package mb.vavilov_engine.client.utils.explorer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PacketDirs {
    
    public static void create(Path dir) throws IOException {
        Files.createDirectories(dir);
    }

}
