package com.cisco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.entities.Contacts;
import com.cisco.entities.Profile;
import com.cisco.service.ContactService;
import com.cisco.service.ProfileService;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*")
public class ProfileContactController {

	@Autowired
	private ProfileService profileService;
	@Autowired
	private ContactService contactService;

	/*
	 * getting all the contacts
	 * 
	 */
	
	@GetMapping(path = "/profile/{userId}/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getContactsService(@PathVariable("userId") int id) {
		ResponseEntity<Object> responseEntity = null;
		try {
			responseEntity = ResponseEntity.status(200).body(contactService.getMyContacts(id));
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Sorry Contacts not available");
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * 
	 * search the contact based on userid and name 
	 *
	 */
	@GetMapping(path = "/profile/searchByName/{userId}/{name}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> searchContactsByNameService(@PathVariable int userId, @PathVariable String name) {
		ResponseEntity<Object> responseEntity = null;
		try {
			List<Contacts> list = contactService.searchContactByName(userId, name);
			if(list.size() != 0)
				responseEntity = ResponseEntity.status(200)
					.body(list);
			else
				throw new RuntimeException();
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Sorry no matching records with "+name);
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * store the profile 
	 * 
	 */
	@PostMapping(path = "/createProfile", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeProfileService(@RequestBody Profile profile) {
		
		ResponseEntity<Object> responseEntity = null;
		try {
			Profile createdProfile = profileService.createProfile(profile);
			responseEntity = ResponseEntity.status(200).body(createdProfile);
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Sorry user is not created");
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * authentication service 
	 * 
	 */
	@GetMapping(path = "/login/{userId}/{password}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> authenticateService(@PathVariable int userId, 
			@PathVariable String password) {
		
		ResponseEntity<Object> responseEntity = null;
		try {
			Profile profile = profileService.login(userId, password);
			responseEntity = ResponseEntity.status(200).body(profile);
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Username or Password is invalid");
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * 
	 * get the profile by userid
	 * 
	 */
	@GetMapping(path = "/profile/{userId}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getProfile(@PathVariable int userId) {
		ResponseEntity<Object> responseEntity = null;
		try {
			Profile profile = profileService.getProfile(userId);
			responseEntity = ResponseEntity.status(200).body(profile);
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Invalid user id: "+userId);
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * 
	 * update the password based on userId
	 * 
	 */
	@PutMapping( 
			path = "/updateProfile/{userId}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatePasswordService(@PathVariable int userId, @PathVariable String password) {
		ResponseEntity<Object> responseEntity = null;
		try {
			Profile profile = profileService.updatePassword(userId, password);
			responseEntity = ResponseEntity.status(200).body(profile);
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", "Sorry try again");
			responseEntity = ResponseEntity.status(404).body(map);
		}
		return responseEntity;
	}
	/*
	 * 
	 * deleting the profile based on userId
	 * 
	 */
	@DeleteMapping(path = "/profile/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteProfileService(@PathVariable int userId) {
		ResponseEntity<Object> responseEntity = null;
		try {
			profileService.deleteProfile(userId);
			responseEntity = ResponseEntity.status(200)
					.body(Map.of("message","Profile deleted, you can't get back your contacts, we wish to see you in future"));
		} catch(Exception e) {
			responseEntity = ResponseEntity.status(404).body(Map.of("message", "Sorry try again"));
		}
		return responseEntity;
	}
	
	/*
	 * 
	 * deleting the contacts based on userid & contactid, user id is so that only the contact of particular user can be deleted
	 * 
	 */
	@DeleteMapping(path = "/profile/{userId}/delete/{contactId}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteContactService(@PathVariable int userId, @PathVariable int contactId) {
		
		ResponseEntity<Object> responseEntity = null;
		try {
			contactService.deleteContact(contactId, userId);
			responseEntity = ResponseEntity.status(200)
					.body(Map.of("message","Contact Deleted"));
		} catch(Exception e) {
			responseEntity = ResponseEntity.status(404).body(Map.of("","Sorry try again"));
		}
		return responseEntity;
	}
	
	
	/*
	 * 
	 * add the contact for a particular userid
	 * 
	 */
	@PostMapping(value = "/profile/{userId}/addContact", 
			 produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addContactService(@RequestBody Contacts contact, @PathVariable int userId) {
		
		ResponseEntity<Object> responseEntity = null;
		try {
			contact.setUserIdRef(userId);
			Contacts createdContact = contactService.addContact(contact);
			responseEntity = ResponseEntity.status(200)
					.body(Map.of("message",createdContact.getName()+" added to your contact"));
		} catch(Exception e) {
			responseEntity = ResponseEntity.status(404).body(Map.of("message","Sorry contact not added"));
		}
		return responseEntity;
	}
}
