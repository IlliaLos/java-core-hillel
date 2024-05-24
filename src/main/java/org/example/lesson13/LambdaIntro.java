package org.example.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaIntro {

    record Person(String firstName, String lastName) {

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        var people = new ArrayList<>(Arrays.asList(
                new Person("Charlie", "Parker"),
                new Person("Dizzy", "Gillespie"),
                new Person("Chet", "Baker"),
                new Person("Miles", "Davis"),
                new Person("Sonny", "Rollins")
        ));

        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName.compareTo(o2.lastName);
            }
        };

        people.sort((o1, o2) -> o1.lastName.compareTo(o2.lastName));
    }
}
