package com.restmongotempletapi.app.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="network")
public class Network {

	@Id 
	private long network_id;
	@Indexed(unique = true)
	private String networkName;
	private String networkType;
	
	
	
	public long getNetwork_id() {
		return network_id;
	}



	public void setNetwork_id(long network_id) {
		this.network_id = network_id;
	}



	public String getNetworkName() {
		return networkName;
	}



	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}



	public String getNetworkType() {
		return networkType;
	}



	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}



	@Override
	public String toString() {
		return "Network [network_id=" + network_id + ", networkName=" + networkName + ", networkType=" + networkType
				+ "]";
	}

}
