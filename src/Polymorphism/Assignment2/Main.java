package Polymorphism.Assignment2;

/**
 * Пример переопределенного метода.
 *
 * Если у переопределенного метода и метода суперкласса не совпадает тип
 * возвращаемого значения, это ошибка компиляции. Исключение — ковариантный
 * возвращаемый тип: подкласс может вернуть более конкретный тип.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();

        animal.voice(); // динамическое связывание: вызовется метод Dog
    }
}

class Animal {
    Animal copy() {
        return new Animal();
    }

    void voice() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    Dog copy() { // можно: Dog является подклассом Animal
        return new Dog();
    }

    @Override
    void voice() {
        System.out.println("Собака лает");
    }

    /*
    Такой код не скомпилируется:

    @Override
    int copy() {
        return 1;
    }

    Причина: int не является ковариантным типом для Animal.
    */
}
