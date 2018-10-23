package com.niit.AutoSpares.Dao;

import java.util.List;

import com.niit.AutoSpares.model.Cart;



public interface CartDAO 
{

	public boolean saveorupdate(Cart cart);
	public boolean delete(Cart cart);
	public Cart getCart(String Cart_Id);
	public List<Cart> cartlist();
	
}
