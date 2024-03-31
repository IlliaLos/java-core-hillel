package org.example.homework5;

import java.util.Random;

public class NumberGenerator {

    public static void main(String[] args) {
        Random random = new Random();
        boolean[] num = new boolean[101];
        int sum = 0;
        int counter = 0;

        for ( ; ; ) {
            int randomNumber = random.nextInt(101);
            System.out.println("Generated number: " + randomNumber);
            sum = sum + randomNumber;
            counter++;
            if (num[randomNumber] == true) {
                break;
            }
            num[randomNumber] = true;
        }

        System.out.println("Sum of all generated numbers: " + sum);
        System.out.println("Count of generated numbers: " + counter);
    }
}
