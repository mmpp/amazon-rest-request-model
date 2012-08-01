package org.mmpp.amazon.rest.request.model;


public class ItemLookupRequest extends AbstractRequest {

	private IdType _idType;
	private String _itemId;
	private SearchIndex _searchIndex;
	
	public void setIdType(IdType idType){
		_idType = idType;
	}
	public IdType getIdType(){
		return _idType;
	}
	
	public void setItemId(String itemId){
		_itemId = itemId;
	}
	public String getItemId(){
		return _itemId;
	}
	public void setSearchIndex(SearchIndex searchIndex) {
		_searchIndex = searchIndex;
	}
	public SearchIndex getSearchIndex(){
		return _searchIndex;
	}
}
