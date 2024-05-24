package org.example.lesson4;

public class VarargExample {

    public static void main(String... args) {
        int twoNumbers = sumNumber(1, 2);
        int threeNumbers = sumNumber(1, 2, 3);
        sumNumber();
    }


    public static int sumNumber(int... args) {
        System.out.println("Argument length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}
