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
public class Billing
{
	 @Id
	    private String Billing_Id;
	   	private String Billing_Name;
	   	private String Billing_Address;
	   	private String Billing_Phoneno;
	   	
	   	public Billing()
	   	{
	   		this.Billing_Id="BILL"+UUID.randomUUID().toString().substring(30).toUpperCase();
	   		
	   	}
	   	
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="UserId")
		private User user;

		public String getBilling_Id() {
			return Billing_Id;
		}

		public void setBilling_Id(String billing_Id) {
			Billing_Id = billing_Id;
		}

		public String getBilling_Name() {
			return Billing_Name;
		}

		public void setBilling_Name(String billing_Name) {
			Billing_Name = billing_Name;
		}

		public String getBilling_Address() {
			return Billing_Address;
		}

		public void setBilling_Address(String billing_Address) {
			Billing_Address = billing_Address;
		}

		public String getBilling_Phoneno() {
			return Billing_Phoneno;
		}

		public void setBilling_Phoneno(String billing_Phoneno) {
			Billing_Phoneno = billing_Phoneno;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
}
