package com.edward.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam String name, @RequestParam String location, @RequestParam String language, @RequestParam String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/dojo";
	}
	
	@RequestMapping("/dojo")
	public String dojo(HttpSession session, Model model) {
		Object name = session.getAttribute("name");
		Object location = session.getAttribute("location");
		Object language = session.getAttribute("language");
		Object comment = session.getAttribute("comment");
		
		model.addAttribute("name", name.toString());
		model.addAttribute("location", location.toString());
		model.addAttribute("language", language.toString());
		model.addAttribute("comment", comment.toString());
		
		return "dojo.jsp";
	}
}
