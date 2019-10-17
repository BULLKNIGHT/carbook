package com.deloit.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "customer")
public class Customer {
	
	@Id
	private String cusid;
	private String name;
	private String bookid;
	
	public Customer() {
		super();
	}

	public Customer(String cusid, String name, String bookid) {
		super();
		this.cusid = cusid;
		this.name = name;
		this.bookid = bookid;
	}

	public String getCusid() {
		return cusid;
	}

	public void setCusid(String cusid) {
		this.cusid = cusid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", name=" + name + ", bookid=" + bookid + "]";
	}
		
}
