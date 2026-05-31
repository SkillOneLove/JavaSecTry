package typesLiterals.Assignment5;

public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.7;

        // b + s: byte и short всегда в операциях расширяются до int (оба меньше int)
        // Результат: int
        int result1 = b + s;

        // i + l: int расширяется до long (long больше int)
        // Результат: long
        long result2 = i + l;

        // l + f: long расширяется до float (float стоит правее long в цепочке расширения)
        // Результат: float
        float result3 = l + f;

        // f + d: float расширяется до double (double больше float)
        // Результат: double
        double result4 = f + d;

        System.out.println("byte + short = " + result1);
        System.out.println("int + long = " + result2);
        System.out.println("long + float = " + result3);
        System.out.println("float + double = " + result4);
    }
}
