package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.PhotoDAO;
import com.luv2code.springdemo.entity.Photo;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDAO photoDAO;

	@Override
	@Transactional
	public List<Photo> getPhotos() {
		return photoDAO.getPhotos();
	}

//	@Override
//	@Transactional
//	public void saveCustomer(Photo newCustomer) {
//
//		customerDAO.saveCustomer(newCustomer);
//	}
//
//	@Override
//	@Transactional
//	public Photo getCustomer(int id) {
//		
//		return customerDAO.getCustomer(id);
//	}
//
//	@Override
//	@Transactional
//	public void deleteCustomer(int id) {
//		
//		customerDAO.deleteCustomer(id);
//		
//	}

//	@Override
//	@Transactional
//	public List<Photo> searchCustomers(String name) {
//		
//		return customerDAO.searchCustomers(name);
//		
//	}

}
