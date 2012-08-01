package org.mmpp.amazon.rest.request.model;

/**
 * アクセス証明書
 * @author wataru
 * @page https://portal.aws.amazon.com/gp/aws/securityCredentials
 */
public class AccessCertificate {
	/**
	 * シークレットアクセスキー
	 */
	private String _secretKey;
	/**
	 * アクセスキー
	 */
	private String _accessKey;

	/**
	 * シークレットアクセスキーを格納します
	 * @param key アクセス証明書 シークレットアクセスキー
	 */
	public void setSecretKey(String key) {
		this._secretKey = key;
	}
	/**
	 * シークレットアクセスキーを取得します
	 * @return アクセス証明書 シークレットアクセスキー
	 */
	public String getSecretKey(){
		return this._secretKey;
	}
	/**
	 * アクセスキーを格納します
	 * @param accessKey アクセス証明書 アクセスキー
	 */
	public void setAccessKey(String accessKey) {
		this._accessKey = accessKey;
	}
	/**
	 * アクセスキーを取得します
	 * @return アクセス証明書 アクセスキー
	 */
	public String getAccessKey(){
		return this._accessKey;
	}
}
