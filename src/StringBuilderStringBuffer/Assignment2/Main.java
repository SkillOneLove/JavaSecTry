package StringBuilderStringBuffer.Assignment2;

/**
 * Преобразования между String, StringBuilder и StringBuffer.
 */
public class Main {
    public static void main(String[] args) {
        String string = "Java";

        StringBuilder builderFromString = new StringBuilder(string);
        StringBuffer bufferFromString = new StringBuffer(string);

        String stringFromBuilder = builderFromString.toString();
        String stringFromBuffer = bufferFromString.toString();

        StringBuilder builderFromBuffer = new StringBuilder(bufferFromString.toString());
        StringBuffer bufferFromBuilder = new StringBuffer(builderFromString.toString());

        System.out.println(stringFromBuilder);
        System.out.println(stringFromBuffer);
        System.out.println(builderFromBuffer);
        System.out.println(bufferFromBuilder);
    }
}
