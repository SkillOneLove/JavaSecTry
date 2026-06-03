package InnerClasses.Assignment3;

/**
 * Доступ внешнего класса к private-полям внутреннего класса.
 */
public class Main {
    public static void main(String[] args) {
        OuterForAccess outer = new OuterForAccess();

        outer.showInnerPrivateData();
    }
}

class OuterForAccess {
    private class PrivateInner {
        private String privateInnerField = "private поле внутреннего класса";
    }

    void showInnerPrivateData() {
        // Внешний класс имеет доступ к private-полям внутреннего,
        // но только через объект внутреннего класса.
        PrivateInner inner = new PrivateInner();

        System.out.println(inner.privateInnerField);
    }
}