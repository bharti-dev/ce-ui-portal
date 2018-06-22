/**
 * 
 */
package com.binji.common.domain;

/**
 * @author amit.bharti
 *
 */
public class BrowseItem extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String thumbnailUrl;
	private String detailUrl;
	private Preview preview;
	private String title;
	private BrowseType type;
	
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public String getDetailUrl() {
		return detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public Preview getPreview() {
		return preview;
	}
	public void setPreview(Preview preview) {
		this.preview = preview;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BrowseType getType() {
		return type;
	}
	public void setType(BrowseType type) {
		this.type = type;
	}
}
