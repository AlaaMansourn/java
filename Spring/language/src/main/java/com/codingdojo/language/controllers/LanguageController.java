package com.codingdojo.language.controllers;


import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.language.models.Language;
import com.codingdojo.language.services.LanguageService;





@Controller
public class LanguageController {
	
	
	
	private final LanguageService languageService;
	
	public LanguageController(LanguageService languageService) {
		
		
		
		this.languageService=languageService;
	}
	
	
	@RequestMapping(value="/languages")
	public String AllLanguages(Model model,@ModelAttribute("language") Language lang,BindingResult result){
	model.addAttribute("languages", languageService.findAllLanguages());
	return "index.jsp";
		
	}
	
	@RequestMapping(value="/languages",method=RequestMethod.POST)
	public String create(@ Valid @ModelAttribute("language") Language lang,BindingResult result){
	
		if(result.hasErrors()) {
			return "index.jsp";
		}
		else {
			languageService.createLanguage(lang);
		return "redirect:/languages";
		}
	}
	
	

	
	@RequestMapping(value="/languages/update/{id}")
	public String show(@PathVariable("id") Long id,Model model ) {
		
		
		model.addAttribute("language",languageService.findLanguage(id));
		
		return "edit.jsp";
		
		
		
		
	}
	
	@RequestMapping(value="/languages/update/{id}",method=RequestMethod.POST)
	public String update( @Valid @ModelAttribute("language") Language language,BindingResult result ) {
		
		
		if(result.hasErrors()) {
			
			return "edit.jsp";
			
			
		}
		else {
		 languageService.updateLanguage(language);
		
		return "redirect:/languages";
		}
		
		
		
		
	}
	
	 @RequestMapping(value="languages/delete/{id}")
		
		
		public String delete(@PathVariable("id")Long id ,@PathParam(value="name")String name,@PathParam(value="creator") String creator ,@PathParam(value="version") Double version) {
		
		 languageService.deleteLanguage(id);
		 
		 return "redirect:/languages";
	 }
	 
 @RequestMapping(value="/languages/{id}")
		
public String show_language(@PathVariable("id") Long id, Model model) {
	
	
	
model.addAttribute("language",languageService.findLanguage(id));
return "show.jsp";
}
	 
	 
}
