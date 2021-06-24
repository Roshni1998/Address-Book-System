package com.bridgelabz;

public class Main {

    public static void main(String []args){
        System.out.println("Welcome to Address Book System");
        AddressBook addressBook = new AddressBook(5);
        addressBook.addContact("Rohit", "Sharma", "Malviya Nagar", "Udaipur", "Rajasthan", "34267","7345682934", "rohit123@");
        addressBook.addContact("Rajeev", "Malhotra", "Shastri Circle", "Ahmedabad", "Gujarat", "56743", "9998889994", "rajeev@");
        System.out.println(addressBook);
    }
}
