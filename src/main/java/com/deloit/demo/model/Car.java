package com.deloit.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "car")
public class Car {
	 
	@Id
	private String carnumber;
	private String model;
	private int capacity;
	private String rent;
	private boolean available;
	private String bookid;
	
	public Car() {
		super();
	}
	
	public Car(String carnumber, String model, int capacity, String rent, boolean available, String bookid) {
		super();
		this.carnumber = carnumber;
		this.model = model;
		this.capacity = capacity;
		this.rent = rent;
		this.available = available;
		this.bookid = bookid;
	}



	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Car [carnumber=" + carnumber + ", model=" + model + ", capacity=" + capacity + ", rent=" + rent
				+ ", available=" + available + ", bookid=" + bookid + "]";
	}

	
}
