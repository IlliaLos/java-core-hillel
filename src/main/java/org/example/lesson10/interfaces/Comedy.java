package org.example.lesson10.interfaces;

public class Comedy extends Movie implements Translatable {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Ha-Ha-Ha!");
    }

    @Override
    public void translate(String language) {
        System.out.println("Language is switched to: " + language);
    }

//    @Override
//    public String getOriginalLanguage() {
//        return "English";
//    }
}
