package com.niit.AutoSparesFrontEnd.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.AutoSpares.Dao.UserDAO;
import com.niit.AutoSpares.model.Cart;
import com.niit.AutoSpares.model.User;

@Controller
public class UserController 
{
	@Autowired
	User user;
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/User")
	public ModelAndView User()
	{
	ModelAndView MV=new ModelAndView();
	MV.addObject("user",new User());
	List<User> UserList = userDAO.userlist();
	MV.addObject("users",UserList);
	MV.setViewName("User");
	return MV ;
	}


	@RequestMapping("/addUser")
	public ModelAndView adduser(@ModelAttribute("user")User user)
	{
	ModelAndView MV=new ModelAndView();
	Cart c= new Cart();
	c.setUser(user);
	user.setCart(c);
	if(userDAO.saveorupdate(user)==true)
	{
	MV.addObject("Msg","User saved");
	}
	else
	{
	MV.addObject("Msg","User Not saved");
	}
	MV.setViewName("redirect:/User");
	return MV;
	}

}
