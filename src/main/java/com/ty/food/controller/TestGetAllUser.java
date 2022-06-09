package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class TestGetAllUser {

	public static void main(String[] args) {

		UserService service = new UserService();

		List<User> users = service.getAllUser();

		for (User user2 : users) {
			System.out.println("User Name : "+user2.getName());
			System.out.println("User Email : "+user2.getEmail());
			System.out.println("User Password : "+user2.getPassword());
			System.out.println("Phone No : "+user2.getPhone());
		}
	}
}
