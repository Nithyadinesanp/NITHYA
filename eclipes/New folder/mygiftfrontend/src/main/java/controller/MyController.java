package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String indexpage()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public ModelAndView loginpage()
	{
		
		return new ModelAndView("login");	
		}
	}