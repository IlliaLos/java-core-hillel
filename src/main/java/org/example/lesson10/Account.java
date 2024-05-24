package org.example.lesson10;

public class Account {

    private String customerName;
    private int number;
    private double balance;
    private boolean isResident;

    public Account(String customerName) {
        this(customerName, 00000, 0.00);
    }

//    public Account() {
//        System.out.println("empty default constructor is called");
//    }

    public Account(String customerName, int number, double balance) {
        this.customerName = customerName;
        this.number = number;
        this.balance = balance;
    }


    public String getCustomerName() {
        return customerName;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isResident() {
        return isResident;
    }
}
