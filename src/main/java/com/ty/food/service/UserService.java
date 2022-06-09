package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.UserDao;
import com.ty.food.dto.User;

public class UserService {

	UserDao dao = new UserDao();

	public User saveUSer(User user) {
		return dao.saveUser(user);
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	public User deleteUserbyId(int id) {
		return dao.deleteUserbyId(id);
	}

	public List<User> validateUser(String email, String password) {
		System.out.println("Found.....!");
		return dao.validateUser(email, password);
	}

	public List<User> getAllUser() {
		return dao.getAllUser();
	}
}
