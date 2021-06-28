package com.codingdojo.ManyToMany.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ManyToMany.models.Category;
import com.codingdojo.ManyToMany.models.Product;
import com.codingdojo.ManyToMany.services.HomeService;

@Controller
public class HomeController {
	
	
	
	private final HomeService homeService;
	
	
	
	
public HomeController(HomeService homeService) {
		
		this.homeService = homeService;
	}

@RequestMapping(value="/products/new")
public String show_product(@ModelAttribute("product") Product product,BindingResult result) {
	
	
	
	
	return "products.jsp";
	
	
	
	
}

@RequestMapping(value="/products/new",method=RequestMethod.POST)
public String create_product(@ModelAttribute("product") Product product,BindingResult result) {
	
	
	if (result.hasErrors()) {
		
		
		return "products.jsp";
	}
	
	
	else {
		homeService.create_product(product);
		
	return "redirect:/products/new";
	
	}
	
	
}


@RequestMapping(value="/categories/new")
public String show_Category(@ModelAttribute("category") Category category,BindingResult result) {




return "category.jsp";




}

@RequestMapping(value="/categories/new",method=RequestMethod.POST)
public String create_category(@ModelAttribute("category") Category category,BindingResult result) {


if (result.hasErrors()) {
	
	
	return "category.jsp";
}


else {
	homeService.create_category(category);
	
return "redirect:/categories/new";

}


}

@RequestMapping(value="/products/{id}")

public String show_proCat(@PathVariable("id")Long id,Model model ) {


model.addAttribute("allnotcategories",homeService.findCantogoriesNotIn(id));
model.addAttribute("anyid",id);
model.addAttribute("allProductCategories",homeService.findCantogoriesIn(id));

return "productD.jsp";
}

@RequestMapping(value="/products/{id}",method=RequestMethod.POST)

public String show_proCat2(@PathVariable("id")Long id,@RequestParam("cid") Long cid,Model model ) {



	
	homeService.addCatPro(id,cid);
	
	
	
	
	

return "redirect:/products/"+id;
}
	
}

