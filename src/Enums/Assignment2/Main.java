package Enums.Assignment2;

public class Main {
    public static void main(String[] args) {
        Operation operation = Operation.PLUS;
        System.out.println(operation.apply(5, 3));

        Operation secondOperation = Operation.MULTIPLY;
        System.out.println(secondOperation.apply(5, 3));
    }
}

// Собственное перечисление с дополнительным методом.
enum Operation {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    };

    public abstract int apply(int a, int b);
}