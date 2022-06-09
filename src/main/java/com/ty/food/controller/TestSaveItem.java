package com.ty.food.controller;

import com.ty.food.dto.Item;
import com.ty.food.service.ItemService;

public class TestSaveItem {

	public static void main(String[] args) {
		
		ItemService itemService=new  ItemService();
		
		Item item=new  Item();
		item.setName("Chicken");
		item.setQauntity(2);
		item.setCost(200);
		itemService.saveItem(item);
	}
}
