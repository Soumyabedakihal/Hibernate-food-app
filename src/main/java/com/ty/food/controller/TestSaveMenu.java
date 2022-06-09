package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class TestSaveMenu {

	public static void main(String[] args) {

		MenuService menuService = new MenuService();

		Menu menu = new Menu();
		menu.setName("chicken");
		menu.setDescription("special");
		menu.setType("non veg");	
		menu.setCost(100);
		menu.setOffer(30);
		menu.setImage("https://media.istockphoto.com/photos/restaurant-healthy-food-delivery-in-take-away-boxes-picture-id1165063882?b=1&k=20&m=1165063882&s=170667a&w=0&h=k5K4HQIXb49T0rAbLjQPzqPoQK9C-nFRAvO-0MuMqgo=");
		menuService.saveMenu(menu);
	}
}
