package org.example.lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = new ArrayList<>();

        melons.add(new Melon("Watermelon", 1000, "USA"));
        melons.add(new Melon("Honeymelon", 888, "Mexico"));
        melons.add(new Melon("Apollo", 1234, "Argentina"));
        melons.add(new Melon("GGG Melon", 2000, "Spain"));
        melons.add(new Melon("Kherson", 1700));

        for (Melon melon : melons) {
            System.out.println(melon);
        }

        System.out.println("-".repeat(20));
        melons.stream().forEach(System.out::println);

        System.out.println("-".repeat(20));
        printAllTypesOfMelons(melons);

        System.out.println("-".repeat(20));
        printAllTypesOfHeavyMelons(melons);

        System.out.println("-".repeat(20));
        printAllOriginsUnique(melons);

        System.out.println("Is there any melon from Mexico: " + anyMelonFromMexico(melons));

        System.out.println("Number of melons from the USA: " + countMelonsFromTheUsa(melons));

        System.out.println("-".repeat(20));
        System.out.println("Melons with weight more than 1000 grams, sorted by weight");
        var filteredAndSortedMelons = filterAndSortByWeight(melons);
        filteredAndSortedMelons.forEach(System.out::println);

        System.out.println("Average weight of melons: " + calculateAverageWeight(melons));

        System.out.println("The lightest melon: " + findTheLightestMelon(melons));


        Store storeOne = new Store();
        storeOne.addMelon(new Melon("Watermelon", 1000, "USA"));
        storeOne.addMelon(new Melon("Honeymelon", 888, "Mexico"));

        Store storeTwo = new Store();
        storeTwo.addMelon(new Melon("Apollo", 1234, "Argentina"));
        storeTwo.addMelon(new Melon("GGG Melon", 2000, "Spain"));

        List<Store> stores = List.of(storeOne, storeTwo);

        List<Melon> melonsFromAllStores = getMelonsFromStores(stores);
        System.out.println("Melons from all stores");
        melonsFromAllStores.forEach(System.out::println);
    }

    private static void printAllTypesOfMelons(List<Melon> melons) {
        melons.stream()
                .map(Melon::getType)
                .sorted()
                .forEach(System.out::println);
    }

    private static void printAllTypesOfHeavyMelons(List<Melon> melons) {
        melons.stream()
                .filter(melon -> melon.getWeight() > 1500)
                .map(Melon::getType)
                .forEach(System.out::println);
    }

    private static void printAllOriginsUnique(List<Melon> melons) {
        melons.stream()
                .map(Melon::getOrigin)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(System.out::println);
    }

    private static boolean anyMelonFromMexico(List<Melon> melons) {
        return melons.stream()
                .anyMatch(melon -> "Mexico".equals(melon.getOrigin()));
//                .anyMatch(melon -> melon.getOrigin().equals("Mexico")); non null-safe usage
    }

    private static long countMelonsFromTheUsa(List<Melon> melons) {
        return melons.stream()
                .filter(melon -> "USA".equals(melon.getOrigin()))
                .count();
    }

    private static List<Melon> filterAndSortByWeight(List<Melon> melons) {
        return melons.stream()
                .filter(melon -> melon.getWeight() > 1000)
                .sorted(Comparator.comparingInt(Melon::getWeight))
                .collect(Collectors.toList());
    }

    private static double calculateAverageWeight(List<Melon> melons) {
        return melons.stream()
                .mapToInt(Melon::getWeight)
                .average()
                .orElse(0.0);
    }

    private static Melon findTheLightestMelon(List<Melon> melons) {
        return melons.stream()
                .min(Comparator.comparingInt(Melon::getWeight))
                .orElseThrow();
    }

    private static List<Melon> getMelonsFromStores(List<Store> stores) {
        return stores.stream()
                .flatMap(store -> store.getMelons().stream())
                .collect(Collectors.toList());
    }
}
