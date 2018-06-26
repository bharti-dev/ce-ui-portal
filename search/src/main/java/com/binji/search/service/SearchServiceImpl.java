/**
 * 
 */
package com.binji.search.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author amit.bharti
 *
 */
@Service
public class SearchServiceImpl implements SearchSearvice {

	@Override
	@HystrixCommand(fallbackMethod = "defaultSearchPreview")
	public String searchPreviewFailed() {
		return new RestTemplate().getForObject("http://localhost:8080/copy", String.class);
	}
	
	private String defaultSearchPreview() {
		return "Default Search Preview";
	}

	@Override
	@HystrixCommand(fallbackMethod = "defaultSearchPreview")
	public String searchPreviewSuccess() {
		return "Search Preview Success";
	}

}
