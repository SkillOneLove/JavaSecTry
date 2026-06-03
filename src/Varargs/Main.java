package Varargs;
/*
Метод с переменным числом параметров можно перегрузить.
Главное правило: параметр вида type... должен быть последним в списке параметров.

Например, можно:
print(int... numbers)
print(String title, int... numbers)
print(String... words)

Нельзя:
print(int... numbers, String title)
*/
public class Main {
    public static void main(String[] args) {
        Printer writer = new Printer();

        writer.print(new int[]{}); // пустой набор int-аргументов
        writer.print(1);
        writer.print(1, 2, 3);
        writer.print("Digits", 10, 20, 30);
        writer.print("Hello", "Java", "World");
    }
}

class Printer {
    public void print(int... numbers) {
        System.out.println("int...");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void print(String title, int... numbers) {
        System.out.println(title);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void print(String... words) {
        System.out.println("String...");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
