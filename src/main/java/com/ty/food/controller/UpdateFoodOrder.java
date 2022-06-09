package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class UpdateFoodOrder {
	public static void main(String[] args) {

		FoodOrderService foodOrderService=new FoodOrderService();
		
		Item item=new Item();
		item.setName("chicken");
		item.setQauntity(2);
		item.setCost(200);
		
		foodOrderService.updateFoodOrder(1, item);
	}
}
