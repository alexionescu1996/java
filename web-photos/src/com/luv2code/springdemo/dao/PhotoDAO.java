package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Photo;

public interface PhotoDAO {

	public List<Photo> getPhotos();

	public void saveCustomer(Photo newCustomer);

	public Photo getCustomer(int id);

	public void deleteCustomer(int id);

	public List<Photo> searchCustomers(String name);

}
