package com.niit.AutoSparesFrontEnd.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.AutoSpares.model.Category;
import com.niit.AutoSpares.Dao.categoryDAO;
@Controller
public class categoryController
{
	@Autowired
	Category category;
	@Autowired
	categoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public ModelAndView Categoryform()
	{
	ModelAndView MV=new ModelAndView();
	MV.addObject("category",new Category());
	List<Category> catList = categoryDAO.catlist();
	MV.addObject("categories",catList);
	MV.setViewName("category");
	return MV ;
	}


	@RequestMapping("/addcategory")
	public ModelAndView addcategory(@ModelAttribute("category")Category category)
	{
	ModelAndView MV=new ModelAndView();
	if(categoryDAO.saveorupdate(category)==true)
	{
	MV.addObject("Msg","Category saved");
	}
	else
	{
	MV.addObject("Msg","Category Not saved");
	}
	MV.setViewName("redirect:/category");
	return MV;
	}


	@RequestMapping("/editcategory/{CategoryID}")
	public ModelAndView editcategory(@PathVariable("CategoryID")String catID)
	{ 
	ModelAndView MV=new ModelAndView("category");
	category=categoryDAO.getCategory(catID);
	MV.addObject("category",category);
	List<Category> catList = categoryDAO.catlist();
	MV.addObject("categories",catList);
	return MV;
	}


	@RequestMapping("/deletecategory/{CategoryID}")
	public ModelAndView deletecategory(@PathVariable("CategoryID")String catID)
	{
	ModelAndView MV=new ModelAndView();
	if(categoryDAO.delete(category)==true)
	{
	MV.addObject("Msg1","category deleted");
	}
	else
	{
	MV.addObject("Msg1","Category Not deleted");
	}
	MV.setViewName("redirect:/category");
	return MV;
	}

}
