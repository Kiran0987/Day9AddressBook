package com.bridge.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBookRepo {
	List<AddressBook> addressbookList = new ArrayList<>();  
	
	public void add(AddressBook addressbook) {
		addressbookList.add(addressbook);
	}

	
}
