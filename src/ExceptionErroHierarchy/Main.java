package ExceptionErroHierarchy;

/**
 * Генерация и обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: выход за границы массива");
        }

        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        try {
            Class.forName("no.such.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: класс не найден");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: обращение к методу через null");
        }
    }

    private static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрицательным");
        }
    }
}
