package org.example.lesson12;

public class ComparableExample {

    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n" , five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i ,val);
        }
    }

}
