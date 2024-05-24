package org.example.lesson16.generics;

public class StringPrinter {

    String stringToPrint;

    public StringPrinter(String stringToPrint) {
        this.stringToPrint = stringToPrint;
    }

    public void print() {
        System.out.println(stringToPrint);
    }
}
