package com.niit.AutoSpares;

import java.util.List;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.User;
public class testUser {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		User u1=(User)ctx.getBean("user");
		UserDAO UserDAO=(UserDAO)ctx.getBean("userDAO");
		
		u1.setUserID("U100");
		u1.setName("User1");
		u1.setPhNo("8951662776");
		u1.setEmail_ID("user1.@gmail.com");
		u1.setPassword("125sfh542");
		u1.setAddress("B'lore");
		
		u1.setUserID("U100");
		
		
		if(UserDAO.saveorupdate(u1)==true)
		{
			System.out.println("User saved");
		}
		else
		{
			System.out.println("User not saved");
		}
		
		u1.setUserID("U101");
		u1.setName("User2");
		u1.setPhNo("8951662776");
		u1.setEmail_ID("user1.@gmail.com");
		u1.setPassword("125sfh542");
		u1.setAddress("B'lore");
		
		if(UserDAO.saveorupdate(u1)==true)
		{
			System.out.println("User saved");
		}
		else
		{
			System.out.println("User not saved");
		}
		
		u1.setUserID("U102");
		u1.setName("User3");
		u1.setPhNo("8951662776");
		u1.setEmail_ID("user1.@gmail.com");
		u1.setPassword("125sfh542");
		u1.setAddress("B'lore");
		
		if(UserDAO.saveorupdate(u1)==true)
		{
			System.out.println("User saved");
		}
		else
		{
			System.out.println("User not saved");
		}
		
		List<User> userlist=UserDAO.userlist();
		for(User u:userlist)
		{
			System.out.println(u1.getUserID());
			System.out.println(u1.getName());
			System.out.println(u1.getEmail_ID());
			System.out.println(u1.getPassword());
			System.out.println(u1.getPhNo());
			System.out.println(u1.getAddress());
		}
		
		
		u1=UserDAO.getUser("U100");
		if(u1!=null)
		{
			System.out.println(u1.getUserID());
			System.out.println(u1.getName());
		}
		else
		{
			System.out.println("User details not found");
		}
		
		u1=UserDAO.getUser("U101");
				if(u1!=null)
				{
					System.out.println("User being Deleted");
					if(UserDAO.delete(u1)==true)
					{
						System.out.println("User being deleted");
					}
					else
					{
						System.out.println("User not Deleted");
					}
				}
				else
				{
					System.out.println("User details not found");
				}
				 
				List<User> Userlist=UserDAO.userlist();
				for(User u13:userlist)
				{
					System.out.println(u13.getUserID());
					System.out.println(u13.getName());
				}
				
		
		User u=new User();
		u.setUserID("125");
		u.setName("Vidhya");
		u.setEmail_ID("Vidya@gmail.com");
		u.setPassword("154sdd25");
		u.setPhNo("8945731588");
		u.setAddress("B'lore");
		System.out.println(u.getUserID());
		System.out.println(u.getName());
		System.out.println(u.getEmail_ID());
		System.out.println(u.getPassword());
		System.out.println(u.getPhNo());
		System.out.println(u.getAddress());

	 }
	 
}
