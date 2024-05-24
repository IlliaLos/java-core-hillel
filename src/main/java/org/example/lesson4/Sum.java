package org.example.lesson4;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.0, 5.0));
        System.out.println(sum());
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int sum() {
        return 1111;
    }
}
