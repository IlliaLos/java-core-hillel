package org.example.lesson5;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] array = {22, 3, 9, 77, 4, 6, 7, 9, 99};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        System.out.println(n);
    }

//    private static void swap(int[] array, int i) {
//        int temp = array[i];
//        array[i] = array[i + 1];
//        array[i + 1] = temp;
//    }

    private static void swap(int[] array, int i) {
        array[i] = array[i] + array[i + 1];
        array[i + 1] = array[i] - array[i + 1];
        array[i] = array[i] - array[i + 1];
    }
}
