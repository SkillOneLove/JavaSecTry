package InnerClasses.Assignment2;

/**
 * Доступ внутреннего класса к полям внешнего класса.
 */
public class Main {
    public static void main(String[] args) {
        OuterForAccess outer = new OuterForAccess();

        outer.createPrivateInner();
    }
}

class OuterForAccess {
    private String privateOuterField = "private поле внешнего класса";
    public String publicOuterField = "public поле внешнего класса";

    private class PrivateInner {
        void printOuterFields() {
            // Внутренний класс имеет доступ даже к private-полям внешнего.
            System.out.println(privateOuterField);
            System.out.println(publicOuterField);
        }
    }

    void createPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.printOuterFields();
    }
}
