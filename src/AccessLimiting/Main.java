package AccessLimiting;

class VisibilityExample {
    public String openText = "public: доступно везде";
    protected String familyText = "protected: доступно в пакете и наследниках";
    String packageText = "default: доступно только внутри пакета";
    private String secretText = "private: доступно только внутри класса";

    public void publicMethod() {
        System.out.println(openText);
    }

    protected void protectedMethod() {
        System.out.println(familyText);
    }

    void defaultMethod() {
        System.out.println(packageText);
    }

    private void privateMethod() {
        System.out.println(secretText);
    }

    public void showPrivateInsideClass() {
        privateMethod();
    }
}

class VisibilityChild extends VisibilityExample {
    public void showAccessFromChild() {
        publicMethod();
        protectedMethod();
        defaultMethod();

        // privateMethod();
        // Такой вызов не скомпилируется: private-метод доступен только внутри VisibilityExample.
    }
}

public class Main {
    public static void main(String[] args) {
        VisibilityExample example = new VisibilityExample();

        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.showPrivateInsideClass();

        // example.privateMethod();
        // Такой вызов не скомпилируется: private-метод нельзя вызвать извне класса VisibilityExample.

        VisibilityChild child = new VisibilityChild();
        child.showAccessFromChild();
    }
}
