package com.ty.food.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food.dto.User;

public class UserDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashant");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

	public User deleteUserbyId(int id) {
		User user = entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> validateUser(String email, String password) {
		Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		return query.getResultList();
	}

	public List<User> getAllUser() {
		Query query = entityManager.createQuery("SELECT U FROM User U");
		List<User> users = query.getResultList();
		return users;
	}
}
