package com.example.LogAndValid.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LogAndValid.Services.UserService;
import com.example.LogAndValid.models.User;
import com.example.LogAndValid.validator.UserValidator;

@Controller
public class Users {
private final UserService userService;
private final UserValidator userValidator;
    
    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
		this.userValidator =userValidator;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login(HttpSession session) {
    	if (session.getAttribute("userId") != null)
    		return "redirect:/home";
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user,Model model, BindingResult result, HttpSession session) {
      userValidator.validate(user, result);
      if(result.hasErrors()) {
    	  return "registrationPage.jsp";
      }
      if (userService.findByEmail(user.getEmail()) != null) {
    	  model.addAttribute("error", "The Email already Exits");
    	  return "registrationPage.jsp";
    	  
      }
      userService.registerUser(user);
      session.setAttribute("userId", user.getId());
      return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
     if (userService.authenticateUser(email, password)) {
    	 Long id = userService.findByEmail(email).getId();
    	 session.setAttribute("userId", id);
    	 return "redirect:/home";
     } else {
    	 model.addAttribute("error", "Invalid User name or Password");
    	 return "loginPage.jsp";
     }
       
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	if (session.getAttribute("userId")== null)
    		return "redirect:/registration";
    	Long id = (Long) session.getAttribute("userId");
    	User u = userService.findUserById(id);
    	model.addAttribute("user",u);
    	return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.invalidate();
    	return "redirect:/login";
    }

}
