package org.example.lesson15;

public class Melon {

    private String type;
    private int weight;
    private String origin;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public Melon() {}

    public Melon(String type, int weight, String origin) {
        this(type, weight);
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
