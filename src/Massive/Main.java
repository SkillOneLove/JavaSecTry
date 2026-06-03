package Massive;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] numbers = {5, 3, 9, 1, 7};
        int[] sameNumbers = {5, 3, 9, 1, 7};
        int[] otherNumbers = {1, 3, 5, 7, 9};

        System.out.println("Arrays.toString(numbers): " + Arrays.toString(numbers));

        System.out.println("Arrays.equals(numbers, sameNumbers): "
                + Arrays.equals(numbers, sameNumbers));

        System.out.println("Arrays.compare(numbers, otherNumbers): "
                + Arrays.compare(numbers, otherNumbers));

        Arrays.sort(numbers);
        System.out.println("После Arrays.sort(numbers): " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Arrays.binarySearch(numbers, 7): " + index);

        int missingIndex = Arrays.binarySearch(numbers, 4);
        System.out.println("Arrays.binarySearch(numbers, 4): " + missingIndex);

        System.out.println();
    }
}
