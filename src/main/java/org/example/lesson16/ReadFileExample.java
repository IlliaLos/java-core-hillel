package org.example.lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileExample {

    public static void main(String[] args) throws IOException {
//        var filelines = readTextFile("src/main/java/org/example/lesson16/titanic.txt");
//        filelines.forEach(System.out::println);

        var filelinesTwo = readTextFileViaFiles("src/main/java/org/example/lesson16/titanic.txt");
        filelinesTwo.forEach(System.out::println);
    }

    public static List<String> readTextFile(String filename) {
        var filelines = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                filelines.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filelines;
    }

    public static List<String> readTextFileViaFiles(String filename) throws IOException {
        return Files.lines(Paths.get(filename)).collect(Collectors.toList());
    }
}
