package org.example.lesson4;

public class Conditional {

    public static void main(String[] args) {
        String score = defineMark(-5);
        System.out.println(score);
    }

    private static String defineMark(int score) {
        if (score > 100 || score < 0) {
            return "Invalid score";
        } else if (score > 89) {
            return "A";
        } else if (score > 74) {
            return "BC";
        } else {
            return "DE";
        }
    }
}
