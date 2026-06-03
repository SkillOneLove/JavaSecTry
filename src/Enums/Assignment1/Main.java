package Enums.Assignment1;

public class Main {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet.getName() + ": " + planet.getOrderFromSun());
        }
    }
}

// Пример перечисления с инициализацией элементов.
enum Planet {
    MERCURY("Меркурий", 1),
    VENUS("Венера", 2),
    EARTH("Земля", 3),
    MARS("Марс", 4);

    private final String name;
    private final int orderFromSun;

    Planet(String name, int orderFromSun) {
        this.name = name;
        this.orderFromSun = orderFromSun;
    }

    public String getName() {
        return name;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }
}
