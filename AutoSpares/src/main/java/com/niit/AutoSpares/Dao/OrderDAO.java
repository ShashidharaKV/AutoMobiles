package com.niit.AutoSpares.Dao;

import java.util.List;
import com.niit.AutoSpares.model.Order;

public interface OrderDAO
{

	public boolean saveorupdate(Order order);
	public boolean delete(Order order);
	public Order getOrder(String Order_Id);
	public List<Order> orderlist();
	
}
