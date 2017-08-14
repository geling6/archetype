package com.geling.archetype.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("")
	public void user(){
		System.out.println("Hello user .");
	}
	
	@RequestMapping("/{id}")
	public String queryUser(@PathVariable Integer id){
		System.out.println(id);
		
		return "fuck na wei !";
	}
	
}
