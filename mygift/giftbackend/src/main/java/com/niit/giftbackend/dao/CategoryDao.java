package com.niit.giftbackend.dao;


import java.util.List;

import com.niit.giftbackend.model.Category;

public interface CategoryDao {

	public List<Category> list();

	public Category get(String id);

	public void saveOrUpdate(Category logger);

	public void delete(String id);

	public Category getByName(String name);

}
