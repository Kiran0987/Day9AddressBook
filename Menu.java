package com.bridge.address;

import java.util.List;
import java.util.Scanner;

public class Menu {

	public int showMainMenu() {
		System.out.println("Enter 1. Add Contact \nEnter 2. Edit Contact \nEnter 3. Delete Contact  \nEnter 4. Print Contact  \nEnter 5. Exit ");
		Scanner sc = new Scanner(System.in);
		int selection = sc.nextInt();
		return selection;
	}
	public AddressBook createbook() {
		AddressBook addressbook = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter FirstName");
        addressbook.first_Name = sc.nextLine();
        System.out.println("Please Enter LastName");
        addressbook.last_Name = sc.nextLine();
        System.out.println("Please Enter Address");
        addressbook.address = sc.nextLine();
        System.out.println("Please Enter city");
        addressbook.city = sc.nextLine();
        System.out.println("Please Enter state");
        addressbook.state = sc.nextLine();
        System.out.println("Please Enter Email");
        addressbook.email = sc.nextLine();
        System.out.println("Please Enter Zipcode");
        addressbook.zipCode = sc.nextInt();
        System.out.println("Please Enter PhoneNo");
        addressbook.phoneNo = sc.nextLong();
        
        return addressbook;
	}
	public void printContact(List<AddressBookRepo> addressbookrepoList) {
		for(int i = 0; i < addressbookrepoList.size(); i++) {
			System.out.println(addressbookrepoList.get(i));
		}
	}
}