package oi.codebind.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import oi.codebind.dao.UserRepo;
import oi.codebind.model.User;

@Controller
public class AppController {
	
	@Autowired
	UserRepo repo;
	
	
	ModelAndView mv=new ModelAndView();
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{	
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registerPage()
	{
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(User user) {
		repo.save(user);
		return "login";
	}
	
	@RequestMapping("/profile")
	public ModelAndView userProfile(Principal principal)
	{	
		principal.getName();
		User user = repo.findByName(principal.getName());
		if(user!=null) {
			mv.addObject("obj", user);
			mv.setViewName("profile");
		}
		else
			mv.setViewName("login");
		//User user = profile.loadUserByUsername(name)
		return mv;
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout";
	}

}
