package com.niit.AutoSparesFrontEnd.Controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.AutoSpares.Dao.CartDAO;
import com.niit.AutoSpares.Dao.CartItemsDAO;
import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.model.Cart;
import com.niit.AutoSpares.model.CartItems;
import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.User;

@Controller
public class CartController 
{
	
	
		@Autowired
		User user;
		
		@Autowired
		UserDAO userDao;
		
		@Autowired
		Product product;
		
		@Autowired
		ProductDAO productDao;
		
		@Autowired
		CartDAO cartDao;
		
		@Autowired
		Cart cart;
		
		@Autowired
		CartItems cartItems;
		
		
		@Autowired
		CartItemsDAO cartItemsDao;
		
		@Autowired
		Category category;
		
		@Autowired
		categoryDAO categoryDao;
		
		@RequestMapping("/addtocart/{proId}")
		public ModelAndView cart(@PathVariable("proId") String id,HttpSession session) 
		{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
				String currusername = authentication.getName();
		User u = userDao.getEmail(currusername);
		if (user == null)
		{
			return new ModelAndView("redirect:/");
		} 
		else
		{
			cart = u.getCart();
			Product product = productDao.getProduct(id);
			CartItems cartItem = new CartItems();
			cartItem.setCart(cart);
			cartItem.setPrice(product.getPrice());
			cartItem.setProduct(product);
			
			cartItemsDao.saveorupdate(cartItem);
			cart.setGrand_total(cart.getGrand_total() + product.getPrice());
			cart.setTotal_items(cart.getTotal_items() + 1);
			cartDao.saveorupdate(cart);
			session.setAttribute("items", cart.getTotal_items());
			session.setAttribute("gd", cart.getGrand_total());
			return new ModelAndView("redirect:/");
			}
			}
			else {
				return new ModelAndView("redirect:/");
			}
		}	
		           @RequestMapping(value="/checkout")
		           public String viewcart(Model model,HttpSession session)
		           {
		        	   Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		        	   if(!(authentication instanceof AnonymousAuthenticationToken))
	                     {
	                    	 String currusername=authentication.getName();
	                    	 User user=userDao.getEmail(currusername);
	                    	 Cart cart=user.getCart();
	                    	 List<CartItems> cartItem=cartItemsDao.getlist(user.getCart().getCart_Id());
	                    	 if(cartItem==null||cartItem.isEmpty())
	                    	 {
	                    		 System.out.println(67567);
	                    		 session.setAttribute("items",0);
	                    		 model.addAttribute("gtotal",0.0);
	                    		 model.addAttribute("msg", "no items is added to cart");
	                    		 return "Cart";
	                    	 }
	                    	 System.out.println(54354);
	                    	 model.addAttribute("cartItem", cartItem);
	            			 model.addAttribute("grandtotal", cart.getGrand_total());
	            			 session.setAttribute("items", cart.getTotal_items());
	            			 session.setAttribute("cartid", cart.getCart_Id());
	            			 List<Category> categories=categoryDao.catlist();
	            			 model.addAttribute("lcat", categories);
	            			 return "Cart";
	                     }
	                    	 else
	                    	 {
	                    	 return "redirect:/checkout";
	                     }
		           }
	                     @RequestMapping(value="/Remove/{CartItems_Id}")
	                     public ModelAndView RemoveFromCart(@PathVariable("CartItems_Id")String id)
	                     {
	                    	 ModelAndView mv=new ModelAndView("redirect:/checkout");
	                    	 cartItems= cartItemsDao.getCartItems(id);
	                    	 cart=cartItems.getCart();
	                    	 cart.setGrand_total(cart.getGrand_total()-cartItems.getPrice());
	                    	 cart.setTotal_items(cart.getTotal_items()-1);
	                    	 cartDao.saveorupdate(cart);
	                    	 cartItemsDao.delete(cartItems);
	                    	 return mv;
	                     }
	                     
	                     
	                     @RequestMapping(value="/RemoveAll")
	                     public String RemoveAllFromCart(Model model, HttpSession session)
	                     {
	                    	 Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
	                    	 if(!(authentication instanceof AnonymousAuthenticationToken))
	                    	 {
	                    		 String currusername=authentication.getName();
	                        	 User u=userDao.getEmail(currusername);
	                        	 Cart c=cartDao.getCart(u.getCart().getCart_Id());
	                        	 List<CartItems> cartItem=cartItemsDao.getlist(u.getCart().getCart_Id()); 
	                        	 for(CartItems c1:cartItem)
	                        	 {
	                        		 cartItemsDao.delete(c1);
	                        	 }
	                        	 c.setGrand_total(0.0);
	                        	 c.setTotal_items(0);
	                        	 cartDao.saveorupdate(c);
	                        	 session.setAttribute("items",c.getTotal_items());
	                        	 return "redirect:/checkout";                    	 
	                     }
	                     
	                     else
	                     {
	                    	 return ("redirect:/");
	                     }
	                     }
}
		
