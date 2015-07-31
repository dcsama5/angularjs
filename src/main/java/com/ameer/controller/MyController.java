package com.ameer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

	 @RequestMapping(value="/person", method=RequestMethod.GET)
	 public String returnPage() {
		 return "person";
	 }
	 
	 @RequestMapping(value="/todo")
	 public String todoPageChapter1() {
		 return "todoApp";
	 }
	
}
