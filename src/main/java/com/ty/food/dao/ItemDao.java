package com.ty.food.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food.dto.Item;

public class ItemDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(Item item) {
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
	}

	public Item deleteItem(int id)
	{
		entityTransaction.begin();
		Item item=	entityManager.find(Item.class, id);
		entityManager.remove(item);
		return item;
	}
	
	public Item getItemById(int id)
	{
		Item item=entityManager.find(Item.class, id);
		return item;
	}
	public Item updateItem(int id,Item item)
	{
		Item item2=entityManager.find(Item.class, id);
		if(item2 != null)
		{
			entityTransaction.begin();
			item2.setId(id);
			entityManager.persist(item2);
			entityTransaction.commit();
			return item2;
		}
		return null;
	}
}
