package com.restmongotempletapi.app.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userdetails")
public class UserDeatils  {
	@Id 
	private long userId;
	@Indexed(unique = true)
	private String userName;
	@DBRef
	private Network network;
	private String emailId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long ld) {
		this.userId = ld;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "UserDeatils [userId=" + userId + ", userName=" + userName + ", network=" + network + ", emailId="
				+ emailId + "]";
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

}
