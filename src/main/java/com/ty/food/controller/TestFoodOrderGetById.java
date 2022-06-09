package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodOrderService;

public class TestFoodOrderGetById {

	public static void main(String[] args) {
		
		FoodOrderService foodOrderService=new FoodOrderService();
		
		FoodOrder foodOrder=foodOrderService.getFoodOrderById(1);
		System.out.println("Id : "+foodOrder.getId());
		System.out.println("Name : "+foodOrder.getName());
		System.out.println("Phone : "+foodOrder.getPhone());
		System.out.println("Total : "+foodOrder.getTotal());
		
		for(Item item : foodOrder.getItems()) {
		System.out.println("Id : "+item.getId());
		System.out.println("Name : "+item.getName());
		System.out.println("Quantity : "+item.getQauntity());
		System.out.println("Cost : "+item.getCost());
		System.out.println("------------------------------");
		}
		
		
	}
}
