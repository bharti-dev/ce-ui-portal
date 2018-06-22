/**
 * 
 */
package com.binji.common.domain;

/**
 * @author amit.bharti
 *
 */
public class Preview extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PreviewType type;
	private String[] urls;
	
	public PreviewType getType() {
		return type;
	}
	public void setType(PreviewType type) {
		this.type = type;
	}
	public String[] getUrls() {
		return urls;
	}
	public void setUrls(String[] urls) {
		this.urls = urls;
	}

}
