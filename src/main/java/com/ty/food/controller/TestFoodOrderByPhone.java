package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class TestFoodOrderByPhone {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		List<FoodOrder> foodOrders = foodOrderService.getFoodOrderByPhone(4433225566l);

			for (FoodOrder foodOrder : foodOrders) {

				System.out.println(foodOrder);
				for (Item item : foodOrder.getItems()) {
					
					System.out.println(item);
				}
			}
		
	}
}
