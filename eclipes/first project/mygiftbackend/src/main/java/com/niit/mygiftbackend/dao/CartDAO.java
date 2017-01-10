package com.niit.mygiftbackend.dao;

import com.niit.mygiftbackend.model.Cart;

public interface CartDAO {
	public void addCart(Cart cart);

	public void updateCart(Cart cart);

	public Cart getCartById(int cartid);

}