package org.mmpp.amazon.ecs.request.model;

import java.util.Date;

public abstract class AbstractRequest {

	private Operation _operation = null;
	private AmazonAccessAccount _amazonAccessAccount;
	private Date _timestamp;
	public void setOperation(Operation operation){
		_operation = operation;
	}
	public Operation getOperation(){
		return _operation;
	}
	
	
	public void setAmazonAccessAccount(AmazonAccessAccount amazonAccessAccount) {
		_amazonAccessAccount = amazonAccessAccount;
	}

	public AmazonAccessAccount getAmazonAccessAccount(){
		return _amazonAccessAccount;
	}
	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;
	}
	public Date getTimestamp(){
		return _timestamp;
	}
}
