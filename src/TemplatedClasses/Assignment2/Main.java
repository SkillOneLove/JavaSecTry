package TemplatedClasses.Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5);

        printNumbers(integers);
        printNumbers(doubles);

        List<Number> numbers = new ArrayList<>();
        addIntegers(numbers);
        System.out.println(numbers);

        List<Object> objects = new ArrayList<>();
        addIntegers(objects);
        System.out.println(objects);
    }

    // <? extends Number> значит: список содержит Number или наследников Number.
    // Из такого списка удобно читать элементы как Number.
    // Но добавлять конкретные значения нельзя, потому что неизвестен точный тип списка.
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    // <? super Integer> значит: список принимает Integer или его предков.
    // В такой список можно добавлять Integer.
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
