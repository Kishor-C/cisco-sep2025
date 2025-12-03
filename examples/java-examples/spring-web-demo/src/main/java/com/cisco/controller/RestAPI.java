package com.cisco.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAO;

@RestController
@RequestMapping("/api")
public class RestAPI {

	
	@Autowired
	private ProfileDAO dao;
	
	// post mapping
	
	@RequestMapping(path = "/save", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveProfile(@RequestBody Profile profile) {
		
		ResponseEntity<Object> response = null;
		int status = dao.save(profile);
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "Saved and  "+status+" row udpated");
		response = ResponseEntity.status(201).body(map);
		return response;
	}
	
	
	// find/* -> find/1, find/200, find/300 and so on
	@RequestMapping(path = "/find/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findProfile(@PathVariable("id") int id) {
		
		ResponseEntity<Object> response = null;
		try {
			Profile profile = dao.findById(id);
			response = ResponseEntity.status(200).body(profile);
		} catch (Exception e) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("message", "Profile with an id "+id+" not found");
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
	
	
	@RequestMapping(path = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findProfiles() {
		List<Profile> list = dao.findAll();
		ResponseEntity<Object> response = ResponseEntity.status(200).body(list);
		return response;
	}
	
	
	@RequestMapping(path = "/test", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<Object> greet() {
		ResponseEntity<Object> response = ResponseEntity.status(200).body("Hello REST");
		return response;
	}
}
