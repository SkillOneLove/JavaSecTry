package ByteAndCharacterIoStreams.Assignment1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * InputStream и read()
 */
public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = "ABC".getBytes(StandardCharsets.UTF_8);

        try (ByteArrayInputStream input = new ByteArrayInputStream(data)) {
            int value;
            while ((value = input.read()) != -1) {
                System.out.println("Прочитан байт: " + value + ", символ: " + (char) value);
            }
        }
    }
}
