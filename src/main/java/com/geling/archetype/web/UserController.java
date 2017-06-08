package com.geling.archetype.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("")
	@ResponseBody
	public String createUser(){
		return "user add sucess !";
	}
}
