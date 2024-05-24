package org.example.lesson12;

import org.example.lesson10.interfaces.Comedy;
import org.example.lesson10.interfaces.Movie;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        var comedy = new Movie("A comedy");
        var adventure = new Movie("An adventure");
        var horror = new Movie("Horror");

        List<Movie> movieList = new ArrayList<>();
        movieList.add(comedy);
        movieList.add(adventure);
        movieList.add(horror);

        List<Comedy> comedyList = new ArrayList<>();
        comedyList.add(new Comedy("Comedy comedy"));

//        List<Movie> newMovieList = comedyList; this is not correct!

        printList(movieList);


    }

    public static <T> void printList(List<T> elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void printListWildcard(List<?> elements) {
        for (Object element : elements) {
            System.out.println(element);
        }
    }

//    public static void testList(List<String> list) {
//        for (var element : list) {
//            System.out.println("String: " + element.toLowerCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//        for (var element : list) {
//            System.out.println("Integer: " + element.doubleValue());
//        }
//    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toLowerCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.doubleValue());
            }
        }
    }
}
