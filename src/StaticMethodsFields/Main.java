package StaticMethodsFields;

public class Main {
    public static void main(String[] args) {
            // Вариант 1: правильный и основной способ вызова статического метода.
            A.printVars();

            // Вариант 2: вызов через объект возможен, но так обычно не пишут.
            A sample = new A();
            sample.printVars();

            // Вариант 3: вызов через null-ссылку тоже сработает, потому что метод связан с классом.
            A emptyReference = null;
            emptyReference.printVars();

            // Вариант 4: вызов из метода того же класса без имени класса.
            A.callInsideClass();

            // Вариант 5: вызов через имя подкласса. Метод все равно принадлежит классу A.
            B.printVars();
        }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void callInsideClass() {
        printVars();
    }
}

class B extends A {
}
