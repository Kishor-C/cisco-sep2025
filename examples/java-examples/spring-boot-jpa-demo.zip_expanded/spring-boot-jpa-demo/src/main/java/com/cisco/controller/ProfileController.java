package com.cisco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.beans.Profile;
import com.cisco.service.ProfileServiceImpl;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	private ProfileServiceImpl service;
	// URL - http://localhost:8080/profile HTTP method - GET
	@GetMapping
	public ResponseEntity<Object> findProfilesAPI() {
		List<Profile> list = service.fetchProfiles();
		return ResponseEntity.ok(list);
	}
	// URL - http://localhost:8080/profile/1 HTTP method - GET
	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> findProfileAPI(@PathVariable int id) {
		try {
			Profile profile = service.fetchProfile(id);
			return ResponseEntity.ok(profile);
		} catch(Exception e) {
			Map<String, String> map = Map.of("message", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}
	// URL - http://localhost:8080/profile HTTP method - POST
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveProfileAPI(@RequestBody Profile profile) {
		Profile saved = service.saveProfile(profile);
		return ResponseEntity.ok(saved);
	}
	
}
