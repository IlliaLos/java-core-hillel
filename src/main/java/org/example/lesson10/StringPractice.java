package org.example.lesson10;

public class StringPractice {

    public static void main(String[] args) {
        String text = """
                Yesterday!
                \u2022All my troubles seemed so far away
                ....
                Oh i believe...
                """;

        String newString = "abcd\n\"efgh\"";

        System.out.println(newString);

        int age = 33;
        int birthdayDay = 9;
        String message = "Your age is" + age + "and birthday day is" + birthdayDay;
        String formattedString = String.format("Your age is %d and birthday day is %d", age, birthdayDay);
        System.out.println(formattedString);
    }
}
