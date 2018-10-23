package com.niit.AutoSpares;

import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.OrderDAO;
import com.niit.AutoSpares.Dao.OrderItemsDAO;
import com.niit.AutoSpares.model.Order;
import com.niit.AutoSpares.model.OrderItems;

public class TestOrderItems
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		OrderItems O1=(OrderItems)ctx.getBean("orderItems");
		OrderItemsDAO orderItemsDAO=(OrderItemsDAO)ctx.getBean("orderItemsDAO");
		
		Order C12=(Order)ctx.getBean("order");
		OrderDAO orderDAO=(OrderDAO)ctx.getBean("orderDAO");
		
		O1.setOrderitem_Id("OI100");
		O1.setProduct_Id("P100");
		
		C12=orderDAO.getOrder("O101");
		O1.setOrder(C12);
		
		if(orderItemsDAO.saveorupdate(O1)==true)
		{
			System.out.println("OrderItems saved");
		}
		else
		{
			System.out.println("OrderItems is not saved");
}


		O1.setOrderitem_Id("OI101");
		O1.setProduct_Id("P101");
		
		C12=orderDAO.getOrder("O101");
		O1.setOrder(C12);
		
		if(orderItemsDAO.saveorupdate(O1)==true)
		{
			System.out.println("OrderItems saved");
		}
		else
		{
			System.out.println("OrderItems is not saved");
}
		
		O1.setOrderitem_Id("OI102");
		O1.setProduct_Id("P102");
		
		C12=orderDAO.getOrder("O101");
		O1.setOrder(C12);
		
		if(orderItemsDAO.saveorupdate(O1)==true)
		{
			System.out.println("OrderItems saved");
		}
		else
		{
			System.out.println("OrderItems is not saved");
}

		
		O1=orderItemsDAO.getOrderItems("OI101");
		if(O1!=null)
		{
			System.out.println(O1.getOrderitem_Id());
			System.out.println(O1.getProduct_Id());
		}
		else
		{
			System.out.println("OrderItems details not found");
		}
		
		O1=orderItemsDAO.getOrderItems("OI101");
		if(O1!=null)
		{
			System.out.println("OrderItems being Deleted");
			if(orderItemsDAO.delete(O1)==true)
			{
				System.out.println("OrderItems being deleted");
			}
			else
			{
				System.out.println("OrderItems not Deleted");
			}
		}
		else
		{
			System.out.println("OrderItems details not found");
		}
		 
		
		List<OrderItems> orderItemslist=orderItemsDAO.orderItemslist();
		for(OrderItems b1:orderItemslist)
		{
			System.out.println(b1.getOrderitem_Id());
			System.out.println(b1.getProduct_Id());
			}

}
}

