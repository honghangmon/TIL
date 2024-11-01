package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	
	@GetMapping("/login")
	public String loginForm() {
		return "/user/loginForm";
	}
	
//	@PostMapping("/login")
//	public String login(@RequestParam("id") String id ,@RequestParam("pw") String pw) {
//		
//		return "hello";
//		
//	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
		
		session.setAttribute("loginUser", user.getId());
		
		return "redirect:hello";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//로그아웃하는 방법 
		//1. 세션에서 유저 속성 삭제
		session.removeAttribute("loginUser");
		//2. 세선 자체 초기화
//		session.invalidate();
		
		
		return "redirect:/";
		
	}
	
	
}
