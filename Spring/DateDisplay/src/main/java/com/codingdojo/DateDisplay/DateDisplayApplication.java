package com.codingdojo.DateDisplay;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DateDisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateDisplayApplication.class, args);
	}
	

@RequestMapping("/")

public String show() {
	
	
	
	
	
	return "index.jsp";
}


@RequestMapping("/date")
public String date(Model model){
	
	

	
	
	LocalDateTime dateTime =  LocalDateTime.now();
	DateTimeFormatter local =  DateTimeFormatter.ofPattern("EEEE, ' the' dd 'of' MMMM , yyyy");
	String mm = dateTime.format(local);
	
	 model.addAttribute("date",mm );
	 
	return "date.jsp";
	
	
	
	
}

@RequestMapping("/time")
public String time(Model model){
	
	

	
	
	LocalDateTime dateTime =  LocalDateTime.now();
	DateTimeFormatter local =  DateTimeFormatter.ofPattern("HH:mm a");
	String mm = dateTime.format(local);
	
	 model.addAttribute("date",mm );
	 
	return "time.jsp";
	
	
	
	
}


}
