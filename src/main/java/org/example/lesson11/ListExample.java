package org.example.lesson11;

import org.example.lesson10.interfaces.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        var comedy = new Movie("A comedy");
        var adventure = new Movie("An adventure");
        var horror = new Movie("Horror");

        List<Movie> movieList = new ArrayList<>();
        movieList.add(comedy);
        movieList.add(adventure);
        movieList.add(horror);

//        System.out.println(movieList.get(2));
//
//        Movie[] movieArray = {comedy, adventure};
//        List<Movie> movieList1 = Arrays.asList(movieArray);
//        movieList1.add(horror);
//
//        List<Movie> movieList2 = List.of(comedy, adventure);

        Iterator<Movie> iterator = movieList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
