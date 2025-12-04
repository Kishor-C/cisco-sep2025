package com.cisco.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileRepository;

@Service
public class ProfileServiceImpl {

	/*
	 * Spring Injects the proxy implementation of ProfileRepository
	 * this proxy implementation is auto-implemented by spring boot
	 */
	@Autowired
	private ProfileRepository profileRepo;
	
	public List<Profile> fetchProfiles() {
		return profileRepo.findAll();
	}
	// import org.springframework.transaction.annotation.Transactional;
	@Transactional // required when table is changed
	public Profile saveProfile(Profile profile) {
		Profile savedEntity = profileRepo.save(profile);
		return savedEntity;
	}
	public Profile fetchProfile(int id) {
		Optional<Profile> option = profileRepo.findById(id);
		return option.orElseThrow(() -> new RuntimeException("Id "+id+" not found"));
	}
	@Transactional // required when table is changed
	public Profile updateProfileDobById(int id, LocalDate dob) {
		Profile profile = fetchProfile(id);
		profile.setDob(dob); // commits the entity under transaction & doesn't need to call any method
		return profile;
	}
}
