package wrapperclasses.Assignment4;

public class Main {
    /**
     * Какие значения напечатает код? Для чего используется IntegerCache?
     *
     * IntegerCache хранит заранее созданные объекты Integer для значений
     * обычно от -128 до 127. Поэтому при автоупаковке таких значений Java может
     * вернуть один и тот же объект из кэша.
     *
     * == для Integer сравнивает ссылки, если оба операнда являются объектами.
     * equals() сравнивает значения.
     */
    public static void main(String[] args) {
        
        int i1 = 128;
        Integer a1 = 11;
        Integer b1 = i1;
        System.out.println("a1==11  " + (a1 == 11));
        System.out.println("b1==i1  " + (b1 == i1));
        System.out.println("a1==b1  " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = 12;
        Integer b2 = i2;
        System.out.println("a2==i2  " + (a2 == i2));
        System.out.println("b2==i2  " + (b2 == i2));
        System.out.println("a2==b2  " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));

        // Отдельный пример IntegerCache:
        Integer cache1 = 127;
        Integer cache2 = 127;
        Integer noCache1 = 128;
        Integer noCache2 = 128;

        System.out.println("127 == 127 для Integer: " + (cache1 == cache2));
        System.out.println("128 == 128 для Integer: " + (noCache1 == noCache2));
        System.out.println();
    }
}
