package com.cisco.dao;

public class StudentRepositoryMySQLImpl implements StudentRepository {
	
	private String databaseVersion;
	public StudentRepositoryMySQLImpl() {
		
	}
	public StudentRepositoryMySQLImpl(String databaseVersion) {
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
		System.out.println("saves in MySQL: "+databaseVersion);
	}

	@Override
	public void find() {
		System.out.println("finds from MySQL: "+databaseVersion);
	}
	
	
}
