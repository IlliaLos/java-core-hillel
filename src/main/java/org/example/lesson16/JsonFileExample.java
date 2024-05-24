package org.example.lesson16;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.lesson15.Melon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonFileExample {

    public static void main(String[] args) {
       List<Melon> melons = readJsonFile("src/main/java/org/example/lesson16/melons.json");
       melons.forEach(System.out::println);

        List<Melon> melonsToWrite = new ArrayList<>();

        melonsToWrite.add(new Melon("Watermelon", 1000, "USA"));
        melonsToWrite.add(new Melon("Honeymelon", 888, "Mexico"));
        melonsToWrite.add(new Melon("Apollo", 1234, "Argentina"));

        writeMelonsToJsonFile("src/main/java/org/example/lesson16/new-melons.json", melonsToWrite);
    }

    private static void writeMelonsToJsonFile(String filename, List<Melon> melons) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filename), melons);
            System.out.println("Melons are written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Melon> readJsonFile(String filename) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Melon> melons = new ArrayList<>();
        try {
            melons = objectMapper.readValue(new File(filename), new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return melons;
    }
}
