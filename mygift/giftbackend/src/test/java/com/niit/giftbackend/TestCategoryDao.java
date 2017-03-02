package com.niit.giftbackend;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftbackend.dao.CategoryDao;
import com.niit.giftbackend.model.Category;

public class TestCategoryDao {

	@Autowired
	static CategoryDao categoryDao;

	@Autowired
	static Category category;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		category = (Category) context.getBean("category");
		categoryDao = (CategoryDao) context.getBean("categoryDao");
		
	}

	@Test
	public void CategoryIdTest() {
		category = categoryDao.get("CG1");
		String id = category.getId();
		assertEquals("category id test", "CG1", id);
	}
}
