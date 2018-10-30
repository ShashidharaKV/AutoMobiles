package com.niit.AutoSpares.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class User
{
	@Id
private String UserID;
private String Name;
private String Email_ID;
private String Password;
private String PhNo;
private String Address;
public User()
{
	this.UserID="USR"+UUID.randomUUID().toString().substring(30).toUpperCase();
	
}

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Billing_Id")
private Billing billing;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Cart_Id")
private Cart cart;


public String getUserID() {
	return UserID;
}
public void setUserID(String userID) {
	UserID = userID;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
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
public String getPhNo() {
	return PhNo;
}
public void setPhNo(String phNo) {
	PhNo = phNo;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Billing getBilling() {
	return billing;
}
public void setBilling(Billing billing) {
	this.billing = billing;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}

}
