package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestMenuGetByAll {

	public static void main(String[] args) {
		MenuService menuService = new MenuService();
		
		List<Menu> menus=menuService.getAllMenu();
		
			for (Menu menu : menus) {
				System.out.println(menu);
			}
		
	}
}
