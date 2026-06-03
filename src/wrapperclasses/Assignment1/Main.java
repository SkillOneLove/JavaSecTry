package wrapperclasses.Assignment1;

public class Main {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("12");
        Integer negative = Integer.decode("-12");
        Integer hex1 = Integer.decode("0x12");
        Integer hex2 = Integer.decode("#12");
        Integer octal = Integer.decode("012");

        System.out.println("Integer.decode(\"12\") = " + decimal);
        System.out.println("Integer.decode(\"-12\") = " + negative);
        System.out.println("Integer.decode(\"0x12\") = " + hex1);
        System.out.println("Integer.decode(\"#12\") = " + hex2);
        System.out.println("Integer.decode(\"012\") = " + octal);

        Long longHex = Long.decode("0xFF");
        Byte byteValue = Byte.decode("127");

        System.out.println("Long.decode(\"0xFF\") = " + longHex);
        System.out.println("Byte.decode(\"127\") = " + byteValue);
        System.out.println();
    }
}

