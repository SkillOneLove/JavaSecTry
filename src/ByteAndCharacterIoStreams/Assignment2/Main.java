package ByteAndCharacterIoStreams.Assignment2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * OutputStream и write(int)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            output.write(72); // H
            output.write(105); // i
            output.write(33); // !

            String result = output.toString(StandardCharsets.UTF_8);
            System.out.println(result);
        }
    }
}
