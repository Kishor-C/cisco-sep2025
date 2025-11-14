package com.cisco.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.cisco.beans.Profile;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

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
	public List<Profile> findAll(){
		List<Profile> list = new ArrayList<Profile>();
		try {
			// accessing the database
			MongoDatabase database = MongoDBUtil.getDatabase();
			MongoCollection<Profile> collection = database.getCollection("profile", Profile.class);
			MongoCursor<Profile> cursor = collection.find().iterator();
			
			while(cursor.hasNext()) {
				Profile user = cursor.next();
				list.add(user);
			}
			cursor.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public int delete(ObjectId id) {
		int status = 0;
		try {
			
            MongoDatabase database = MongoDBUtil.getDatabase();
            MongoCollection<Profile> collection = database.getCollection("profile", Profile.class);
            DeleteResult deleteProfile = collection.deleteOne(Filters.eq("_id", id));
            if(deleteProfile.getDeletedCount()!=0) {
            	status = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return status;
	}
	public Profile updatePhonById(ObjectId id, long phone) {
		try {
            MongoDatabase database = MongoDBUtil.getDatabase();
            MongoCollection<Profile> collection = database.getCollection("profile", Profile.class);
            collection.updateOne(Filters.eq("_id", id), Updates.set("phone", phone));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		return findById(id);
	}
}
