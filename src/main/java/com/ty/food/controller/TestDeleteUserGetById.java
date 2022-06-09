package com.ty.food.controller;

import com.ty.food.service.UserService;

public class TestDeleteUserGetById {

	public static void main(String[] args) {
		
		UserService service=new UserService();
		
		 service.deleteUserbyId(1);
	}
}
