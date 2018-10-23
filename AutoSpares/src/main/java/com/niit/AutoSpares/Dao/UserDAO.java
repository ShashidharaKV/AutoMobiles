package com.niit.AutoSpares.Dao;
import java.util.List;
import com.niit.AutoSpares.model.User;
public interface UserDAO 
{
	public boolean saveorupdate(User user);
	public boolean delete(User user);
	public User getUser(String ID);
	public List<User> userlist();
	public User isValid(String umail, String pwd);
	        
	
	}