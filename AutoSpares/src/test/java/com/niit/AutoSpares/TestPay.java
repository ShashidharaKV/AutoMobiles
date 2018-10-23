package com.niit.AutoSpares;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.PayDAO;
import com.niit.AutoSpares.model.Pay;

public class TestPay
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Pay PA1=(Pay)ctx.getBean("pay");
		PayDAO payDAO=(PayDAO)ctx.getBean("payDAO");
		
		PA1.setPay_Id("P100");
		PA1.setPay_Method("Card");
		PA1.setStatus("Pending");
		if(payDAO.saveorupdate(PA1)==true)
		{
			System.out.println("Pay saved");
		}
		else
		{
			System.out.println("Pay is not saved");
}


		PA1.setPay_Id("P101");
		PA1.setPay_Method("Neft");
		PA1.setStatus("Paid");
		if(payDAO.saveorupdate(PA1)==true)
		{
			System.out.println("Pay saved");
		}
		else
		{
			System.out.println("Pay is not saved");
}
		
		PA1.setPay_Id("P102");
		PA1.setPay_Method("CAsh on delivery");
		PA1.setStatus("Pending");
		if(payDAO.saveorupdate(PA1)==true)
		{
			System.out.println("Pay saved");
		}
		else
		{
			System.out.println("Pay is not saved");
}

		
		PA1=payDAO.getPay("P100");
		if(PA1!=null)
		{
			System.out.println(PA1.getPay_Id());
			System.out.println(PA1.getPay_Method());
			System.out.println(PA1.getStatus());
		}
		else
		{
			System.out.println("Pay details not found");
		}
		
		PA1=payDAO.getPay("P102");
		if(PA1!=null)
		{
			System.out.println("Pay being Deleted");
			if(payDAO.delete(PA1)==true)
			{
				System.out.println("Pay being deleted");
			}
			else
			{
				System.out.println("Pay not Deleted");
			}
		}
		else
		{
			System.out.println("Pay details not found");
		}
		 
		
		List<Pay> paylist=payDAO.paylist();
		for(Pay b1:paylist)
		{
			System.out.println(b1.getPay_Id());
			System.out.println(b1.getPay_Method());
			System.out.println(b1.getStatus());
			}
}
}