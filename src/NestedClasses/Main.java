package NestedClasses;

/**
 * Пример вложенного static-класса в классе и в интерфейсе.
 */
public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.printStaticOuterField();

        InterfaceWithNested.NestedInInterface nestedInInterface =
                new InterfaceWithNested.NestedInInterface();

        nestedInInterface.print();
    }
}

class OuterClass {
    static String staticOuterField = "static поле внешнего класса";
    String nonStaticOuterField = "нестатическое поле внешнего класса";

    static class NestedClass {
        void printStaticOuterField() {
            System.out.println(staticOuterField);

            // System.out.println(nonStaticOuterField);
            // Нельзя напрямую обратиться к нестатическому полю внешнего класса.

            OuterClass outer = new OuterClass();
            System.out.println(outer.nonStaticOuterField); // можно через объект
        }
    }
}

interface InterfaceWithNested {
    /**
     * Класс внутри интерфейса неявно является public static.
     */
    class NestedInInterface {
        public void print() {
            System.out.println("Вложенный класс внутри интерфейса");
        }
    }
}