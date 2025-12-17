package com.cisco.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.dao.ContactsRepository;
import com.cisco.entities.Contacts;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactsRepository contactDAO;
	@Autowired
	private ProfileService profileService;
	
	@Override
	public List<Contacts> getMyContacts(int userId) {
		List<Contacts> contactsList = profileService.getProfile(userId).getContactList();
		if(contactsList.size() == 0) {
			throw new RuntimeException();
		}
		return contactsList;
	}
	
	@Override
	public List<Contacts> searchContactByName(int userId, String name) {
		List<Contacts> filteredContacts = null;	
		List<Contacts> allContacts = getMyContacts(userId);
		filteredContacts = allContacts.stream()
				.filter(contact -> contact.getName().startsWith(name)).collect(Collectors.toList());
		return filteredContacts;
	}
	@Transactional
	public Contacts addContact(Contacts contact){	
		return contactDAO.save(contact);
	}
	@Transactional
	public void deleteContact(int contactId, int userId) {
		int x = contactDAO.deleteContact(contactId, userId);
		if(x == 0) {
			throw new RuntimeException();
		}
	}

}
