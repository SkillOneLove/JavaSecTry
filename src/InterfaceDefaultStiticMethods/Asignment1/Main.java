package InterfaceDefaultStiticMethods.Asignment1;

/**
 * default-методы и static-методы интерфейса.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker = new WorkerImpl();

        // Вызов абстрактного метода через объект класса.
        worker.work();

        // Вызов default-метода через объект класса.
        worker.printInfo();

        // Вызов static-метода только через имя интерфейса.
        Worker.printStaticInfo();
    }
}

interface Worker {
    void work();

    default void printInfo() {
        System.out.println("default-метод интерфейса Worker");
    }

    static void printStaticInfo() {
        System.out.println("static-метод интерфейса Worker");
    }
}

class WorkerImpl implements Worker {
    @Override
    public void work() {
        System.out.println("Класс реализует абстрактный метод work()");
    }
}
