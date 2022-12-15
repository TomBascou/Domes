package frdomeswww.entity;

import java.util.Date;

public class  User{
	protected int id;
	protected String lname;
	protected String fname;
	protected String mail;
	protected String tel;
	protected Date CreationDate;
	protected int token;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", lname=" + lname + ", fname=" + fname + ", mail=" + mail + ", tel=" + tel
				+ "]";
	}


	public User() {
		super();
	}


	public User(int id, String lname, String fname, String mail, String tel, Date creationDate, int token) {
		super();
		this.id = id;
		this.lname = lname;
		this.fname = fname;
		this.mail = mail;
		this.tel = tel;
		CreationDate = creationDate;
		this.token = token;
	}


	//getters & setters
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getLname() {
		return lname;
	}
	public final void setLname(String lname) {
		this.lname = lname;
	}
	public final String getFname() {
		return fname;
	}
	public final void setFname(String fname) {
		this.fname = fname;
	}
	public final String getMail() {
		return mail;
	}
	public final void setMail(String mail) {
		this.mail = mail;
	}
	public final String getTel() {
		return tel;
	}
	public final void setTel(String tel) {
		this.tel = tel;
	}


	public Date getCreationDate() {
		return CreationDate;
	}


	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}


}
