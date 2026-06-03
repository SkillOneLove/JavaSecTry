package InformationFormatting.Assignment1;

import java.util.Formatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика #1. Пять спецификаторов форматирования");

        Formatter formatter = new Formatter(System.out, Locale.US);

        formatter.format("boolean: %b%n", true);      // %b — логическое значение
        formatter.format("char: %c%n", 'A');          // %c — символ
        formatter.format("integer: %d%n", 125);       // %d — десятичное целое число
        formatter.format("float: %.2f%n", 12.34567);  // %f — число с плавающей точкой
        formatter.format("string: %s%n", "Java");    // %s — строковое представление
        formatter.format("hash code: %h%n", "Java"); // %h — хэшкод аргумента в шестнадцатеричном виде
        formatter.format("percent: 100%%%n");         // %% — символ процента

        formatter.flush();
        formatter.close();
    }
}
