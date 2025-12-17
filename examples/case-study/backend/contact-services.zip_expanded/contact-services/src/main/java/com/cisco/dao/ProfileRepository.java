package com.cisco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
