package com.example.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need to create a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need to create a controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// need a controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read request parameter from the html form
		String name = request.getParameter("studentName");
		// convert data to all caps
		name = name.toUpperCase();
		// create the message
		String result = "Yo! " + name;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	// need a controller method to read form data using different technique
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String sName,
			Model model) {
		// convert data to all caps
		sName = sName.toUpperCase();
		// create the message
		String result = "Hey My Friend from v3! " + sName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
