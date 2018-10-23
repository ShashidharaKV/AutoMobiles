package com.niit.AutoSpares.Dao;

import java.util.List;
import com.niit.AutoSpares.model.Shipping;

public interface ShippingDAO
{

	public boolean saveorupdate(Shipping shipping);
	public boolean delete(Shipping shipping);
	public Shipping getShipping(String ShipId);
	public List<Shipping> shippinglist();
	
}
