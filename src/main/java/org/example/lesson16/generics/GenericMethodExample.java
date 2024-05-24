package org.example.lesson16.generics;

import org.example.lesson15.Melon;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

    public static void main(String[] args) {
        shout("Alex");
        shout(new Melon("Watermelon", 1000, "USA"));

        List<Integer> intList = new ArrayList<>();
        intList.add(99);

        printList(intList);
    }

    private static <T> T shout(T thingToShout) {
        System.out.println(thingToShout + "!!!");
        return thingToShout;
    }

    private static void printList(List<? extends Number> list) {
        list.forEach(System.out::println);
    }
}
