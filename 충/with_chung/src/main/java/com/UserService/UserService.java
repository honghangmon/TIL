package com.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User resgisterUser(User user) {
		
		return userRepository.save(user);
	}
	
	//비밀번호 암호화, 유저네임 중복 체크 
}
