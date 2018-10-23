package com.niit.AutoSparesFrontEnd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.AutoSpares.Dao.ProductDAO;
import com.niit.AutoSpares.Dao.SupplierDAO;
import com.niit.AutoSpares.Dao.categoryDAO;
import com.niit.AutoSpares.FileInput.FileInput;
import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.model.Product;
import com.niit.AutoSpares.model.Supplier;

@Controller
public class ProductController 
{

	@Autowired
	Product product;
	@Autowired
	ProductDAO productDAO;
	

	@Autowired
	Category category;
	@Autowired
	categoryDAO categoryDAO;
	
	@Autowired
	Supplier supplier;
	@Autowired
	SupplierDAO supplierDAO;
	
	String path="C:\\Users\\Dell\\eclipse-workspace\\AutoSparesFrontEnd\\src\\main\\webapp\\resources\\images\\";
	
	
	@RequestMapping("/Product")
	public ModelAndView Product()
	{
	ModelAndView MV=new ModelAndView();
	MV.addObject("product",new Product());
	List<Product> productList = productDAO.productlist();
	MV.addObject("products",productList);
	List<Category> catList=categoryDAO.catlist();
	List<Supplier> supplierList=supplierDAO.supplierlist();
	MV.addObject("categories",catList);
	MV.addObject("suppliers",supplierList);
	MV.setViewName("Product");
	return MV ;
	}

   
	@RequestMapping("/addproduct")
	public ModelAndView addproduct(@ModelAttribute("product")Product product)
	{
	ModelAndView MV=new ModelAndView();

	FileInput.upload(path, product.getPimg(), product.getProductID()+".jpg");
	if(productDAO.saveorupdate(product)==true)
	{
	MV.addObject("Msg","Product saved");
	}
	else
	{
	MV.addObject("Msg","Product Not saved");
	}
	MV.setViewName("redirect:/Product");
	return MV;
	}


	@RequestMapping("/editProduct/{ProductID}")
	public ModelAndView editProduct(@PathVariable("ProductID")String ID)
	{ 
	ModelAndView MV=new ModelAndView("Product");
	product=productDAO.getProduct(ID);
	MV.addObject("product",product);
	List<Product> List = productDAO.productlist();
	MV.addObject("products",List);
	List<Category> catList=categoryDAO.catlist();
	List<Supplier> supplierList=supplierDAO.supplierlist();
	MV.addObject("categories",catList);
	MV.addObject("suppliers",supplierList);
	return MV;
	}


	@RequestMapping("/deleteproduct/{ProductID}")
	public ModelAndView deleteproduct(@PathVariable("ProductID")String ID)
	{
	ModelAndView MV=new ModelAndView();
	product=productDAO.getProduct(ID);
	if(productDAO.delete(product)==true)
	{
	MV.addObject("Msg1","Product deleted");
	}
	else
	{
	MV.addObject("Msg1","Product Not deleted");
	}
	MV.setViewName("redirect:/Product");
	return MV;
	}

}
