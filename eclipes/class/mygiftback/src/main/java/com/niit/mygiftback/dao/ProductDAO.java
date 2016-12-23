package com.niit.mygiftback.dao;

import java.util.List;

import com.niit.mygiftback.model.Product;

public interface ProductDAO {
	public void addProduct(Product p);
	public void updateProduct(Product p);
	public List<Product> listProducts();
	public Product getPersonById(int id);
	public void removePerson(int id);
	

}
