package org.mmpp.amazon.ecs.request.model;

public class AmazonAccessAccount {
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
}
