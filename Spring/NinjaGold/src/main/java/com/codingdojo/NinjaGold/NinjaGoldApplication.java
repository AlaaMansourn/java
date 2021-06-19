package com.codingdojo.NinjaGold;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class NinjaGoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
	
	
@RequestMapping("/")
public String index() {
	
	return "index.jsp";
	
}

@RequestMapping(value="/process_money" ,method={RequestMethod.POST, RequestMethod.GET})
public String process(HttpSession session,@RequestParam(value="building") String building) {
	ArrayList<Object> activity =new ArrayList<Object>();
	if (session.isNew()) {
		
		session.setAttribute("count",0);
		
		
		session.setAttribute("activity",activity);
	}
	else if(building.equals("casino"))
	{	
		
		
		int c = (Integer)session.getAttribute("count");
		
		
	
	
		Random r = new Random();
		int d = r.nextInt(100)-50;
		String s="";
		if (d>0) {
			
			LocalDateTime dateTime =  LocalDateTime.now();
			DateTimeFormatter local =  DateTimeFormatter.ofPattern("'('EEEE, ' the' dd 'of' MMMM , yyyy')'");
			String mm = dateTime.format(local);
			
			
			
		s = "you entered a casino and earned  "+ d +mm;
		}
		if (d<0) {
			
			LocalDateTime dateTime =  LocalDateTime.now();
			DateTimeFormatter local =  DateTimeFormatter.ofPattern("'('EEEE, ' the' dd 'of' MMMM , yyyy')'");
			String mm = dateTime.format(local);
			
			
			 s = "you entered a casino and lost  "+ d +mm;
			}
		
		session.setAttribute("count", c+d);
		
		
		
		activity = (ArrayList<Object>) session.getAttribute("activity");
		activity.add(s);
		session.setAttribute("activity",activity);
		
		System.out.println(session.getAttribute("activity"));

		
		
		
	}
	
	else if(building.equals("cave"))
	{
		int c = (Integer)session.getAttribute("count");
		
		Random r = new Random();
		int d = r.nextInt(5)+5;
		LocalDateTime dateTime =  LocalDateTime.now();
		DateTimeFormatter local =  DateTimeFormatter.ofPattern("'('EEEE, ' the' dd 'of' MMMM , yyyy')'");
		String mm = dateTime.format(local);
		
		String s = "you entered a cave and earned  "+ d +mm;
		
		
		session.setAttribute("count", c+d);
		
		
		
		activity = (ArrayList<Object>) session.getAttribute("activity");
		activity.add(s);
		session.setAttribute("activity",activity);
		
		System.out.println(session.getAttribute("activity"));

		
		
		
	}
	else if(building.equals("house"))
	{
		int c = (Integer)session.getAttribute("count");
		
		Random r = new Random();
		int d = r.nextInt(3)+2;
		
		LocalDateTime dateTime =  LocalDateTime.now();
		DateTimeFormatter local =  DateTimeFormatter.ofPattern("'('EEEE, ' the' dd 'of' MMMM , yyyy')'");
		String mm = dateTime.format(local);
		
		
		String s = "you entered a house and earned  "+ d+mm ;
		
		
		session.setAttribute("count", c+d);
		
		
		
		activity = (ArrayList<Object>) session.getAttribute("activity");
		activity.add(s);
		session.setAttribute("activity",activity);
		
		System.out.println(session.getAttribute("activity"));

		
		
		
	}
	else if(building.equals("farm"))
	{
		int c = (Integer)session.getAttribute("count");
		
		Random r = new Random();
		int d = r.nextInt(10)+10;
		LocalDateTime dateTime =  LocalDateTime.now();
		DateTimeFormatter local =  DateTimeFormatter.ofPattern("'('EEEE, ' the' dd 'of' MMMM , yyyy')'");
		String mm = dateTime.format(local);
		
		
		String s = "you entered a farm and earned  "+ d +mm;
		
		
		session.setAttribute("count", c+d);
		
		
		
		activity = (ArrayList<Object>) session.getAttribute("activity");
		activity.add(s);
		session.setAttribute("activity",activity);
		
		System.out.println(session.getAttribute("activity"));

		
		
		
	}
	
	
	
	return "redirect:/";
	
}

}
