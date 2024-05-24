package org.example.lesson16.generics;

public class Printer<T> {

    T objectToPrint;

    public Printer(T objectToPrint) {
        this.objectToPrint = objectToPrint;
    }

    public void print() {
        System.out.println(objectToPrint);
    }
}
