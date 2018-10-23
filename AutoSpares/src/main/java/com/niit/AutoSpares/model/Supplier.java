package com.niit.AutoSpares.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier
{
	@Id
private String supplierID;
private String Name;
private String Address;
private String Phno;
private String Email_ID;
private String Password;

public Supplier()
{
	this.supplierID="Sup"+UUID.randomUUID().toString().substring(30).toUpperCase();
	
}

public String getSupplierID() {
	return supplierID;
}
public void setSupplierID(String supplierID) {
	this.supplierID = supplierID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}

@OneToMany
(mappedBy="supplier", cascade=CascadeType.ALL)
private List<Product> product;

public void setAddress(String address) {
	Address = address;
}
public String getPhno() {
	return Phno;
}
public void setPhno(String phno) {
	Phno = phno;
}
public String getEmail_ID() {
	return Email_ID;
}
public void setEmail_ID(String email_ID) {
	Email_ID = email_ID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}


}
