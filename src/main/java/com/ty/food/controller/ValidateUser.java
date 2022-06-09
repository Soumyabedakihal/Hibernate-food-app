package com.ty.food.controller;

import com.ty.food.service.UserService;

public class ValidateUser {

	public static void main(String[] args) {
		
		UserService service=new UserService();
		
		service.validateUser("prashat@gmai.com", "PP123");
	}
}
