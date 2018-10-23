package com.niit.AutoSpares.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product
{
	
	@Transient
	private MultipartFile pimg;
	
	
	
	public MultipartFile getPimg() {
		return pimg;
	}
	public void setPimg(MultipartFile pimg) {
		this.pimg = pimg;
	}


	@Id
private String ProductID;
private String Name;
private String Price;
private String Qty;
private String Description;

public Product()
{
	this.ProductID="P"+UUID.randomUUID().toString().substring(30).toUpperCase();
	
}


@ManyToOne
@JoinColumn(name="Category_ID")
private Category category;

@ManyToOne
@JoinColumn(name="ID")
private Supplier supplier;

public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public String getProductID(){
	return ProductID;
}
public void setProductID(String productID) {
	ProductID = productID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	Price = price;
}
public String getQty() {
	return Qty;
}
public void setQty(String qty) {
	Qty = qty;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}


}
