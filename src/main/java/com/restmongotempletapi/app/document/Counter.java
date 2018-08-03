package com.restmongotempletapi.app.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "counter")
public class Counter extends IdEntity {
	private String name;
	private long sequence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSequence() {
		return sequence;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", sequence=" + sequence + "]";
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}
}
