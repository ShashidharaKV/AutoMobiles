package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.SupplierDAO;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.Supplier;;
public class testSupplier {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Supplier s1=(Supplier)ctx.getBean("supplier");
		SupplierDAO SupplierDAO=(SupplierDAO)ctx.getBean("supplierDAO");
		
		s1.setSupplierID("S121");
		s1.setName("Sup1");
		s1.setPhno("8954632115");
		s1.setEmail_ID("Saup1@gmail.com");
		s1.setPassword("afdf125478aed");
		s1.setAddress("Mysore");
		
		if(SupplierDAO.saveorupdate(s1)==true)
		{
			System.out.println("Supplier saved");
		}
		else
		{
			System.out.println("Supplier not saved");
		}
		
		s1.setSupplierID("S122");
		s1.setName("Sup2");
		s1.setPhno("8954632115");
		s1.setEmail_ID("Saup1@gmail.com");
		s1.setPassword("afdf125478aed");
		s1.setAddress("Mysore");
		
		if(SupplierDAO.saveorupdate(s1)==true)
		{
			System.out.println("Supplier saved");
		}
		else
		{
			System.out.println("Supplier not saved");
		}
		
		s1.setSupplierID("S123");
		s1.setName("Sup3");
		s1.setPhno("8954632115");
		s1.setEmail_ID("Saup1@gmail.com");
		s1.setPassword("afdf125478aed");
		s1.setAddress("Mysore");
		
		if(SupplierDAO.saveorupdate(s1)==true)
		{
			System.out.println("Supplier saved");
		}
		else
		{
			System.out.println("Supplier not saved");
		}
		
		List<Supplier> supplierlist=SupplierDAO.supplierlist();
		for(Supplier s:supplierlist)
		{
			System.out.println(s1.getSupplierID());
			System.out.println(s1.getName());
			System.out.println(s1.getEmail_ID());
			System.out.println(s1.getPassword());
			System.out.println(s1.getPhno());
			System.out.println(s1.getAddress());
		}
		
		s1=SupplierDAO.getSupplier("S121");
		if(s1!=null)
		{
			System.out.println(s1.getSupplierID());
			System.out.println(s1.getName());
		}
		else
		{
			System.out.println("Supplier details not found");
		}
		
		s1=SupplierDAO.getSupplier("S122");
				if(s1!=null)
				{
					System.out.println("Supplier being Deleted");
					if(SupplierDAO.delete(s1)==true)
					{
						System.out.println("Supplier being deleted");
					}
					else
					{
						System.out.println("Supplier not Deleted");
					}
				}
				else
				{
					System.out.println("Supplier details not found");
				}
				 
				List<Supplier> Supplierlist=SupplierDAO.supplierlist();
				for(Supplier s12:supplierlist)
				{
					System.out.println(s12.getSupplierID());
					System.out.println(s12.getName());
				}
		
	}

}
