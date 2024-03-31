package org.example.homework5;

public class EvenDigitsSum {

    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum (int digit) {
        int sum = 0;

        if (digit > 0) {
            int numDigits = String.valueOf(digit).length();
            for (int i = 0; i < numDigits; i++) {
                int currentDigit = digit % 10;
                digit /= 10;
                if(currentDigit % 2 == 0)
                    sum = sum + currentDigit;
            }
        }
        else sum = -1;

        return sum;
    }
}
