package org.mmpp.amazon.ecs.request.model;

import java.util.Date;

public abstract class AbstractRequest {

	private Operation _operation = null;
	private Date _timestamp;
	private AccessCertificate _accessCertificate;
	private AffiliateAccount _affiateAccount;
	public void setAccessCertificate(AccessCertificate accessCertificate) {
		_accessCertificate = accessCertificate;
	}
	public AccessCertificate getAccessCertificate(){
		return _accessCertificate;
	}
	public void setAffiliateAccount(AffiliateAccount affiateAccount) {
		_affiateAccount = affiateAccount;
	}
	public AffiliateAccount getAffiliateAccount(){
		return _affiateAccount;
	}
	public void setOperation(Operation operation){
		_operation = operation;
	}
	public Operation getOperation(){
		return _operation;
	}
	
	public void setTimestamp(Date timestamp) {
		_timestamp = timestamp;
	}
	public Date getTimestamp(){
		return _timestamp;
	}
}
