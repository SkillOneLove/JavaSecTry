package FinalClassesMethods.Assignment2;

/**
 * Практика #2
 * Пример кода, демонстрирующего невозможность наследования от final-класса.
 */
public class Main {
    public static void main(String[] args) {
        FinalClassExample example = new FinalClassExample();

        example.print();
    }
}

final class FinalClassExample {
    public void print() {
        System.out.println("От final-класса нельзя создать подкласс.");
    }
}

/*
Такой код не скомпилируется:

class ChildOfFinalClass extends FinalClassExample {
}

Потому, что класс FinalClassExample объявлен как final.
*/
