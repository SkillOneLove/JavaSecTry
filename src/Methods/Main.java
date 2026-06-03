package Methods;

public class Main {
public static void main(String[] args) {
        MathBox mathBox = new MathBox();
        System.out.println(mathBox.add(2, 3));
        System.out.println(mathBox.add(2.5, 3.1));
        System.out.println(mathBox.add(1, 2, 3));

        Creature animal = new Creature();
        Creature dog = new Cat();

        animal.makeSound();
        dog.makeSound();
    }
}

class MathBox {
    // Перегрузка метода: одинаковое имя, но разные параметры.
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Creature {
    public void makeSound() {
        System.out.println("Creature makes a sound");
    }
}

class Cat extends Creature {
    // Переопределение метода: подкласс дает свою реализацию метода суперкласса.
    @Override
    public void makeSound() {
        System.out.println("Cat barks");
    }
}