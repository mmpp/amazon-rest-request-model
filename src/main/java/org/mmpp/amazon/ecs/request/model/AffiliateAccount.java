package org.mmpp.amazon.ecs.request.model;

/**
 * アフィリエイトアカウント情報
 * @author wataru
 * @page https://affiliate.amazon.co.jp/gp/associates/network/main.html
 */
public class AffiliateAccount {
	/**
	 * アフィリエイト トラッキングID 
	 */
	private String _trackingId;

	/**
	 * アフィリエイト トラッキングIDを格納します
	 * @param affiliateid アフィリエイト トラッキングID 
	 */
	public void setTrackingID(String trackingid) {
		this._trackingId = trackingid;
	}
	/**
	 * アフィリエイト トラッキングIDを取得します 
	 * @return アフィリエイト トラッキングID
	 */
	public String getTrackingID(){
		return _trackingId;
	}
}
