package com.niit.AutoSpares;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.BillingDAO;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.Billing;
import com.niit.AutoSpares.model.User;


public class TestBilling
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Billing B1=(Billing)ctx.getBean("billing");
		BillingDAO billingDAO=(BillingDAO)ctx.getBean("billingDAO");
		
		User u1=(User)ctx.getBean("user");
		UserDAO UserDAO=(UserDAO)ctx.getBean("userDAO");
		
		B1.setBilling_Id("B100");
		B1.setBilling_Name("Mohan");
		B1.setBilling_Address("Dollars Collony");
		B1.setBilling_Phoneno("8945135784");
		
		u1.setUserID("U100");
		B1.setUser(u1);
		
		if(billingDAO.saveorupdate(B1)==true)
		{
			System.out.println("Billing saved");
		}
		else
		{
			System.out.println("Billing is not saved");
}


		B1.setBilling_Id("B101");
		B1.setBilling_Name("Mohan");
		B1.setBilling_Address("Dollars Collony");
		B1.setBilling_Phoneno("8945135784");
		
		if(billingDAO.saveorupdate(B1)==true)
		{
			System.out.println("Billing saved");
		}
		else
		{
			System.out.println("Billing is not saved");
}		

		B1.setBilling_Id("B102");
		B1.setBilling_Name("Mohan1");
		B1.setBilling_Address("Dollars Collony");
		B1.setBilling_Phoneno("8945135784");
		
		u1.setUserID("U102");
		B1.setUser(u1);
		
		if(billingDAO.saveorupdate(B1)==true)
		{
			System.out.println("Billing saved");
		}
		else
		{
			System.out.println("Billing is not saved");
}
		
		
		B1=billingDAO.getBilling("B100");
		if(B1!=null)
		{
			System.out.println(B1.getBilling_Id());
			System.out.println(B1.getBilling_Name());
			System.out.println(B1.getBilling_Address());
			System.out.println(B1.getBilling_Phoneno());
		}
		else
		{
			System.out.println("Billing details not found");
		}
		
		B1=billingDAO.getBilling("B101");
		if(B1!=null)
		{
			System.out.println("Billing being Deleted");
			if(billingDAO.delete(B1)==true)
			{
				System.out.println("Billing being deleted");
			}
			else
			{
				System.out.println("Billing not Deleted");
			}
		}
		else
		{
			System.out.println("Billing details not found");
		}
		 
		
		List<Billing> billinglist=billingDAO.billinglist();
		for(Billing b1:billinglist)
		{
			System.out.println(b1.getBilling_Id());
			System.out.println(b1.getBilling_Name());
			System.out.println(b1.getUser());
			System.out.println(b1.getBilling_Phoneno());
		}
		
}
}