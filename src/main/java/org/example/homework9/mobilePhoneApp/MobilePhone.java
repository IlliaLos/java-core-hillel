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
        return myContacts.add(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.add(index, newContact);
            return true;
        }
        else return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactString) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactString))
                return myContacts.indexOf(contact);
        }
        return 0;
    }

    public Contact queryContact(String contactString) {
        if (findContact(contactString) > 0) {
            return myContacts.get(findContact(contactString));
        }
        else return null;
    }

    public void printContacts() {
        for (Contact contact : myContacts) {
            int i = 1;
            System.out.println(i + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }
}
