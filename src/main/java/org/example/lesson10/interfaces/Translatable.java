package org.example.lesson10.interfaces;

public interface Translatable {

    void translate(String language);

    default String getOriginalLanguage() {
        return "English";
    }
}
