package typesLiterals.Assignment1;
public class Main {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {
        // 1. byte (8 бит, диапазон -128..127)
        byte byteValue = 42;
        byte byteZero = 0;                  
        System.out.println("byte: " + byteValue + ", нулевое: " + byteZero);
        System.out.println("default byte (поле класса): " + defaultByte); // 0

        // 2. short (16 бит)
        short shortValue = 1000;
        short shortZero = 0;
        System.out.println("short: " + shortValue + ", нулевое: " + shortZero);
        System.out.println("default short: " + defaultShort);

        // 3. int (32 бита)
        int intValue = 123456;
        int intZero = 0;
        System.out.println("int: " + intValue + ", нулевое: " + intZero);
        System.out.println("default int: " + defaultInt);

        // 4. long (64 бита) – требуется суффикс L
        long longValue = 9876543210L;
        long longZero = 0L;
        System.out.println("long: " + longValue + ", нулевое: " + longZero);
        System.out.println("default long: " + defaultLong);

        // 5. float (32 бита) – требуется суффикс f
        float floatValue = 3.14f;
        float floatZero = 0.0f;
        System.out.println("float: " + floatValue + ", нулевое: " + floatZero);
        System.out.println("default float: " + defaultFloat);

        // 6. double (64 бита)
        double doubleValue = 2.71828;
        double doubleZero = 0.0;
        System.out.println("double: " + doubleValue + ", нулевое: " + doubleZero);
        System.out.println("default double: " + defaultDouble);

        // 7. char (16 бит, символ Unicode)
        char charValue = 'A';
        char charZero = '\u0000';   // нулевой символ (null character)
        System.out.println("char: " + charValue + ", нулевое (код): " + (int) charZero);
        System.out.println("default char (код): " + (int) defaultChar);

        // 8. boolean (логический, true/false)
        boolean booleanValue = true;
        boolean booleanZero = false;
        System.out.println("boolean: " + booleanValue + ", нулевое: " + booleanZero);
        System.out.println("default boolean: " + defaultBoolean);
    }
}
