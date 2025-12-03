package com.cisco.dao;

import java.util.List;

import com.cisco.beans.Profile;

public interface ProfileDAO {
	public int save(Profile profile);
	public List<Profile> findAll();
	public Profile findById(int id);
	public void deleteById(int id);
}
