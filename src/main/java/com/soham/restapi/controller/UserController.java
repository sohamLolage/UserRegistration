package com.soham.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soham.restapi.model.User;
import com.soham.restapi.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	@GetMapping("/{userName}")
	public User getUser(@PathVariable String userName) {
		return userService.getUser(userName);
	}
	@GetMapping("/")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	@PutMapping("/")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
	}

}
