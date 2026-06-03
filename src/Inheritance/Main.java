package Inheritance;

/**
 * this — ссылка на текущий объект. Через this обращаются к полям и методам
 * текущего объекта, а также вызывают другой конструктор этого же класса: this(...).
 *
 * super — ссылка на часть текущего объекта, которая относится к суперклассу.
 * Через super обращаются к полю суперкласса, методу суперкласса или вызывают
 * конструктор суперкласса: super(...).
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child("parent value", "child value");

        child.printValues();
        child.printMethodResult();
    }
}

class Parent {
    String value;

    Parent(String value) {
        this.value = value;
    }

    void printMethod() {
        System.out.println("Метод суперкласса Parent");
    }
}

class Child extends Parent {
    String value;

    Child(String parentValue, String childValue) {
        super(parentValue);       // вызов конструктора суперкласса
        this.value = childValue;  // обращение к полю текущего класса
    }

    void printValues() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);
    }

    void printMethodResult() {
        this.printMethod();
        super.printMethod();
    }

    @Override
    void printMethod() {
        System.out.println("Метод подкласса Child");
    }
}
