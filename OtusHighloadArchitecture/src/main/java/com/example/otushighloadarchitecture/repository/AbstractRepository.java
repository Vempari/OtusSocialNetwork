package com.example.otushighloadarchitecture.repository;

import com.example.otushighloadarchitecture.model.BaseEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public abstract class AbstractRepository <T extends BaseEntity, ID extends Serializable> {

	@Autowired
	protected SessionFactory sessionFactory;

	protected Session session() {
		return sessionFactory.getCurrentSession();
	}

}
