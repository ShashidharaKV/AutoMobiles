package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.BillingDAO;
import com.niit.AutoSpares.Dao.CartDAO;
import com.niit.AutoSpares.model.Billing;
import com.niit.AutoSpares.model.Cart;

public class TestCart
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Cart C2=(Cart)ctx.getBean("cart");
		CartDAO cartDAO=(CartDAO)ctx.getBean("cartDAO");
		
		C2.setCart_Id("C101");
		C2.setTotal_items(2);
		C2.setGrand_total(20.0);
		if(cartDAO.saveorupdate(C2)==true)
		{
			System.out.println("Cart saved");
		}
		else
		{
			System.out.println("Cart is not saved");
}


		C2.setCart_Id("C102");
		C2.setTotal_items(3);
		C2.setGrand_total(200.2);
		if(cartDAO.saveorupdate(C2)==true)
		{
			System.out.println("Cart saved");
		}
		else
		{
			System.out.println("Cart is not saved");
}
		
		C2.setCart_Id("C103");
		C2.setTotal_items(4);
		C2.setGrand_total(22.0);
		if(cartDAO.saveorupdate(C2)==true)
		{
			System.out.println("Cart saved");
		}
		else
		{
			System.out.println("Cart is not saved");
}
		
		C2=cartDAO.getCart("C101");
		if(C2!=null)
		{
			System.out.println(C2.getCart_Id());
			System.out.println(C2.getTotal_items());
			System.out.println(C2.getGrand_total());
		}
		else
		{
			System.out.println("Cart details not found");
		}
		
		C2=cartDAO.getCart("C102");
		if(C2!=null)
		{
			System.out.println("Cart being Deleted");
			if(cartDAO.delete(C2)==true)
			{
				System.out.println("Cart being deleted");
			}
			else
			{
				System.out.println("Cart not Deleted");
			}
		}
		else
		{
			System.out.println("Cart details not found");
		}
		 
		
		List<Cart> cartlist=cartDAO.cartlist();
		for(Cart b1:cartlist)
		{
			System.out.println(b1.getCart_Id());
			System.out.println(b1.getTotal_items());
			System.out.println(b1.getGrand_total());
		}

}
}
