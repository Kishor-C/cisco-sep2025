package com.cisco.service;

import com.cisco.dao.StudentRepository;

public class StudentServiceImpl {
	private StudentRepository repo;

	public StudentServiceImpl() {
		super();
	}

	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	public StudentRepository getRepo() {
		return repo;
	}

	public void setRepo(StudentRepository repo) {
		this.repo = repo;
	}
	public void testCRUD() {
		repo.save();
		repo.find();
	}
}
