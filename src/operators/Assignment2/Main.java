package operators.Assignment2;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(animal instanceof Animal); // true

        System.out.println(dog instanceof Dog);       // true
        System.out.println(dog instanceof Animal);    // true, Dog наследуется от Animal

        System.out.println(cat instanceof Cat);       // true
        System.out.println(cat instanceof Animal);    // true

        Animal someAnimal = new Dog();

        System.out.println(someAnimal instanceof Dog);    // true
        System.out.println(someAnimal instanceof Animal); // true
        System.out.println(someAnimal instanceof Cat);    // false

        // instanceof и null
        Animal nullAnimal = null;

        System.out.println(nullAnimal instanceof Animal); // false
        System.out.println(nullAnimal instanceof Dog);    // false
    }
}
