package SuperThis.Assignment1;

/**
 * Все три варианта использования super:
 * 1) вызов конструктора суперкласса;
 * 2) доступ к полю суперкласса;
 * 3) доступ к методу суперкласса.
 */
public class Main {
    public static void main(String[] args) {
        SuperChild child = new SuperChild("поле родителя", "поле потомка");
        child.showAllSuperUsages();
    }
}

class SuperParent {
    String text;

    SuperParent(String text) {
        this.text = text;
    }

    void printText() {
        System.out.println("Метод SuperParent: " + text);
    }
}

class SuperChild extends SuperParent {
    String text;

    SuperChild(String parentText, String childText) {
        super(parentText);       // 1. вызов конструктора суперкласса
        this.text = childText;
    }

    void showAllSuperUsages() {
        System.out.println("super.text = " + super.text); // 2. поле суперкласса
        super.printText();                               // 3. метод суперкласса
        System.out.println("this.text = " + this.text);
    }
}
