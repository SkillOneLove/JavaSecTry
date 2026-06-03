package Polymorphism.Assignment1;

/**
 * Пример перегруженных методов.
 */
public class Main {
    public static void main(String[] args) {
        OverloadExample overload = new OverloadExample();

        overload.print(10);
        overload.print("Java");
        overload.print(10, "Java");
    }
}

class OverloadExample {
    void print(int value) {
        System.out.println("int: " + value);
    }

    void print(String value) {
        System.out.println("String: " + value);
    }

    void print(int number, String text) {
        System.out.println(number + " " + text);
    }
}
