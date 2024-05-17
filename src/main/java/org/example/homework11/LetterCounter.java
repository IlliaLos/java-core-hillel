package org.example.homework11;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String inputString = "Write a method that accepts a string and outputs the count of each letter in it";
        Map<Character, Integer> charMap = new HashMap<>();

        char[] charArray = inputString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if(charMap.containsKey(charArray[i])){
                charMap.put(charArray[i], charMap.get(charArray[i]) + 1);
            }
            else charMap.put(charArray[i], 1);
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.println("Символ \"" + entry.getKey() + "\" зустрічається: " + entry.getValue() + " разів");
        }
    }
}