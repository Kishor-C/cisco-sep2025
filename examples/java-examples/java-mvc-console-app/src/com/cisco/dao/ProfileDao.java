package com.cisco.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cisco.beans.Profile;
/*
 * CRUD methods on Profile table
 */
public class ProfileDao {
	// save(Profile p), findAll(), findById(int id), deleteById(int id)
	
	// save the profile and return the saved profile
	public Profile save(Profile profile) {
		try {
			Connection connection = JdbcUtil.getConnection();
			// Statement has a constant that can return the generated primary key
			PreparedStatement statement = 
		connection.prepareStatement("insert into profile(name, dob) values (?,?)", Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, profile.getName());
			statement.setDate(2, Date.valueOf(profile.getDob()));
			int count = statement.executeUpdate();
			Profile createdProfile = null;
			if(count > 0) {
				ResultSet result =  statement.getGeneratedKeys();
				if(result.next()) {
					int id = result.getInt(1);
					createdProfile = findById(id);
				}
			}
			return createdProfile;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// get a profile based on id
	public Profile findById(int id) {
		try {
			Connection connection = JdbcUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from profile where id = ?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			Profile profile = null;
			while(result.next()) {
				profile = new Profile();
				profile.setId(result.getInt(1));
				profile.setName(result.getString(2));
				profile.setDob(result.getDate(3).toLocalDate());
			}
			result.close();
			statement.close();
			connection.close();
			return profile;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	// get all the profiles
	public List<Profile> findAll() {
		try {
			Connection connection = JdbcUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from profile");
			// next() returns true if record is present
			// getInt(index), getString(index), getDouble(index), getDate(index)
			List<Profile> list = new ArrayList<Profile>();
			while(result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				LocalDate dob = result.getDate(3).toLocalDate();
				Profile profile = new Profile(id, name, dob);
				list.add(profile);
			}
			//System.out.println(list);
			result.close();
			statement.close();
			connection.close();
			return list;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
