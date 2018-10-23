package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.BillingDAO;
import com.niit.AutoSpares.Dao.OrderDAO;
import com.niit.AutoSpares.Dao.PayDAO;
import com.niit.AutoSpares.Dao.ShippingDAO;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.Billing;
import com.niit.AutoSpares.model.Order;
import com.niit.AutoSpares.model.Pay;
import com.niit.AutoSpares.model.Shipping;
import com.niit.AutoSpares.model.User;


public class TestOrder 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Order C12=(Order)ctx.getBean("order");
		OrderDAO orderDAO=(OrderDAO)ctx.getBean("orderDAO");
		
		Billing B1=(Billing)ctx.getBean("billing");
		BillingDAO billingDAO=(BillingDAO)ctx.getBean("billingDAO");
		
		Pay PA1=(Pay)ctx.getBean("pay");
		PayDAO payDAO=(PayDAO)ctx.getBean("payDAO");
		
		Shipping S12=(Shipping)ctx.getBean("shipping");
		ShippingDAO shippingDAO=(ShippingDAO)ctx.getBean("shippingDAO");
		
		User u1=(User)ctx.getBean("user");
		UserDAO UserDAO=(UserDAO)ctx.getBean("userDAO");
		
		C12.setOrder_Id("O100");
		C12.setOrder_Date("22/11/2018");
		C12.setOrder_Time("11.00 AM");
		C12.setGrand_Total(20000.0);
		
		B1=billingDAO.getBilling("B100");
		C12.setBilling(B1);
		
         PA1=payDAO.getPay("P101");
         C12.setPay(PA1);
		
         S12=shippingDAO.getShipping("SHIP100");
         C12.setShipping(S12);
         
		u1=UserDAO.getUser("U100");
		C12.setUser(u1);
		
		if(orderDAO.saveorupdate(C12)==true)
		{
			System.out.println("Order saved");
		}
		else
		{
			System.out.println("Order is not saved");
}


		C12.setOrder_Id("O101");
		C12.setOrder_Date("24/11/2018");
		C12.setOrder_Time("11.00 AM");
		C12.setGrand_Total(20000.0);
		
		B1=billingDAO.getBilling("B100");
		C12.setBilling(B1);
		
         PA1=payDAO.getPay("P101");
         C12.setPay(PA1);
		
         S12=shippingDAO.getShipping("SHIP100");
         C12.setShipping(S12);
         
		u1=UserDAO.getUser("U100");
		C12.setUser(u1);
		
		if(orderDAO.saveorupdate(C12)==true)
		{
			System.out.println("Order saved");
		}
		else
		{
			System.out.println("Order is not saved");
}

		C12.setOrder_Id("O102");
		C12.setOrder_Date("26/11/2018");
		C12.setOrder_Time("11.00 AM");
		C12.setGrand_Total(20000.0);
		
		B1=billingDAO.getBilling("B102");
		C12.setBilling(B1);
		
         PA1=payDAO.getPay("P101");
         C12.setPay(PA1);
		
         S12=shippingDAO.getShipping("SHIP102");
         C12.setShipping(S12);
         
		u1=UserDAO.getUser("U100");
		C12.setUser(u1);
		
		if(orderDAO.saveorupdate(C12)==true)
		{
			System.out.println("Order saved");
		}
		else
		{
			System.out.println("Order is not saved");
}

		
		C12=orderDAO.getOrder("O100");
		if(C12!=null)
		{
			System.out.println(C12.getOrder_Id());
			System.out.println(C12.getOrder_Date());
			System.out.println(C12.getOrder_Time());
			System.out.println(C12.getGrand_Total());
		}
		else
		{
			System.out.println("Order details not found");
		}
		
		C12=orderDAO.getOrder("O100");
		if(C12!=null)
		{
			System.out.println("Order being Deleted");
			if(orderDAO.delete(C12)==true)
			{
				System.out.println("Order deleted");
			}
			else
			{
				System.out.println("Order not Deleted");
			}
		}
		else
		{
			System.out.println("Order details not found");
		}
		 
		
		List<Order> orderlist=orderDAO.orderlist();
		for(Order b1:orderlist)
		{
			System.out.println(b1.getOrder_Id());
			System.out.println(b1.getOrder_Date());
			System.out.println(b1.getOrder_Time());
			System.out.println(b1.getGrand_Total());
		}

}
}
