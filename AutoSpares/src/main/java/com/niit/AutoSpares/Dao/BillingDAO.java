package com.niit.AutoSpares.Dao;

import java.util.List;
import com.niit.AutoSpares.model.Billing;

public interface BillingDAO
{

	public boolean saveorupdate(Billing billing);
	public boolean delete(Billing billing);
	public Billing getBilling(String Billing_Id);
	public List<Billing> billinglist();
	
}
