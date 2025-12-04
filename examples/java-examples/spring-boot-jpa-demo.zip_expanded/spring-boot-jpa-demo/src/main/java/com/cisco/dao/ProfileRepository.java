package com.cisco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cisco.beans.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

	@Query("select p from Profile p where p.name = ?1")
	public List<Profile> findByNames(String name);
	
	/*
	 * ?1 accepts 1st parameter of the method
	 */
}
