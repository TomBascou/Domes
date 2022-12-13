package frdomeswww.entity;

public class Customer extends User {
private String address;
private String city;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
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
