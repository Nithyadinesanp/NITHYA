package com.niit.giftbackend.DAOImpl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.giftbackend.dao.ShippingAddressDao;
import com.niit.giftbackend.model.ShippingAddress;
 
@Repository("ShippingAddressDao")
@EnableTransactionManagement
@Transactional
public class ShippingAddressDaoImpl implements ShippingAddressDao {

	Logger log = LoggerFactory.getLogger(ShippingAddressDaoImpl.class);
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addAddress(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
	} 

	@Transactional
	public void update(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().update(shippingAddress);
	}

}