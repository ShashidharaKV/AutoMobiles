package com.niit.AutoSpares.Dao;
import java.util.List;

import com.niit.AutoSpares.model.Category;

public interface categoryDAO 
{
public boolean saveorupdate(Category category);
public boolean delete(Category category);
public Category getCategory(String ID);
public List<Category> catlist();
                                                           
}
