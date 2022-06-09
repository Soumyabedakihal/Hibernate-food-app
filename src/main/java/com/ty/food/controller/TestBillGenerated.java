package com.ty.food.controller;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodOrderService;

public class TestBillGenerated {

	public static void main(String[] args) {

		FoodOrderService foodOrderService = new FoodOrderService();

		double bill = foodOrderService.billGenerated(1);
		
		System.out.println("Total Amount with GST :  "+bill);
	}
}
