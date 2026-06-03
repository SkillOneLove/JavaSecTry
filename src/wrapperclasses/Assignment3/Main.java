package wrapperclasses.Assignment3;

public class Main {
    /**
     * В каком случае при автоупаковке/автораспаковке будет брошено NullPointerException?
     *
     * NullPointerException появляется при автораспаковке null.
     * То есть когда объект-оболочка равен null, а Java пытается получить
     * из него значение базового типа.
     */
    public static void main(String[] args) {

        Integer value = null;

        try {
            int number = value; // unboxing null -> NullPointerException
            System.out.println(number);
        } catch (NullPointerException exception) {
            System.out.println("При автораспаковке null возникло NullPointerException");
        }

        // Автоупаковка обычного значения безопасна:
        int primitive = 10;
        Integer boxed = primitive; // boxing
        System.out.println("Автоупаковка int в Integer: " + boxed);
        System.out.println();
    }
}
