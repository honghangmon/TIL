package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.service.UserService;

@Controller
public class UserController {

//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//	@Autowired
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}

	
	@GetMapping("/login")
	public String loginForm() {
		return "user/loginForm";
	}
	@PostMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		
	}
	
}

