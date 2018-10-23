package com.niit.AutoSpares.Dao;
import java.util.List;
import com.niit.AutoSpares.model.Supplier;
public interface SupplierDAO 
{

	public boolean saveorupdate(Supplier supplier);
	public boolean delete(Supplier supplier);
	public Supplier getSupplier(String ID);
	public List<Supplier> supplierlist();
	                                                           
	}

