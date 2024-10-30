package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionIdListener;

import org.springframework.web.bind.annotation.RequestParam;


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
		return "/user/loginForm";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		
//		return "hello";
		return "redirect:hello";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		return "redirect:hello";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
//		User loginUser = userService.login(user);
		
		session.setAttribute("loginUser", user.getId());
		
		return "redirect:hello";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("loginUser");
		
		session.invalidate();
		return "redirect:/";
	}
	
}
