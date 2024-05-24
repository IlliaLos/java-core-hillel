package org.example.lesson10.interfaces;

public class Main {

    public static void main(String[] args) {

        Movie theMovie = new Adventure("Indiana Jones");
        theMovie.watchMovie();

        Comedy veryScaryMovie = new Comedy("Very scary movie");
        veryScaryMovie.watchMovie();
        veryScaryMovie.translate("French");
        String language = veryScaryMovie.getOriginalLanguage();
        System.out.println(language);
    }
}
