package frdomeswww.service;

import Dao.LoginDaoMoc;
import frdomeswww.entity.Login;

public class GestionLoginImpl implements GestionUser {
LoginDaoMoc dao = new LoginDaoMoc();

@Override
public void isValid() {
	// TODO Auto-generated method stub
	
}

@Override
public void nouveauLogin(Login l) {
	// TODO Auto-generated method stub
	dao.createLogin(l);
	
}

}
