package com.niit.AutoSpares.Dao;

import java.util.List;

import com.niit.AutoSpares.model.CartItems;


public interface CartItemsDAO
{

	public boolean saveorupdate(CartItems cartItems);
	public boolean delete(CartItems cartItems);
	public CartItems getCartItems(String Cartitems_Id);
	public List<CartItems> cartitemslist();
	
}
