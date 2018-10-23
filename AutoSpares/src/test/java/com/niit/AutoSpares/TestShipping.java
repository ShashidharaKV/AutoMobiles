package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.ShippingDAO;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.Shipping;
import com.niit.AutoSpares.model.User;


public class TestShipping
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Shipping S12=(Shipping)ctx.getBean("shipping");
		ShippingDAO shippingDAO=(ShippingDAO)ctx.getBean("shippingDAO");
		
		User u1=(User)ctx.getBean("user");
		UserDAO UserDAO=(UserDAO)ctx.getBean("userDAO");
		
		S12.setShipId("SHIP100");
		S12.setAddress("R'Nagar");
		S12.setCity("B'lore");
		S12.setState("Karnataka");
		S12.setCountry("INDIA");
		S12.setPincode(560048);
		S12.setPhone(98754645);
		
		u1=UserDAO.getUser("U100");
		S12.setUser(u1);
		
		if(shippingDAO.saveorupdate(S12)==true)
		{
			System.out.println("Shipping saved");
		}
		else
		{
			System.out.println("Shipping is not saved");
}


		S12.setShipId("SHIP101");
		S12.setAddress("T'Nagar");
		S12.setCity("B'lore");
		S12.setState("Karnataka");
		S12.setCountry("INDIA");
		S12.setPincode(560048);
		S12.setPhone(98754645);
		
		u1=UserDAO.getUser("U100");
		S12.setUser(u1);
		
		
		if(shippingDAO.saveorupdate(S12)==true)
		{
			System.out.println("Shipping saved");
		}
		else
		{
			System.out.println("Shipping is not saved");
}

		S12.setShipId("SHIP102");
		S12.setAddress("S'Nagar");
		S12.setCity("B'lore");
		S12.setState("Karnataka");
		S12.setCountry("INDIA");
		S12.setPincode(560048);
		S12.setPhone(98754645);
		
		u1=UserDAO.getUser("U100");
		S12.setUser(u1);
		
		
		if(shippingDAO.saveorupdate(S12)==true)
		{
			System.out.println("Shipping saved");
		}
		else
		{
			System.out.println("Shipping is not saved");
}

		S12=shippingDAO.getShipping("SHIP100");
		if(S12!=null)
		{
			System.out.println(S12.getShipId());
			System.out.println(S12.getAddress());
			System.out.println(S12.getCity());
			System.out.println(S12.getState());
			System.out.println(S12.getCountry());
			System.out.println(S12.getPincode());
			System.out.println(S12.getPhone());
		}
		else
		{
			System.out.println("Shipping details not found");
		}
		
		S12=shippingDAO.getShipping("SHIP101");
		if(S12!=null)
		{
			System.out.println("Shipping being Deleted");
			if(shippingDAO.delete(S12)==true)
			{
				System.out.println("Shipping deleted");
			}
			else
			{
				System.out.println("Shipping not Deleted");
			}
		}
		else
		{
			System.out.println("Shipping details not found");
		}
		 
		
		List<Shipping> shippinglist=shippingDAO.shippinglist();
		for(Shipping b1:shippinglist)
		{
			System.out.println(b1.getShipId());
			System.out.println(b1.getAddress());
			System.out.println(b1.getCity());
			System.out.println(b1.getState());
			System.out.println(b1.getCountry());
			System.out.println(b1.getPincode());
			System.out.println(b1.getPhone());
			}
}
}

