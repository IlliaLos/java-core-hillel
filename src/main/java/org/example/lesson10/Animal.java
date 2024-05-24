package org.example.lesson10;

public abstract class Animal {

    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void move() {
        System.out.println(type + " moves with unknown speed");

    }

    public void makeNoise() {
        System.out.println(type + "makes some noise");
    }
}
