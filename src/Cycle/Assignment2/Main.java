package Cycle.Assignment2;

public class Main {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("i = 3 пропускаем через continue");
                continue;
            }

            if (i == 8) {
                System.out.println("i = 8 останавливаем цикл через break");
                break;
            }

            System.out.println("i = " + i);
        }

        System.out.println();
    }
}
