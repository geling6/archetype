package com.geling.archetype.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("")
	public void user(){
		System.out.println("Hello user .");
	}
}
