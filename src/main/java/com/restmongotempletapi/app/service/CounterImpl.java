package com.restmongotempletapi.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.restmongotempletapi.app.document.Counter;
@Service
public class CounterImpl implements CounterService{
	public static final String USER_ID_SEQUENCE_NAME = "user_id";
	public static final String NetWork_ID_SEQUENCE_NAME = "network_id";
    @Autowired
	private MongoTemplate mongotemp;
	
	
	@Override
	public long getNextUserIdSequence() {

		return increaseCounter(USER_ID_SEQUENCE_NAME);
	}
	private long increaseCounter(String counterName){
		
		        Query query = new Query(Criteria.where("name").is(counterName));
		
		        Update update = new Update().inc("sequence", 1);
		
		        Counter counter = mongotemp.findAndModify(query, update, Counter.class); // return old Counter object
		
		        return counter.getSequence();
		
		    }
	@Override
	public long getNextNetworkIdSequence() {
		  return increaseCounter(NetWork_ID_SEQUENCE_NAME);
	}

}
