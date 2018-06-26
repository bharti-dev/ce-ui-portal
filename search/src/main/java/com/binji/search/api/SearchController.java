/**
 * 
 */
package com.binji.search.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.binji.search.service.SearchSearvice;

/**
 * @author amit.bharti
 *
 */
@RequestMapping("/search")
@RestController
public class SearchController {

	@Autowired
	private SearchSearvice searchService;
	
	@GetMapping("/preview/fail")
	public String searchPreviewFailed() {
		return searchService.searchPreviewFailed();
	}
	
	@GetMapping("/preview/success")
	public String searchPreviewSuccess() {
		return searchService.searchPreviewSuccess();
	}

	public SearchSearvice getSearchService() {
		return searchService;
	}

	public void setSearchService(SearchSearvice searchService) {
		this.searchService = searchService;
	}
}
