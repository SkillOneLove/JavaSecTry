package BlockFinally;

public class Main {
    public static void main(String[] args) {
        practice1TryOnly();
        practice2TryFinally();
        practice3TwoFinally();
    }

    private static void practice1TryOnly() {
        System.out.println("Практика #1. try без catch и finally");
        /*
         * Нет, такую конструкцию использовать нельзя.
         * В Java после try обязательно должен идти хотя бы один catch или блок finally.
         * Код вида try { ... } сам по себе вызовет ошибку компиляции.
         */
        System.out.println("try без catch и finally не компилируется.");
    }

    private static void practice2TryFinally() {
        System.out.println("\nПрактика #2. try только с finally");
        try {
            System.out.println("Код в try выполнен.");
        } finally {
            System.out.println("finally выполнится всегда, даже если catch отсутствует.");
        }
    }

    private static void practice3TwoFinally() {
        System.out.println("\nПрактика #3. try с двумя finally");
        /*
         * Нет, у одного try может быть только один блок finally.
         * Если нужно выполнить несколько действий, их пишут внутри одного finally.
         */
        try {
            System.out.println("Код в try выполнен.");
        } finally {
            System.out.println("Первое действие очистки.");
            System.out.println("Второе действие очистки.");
        }
    }
}

