package org.example.homework9.mobilePhoneApp;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List <Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0 )
            return false;
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if(findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName))
                return myContacts.indexOf(contact);
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        if (findContact(contactName) >= 0) {
            return myContacts.get(findContact(contactName));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}