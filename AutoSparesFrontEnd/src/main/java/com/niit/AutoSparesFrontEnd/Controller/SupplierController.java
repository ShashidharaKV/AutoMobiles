package com.niit.AutoSparesFrontEnd.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.AutoSpares.Dao.SupplierDAO;
import com.niit.AutoSpares.model.Supplier;



@Controller
public class SupplierController
{
	@Autowired
	Supplier supplier;
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/Supplier")
	public ModelAndView Supplier()
	{
	ModelAndView MV=new ModelAndView();
	MV.addObject("supplier",new Supplier());
	List<Supplier> supplierList = supplierDAO.supplierlist();
	MV.addObject("suppliers",supplierList);
	MV.setViewName("Supplier");
	return MV ;
	}


	@RequestMapping("/addSupplier")
	public ModelAndView addsupplier(@ModelAttribute("supplier")Supplier supplier)
	{
	ModelAndView MV=new ModelAndView();
	if(supplierDAO.saveorupdate(supplier)==true)
	{
	MV.addObject("Msg","Supplier saved");
	}
	else
	{
	MV.addObject("Msg","Supplier Not saved");
	}
	MV.setViewName("redirect:/Supplier");
	return MV;
	}

	@RequestMapping("/editSupplier/{supplierID}")
	public ModelAndView editsupplier(@PathVariable("supplierID")String ID)
	{ 
	ModelAndView MV=new ModelAndView("Supplier");
	supplier=supplierDAO.getSupplier(ID);
	MV.addObject("supplier",supplier);
	List<Supplier> supplierList = supplierDAO.supplierlist();
	MV.addObject("suppliers",supplierList);
	return MV;
	}

	@RequestMapping("/deleteSupplier/{supplierID}")
	public ModelAndView deletesupplier(@PathVariable("supplierID")String ID)
	{
	ModelAndView MV=new ModelAndView();
	supplier=supplierDAO.getSupplier(ID);
	if(supplierDAO.delete(supplier)==true)
	{
	MV.addObject("Msg1","Supplier deleted");
	}
	else
	{
	MV.addObject("Msg1","Supplier Not deleted");
	}
	MV.setViewName("redirect:/Supplier");
	return MV;
	}
}
