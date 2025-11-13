package com.cisco;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class TestMongoDBFindAll {

	public static void main(String[] args) {
		try {
			// accessing the database with a converter
			MongoDatabase database = MongoDBConnection.getDatabase();
			MongoCollection<Employee> collection = database.getCollection("employee", Employee.class);
			MongoCursor<Employee> cursor = collection.find().iterator();
			// List<Employee> to hold the employee objects
			List<Employee> employees = new ArrayList<>();
			while(cursor.hasNext()) {
				Employee emp = cursor.next();
				employees.add(emp);
			}
			System.out.println(employees);
			cursor.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
