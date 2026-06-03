package ConditionalBranchStatement;

public class Main {
    /*
     * Исходный код:
     *
     * int i = 0;
     * if (a == 1) {
     *     i = 1;
     * } else if (a == 2) {
     *     i = 2;
     * } else {
     *     i = 3;
     * }
     *
     * Через тернарный оператор:
     *
     * int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
     */
    public static void main(String[] args) {
        int a = 2;

        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println("i = " + i);

    }
}
