package com.cisco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.dao.ProfileRepository;
import com.cisco.entities.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileDAO;

	@Transactional
	public Profile createProfile(Profile profile) {
		return profileDAO.save(profile);
	}

	@Override
	public Profile getProfile(int userId) {
		return profileDAO.findById(userId).get();
	}

	@Transactional
	public void deleteProfile(int userId) {
		profileDAO.deleteById(userId);

	}

	@Transactional
	public Profile updatePassword(int userId, String password) {
		Profile profile = null;
		profile = getProfile(userId);
		if (profile == null) {
			throw new RuntimeException();
		}
		profile.setPassword(password);
		return profile;
	}

	@Override
	public Profile login(int userId, String password) {
		Profile profile = getProfile(userId);
		if (profile == null) {
			throw new RuntimeException();
		}
		String pwd = profile.getPassword();
		if (pwd.equals(password)) {
			return profile;
		} else {
			throw new RuntimeException();
		}
	}

}
