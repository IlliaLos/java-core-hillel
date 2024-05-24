package org.example.lesson4;

public class StringCreation {

    public static void main(String[] args) {
        String first = "Abcd";
        String second = "Abcd";
        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = new String("Abcd");
        System.out.println(first == third);
        System.out.println(first.equals(third));
    }
}
