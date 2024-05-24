package org.example.lesson11;

import org.example.lesson10.interfaces.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListVersusArray {

    public static void main(String[] args) {
        var comedy = new Movie("A comedy");
        var adventure = new Movie("An adventure");
        var horror = new Movie("Horror");

        Movie[] movieArray = {comedy, adventure, horror};
        List<Movie> movieList = new ArrayList<>();

        movieList.add(comedy);
        movieList.add(adventure);
        movieList.add(horror);

        System.out.println(Arrays.toString(movieArray));
        System.out.println(movieList);

        for(Movie movie : movieArray) {
            System.out.println(movie);
        }
        System.out.println("-".repeat(20));
        for(Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println("-".repeat(20));

        movieList.get(2);
        movieList.getFirst();

        System.out.println("Before deletion: " +movieList.size());
        movieList.remove(1);
        System.out.println("After deletion: " +movieList.size());

        movieList.set(1, adventure);
        movieList.contains(adventure);
        movieList.indexOf(adventure);

        List<String> stringList = new ArrayList<>(List.of("abc", "wer", "dfg"));
        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

    }
}
