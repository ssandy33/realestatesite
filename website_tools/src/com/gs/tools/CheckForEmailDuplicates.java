package com.gs.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.gs.database.ContactDAO;
import com.gs.models.Contact;

public class CheckForEmailDuplicates {
	static ContactDAO contactDAO = new ContactDAO();
	
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<Contact>();
		HashMap<String, Contact> contactMap = null;
		Contact contact = null;
		
		contacts = contactDAO.getAllContacts();
		contactMap = createHash(contacts);
		
		Iterator<Contact> it = contacts.iterator();
		
//		while (it.hasNext()) {
//			contact = it.next();
//			if (contactMap.containsKey(contact.getEmail().trim()))
//				System.out.println("This is a duplicate: " + contact.getEmail());	
//		}
		
		System.out.println("TSTE");
	}
	
	public static HashMap<String, Contact> createHash(List<Contact> list) {
		HashMap<String, Contact> map = new HashMap<String, Contact>();
			for(Contact item: list) {
				if (!map.containsKey(item.getEmail().trim()))
					map.put(item.getEmail().trim(), item);
				else {
					System.out.println("This is a duplicate: " + item.getEmail());
					contactDAO.updateNoMailAndEmail(item);
				}
			}
		
		return map;
	}
	
	public static List<Contact> cloneList(List<Contact> list) {
	    List<Contact> clone = new ArrayList<Contact>(list.size());
	    for(Contact item: list) 
	    	clone.add(new Contact(item));
	    return clone;
	}
}
