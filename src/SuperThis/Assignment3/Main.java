package SuperThis.Assignment3;

public class Main {
    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo(10, 20, 30);
        demo.print();
    }
}

class ConstructorDemo {
    int a;
    int b;
    int c;
    int z;

    public ConstructorDemo() {
        this(0, 0, 0);
    }

    public ConstructorDemo(int a) {
        this(a, 0, 0);
    }

    public ConstructorDemo(int a, int b) {
        this(a, b, 0);
    }

    public ConstructorDemo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }

    void print() {
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", z=" + z);
    }
}
