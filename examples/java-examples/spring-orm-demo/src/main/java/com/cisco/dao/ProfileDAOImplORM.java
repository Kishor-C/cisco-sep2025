package com.cisco.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cisco.beans.Profile;

@Repository
public class ProfileDAOImplORM implements ProfileDAO {
	@Autowired
	private HibernateTemplate hibernateTemp;
	/*
	 * HibernateTemplate has methods like - save(), loadAll(), delete(Object), get(Class, ID), update(Object)
	 */
	@Override
	public Profile save(Profile profile) {
		// save method of HibernateTemplate returns a primary key
		int id = (int)hibernateTemp.save(profile);
		return findById(id);
	}
	@Override
	public List<Profile> findAll() {
		List<Profile> list = hibernateTemp.loadAll(Profile.class);
		return list;
	}
	@Override
	public Profile findById(int id) {
		Profile profile = hibernateTemp.get(Profile.class, Integer.valueOf(id));
		return profile;
	}
	@Override
	public Profile update(Profile profile) {
		Profile existing = findById(profile.getId());
		existing.setName(profile.getName());
		existing.setDob(profile.getDob());
		hibernateTemp.update(existing);
		return existing;
	}
	@Override
	public void delete(Profile profile) {
		hibernateTemp.delete(profile);
	}
}
