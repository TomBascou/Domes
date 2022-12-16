package frdomeswww.service;

import javax.servlet.http.HttpSession;

import Dao.LoginDaoMoc;
import frdomeswww.entity.Login;

public class GestionLoginImpl implements GestionUser {
LoginDaoMoc dao = new LoginDaoMoc();

@Override
public int isValid(String login, String password) {
    System.out.println(dao.isValid(login, password));
    return (dao.isValid(login, password));
}

@Override
public void nouveauLogin(Login l) {
    // TODO Auto-generated method stub
    dao.createLogin(l);
    
}

}
