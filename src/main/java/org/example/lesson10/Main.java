package org.example.lesson10;

public class Main {

    public static void main(String[] args) {
//        Account newAccount = new Account();
        Account john = new Account("John");
        System.out.println(john.getBalance());
        System.out.println(john.getNumber());
        Account accountNumberThree = new Account("Tommy", 123456, 100.00);

        System.out.println("*".repeat(20));

        Dog anyDog = new Dog(); // initialization of a dog
        System.out.println(anyDog);
    }
}
