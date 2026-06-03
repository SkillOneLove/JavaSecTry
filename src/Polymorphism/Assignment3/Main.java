package Polymorphism.Assignment3;

/**
 * Когда @Override помогает найти ошибку.
 */
public class Main {
    public static void main(String[] args) {
        OverrideMistakeFixed fixed = new OverrideMistakeFixed();

        fixed.print("text");
    }
}

class OverrideMistakeParent {
    void print(String text) {
        System.out.println("Parent: " + text);
    }
}

class OverrideMistakeFixed extends OverrideMistakeParent {
    @Override
    void print(String text) {
        System.out.println("Child: " + text);
    }

    /*
    Если случайно написать другой параметр, @Override сразу покажет ошибку:

    @Override
    void print(Object text) {
        System.out.println(text);
    }

    Без @Override это был бы новый перегруженный метод, а не переопределение.
    */
}
