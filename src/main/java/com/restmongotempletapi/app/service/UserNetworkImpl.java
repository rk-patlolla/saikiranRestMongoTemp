package com.restmongotempletapi.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.restmongotempletapi.app.document.Network;

@Service
public class UserNetworkImpl implements UserNetWork {
	@Autowired
	private MongoTemplate mongotemp;
	@Autowired
	private CounterImpl CounterService;

	@Override
	public Network addNetWork(Network network) {
		network.setNetwork_id(CounterService.getNextNetworkIdSequence());
		mongotemp.save(network);
		return network;
	}

}
