package Cycle.Assignment1;

public class Main {
    public static void main(String[] args) {
    int whileCounter = 0;
        while (true) {
            System.out.println("Бесконечный while, итерация " + whileCounter);
            whileCounter++;

            // break добавлен, чтобы пример не завис навсегда.
            if (whileCounter == 3) {
                break;
            }
        }

        int doWhileCounter = 0;
        do {
            System.out.println("Бесконечный do-while, итерация " + doWhileCounter);
            doWhileCounter++;

            // break добавлен, чтобы пример не завис навсегда.
            if (doWhileCounter == 3) {
                break;
            }
        } while (true);
    }
}
