package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Чтение данных из текстового файла через Scanner.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Чтение данных из текстового файла через Scanner");

        if (args.length == 0) {
            System.out.println("Передайте путь к файлу первым аргументом командной строки.");
            System.out.println("Пример: src\\Scanner\\input.txt");
            return;
        }

        File file = new File(args[0]);

        try (Scanner scanner = new Scanner(file)) {
            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + file.getAbsolutePath());
        }
    }
}
