package com.cisco.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAO;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDAO dao;

	@Override
	@Transactional
	public Profile saveProfile(Profile profile) {
		Profile created = dao.save(profile);
		return created;
		
	}
	@Override
	public List<Profile> fetchProfiles() {
		List<Profile> list = dao.findAll();
		return list;
	}

	@Override
	public Profile[] saveManyProfiles(Profile... profiles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateProfileDob(int id, LocalDate dob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile updateProfileName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProfile(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteManyProfiles(int... id) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public Profile fetchProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
