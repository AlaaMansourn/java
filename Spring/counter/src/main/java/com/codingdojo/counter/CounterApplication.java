package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	
	
@RequestMapping("/")
public String count(HttpSession session) {
	
	
	if (session.isNew())
	{
		
		session.setAttribute("count", 0);
		
	}
	
	else {
		Integer count = (Integer) session.getAttribute("count");
		count+=1;
		session.setAttribute("count",count);
		
	}
		
		
		
	
	return "index.jsp";
	
	
	
}

@RequestMapping("/counter")
public String displayCounter() {
	
	
	
	
	return "coun.jsp";
	
	
	
}


}
