package com.bridgelabz;

import java.util.Arrays;

public class AddressBook {

    private ContactDetail contactArray[] ;
    private int index = 0;

    public AddressBook(int sizeOfArray){
        contactArray = new ContactDetail[sizeOfArray];
    }

    public void addContact(String firstName, String lastName, String address, String city, String state, String zipNo, String mobileNo, String emailId){

        ContactDetail contact = new ContactDetail(firstName, lastName, address, city, state, zipNo, mobileNo, emailId);
        contactArray[index] = contact;
        index++;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactArray=" + Arrays.toString(contactArray) +
                '}';
    }
}
