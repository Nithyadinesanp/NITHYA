package com.niit.giftbackend;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.giftbackend.dao.CartDao;


public class TestCartDao {

	@Autowired
	CartDao cartDao;

	

	AnnotationConfigApplicationContext context;



	

	@Before
	public void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		cartDao = (CartDao) context.getBean("cartDao");
	}

	@Test

	public void UserTestCase() {
		int size = cartDao.getById(1).getCartId();
		assertEquals("supplier list test case ", 6 , size);

	}

}