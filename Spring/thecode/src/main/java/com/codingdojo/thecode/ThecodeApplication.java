package com.codingdojo.thecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@SpringBootApplication
@Controller
public class ThecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThecodeApplication.class, args);
	}
	
	
@RequestMapping("/")

public String index() {


return "index.jsp";

}
}
