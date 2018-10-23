package com.niit.AutoSpares.Dao;
	import java.util.List;
	import com.niit.AutoSpares.model.Product;

public interface ProductDAO {

		public boolean saveorupdate(Product product);
		public boolean delete(Product supplier);
		public Product getProduct(String ID);
		public List<Product> productlist();
}
