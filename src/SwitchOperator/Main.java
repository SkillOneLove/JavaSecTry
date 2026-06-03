package SwitchOperator;

class Main {
    enum Day {
        MONDAY,
        TUESDAY
    }

    /**
     * Какого типа может быть переменная в switch?
     *
     * В классическом switch в Java можно использовать:
     * byte, short, char, int;
     * Byte, Short, Character, Integer;
     * enum;
     * String.
     *
     * Нельзя использовать long, float, double, boolean.
     */
    public static void main() {
        byte byteValue = 1;
        switch (byteValue) {
            case 1:
                System.out.println("byte");
                break;
            default:
                break;
        }

        short shortValue = 1;
        switch (shortValue) {
            case 1:
                System.out.println("short");
                break;
            default:
                break;
        }

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("char");
                break;
            default:
                break;
        }

        int intValue = 1;
        switch (intValue) {
            case 1:
                System.out.println("int");
                break;
            default:
                break;
        }

        Integer integerValue = 1;
        switch (integerValue) {
            case 1:
                System.out.println("Integer");
                break;
            default:
                break;
        }

        String stringValue = "java";
        switch (stringValue) {
            case "java":
                System.out.println("String");
                break;
            default:
                break;
        }

        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum");
                break;
            default:
                break;
        }

        System.out.println();
    }
}