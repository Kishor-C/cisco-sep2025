package com.cisco.service;

import java.util.List;

import com.cisco.entities.Contacts;

public interface ContactService {
	// add contact for the existing userId
	public Contacts addContact(Contacts contact);

	// get contacts matching by name for a particular userId
	public List<Contacts> searchContactByName(int userId, String name);

	// delete the contact only for a particular userId
	public void deleteContact(int contactId, int userid);

	// get contacts of a particular userId
	public List<Contacts> getMyContacts(int userId);

}
