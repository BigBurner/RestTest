package com.rushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rushi.repos.PersonRepository;

@SpringBootApplication
public class RestTestApplication {
	
	String s;
	
	PersonRepository personRepository; 

	public static void main(String[] args) {
		SpringApplication.run(RestTestApplication.class, args);
		
	}
}
