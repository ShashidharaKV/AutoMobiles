package com.niit.AutoSpares.Dao;

import java.util.List;

import com.niit.AutoSpares.model.Authentication;

public interface AuthenticationDAO 
{

	public boolean saveorupdate(Authentication authentication);
	public boolean delete(Authentication authentication);
	public Authentication getAuthentication(String rID);
	public List<Authentication> authenticationlist();
	
}
