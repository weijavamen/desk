package com.desktop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	public IndexController(){
		System.out.println("wwww");
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView index(){
		System.out.println("kkkkk");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	
}
