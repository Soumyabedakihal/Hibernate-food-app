package com.ty.food.controller;

import com.ty.food.service.FoodOrderService;

public class DeleteFoodByOrderById {

	public static void main(String[] args) {
		
		FoodOrderService foodOrderService=new FoodOrderService();
		
		
		foodOrderService.deleteFooodOrderById(1);
	}
}
