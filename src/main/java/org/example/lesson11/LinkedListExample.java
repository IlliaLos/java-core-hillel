package org.example.lesson11;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Kyiv");
        placesToVisit.add(0, "Boryspyl");
        System.out.println(placesToVisit);

        placesToVisit.addFirst("Unknown village");
        System.out.println(placesToVisit);

        placesToVisit.addLast("Odessa");
        System.out.println(placesToVisit);

        placesToVisit.remove(2);
        System.out.println(placesToVisit);

        placesToVisit.removeLast();
        System.out.println(placesToVisit);
    }
}
