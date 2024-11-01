package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.Dto.User;
import com.ssafy.mvc.model.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

//빈으로 등록이 됐다? 
@Controller
public class UserController {
		//서비스 의존성 주입 받아야 한다?
//	@Autowired
//	private final UserService userService;

//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//	@Autowired
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}
	//뭐가 포워딩?
	@GetMapping("/login")
	public String LoginForm() {
		return "/user/loginForm";
	}
	
//	@PostMapping("/login")
//	public String login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
//		
//		System.out.println(id);
//		System.out.println(pw);
//		
////		return "hello";
//		return "redirect:hello";
//	}
	
//	@PostMapping("/login")
//	public String login(@ModelAttribute User user, HttpServletRequest request) {
//		
//		HttpSession session = request.getSession();
//		
//		return "redirect:hello";
//	}

	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession sesstion) {
		
		//지금 서비스를 구현하지 않아서 넘겨받은 user의 id를 냅다 넣었다!
		//하지만 실제로 구현하고 난 뒤!! 인증 받은 정보만을 넣어라~~
		sesstion.setAttribute("loginUser", user.getId());
		
		return "redirect:hello";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		//로그아웃을 하는 방법 2가지! 
		//1. 세션에서 우저 속성을 지우는 작업
		session.removeAttribute("loginUser");
		
		//2. 세선 자체를 초기화
		session.invalidate();
		return "redirect:/";
		
	}
	
	
}
