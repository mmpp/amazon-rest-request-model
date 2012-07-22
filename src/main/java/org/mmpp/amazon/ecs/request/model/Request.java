package org.mmpp.amazon.ecs.request.model;


public class Request {
	public static final String REQUEST_URI = "/onca/xml";
	public static final String REQUEST_METHOD = "GET";
	private String _endpoint = "ecs.amazonaws.jp";

	private AbstractRequest _itemRequest;
	public String getEndpoint(){
		return _endpoint;
	}
	public void setEndpoint(String endpoint){
		_endpoint = endpoint;
	}
	public void setItemRequest(AbstractRequest itemRequest) {
		_itemRequest = itemRequest;
	}
	public AbstractRequest getItemRequest(){
		return _itemRequest;
	}
}
