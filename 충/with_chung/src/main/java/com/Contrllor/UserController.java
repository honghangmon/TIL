package com.Contrllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.User;
import com.UserService.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		userService.resgisterUser(user);
		
		 return ResponseEntity.ok("User registered successfully"); 
	}
	
	//실패한 경우도 만들어보기 ,https://www.postman.com/ 참고 참고하라고 ㅋㅋ
	//인서트까지 
		
}


