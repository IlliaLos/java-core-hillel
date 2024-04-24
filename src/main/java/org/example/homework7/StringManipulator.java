package org.example.homework7;

import java.util.Arrays;

public class StringManipulator {

    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        char[] charsToRemove = {'a', 'd', '3'};
        String modifiedString = removeCharacters(initialString, charsToRemove);
        System.out.println("Initial string: " + initialString);
        System.out.println("Characters to remove: " + Arrays.toString(charsToRemove));
        System.out.println("Modified string: " + modifiedString);
    }

    private static String removeCharacters(String initialString, char[] charsToRemove) {

        for (int i = 0; i < charsToRemove.length; i++)
            initialString = initialString.replaceAll(String.valueOf(charsToRemove[i]), "");

        return initialString;
    }
}
