package typesLiterals.Assignment6;

public class Main {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i;

        double d = 15.75;
        int number = (int) d;

        long l = 100000L;
        int smallNumber = (int) l;

        int code = 65;
        char symbol = (char) code;

        System.out.println("int в byte: " + b);
        System.out.println("double в int: " + number);
        System.out.println("long в int: " + smallNumber);
        System.out.println("int в char: " + symbol);
    }
}
