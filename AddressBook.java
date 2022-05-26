package com.bridge.address;

import java.util.List;

public class AddressBook {

	String first_Name; 
	String last_Name;
	String address;
	String city;
	String state;
	String  email;
	int zipCode;
	long phoneNo;
	
	List<Contact> contactList;

	@Override
	public String toString() {
		return "AddressBook [first_Name=" + first_Name + ", last_Name=" + last_Name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", email=" + email + ", zipCode=" + zipCode + ", phoneNo=" + phoneNo
				+ ", contactList=" + contactList + "]";
	}
	
}
