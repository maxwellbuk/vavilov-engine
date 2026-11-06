package mb.vavilov_engine.client.utils.explorer;

import java.nio.file.Files;
import java.nio.file.Path;

import java.io.IOException;

public class PacketFiles {
    
    public static void create(Path file, String value) throws IOException {
        Files.writeString(file, value);
    }

    public static String read(Path file) throws IOException {
        return Files.readString(file);
    }

}
