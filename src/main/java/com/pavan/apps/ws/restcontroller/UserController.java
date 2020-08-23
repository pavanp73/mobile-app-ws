package com.pavan.apps.ws.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.apps.ws.models.UserDto;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public String getUsers() {
		return "get users method";
	}
	
	@GetMapping("/{userId}")
	public UserDto getUser(@PathVariable("userId") long userId) {
		return new UserDto();
	}
	
	@PostMapping
	public String createUser() {
		return "create user";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user";
	}
}
