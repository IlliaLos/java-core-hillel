package org.example.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Melon> melons = new ArrayList<>();

    public void addMelon(Melon melon) {
        melons.add(melon);
    }

    public List<Melon> getMelons() {
        return melons;
    }
}
