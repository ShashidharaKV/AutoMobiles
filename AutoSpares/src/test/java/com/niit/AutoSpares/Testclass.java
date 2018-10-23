package com.niit.AutoSpares;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.model.Category;

public class Testclass 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Category cat=(Category)ctx.getBean("category");
		categoryDAO catDAO=(categoryDAO)ctx.getBean("categoryDAO");
		
		cat.setCategoryID("C101");
		cat.setCategoryname("Category1");
		if(catDAO.saveorupdate(cat)==true)
		{
			System.out.println("Category saved");
		}
		else
		{
			System.out.println("Category not saved");
		}
		
		cat.setCategoryID("C102");
		cat.setCategoryname("Category2");
		if(catDAO.saveorupdate(cat)==true)
		{
			System.out.println("Category saved");
		}
		else
		{
			System.out.println("Category not saved");
		}
		
		cat.setCategoryID("C103");
		cat.setCategoryname("Category3");
		if(catDAO.saveorupdate(cat)==true)
		{
			System.out.println("Category saved");
		}
		else
		{
			System.out.println("Category not saved");
		}
		
		cat=catDAO.getCategory("C101");
		if(cat!=null)
		{
			System.out.println(cat.getCategoryID());
			System.out.println(cat.getCategoryname());
		}
		else
		{
			System.out.println("Category details not found");
		}
		
		cat=catDAO.getCategory("C102");
				if(cat!=null)
				{
					System.out.println("Category being Deleted");
					if(catDAO.delete(cat)==true)
					{
						System.out.println("Category being deleted");
					}
					else
					{
						System.out.println("Category not Deleted");
					}
				}
				else
				{
					System.out.println("Category details not found");
				}
				 
				List<Category> catlist=catDAO.catlist();
				for(Category c:catlist)
				{
					System.out.println(c.getCategoryID());
					System.out.println(c.getCategoryname());
				}
				 
		Category v1=new Category();
		v1.setCategoryID("10");
		v1.setCategoryname("vehicle");
System.out.println(v1.getCategoryID());
System.out.println(v1.getCategoryname());
	}
}
