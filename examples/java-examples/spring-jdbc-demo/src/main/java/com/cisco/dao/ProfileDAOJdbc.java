package com.cisco.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cisco.beans.Profile;

@Repository
public class ProfileDAOJdbc implements ProfileDAO {

	@Autowired
	private JdbcTemplate jdbcTemp;

	public int save(Profile profile) {
		int status = 0;
		String query = "insert into profile(name, dob) values(?,?)";
		status = jdbcTemp.update(query, profile.getName(), Date.valueOf(profile.getDob()));
		return status;
	}
	public List<Profile> findAll() {
		String query = "select * from profile";
		List<Profile> list = jdbcTemp.query(query, 
				(rs, rowNum)-> new Profile(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate()));
		return list;
	}
	public Profile findById(int id) {
		Profile p = jdbcTemp.queryForObject("select * from profile where id = ?", 
				(rs, rowNum)-> new Profile(rs.getInt(1), rs.getString(2), rs.getDate(3).toLocalDate()), 
				id);
		return p;
	}
	public void deleteById(int id) {
		String query = "delete from profile where id = ?";
		jdbcTemp.update(query, id);
	} 
}
