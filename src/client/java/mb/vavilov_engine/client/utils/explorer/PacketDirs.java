package mb.vavilov_engine.client.utils.explorer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class PacketDirs {
    
    public static void create(Path dirs) throws IOException {
        Files.createDirectories(dirs);
    }

}
