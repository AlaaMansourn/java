package com.codingdojo.OneToMoney.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.OneToMoney.models.Dojo;
import com.codingdojo.OneToMoney.models.Ninja;
import com.codingdojo.OneToMoney.services.HomeService;

@Controller
public class HomeController {
	
	
	private final HomeService homeService;
	
	public HomeController(HomeService homeService) {
		
		
		
		this.homeService=homeService;
	}
	
	
	
	
	
	
	@RequestMapping(value="/dojos/new")
	public String show_Dojo(@ModelAttribute("dojo") Dojo  dojo,BindingResult result ) {
		
		System.out.println("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			
		return "dojo.jsp";	
				
		
	}
	
	
	@RequestMapping(value="/dojos/new",method=RequestMethod.POST)
	public String create_Dojo(@ModelAttribute("dojo") Dojo  dojo,BindingResult result ) {
		
		
		if (result.hasErrors())
		{
			
		return "dojo.jsp";	
				
		}
		
		else {
			
			
			homeService.createDojo(dojo);
			return "redirect:/dojos/new";
			
		}
	}

	
	
	@RequestMapping(value="/ninjas/new")
	public String show_Ninja(@ModelAttribute("ninja") Ninja  ninja,BindingResult result,Model model ) {
		
		System.out.println("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		model.addAttribute("dojos",homeService.findAllDojos());
			
		return "ninja.jsp";	
				
		
	}
	@RequestMapping(value="/ninjas/new",method=RequestMethod.POST)
	public String create_ninjas(@ModelAttribute("ninja") Ninja  ninja,BindingResult result,Model model ) {
		
		
		if (result.hasErrors())
		{
			
		return "ninja.jsp";	
				
		}
		
		else {
			
			
			homeService.createNinja(ninja);
			return "redirect:/ninjas/new";
			
		}
	}
	
	@RequestMapping(value="/dojos/{id}")
	public String showDojosById(@PathVariable("id") Long id, Model model ) {
		
		
		model.addAttribute("dojos", homeService.findDojo(id));
		
		System.out.println(id);
		System.out.println(homeService.findDojo(id));
		
		return "dojo_show.jsp";
	}
	
	
}
