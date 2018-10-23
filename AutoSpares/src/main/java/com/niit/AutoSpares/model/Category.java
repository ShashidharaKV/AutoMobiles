package com.niit.AutoSpares.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category
{
	@Id
private String CategoryID;
private String Categoryname;

public Category()
{
	this.CategoryID="CAT"+UUID.randomUUID().toString().substring(30).toUpperCase();
	
}

@OneToMany(mappedBy="category")
private List<Product> product;

public String getCategoryID() {
	return CategoryID;
}
public void setCategoryID(String categoryID) {
	CategoryID = categoryID;
}
public String getCategoryname() {
	return Categoryname;
}
public void setCategoryname(String categoryname) {
	Categoryname = categoryname;
}
public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}

 
}
