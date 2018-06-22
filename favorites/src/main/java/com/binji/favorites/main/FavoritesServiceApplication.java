package com.binji.favorites.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.binji")
@SpringBootApplication
public class FavoritesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavoritesServiceApplication.class, args);
	}
}
