package com.ty.food.controller;

import com.ty.food.service.MenuService;

public class DeleteMenu {

	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		menuService.deleteMenuById(1);
	}
}
