package org.example.homework9.mobilePhoneApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Contact> myContacts = new ArrayList<>();
        MobilePhone myMobilePhone = new MobilePhone("+380 50-465-46-35", myContacts);

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        System.out.println("addNewContact() and printContacts() testing");
        myMobilePhone.addNewContact(bob);
        myMobilePhone.addNewContact(alice);
        myMobilePhone.addNewContact(tom);
        myMobilePhone.addNewContact(jane);
        myMobilePhone.printContacts();
        System.out.println("-".repeat(30));

        System.out.println("updateContact() testing");
        myMobilePhone.updateContact(tom, jane);
        myMobilePhone.printContacts();
        System.out.println("-".repeat(30));

        System.out.println("removeContact() testing");
        myMobilePhone.removeContact(jane);
        myMobilePhone.printContacts();
        System.out.println("-".repeat(30));

        System.out.println("findContact(Contact) testing");
        System.out.println(myMobilePhone.findContact(alice));
        System.out.println("-".repeat(30));

        System.out.println("findContact(String) testing");
        System.out.println(myMobilePhone.findContact("Bob"));
        System.out.println("-".repeat(30));

        System.out.println("queryContact() testing");
        System.out.println(myMobilePhone.queryContact("Jane").getName());
        System.out.println(myMobilePhone.queryContact("Tom"));
        System.out.println("-".repeat(30));
    }
}