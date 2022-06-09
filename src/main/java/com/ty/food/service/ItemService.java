package com.ty.food.service;

import com.ty.food.dao.ItemDao;
import com.ty.food.dto.Item;

public class ItemService {

	ItemDao dao=new ItemDao();

	public Item saveItem(Item item)
	{
		return dao.saveItem(item);
	}
	public Item deleteItem(int id)
	{
		return dao.deleteItem(id);
	}
	public Item getItemById(int id)
	{
		return dao.getItemById(id);
	}
	public Item updateItem(int id,Item item)
	{
		return dao.updateItem(id, item);
	}
}
