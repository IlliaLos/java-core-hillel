package org.example.lesson5;

public class ForLoopPuzzle {

    public static void main(String[] args) {

        int sumOfMatches = 0;
        int countOfMatches = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumOfMatches += i;
                countOfMatches++;
                System.out.println("Number can be divided by 3 and 5: " + i);
            }

            if (countOfMatches == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumOfMatches);
    }
}
