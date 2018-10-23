package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.AuthenticationDAO;
import com.niit.AutoSpares.model.Authentication;

public class TestAuthentication
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Authentication A1=(Authentication)ctx.getBean("authentication");
		AuthenticationDAO authenticationDAO=(AuthenticationDAO)ctx.getBean("authenticationDAO");
		
		A1.setrId("A100");
		A1.setRole_name("Developer");
		A1.setUsername("Ram");
		if(authenticationDAO.saveorupdate(A1)==true)
		{
			System.out.println("Authentication saved");
		}
		else
		{
			System.out.println("Authentication is not saved");
}
		
		A1.setrId("A101");
		A1.setRole_name("Devop");
		A1.setUsername("Ram");
		if(authenticationDAO.saveorupdate(A1)==true)
		{
			System.out.println("Authentication saved");
		}
		else
		{
			System.out.println("Authentication is not saved");
}

		A1.setrId("A102");
		A1.setRole_name("Developer1");
		A1.setUsername("Ram");
		if(authenticationDAO.saveorupdate(A1)==true)
		{
			System.out.println("Authentication saved");
		}
		else
		{
			System.out.println("Authentication is not saved");
}
		
		A1=authenticationDAO.getAuthentication("A100");
		if(A1!=null)
		{
			System.out.println(A1.getrId());
			System.out.println(A1.getRole_name());
			System.out.println(A1.getUsername());
		}
		else
		{
			System.out.println("Authentication details not found");
		}
		
		A1=authenticationDAO.getAuthentication("A101");
		if(A1!=null)
		{
			System.out.println("Authentication being Deleted");
			if(authenticationDAO.delete(A1)==true)
			{
				System.out.println("Authentication being deleted");
			}
			else
			{
				System.out.println("Authentication not Deleted");
			}
		}
		else
		{
			System.out.println("Authentication details not found");
		}
		 
		
		List<Authentication> authenticationlist=authenticationDAO.authenticationlist();
		for(Authentication a1:authenticationlist)
		{
			System.out.println(a1.getrId());
			System.out.println(a1.getRole_name());
			System.out.println(a1.getUsername());
		}
				
}
}
