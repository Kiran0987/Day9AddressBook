package com.bridge.address;

public class Contact {
	String first_Name; 
	String last_Name;
	String address;
	String city;
	String state;
	String  email;
	int zipCode;
	long phoneNo;
	
	public Contact(String first_Name, String last_Name, String address, String city, String state, String email,
			int zipCode, long phoneNo) {
		
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
		System.out.println("FirstName :"+ first_Name + " LastName :" +last_Name +" Address is:" + address +" city :" + city +
				" State :" +state +" Email : " + email +" Zipcode :" + zipCode + "  " +" PhoneNo :" + phoneNo);
	
	}
}