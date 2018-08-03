package com.restmongotempletapi.app.service;

public interface CounterService {

	long getNextUserIdSequence();
	long getNextNetworkIdSequence();

}
