package com.cisco.service;

import com.cisco.dao.StudentRepositoryMongoImpl;
import com.cisco.dao.StudentRepositoryMySQLImpl;
import com.cisco.dao.StudentRepositoryOracleImpl;

public class EmployeeServiceImpl {
	private StudentRepositoryMySQLImpl mysqlRepo;
	private StudentRepositoryOracleImpl oracleRepo;
	private StudentRepositoryMongoImpl mongoRepo;
	
	public void testAllDBs() {
		mysqlRepo.save();
		oracleRepo.save();
		mongoRepo.save();
	}
	// setters & getters

	public StudentRepositoryMySQLImpl getMysqlRepo() {
		return mysqlRepo;
	}

	public void setMysqlRepo(StudentRepositoryMySQLImpl mysqlRepo) {
		this.mysqlRepo = mysqlRepo;
	}

	public StudentRepositoryOracleImpl getOracleRepo() {
		return oracleRepo;
	}

	public void setOracleRepo(StudentRepositoryOracleImpl oracleRepo) {
		this.oracleRepo = oracleRepo;
	}

	public StudentRepositoryMongoImpl getMongoRepo() {
		return mongoRepo;
	}

	public void setMongoRepo(StudentRepositoryMongoImpl mongoRepo) {
		this.mongoRepo = mongoRepo;
	}
	
}
