package org.example.lesson16.generics;

public class DoublePrinter {

    Double doubleToPrint;

    public DoublePrinter(Double doubleToPrint) {
        this.doubleToPrint = doubleToPrint;
    }

    public void print() {
        System.out.println(doubleToPrint);
    }
}
