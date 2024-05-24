package org.example.lesson13;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("one", "two", "three", "four"));

        for (var s : list) {
            System.out.println(s);
        }

        /// Lambda expression
        list.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(10));

        // Method reference
        list.forEach(System.out::println);
        System.out.println("-".repeat(10));

        list.forEach(s -> {
            char first = s.charAt(0);
            System.out.println(first + " is for " + s);
        });
    }
}
