package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class TestFoodOrderByName {

	public static void main(String[] args) {
		
		FoodOrderService foodOrderService=new FoodOrderService();
		
		List<FoodOrder> foodOrders = foodOrderService.getFoodOrdersByName("ravi");
		
		if(!(foodOrders.isEmpty()))
		{
			for (FoodOrder foodOrder : foodOrders) {
				System.out.println(foodOrder.getName());
				
				for(Item item : foodOrder.getItems() ) {
					System.out.println(item.getName());
				}
			}
		}
		else
			System.out.println("No data");
	}
}
