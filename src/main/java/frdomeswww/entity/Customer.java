package frdomeswww.entity;

import java.util.Date;

public class Customer extends User {
private String address;
private String city;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


public Customer(String address, String city,int id, String lname, String fname, String mail, String tel, Date creationDate, int token) {
	super(id, lname, fname, mail, tel, creationDate, token);
	this.address = address;
	this.city = city;
}


public final String getAddress() {
	return address;
}


public final void setAddress(String address) {
	this.address = address;
}


public final String getCity() {
	return city;
}


public final void setCity(String city) {
	this.city = city;
}

}
