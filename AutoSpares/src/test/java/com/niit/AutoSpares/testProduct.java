package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.Dao.SupplierDAO;
import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.Supplier;
public class testProduct {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Product p1=(Product)ctx.getBean("product");
		ProductDAO ProductDAO=(ProductDAO)ctx.getBean("productDAO");
		
		Supplier s1=(Supplier)ctx.getBean("supplier");
		SupplierDAO SupplierDAO=(SupplierDAO)ctx.getBean("supplierDAO");
		Category cat=(Category)ctx.getBean("category");
		categoryDAO catDAO=(categoryDAO)ctx.getBean("categoryDAO");
		
		p1.setProductID("P101");
		p1.setName("Prod1");
		p1.setQty("2");
		p1.setPrice("2550");
		p1.setDescription("Geniune Product");
		
		s1=SupplierDAO.getSupplier("S121");
		p1.setSupplier(s1);
		
		cat=catDAO.getCategory("C101");
		p1.setCategory(cat);
		
		
		if(ProductDAO.saveorupdate(p1)==true)
		{
			System.out.println("Product saved");
		}
		else
		{
			System.out.println("Product not saved");
		}
		
		p1.setProductID("P102");
		p1.setName("Prod2");
		p1.setQty("3");
		p1.setPrice("2150");
		p1.setDescription("Geniune Product");
		
		s1=SupplierDAO.getSupplier("S103");
		p1.setSupplier(s1);
		
		cat=catDAO.getCategory("C103");
		p1.setCategory(cat);
		
		
		if(ProductDAO.saveorupdate(p1)==true)
		{
			System.out.println("Product saved");
		}
		else
		{
			System.out.println("Product not saved");
		}
		
		p1.setProductID("P103");
		p1.setName("Prod3");
		p1.setQty("4");
		p1.setPrice("2500");
		p1.setDescription("Geniune Product");
		
		cat.setCategoryID("C101");
		cat.setCategoryname("Category1");
		
	
		
		s1=SupplierDAO.getSupplier("S121");
		p1.setSupplier(s1);
		
		cat=catDAO.getCategory("C101");
		p1.setCategory(cat);
		
		if(ProductDAO.saveorupdate(p1)==true)
		{
			System.out.println("Product saved");
		}
		else
		{
			System.out.println("Product not saved");
		}
		
		List<Product> productlist=ProductDAO.productlist();
		for(Product p:productlist)
		{
			System.out.println(p.getProductID());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getQty());
			System.out.println(p.getDescription());
		}
		
		p1=ProductDAO.getProduct("P101");
		if(p1!=null)
		{
			System.out.println(p1.getProductID());
			System.out.println(p1.getName());
		}
		else
		{
			System.out.println("Product details not found");
		}
		
		p1=ProductDAO.getProduct("P102");
				if(p1!=null)
				{
					System.out.println("Product being Deleted");
					if(ProductDAO.delete(p1)==true)
					{
						System.out.println("Product being deleted");
					}
					else
					{
						System.out.println("Product not Deleted");
					}
				}
				else
				{
					System.out.println("Product details not found");
				}
				 
				List<Product> Productlist=ProductDAO.productlist();
				for(Product c124:productlist)
				{
					System.out.println(c124.getProductID());
					System.out.println(c124.getName());
				}
		
	Product p=new Product();
	p.setProductID("P1023");
	p.setName("Clutch");
	p.setPrice("250/-");
	p.setQty("2");
	p.setDescription("For Honda Vehicles only. Geniune Product");
	System.out.println(p.getProductID());
	System.out.println(p.getName());
	System.out.println(p.getPrice());
	System.out.println(p.getQty());
	System.out.println(p.getDescription());	
	}

}
