package com.niit.AutoSpares.Dao;

import java.util.List;
import com.niit.AutoSpares.model.OrderItems;

public interface OrderItemsDAO
{

	public boolean saveorupdate(OrderItems orderItems);
	public boolean delete(OrderItems orderItems);
	public OrderItems getOrderItems(String Orderitems_Id);
	public List<OrderItems> orderItemslist();
	
}
