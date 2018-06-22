/**
 * 
 */
package com.binji.common.domain;

/**
 * @author amit.bharti
 *
 */
public class Error extends BaseDomain {

	private static final long serialVersionUID = 1L;

	private String code;
	private String message;
	private String requestId;
	private String resource;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

}
