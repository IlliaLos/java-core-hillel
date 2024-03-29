package org.example.homework5;

import java.util.Random;

public class GenSortPrintArray {
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        printArray(numbers);
        int[] sortedNumbers = sortIntegers(numbers);
        printArray(sortedNumbers);
    }

    private static int[] getIntegers(int i) {
        int[] array = new int[i];
        Random random = new Random();
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void printArray (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " contents " + numbers[i]);
        }
    }

    private static int[] sortIntegers(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1])
                    swap(numbers, j);
            }
        }
        return numbers;
    }

    private static void swap(int[] numbers, int i) {
        int temp;
        temp = numbers[i + 1];
        numbers[i + 1] = numbers[i];
        numbers[i] = temp;
    }
}
