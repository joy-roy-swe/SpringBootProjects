package oi.codebind.dev.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import oi.codebind.dev.model.developer;
import oi.codebind.dev.repository.DeveloperRepo;


@Controller
public class ApplicationController {
	
	@Autowired
	DeveloperRepo repo;

	ModelAndView mv = new ModelAndView();
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/registration")
	public String registerPage() {
		return "registrationPage";
	}
	
	@PostMapping("/registration")
	public String saveDev(developer dev) {
		repo.save(dev);
		return "login";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/userhome")
	public String login() {
		return "user_home";
	}
	
	@RequestMapping("/userhome/profile")
	public ModelAndView userProfile(Principal principal)
	{	
		principal.getName();
		developer dev = repo.findByName(principal.getName());
		if(dev!=null) {
			mv.addObject("obj", dev);
			mv.setViewName("profile");
		}
		else
			mv.setViewName("login");
		//User user = profile.loadUserByUsername(name)
		return mv;
	}
	
	
}
