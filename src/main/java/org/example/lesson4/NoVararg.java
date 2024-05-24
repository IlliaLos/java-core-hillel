package org.example.lesson4;

public class NoVararg {

    public static int sumNumber(int a, int b) {
        return a + b;
    }

    public static int sumNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        sumNumber(1,2);
        sumNumber(1,2, 3);
    }
}
