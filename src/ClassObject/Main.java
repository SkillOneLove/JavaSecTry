package ClassObject;

import java.util.Objects;

/**
 * Соглашения для equals():
 * 1. Рефлексивность: x.equals(x) == true.
 * 2. Симметричность: если x.equals(y), то y.equals(x).
 * 3. Транзитивность: если x.equals(y) и y.equals(z), то x.equals(z).
 * 4. Постоянство: результат не должен меняться, пока не меняются поля объекта.
 * 5. Сравнение с null всегда возвращает false.
 * 6. Если equals() переопределен, обычно нужно переопределить hashCode().
 */
public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("Pavel", 20);
        Student studentB = new Student("Pavel", 20);
        Student p3 = new Student("Petr", 25);

        System.out.println(studentA.equals(studentA));   // true
        System.out.println(studentA.equals(studentB));   // true
        System.out.println(studentA.equals(p3));         // false
        System.out.println(studentA.equals(null));       // false
        System.out.println(studentA.hashCode() == studentB.hashCode()); // true
    }
}

class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student person = (Student) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
