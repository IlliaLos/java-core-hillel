package org.example.lesson16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
//        String fileName = "src/main/java/org/example/lesson16/titanic.txt";
////
////        File file = new File(fileName);
////        if (!file.exists()) {
////            System.out.println("File not found, quit the application");
////            return;
////        }
//
//        Path path = Paths.get(fileName);
//        List<String> lines;
//        try {
//            lines = Files.readAllLines(path);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("I want to close connection");
//        }
//
//        lines.forEach(System.out::println);

        readFile("src/main/java/org/example/lesson16/titanic.txt");
        readFileUsingTryWithResources("src/main/java/org/example/lesson16/titanic.txt");
    }

    private static void readFile(String filename) {
        FileReader reader = null;
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void readFileUsingTryWithResources(String filename) {
        try (FileReader reader = new FileReader(filename)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File exists: " + filename);
    }
}
