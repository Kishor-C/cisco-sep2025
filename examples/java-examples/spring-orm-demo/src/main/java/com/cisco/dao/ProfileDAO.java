package com.cisco.dao;

import java.util.List;

import com.cisco.beans.Profile;

public interface ProfileDAO {
	public Profile save(Profile profile);
	public List<Profile> findAll();
	public Profile findById(int id);
	public Profile update(Profile profile);
	public void delete(Profile profile);
}
