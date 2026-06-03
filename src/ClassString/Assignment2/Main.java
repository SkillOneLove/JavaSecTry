package ClassString.Assignment2;

import java.util.StringJoiner;

/**
 * StringJoiner удобен, когда нужно собрать строку из частей с разделителем,
 * а также указать префикс и суффикс.
 */
public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");

        System.out.println(joiner);
    }
}
