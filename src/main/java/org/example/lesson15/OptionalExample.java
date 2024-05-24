package org.example.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();

        melons.add(new Melon("Watermelon", 1000, "USA"));
        melons.add(new Melon("Honeymelon", 888, "Mexico"));
        melons.add(new Melon("Apollo", 1234, "Argentina"));
        melons.add(new Melon("GGG Melon", 2000, "Spain"));
        melons.add(new Melon("Kherson", 1700));
        melons.add(new Melon("Samba", 1740, "Brazil"));

        Optional<Melon> fromBrazil = melons.stream()
                .filter(melon -> "Brazil".equals(melon.getOrigin()))
                .findAny();

        if (fromBrazil.isPresent()) {
            System.out.println("Melon from Brazil: " + fromBrazil.get());
        } else {
            System.out.println("No melon from Brazil was found");
        }

        var khersonMelon = new Melon("Kherson", 1700);
        var probablyNullOrigin = Optional.ofNullable(khersonMelon.getOrigin());
        System.out.println("Kherson origin: " + probablyNullOrigin.isPresent());

        Optional<Melon> emptyMelon = Optional.empty();
        System.out.println("No melon:" + emptyMelon.isPresent());

        Melon justAnExample = melons.stream()
                .filter(melon -> "Brazil".equals(melon.getOrigin()))
                .findAny()
                .orElseThrow();
    }
}
