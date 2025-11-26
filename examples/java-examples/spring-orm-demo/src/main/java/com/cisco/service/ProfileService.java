package com.cisco.service;

import java.time.LocalDate;
import java.util.List;

import com.cisco.beans.Profile;

public interface ProfileService {
	public Profile saveProfile(Profile profile);
	public Profile[] saveManyProfiles(Profile... profiles);
	public Profile updateProfileDob(int id, LocalDate dob);
	public Profile updateProfileName(int id, String name);
	public void deleteProfile(int id);
	public void deleteManyProfiles(int... id);
	public List<Profile> fetchProfiles();
	public Profile fetchProfile(int id);
}
