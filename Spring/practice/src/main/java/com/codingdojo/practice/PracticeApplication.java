package com.codingdojo.practice;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
	
	@RequestMapping("/coding")
public String index() {
	
	
	return "hello coding dojo ";


}

	@RequestMapping("/coding/python")
public String index2() {
	
	
	return "Python/Django was awesome ";


}
	@RequestMapping("/ava/Spring")
	public String index3() {
		
		
		return "Java/Spring is better! ";


	}
	@RequestMapping("/{c}")
	public String index4(@PathVariable("c") String c) {
		
		
		if (c.equals("dojo"))
		{
		return "the"+c +"is the awesome";
		
	}
		
			
			return null;
		}
	@RequestMapping("/{c}/")
	public String index5(@PathVariable("c") String c) {
		
		
		if (c.equals("burbank-dojo"))
		{
		return "Burbank Dojo is located in Southern California";
		
	}
		else if (c.equals("san-jose"))
			return "SJ dojo is the headquarters";
			
			return null;
		}
	
	
	
	
	
	
}