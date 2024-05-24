package org.example.lesson5;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 9, 14, 22, 77, 99};
        int index = searchElement(array, 100);
        System.out.println("Index is: " + index);
    }

    private static int searchElement(int[] array, int key) {
        int index = -1;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (array[middle] == key) {
                return middle;
            }

            if (array[middle] < key) {
                low = middle + 1; // ignore left half
            }
            else {
                high = middle - 1; // ignore right half
            }
        }
        return index;
    }
}
