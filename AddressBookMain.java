package com.bridge.address;

import java.util.Scanner;

public class AddressBookMain {

	public static void main (String[] args) {
		System.out.println("Welcome to AddressBook Program");
		/*	AddressBook addressbook = AddressBook();
		addressbook.contactList= new ArrayList<>();
		addressbook.first_Name = "Ram";
		addressbook.last_Name = "Kumar";
		addressbook.address = "166 chhatisgarh";
		addressbook.city = "MP";
		addressbook.state = "Mp";
		addressbook.email = "r123@gmail.com";
		addressbook.zipCode = 786543;
		addressbook.phoneNo = 987654432;*/

		AddressBookMain main = new AddressBookMain();
		Menu menu = new Menu();
		int selection = 0;
		while (selection != 9) {
			selection = menu.showMainMenu();
			main.handleUserSelection(selection);
		}	
	}
	public void handleUserSelection(int selection) {
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);
		switch(selection) {
		case 1:
			AddressBookRepo repo = new AddressBookRepo();	
			AddressBook addressbook = menu.createbook();
			repo.add(addressbook);
			System.out.println("Successfully Added");
			break;
		default:
			System.out.println("Enter proper option");
			break;
		}
		}
	}
