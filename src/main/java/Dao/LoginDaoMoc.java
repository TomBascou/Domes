package Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import frdomeswww.entity.Login;

public class LoginDaoMoc {
	
	private List<Login> logins = new ArrayList();
	public LoginDaoMoc() {
		super();
		logins.add(new Login("Tom","prout",2));
		logins.add(new Login("Valentine","prout",3));
		logins.add(new Login("Ilyas","prout",4));
	}

	public String isValid(String login,String password) {
	 for (Login l : logins) {
		if(l.getLogin().equals(login)&&l.getPassword().equals(password)) {
			return l.getToken();
		} return "pas bon";
	}
	}
	q
}
