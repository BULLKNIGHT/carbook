package com.deloit.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "booking")
public class Booking {

	@Id
	private ObjectId bookid;
	private String carnumber;
	private String cusid;
	private String issuedate;
	private String returndate;
	public Booking() {
		super();
	}
	public Booking(ObjectId bookid, String carnumber, String cusid, String issuedate, String returndate) {
		super();
		this.bookid = bookid;
		this.carnumber = carnumber;
		this.cusid = cusid;
		this.issuedate = issuedate;
		this.returndate = returndate;
	}
	public String getBookid() {
		return bookid.toHexString();
	}
	public void setBookid(ObjectId bookid) {
		this.bookid = bookid;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getCusid() {
		return cusid;
	}
	public void setCusid(String cusid) {
		this.cusid = cusid;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	@Override
	public String toString() {
		return "Booking [bookid=" + bookid + ", carnumber=" + carnumber + ", cusid=" + cusid + ", issuedate="
				+ issuedate + ", returndate=" + returndate + "]";
	}
	
	
}
