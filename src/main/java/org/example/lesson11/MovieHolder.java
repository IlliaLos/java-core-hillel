package org.example.lesson11;

import org.example.lesson10.interfaces.Movie;

public class MovieHolder<T extends Movie> {

    private T object;

    public MovieHolder(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void doMovieStuff() {
        object.watchMovie();
    }
}
