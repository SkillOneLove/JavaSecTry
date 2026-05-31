package typesLiterals.Assignment5;

public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 5.5f;
        double d = 6.7;

        int result1 = b + s;
        long result2 = i + l;
        float result3 = l + f;
        double result4 = f + d;

        System.out.println("byte + short = " + result1);
        System.out.println("int + long = " + result2);
        System.out.println("long + float = " + result3);
        System.out.println("float + double = " + result4);
    }
}
