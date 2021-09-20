package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Photo;

@Repository
public class PhotoDAOImpl implements PhotoDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Photo> getPhotos() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query sort by last name
		Query<Photo> query = currentSession.createQuery("from Photo order by id", Photo.class);

		// execute the query and get result list
		List<Photo> photos = query.getResultList();

		// return the results
		return photos;
	}

	@Override
	public void saveCustomer(Photo newCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer to the DB
		currentSession.saveOrUpdate(newCustomer);
	}

	@Override
	public Photo getCustomer(int id) {

		// get current hibernate session
		Session session = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Photo customer = session.get(Photo.class, id);

		return customer;
	}

	@Override
	public void deleteCustomer(int id) {

		Session session = sessionFactory.getCurrentSession();

//		Query query = session.createNamedQuery("delete from Customer where id=:customerId");
//		query.setParameter("customerId", id);
//		query.executeUpdate();

		Photo customer = session.get(Photo.class, id);

		session.delete(customer);

	}

	@Override
	public List<Photo> searchCustomers(String name) {

		Session currentSession = sessionFactory.getCurrentSession();

		Query query = null;

		// only search by name if theSearchName is not empty
		//
		if (name != null && name.trim().length() > 0) {

			// search for firstName or lastName ... case insensitive
			query = currentSession.createQuery(
					"from Customer where lower(firstName) like :searchName or lower(lastName) like :searchName",
					Photo.class);
			query.setParameter("searchName", "%" + name.toLowerCase() + "%");

		} else {
			// theSearchName is empty ... so just get all customers
			query = currentSession.createQuery("from Customer", Photo.class);
		}

		List<Photo> customers = query.getResultList();

		return customers;

	}

}
