package com.soham.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soham.restapi.model.User;
import com.soham.restapi.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User createUser(User user) {
		User user2 = userRepository.save(user);
		return user2;
	}

	@Override
	public User getUser(String username) {
		User user = userRepository.findByuserName(username);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public void deleteUser(long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {
		User user2 = getUser(user.getUserName());
		System.out.println(user2);
		User save = userRepository.save(user);
		return save;
	}

}
