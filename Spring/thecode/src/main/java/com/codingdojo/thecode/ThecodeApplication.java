package com.codingdojo.thecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;




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






@RequestMapping(value="/code", method=RequestMethod.POST)

public String code(@RequestParam(value="code") String code) {

if (code=="bushido")
	
	return "index.jsp";

	

return "redirect:/createError";

}


@RequestMapping("/createError")
public String flashMessages(RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("error", "A test error!");
    return "redirect:/";
}
}

