package TemplatedClasses.Assignment1;

/*
Примеры использования instanceof с объектами параметризованных классов.

instanceof можно использовать с обычными классами и с параметризованными классами
только через wildcard, например Box<?>.

Проверка Box<String> невозможна, потому что generic-типы стираются
во время выполнения программы.
*/
public class Main {    
    public static void main(String[] args) {
        System.out.println("Практика #1: instanceof с параметризованными классами");

        Box<String> stringBox = new Box<>("text");
        Box<Integer> integerBox = new Box<>(100);
        String text = "hello";

        System.out.println(stringBox instanceof Box<?>);              // true
        System.out.println(integerBox instanceof Box<?>);             // true
        System.out.println(text instanceof String);                   // true
        System.out.println(stringBox.getValue() instanceof String);   // true
        System.out.println(integerBox.getValue() instanceof Integer); // true

        // Так писать нельзя: generic-тип стирается во время выполнения.
        // System.out.println(stringBox instanceof Box<String>);
        // System.out.println(integerBox instanceof Box<Integer>);
    }
}

class Box<T> {
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
