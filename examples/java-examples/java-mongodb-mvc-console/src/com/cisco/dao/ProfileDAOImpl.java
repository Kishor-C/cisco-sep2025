package com.cisco.dao;

import org.bson.types.ObjectId;

import com.cisco.beans.Profile;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;

public class ProfileDAOImpl {
	// save, findAll, findById, updateById, deleteById
	// findById that accepts the _id and returns the Profile
	public Profile findById(ObjectId id) {
		MongoCollection<Profile> collection = MongoDBUtil.getDatabase().getCollection("profile", Profile.class);
		Profile profile = collection.find(Filters.eq("_id", id)).first();
		return profile;
	}
	public Profile save(Profile profile) {
		MongoCollection<Profile> collection = MongoDBUtil.getDatabase().getCollection("profile", Profile.class);
		InsertOneResult result = collection.insertOne(profile);
		ObjectId insertedId = result.getInsertedId().asObjectId().getValue();
		return findById(insertedId);
	}
}
