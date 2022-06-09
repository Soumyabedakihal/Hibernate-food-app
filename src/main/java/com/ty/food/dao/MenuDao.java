package com.ty.food.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.Menu;

public class MenuDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Menu saveMenu(Menu menu) {
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}

	public Menu deleteMenuById(int id) {
		entityTransaction.begin();
		Menu menu = entityManager.find(Menu.class, id);
		entityManager.remove(menu);
		entityTransaction.commit();
		return menu;
	}

	public List<Menu> getAllMenu() {
		String sql = "SELECT m FROM Menu m";
		Query query = entityManager.createQuery(sql);
		List<Menu> menus = query.getResultList();
		return menus;
	}

	public Menu getMenuById(int id) {
		entityTransaction.begin();
		Menu menu = entityManager.find(Menu.class, id);
		entityManager.persist(menu);
		return menu;
	}

	public Menu updateMenu(int id, Menu menu) {
		Menu menu2 = entityManager.find(Menu.class, id);
		if (menu2 != null) {
			entityTransaction.begin();
			menu2.setId(id);
			entityManager.merge(menu2);
			entityTransaction.commit();
			return menu;
		}
		return null;
	}
}
