package commenting;

/**
 * Класс-пример для демонстрации работы комментариев и утилиты javadoc.
 * Содержит простой метод сложения двух чисел и точку входа.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2026-05-31
 */
public class Main {

    /**
     * Главный метод программы.
     * 
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Однострочный комментарий: объявление и инициализация переменных
        int x = 5;
        int y = 3;

        int sum = add(x, y);
        System.out.println("Сумма " + x + " и " + y + " = " + sum);
    }

    /**
     * Возвращает сумму двух целых чисел.
     * 
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     * @throws ArithmeticException если происходит переполнение (в данном примере не возникает)
     * @see Math#addExact(int, int)
     */
    public static int add(int a, int b) {
        // Однострочный комментарий внутри метода
        return a + b; // результат сложения
    }
}
