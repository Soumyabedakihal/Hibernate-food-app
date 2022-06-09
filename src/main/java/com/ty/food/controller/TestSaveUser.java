package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		
		UserService service=new UserService();
		
		User user=new User();
		user.setName("ravi");
		user.setEmail("ravi@gmail.com");
		user.setPassword("RR123");
		user.setPhone(776666399l);
		service.saveUSer(user);
	}
}
