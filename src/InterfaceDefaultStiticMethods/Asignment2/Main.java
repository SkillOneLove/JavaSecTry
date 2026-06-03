package InterfaceDefaultStiticMethods.Asignment2;

/**
 * Одинаковые методы в двух интерфейсах.
 *
 * Если класс реализует два интерфейса с одинаковыми абстрактными методами,
 * конфликта нет: класс просто дает одну реализацию этого метода.
 *
 * Если одинаковыми будут default-методы, класс обязан переопределить метод
 * и явно решить конфликт.
 */
public class Main {
    public static void main(String[] args) {
        ConflictResolver resolver = new ConflictResolver();

        resolver.action();
        resolver.defaultAction();
    }
}

interface FirstInterface {
    void action();

    default void defaultAction() {
        System.out.println("FirstInterface.defaultAction()");
    }
}

interface SecondInterface {
    void action();

    default void defaultAction() {
        System.out.println("SecondInterface.defaultAction()");
    }
}

class ConflictResolver implements FirstInterface, SecondInterface {
    @Override
    public void action() {
        System.out.println("Одна реализация одинакового абстрактного метода action()");
    }

    @Override
    public void defaultAction() {
        FirstInterface.super.defaultAction();
        SecondInterface.super.defaultAction();

        System.out.println("Конфликт default-методов решен в классе");
    }
}
