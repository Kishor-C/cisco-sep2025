package com.cisco.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cisco.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer>{

	@Modifying
	@Query("delete from Contacts c where c.id=?1 and c.userIdRef=?2")
	int deleteContact(int id, int userId);
}
