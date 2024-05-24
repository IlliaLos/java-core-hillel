package org.example.lesson14;

import java.util.*;

public class CollectionsIntro {

    public static void main(String[] args) {
        Set<String> list = new HashSet<>();

        String [] names = {"Anna", "Bob", "Carol", "David", "Elon"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Elon"));
        System.out.println(list);

        System.out.println("Gary is in the list? " + list.contains("Gary"));
        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

    }
}
