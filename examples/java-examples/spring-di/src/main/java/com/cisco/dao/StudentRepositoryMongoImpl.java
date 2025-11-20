package com.cisco.dao;

public class StudentRepositoryMongoImpl implements StudentRepository {
	
	private String databaseVersion;
	public StudentRepositoryMongoImpl() {
		
	}
	public StudentRepositoryMongoImpl(String databaseVersion) {
		this.databaseVersion = databaseVersion;
	}
	
	public String getDatabaseVersion() {
		return databaseVersion;
	}
	public void setDatabaseVersion(String databaseVersion) {
		this.databaseVersion = databaseVersion;
	}
	@Override
	public void save() {
		System.out.println("saves in MongoDB: "+databaseVersion);
	}

	@Override
	public void find() {
		System.out.println("finds from MongoDB: "+databaseVersion);
	}
	
	
}
