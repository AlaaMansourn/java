package com.codingdojo.license.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.license.models.License;
import com.codingdojo.license.models.Person;
import com.codingdojo.license.services.HomeService;

@Controller
public class HomeController {
	
	private final HomeService homeService;
	
	
	
	
	
	

	
public HomeController(HomeService homeService){
	
	
	this.homeService=homeService;
	
	
}


	

@RequestMapping(value="persons/new")
public String show_person(@ModelAttribute("person") Person person,BindingResult result) {
	
	
	

	return "index.jsp";
	

}







	@RequestMapping(value="persons/new",method=RequestMethod.POST)
	public String create_person(@ModelAttribute("person") Person person,BindingResult result) {
		
		
		if (result.hasErrors()){
	
		return "index.jsp";
		
	}

		else {
			
			
			System.out.println(person.getFirstName());
			homeService.createPerson(person);
			return "redirect:/persons/new";
			
		}
		
	}
	
	
	@RequestMapping(value="licenses/new",method=RequestMethod.POST)
	
public String create_license(@ModelAttribute("license") License license,BindingResult result,Model model) {
		
		if (result.hasErrors())
		{
		
		return "license.jsp";
		
		}
		
		else {
			
			homeService.createLicense(license);
			return "redirect:/licenses/new";
		}
		
	}
	
	@RequestMapping(value="licenses/new")
	
	public String show_license(@ModelAttribute("license") License license,BindingResult result,Model model) {
			
		List<Person> unlicensed = homeService.findUnLicensed();
		model.addAttribute("unlicensed",unlicensed);
		System.out.println("whhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhy");
			
			return "license.jsp";
			
			
			
		}
	
	@RequestMapping(value="persons/{id}")
	
	public String show_license_details(@PathVariable("id") Long id , Model model) {
		
		
		System.out.println(id);
		
		
		model.addAttribute("person",homeService.findPerson(id));
		
		return "show_license_details.jsp";
		
	}
	}

	
