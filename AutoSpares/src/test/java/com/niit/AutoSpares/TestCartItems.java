package com.niit.AutoSpares;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AutoSpares.Dao.CartDAO;
import com.niit.AutoSpares.Dao.CartItemsDAO;
import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.model.Cart;
import com.niit.AutoSpares.model.CartItems;
import com.niit.AutoSpares.model.Product;

public class TestCartItems
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		CartItems C1=(CartItems)ctx.getBean("cartItems");
		CartItemsDAO cartitemsDAO=(CartItemsDAO)ctx.getBean("cartItemsDAO");
		
		Cart C2=(Cart)ctx.getBean("cart");
		CartDAO cartDAO=(CartDAO)ctx.getBean("cartDAO");
		
		Product p1=(Product)ctx.getBean("product");
		ProductDAO ProductDAO=(ProductDAO)ctx.getBean("productDAO");
		
		C1.setCartitem_Id("C102");
		C1.setPrice(200.0);
		
		C2=cartDAO.getCart("C101");
		C1.setCart(C2);
		
		p1=ProductDAO.getProduct("P101");
		C1.setProduct(p1);
		
		if(cartitemsDAO.saveorupdate(C1)==true)
		{
			System.out.println("CartItems saved");
		}
		else
		{
			System.out.println("CartItems is not saved");
}

		C1.setCartitem_Id("C103");
		C1.setPrice(2145.0);
		if(cartitemsDAO.saveorupdate(C1)==true)
		{
			System.out.println("CartItems saved");
		}
		else
		{
			System.out.println("CartItems is not saved");
}
		
		C1.setCartitem_Id("C104");
		C1.setPrice(2450.00);
		if(cartitemsDAO.saveorupdate(C1)==true)
		{
			System.out.println("CartItems saved");
		}
		else
		{
			System.out.println("CartItems is not saved");
}
		
		C1=cartitemsDAO.getCartItems("C102");
		if(C1!=null)
		{
			System.out.println(C1.getCartitem_Id());
			System.out.println(C1.getPrice());
		}
		else
		{
			System.out.println("CartItems details not found");
		}
		
		C1=cartitemsDAO.getCartItems("C102");
		if(C1!=null)
		{
			System.out.println("CartItems being Deleted");
			if(cartitemsDAO.delete(C1)==true)
			{
				System.out.println("CartItems being deleted");
			}
			else
			{
				System.out.println("CartItems not Deleted");
			}
		}
		else
		{
			System.out.println("CartItems details not found");
		}
		 
		List<CartItems> cartitemstlist=cartitemsDAO.cartitemslist();
		for(CartItems b1:cartitemstlist)
		{
			System.out.println(b1.getCartitem_Id());
			System.out.println(b1.getPrice());
		}
}
}
