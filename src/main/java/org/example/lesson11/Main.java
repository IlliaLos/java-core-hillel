package org.example.lesson11;

public class Main {

    public static void main(String[] args) {
        ObjectHolder<String> stringHolder = new ObjectHolder<>("Hello!");
        String string = stringHolder.getObject();
        System.out.println(string);
    }
}
