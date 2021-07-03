package com.example.otushighloadarchitecture.repository;

import com.example.otushighloadarchitecture.model.Client;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepositoryImpl extends AbstractRepository<Client, Long> implements ClientRepository {

	@Override
	public List<Client> getAllClients() {
		Criteria criteria = session().createCriteria(Client.class)
				.addOrder(Order.asc("id"));
		return criteria.list();
	}
}
