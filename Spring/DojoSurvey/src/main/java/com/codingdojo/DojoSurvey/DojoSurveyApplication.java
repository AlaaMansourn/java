package com.codingdojo.DojoSurvey;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
	
	
@RequestMapping("/")
public String index(HttpSession session)
{
	
	
	session.setAttribute("count", 0);
	return "index.jsp";
}

@RequestMapping(value="/result"  , method=RequestMethod.POST)
public String result(HttpSession session,@RequestParam(value="name") String name,@RequestParam(value="location") String location,@RequestParam(value="language") String language , @RequestParam(value="optional")String optional,Model model) {
	
	session.setAttribute("name", name);
	session.setAttribute("location",location);
	session.setAttribute("language", language);
	session.setAttribute("optional", optional);
	
	
	
	return "result.jsp";
	
	
	
}
}




