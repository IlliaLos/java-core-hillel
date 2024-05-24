package org.example.lesson10.interfaces;

public class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("So exciting adventure!");
    }
}
