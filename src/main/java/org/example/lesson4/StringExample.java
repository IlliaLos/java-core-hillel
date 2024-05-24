package org.example.lesson4;

public class StringExample {

    public static void main(String[] args) {
        String myString = "Hello";

        char firstChar = myString.charAt(1);
        System.out.println(firstChar);

        String concat = myString.concat(" something else");
        System.out.println(concat);
        System.out.println(myString);

        boolean isEqual = myString.toLowerCase().equals("hello".toLowerCase());
        System.out.println(isEqual);

        int length = myString.length();
        System.out.println("Length: " + length);

        String upper = myString.toUpperCase();
        System.out.println(upper);

        String subStr = myString.substring(2, 4);
        System.out.println(subStr);

        String replacedString = myString.replace('l', 'a');
        System.out.println(replacedString);

        String[] words = "This is the sentence".split(" ");
        System.out.println(words[2]);
    }
}
