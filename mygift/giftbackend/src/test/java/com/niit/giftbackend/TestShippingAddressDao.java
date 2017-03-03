//package com.niit.giftbackend;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.giftbackend.dao.ShippingAddressDao;
//
//public class TestShippingAddressDao {
//
//	
//	@Autowired
//	ShippingAddressDao shippingAddressDao;
//
//	
//
//	AnnotationConfigApplicationContext context;
//
//	@Before
//	public void init() {
//
//		context = new AnnotationConfigApplicationContext();
//		context.scan("com.niit");
//		context.refresh();
//		shippingAddressDao = (ShippingAddressDao) context.getBean("shippingAddressDao");
//	}
//
//	@Test
//
//	public void UserTestCase() {
//		int size = shippingAddressDao.list().size();
//		assertEquals("product list test case ", 5, size);
//
//	}
//
//}
