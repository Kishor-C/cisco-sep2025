package com.cisco.dao;

public class StudentRepositoryOracleImpl implements StudentRepository {
	
	private String databaseVersion;
	public StudentRepositoryOracleImpl() {
		
	}
	public StudentRepositoryOracleImpl(String databaseVersion) {
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
		System.out.println("saves in Oracle: "+databaseVersion);
	}

	@Override
	public void find() {
		System.out.println("finds from Oracle: "+databaseVersion);
	}
	
	
}
