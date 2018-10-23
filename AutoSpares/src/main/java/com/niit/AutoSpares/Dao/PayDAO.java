package com.niit.AutoSpares.Dao;

import java.util.List;
import com.niit.AutoSpares.model.Pay;

public interface PayDAO
{

	public boolean saveorupdate(Pay pay);
	public boolean delete(Pay pay);
	public Pay getPay(String Pay_Id);
	public List<Pay> paylist();
	
	
}
