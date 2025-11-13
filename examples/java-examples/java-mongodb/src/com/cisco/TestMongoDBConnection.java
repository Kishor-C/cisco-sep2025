package com.cisco;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

public class TestMongoDBConnection {
	public static void main(String[] args) {
		
		try {
			// accessing the database with a converter
			MongoDatabase database = MongoDBConnection.getDatabase();
			System.out.println(database+" Connected");
			//lets create an employee object and store it in the collection
			Employee employee = new Employee("Atharva", 40000);
			//MongoCollection to access the collection 
			MongoCollection<Employee> collection = database.getCollection("employee", Employee.class);
			InsertOneResult result = collection.insertOne(employee);
			System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
