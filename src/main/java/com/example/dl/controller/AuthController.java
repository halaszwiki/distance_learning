package com.example.dl.controller;

import com.example.dl.model.User;
import com.example.dl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("")
public class AuthController {
		@Autowired
		UserService userService;

	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User param) {
		List<User> list = userService.findAll();

		for(User user: list){
			if(user.getUsername().equals(param.getUsername()) && user.getPassword().equals(param.getPassword())){
				return new ResponseEntity<User>(user, HttpStatus.OK);
			}
		}

		return null;
	}
}
