package FinalClassesMethods.Assignment1;

public class Main {
    public static void main(String[] args) {
        FinalMethodChild child = new FinalMethodChild();

        child.printInfo();
        child.normalMethod();
    }
}

class FinalMethodParent {
    public final void printInfo() {
        System.out.println("Этот метод final, поэтому его нельзя переопределить.");
    }

    public void normalMethod() {
        System.out.println("Обычный метод суперкласса.");
    }
}

class FinalMethodChild extends FinalMethodParent {
    /*
    Такой код не скомпилируется:

    public void printInfo() {
        System.out.println("Попытка переопределения");
    }

    Потому, что метод printInfo() в суперклассе объявлен как final.
    */

    @Override
    public void normalMethod() {
        System.out.println("Обычный метод можно переопределить.");
    }
}
