package org.example.homework7;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter e-mail address");
        String email = scan.nextLine();


        System.out.println(email + " is valid e-mail: " + isValidEmail(email));
    }

    private static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }
}
