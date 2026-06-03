package ExceptionHandlingMethods;

/**
 * Одно исключение перехвачено, второе приводит к аварийной остановке.
 */
public class Main {
    public static void main(String[] args) {
        caughtException();

        /*
         * Вызов notCaughtException() закомментирован,
         * потому что он завершит программу исключением.
         *
         * Раскомментируйте строку ниже,
         * чтобы увидеть аварийную остановку.
         */
        // notCaughtException();
    }

    private static void caughtException() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: " + e.getClass().getSimpleName());
        }
    }

    private static void notCaughtException() {
        String text = null;

        // NullPointerException не обрабатывается и поднимается вверх по стеку.
        System.out.println(text.length());
    }
}
