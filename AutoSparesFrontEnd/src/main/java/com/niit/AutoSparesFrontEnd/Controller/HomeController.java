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

import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.User;

@Controller
public class HomeController
{
	@Autowired
	Category category;
	@Autowired
	categoryDAO categoryDao;
	@Autowired
	Product product;
	@Autowired
	ProductDAO productDao;

	@RequestMapping("/")
    public String home(Model model)
	{
		List<Category> catlist=categoryDao.catlist();
		model.addAttribute("categories", catlist);
		List<Product> prodlist=productDao.productlist();
		model.addAttribute("products", prodlist);
	return "index";	
	}
	
	@RequestMapping("/header")
	public String header()
	{
		return "header";
	}


	@RequestMapping("/footer")
	public String footer()
	{
		return "footer";
	}
	

	@RequestMapping("/carbumpers")
	public String carbumpers(Model model)
	{
		List<Product> prodlist=productDao.productlist();
		model.addAttribute("products", prodlist);
		return "carbumpers";
	}
	
	@RequestMapping("/singlepage/{ProductID}")
	public String singlepage(@PathVariable("ProductID")String prodId, Model model)
	{
		product=productDao.getProduct(prodId);
		model.addAttribute("pro", product);
		return "singlepage";
	}
	
	
}
