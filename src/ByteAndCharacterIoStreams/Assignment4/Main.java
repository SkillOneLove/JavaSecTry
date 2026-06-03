package ByteAndCharacterIoStreams.Assignment4;

/**
 * AutoCloseable
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * AutoCloseable позволяет объекту автоматически закрываться
         * в try-with-resources. Это помогает не забыть освободить ресурс:
         * файл, поток, сетевое соединение.
         */
        try (ByteArrayInputStream input = new ByteArrayInputStream("Java".getBytes(StandardCharsets.UTF_8))) {
            System.out.println("Первый байт: " + input.read());
        }
    }
}
