package Dao;
import java.util.ArrayList;
import frdomeswww.entity.Customer;
import frdomeswww.entity.Login;

public class ClientDaoMoc {
ArrayList<Customer> listClient;
LoginDaoMoc loginDao = new LoginDaoMoc();

public ClientDaoMoc() {
	super();
	
}

public int createclient(String name, String password){
	Login login = new Login(name, password,0);
	this.loginDao.createLogin(login);
	int token = login.getToken();
	Customer newCustomer = new Customer(login.getLogin(),"", 0, null, null, null, null, null, token);
	return token;}

public Customer findClientbyId(){
	return null;
	
}
}