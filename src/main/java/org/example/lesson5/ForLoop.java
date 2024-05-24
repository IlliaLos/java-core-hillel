package org.example.lesson5;

public class ForLoop {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 88, 99, -4};

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }

//        for ( ; ; ) {
//            System.out.println("a");
//        }

        System.out.println("-".repeat(30));
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("-".repeat(30));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 88) {
                break;
            }
            System.out.println(array[i]);
        }

        System.out.println("-".repeat(30));
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-".repeat(30));
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
