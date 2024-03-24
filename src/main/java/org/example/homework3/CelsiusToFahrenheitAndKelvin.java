package org.example.homework3;

public class CelsiusToFahrenheitAndKelvin {
    public static void main(String[] args) {
        double c = 36.0;

        System.out.println(c + " degrees Celsius corresponds to " + (c * 1.8 + 32) + " degrees Fahrenheit");
        System.out.println(c + " degrees Celsius corresponds to " + (c + 273.15) + " degrees Kelvin");
    }
}
