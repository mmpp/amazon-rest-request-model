package org.mmpp.amazon.rest.request.model;

public class ItemSearchRequest extends AbstractRequest{
	private SearchIndex _searchIndex;
	private java.util.Map<SearchType,String> _searchParameters;
	/**
	 * 検索結果から10Itemを1ページとしてページングした
	 * 何ページ目のデータを取得するかを指示する
	 * default null : 1ページ目
	 */
	private Integer _itemPage = null;;
	
	public ItemSearchRequest(){
		super();
		_searchParameters = new java.util.HashMap<SearchType,String>();
	}
	public void setSearchIndex(SearchIndex searchIndex) {
		_searchIndex = searchIndex;
	}
	public SearchIndex getSearchIndex(){
		return _searchIndex;
	}
	public java.util.Map<SearchType,String> getSearchParameters(){
		return _searchParameters;
	}
	public Integer getItemPage() {
		return _itemPage;
	}
	public void setItemPage(int itemPage){
		_itemPage = itemPage;
	}
}
