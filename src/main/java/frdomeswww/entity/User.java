package frdomeswww.entity;

import java.util.Date;

public class  User{
	private int id;
	private String lname;
	private String fname;
	private String mail;
	private String tel;
	private Date CreationDate;
	private String token;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", lname=" + lname + ", fname=" + fname + ", mail=" + mail + ", tel=" + tel
				+ "]";
	}


	public User() {
		super();
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
