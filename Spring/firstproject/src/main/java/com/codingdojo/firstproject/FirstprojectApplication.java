package com.codingdojo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	
	
@RequestMapping("/")
	
	
	
public String Hello() {
	
	
	
	
	return "hello Client how are you doing";
}

@RequestMapping("/random")
public String display() {
	
	
	
	
	return "Spring boot is so great! so easy to just look for string";
}

}
