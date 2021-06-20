package com.soham.restapi.service;

import java.util.List;

import com.soham.restapi.model.User;

public interface UserService {
	
	public User createUser(User user);
	public User getUser(String username);
	public List<User> getAllUser();
	public void deleteUser(long id);
	public User updateUser(User user);

}
