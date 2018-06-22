/**
 * 
 */
package com.binji.favorites.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amit.bharti
 *
 */
@RequestMapping("/favorites")
@RefreshScope
@RestController
public class FavoritesController {
	
	@Value("${message:Hello default}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return this.message;
	}
}
