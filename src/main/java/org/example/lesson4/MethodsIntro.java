package org.example.lesson4;

public class MethodsIntro {

    public static void main(String[] args) {
        printMessage("First message");
        printMessage("Second message");

        String modifiedMessage = modifyMessage("Third message");
        System.out.println(modifiedMessage);
    }

     private static void printMessage(String message) {
        System.out.println(message);
    }

    private static String modifyMessage(String message) {

        return message + "!!!";
    }
}
