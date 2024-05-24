package org.example.lesson14;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(111, "Anna");
        map.put(222, "Bob");
        map.put(333, "Carol");
        map.put(444, "David");
        map.put(555, "Elon");
        System.out.println(map);

        map.put(115, "Anna");
        map.put(222, "George");
        System.out.println(map);

        System.out.println("George value is in the map? " + map.containsValue("George"));
        map.remove(333);
        System.out.println(map);
        System.out.println("Carol value is in the map? " + map.containsValue("Carol"));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
