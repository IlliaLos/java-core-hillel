package org.example.lesson16.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(34);
        printer.print();

        Printer<String> stringPrinter = new Printer<>("A string");
        printer.print();

        List<Integer> intList = new ArrayList<>();
        intList.add(Integer.valueOf(2));
//        intList.add(Double.valueOf(2.2));

        List<Object> objList = new ArrayList<>();
        objList.add(1);
        objList.add("asdf");

        Integer myInt = (Integer) objList.get(0);
        Integer myInt2 = (Integer) objList.get(1);
    }
}
