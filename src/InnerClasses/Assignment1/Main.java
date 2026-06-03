package InnerClasses.Assignment1;

/**
 * Примеры внутренних классов с разными модификаторами доступа.
 */
public class Main {
    public static void main(String[] args) {
        OuterForAccess outer = new OuterForAccess();

        OuterForAccess.PublicInner publicInner = outer.new PublicInner();
        publicInner.print();

        OuterForAccess.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.print();

        OuterForAccess.PackageInner packageInner = outer.new PackageInner();
        packageInner.print();

        outer.createPrivateInner();
    }
}

class OuterForAccess {
    /**
     * public-внутренний класс можно использовать снаружи,
     * если доступен внешний класс.
     */
    public class PublicInner {
        public void print() {
            System.out.println("PublicInner");
        }
    }

    /**
     * protected-внутренний класс доступен в том же пакете и в подклассах.
     */
    protected class ProtectedInner {
        public void print() {
            System.out.println("ProtectedInner");
        }
    }

    /**
     * Внутренний класс без спецификатора доступен только в том же пакете.
     */
    class PackageInner {
        public void print() {
            System.out.println("PackageInner");
        }
    }

    /**
     * private-внутренний класс доступен только внутри внешнего класса.
     */
    private class PrivateInner {
        public void print() {
            System.out.println("PrivateInner");
        }
    }

    void createPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.print();
    }
}
