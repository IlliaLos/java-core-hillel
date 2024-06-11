package org.example.homework10.splitTheSentenceLambda;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        String sentense = "we chose items at random";
        splitAndPrint(sentense);
    }
    public static void splitAndPrint(String sentence){
        var splitSentense = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        splitSentense.forEach(System.out::println);
    }
}