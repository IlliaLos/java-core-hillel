package org.example.homework11;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String inputString = "Write a method that accepts a string and outputs the count of each letter in it";
        Map<Character, Integer> charMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();

        for (char c : charArray) {
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }
            else charMap.put(c, 1);
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println("Символ \"" + entry.getKey() + "\" зустрічається: " + entry.getValue() + " разів");
        }
    }
}