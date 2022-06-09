package com.ty.food.dao;

import static com.ty.food.dto.Tax.CGST;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodOrderDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public FoodOrder saveFoodOreder(FoodOrder foodOrder) {
		entityTransaction.begin();
	//	for (Item item : foodOrder.getItems()) {
		//	entityManager.persist(item);
		//}
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

	public FoodOrder getFoodOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, 1);
		return foodOrder;
	}

	public FoodOrder deleteFooodOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		entityTransaction.begin();
		entityManager.remove(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}

	public FoodOrder updateFoodOrder(int id, Item item) {
		entityTransaction.begin();
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		foodOrder.getItems().add(item);
		double total =0;
		for(Item item1:foodOrder.getItems())
		{
			item1.setFoodOrder(foodOrder);
			total+=(item1.getCost()*item1.getQauntity());
		}
		foodOrder.setTotal(total);
		entityManager.merge(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}

	public List<FoodOrder> getFoodOrderByPhone(long phone) {
		String sql = "SELECT f FROM FoodOrder f WHERE phone=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, phone);
		return query.getResultList();
	}

	public List<FoodOrder> getFoodOrdersByName(String name) {
		Query query = entityManager.createQuery("SELECT f FROM FoodOrder f WHERE f.name=?1");
		query.setParameter(1, name);
		return query.getResultList();
	}
	
}
