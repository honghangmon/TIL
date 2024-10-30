package com.UserService;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.User;



public interface UserRepository extends JpaRepository<User,Long>{

	Optional<User> findByUsername(String username);
}
