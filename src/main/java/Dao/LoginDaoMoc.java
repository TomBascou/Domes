package Dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import frdomeswww.entity.Login;
import frdomeswww.entity.User;

public class LoginDaoMoc {
    static int indexlogin = 1;
    
    private List<Login> logins = new ArrayList();
    public LoginDaoMoc() {
        super();
        logins.add(new Login("Tom","prout",2));
        logins.add(new Login("Valentine","prout",3));
        logins.add(new Login("Ilyas","prout",4));
    }
    
    public int isValid(String log,String password) {
     for (Login l : logins) {
         System.out.println("---" + l.getLogin());
        if(l.getLogin().equals(log)&&l.getPassword().equals(password)) {
            return l.getToken();
        }
    }
    return 0;
    }
    
    public void createLogin(Login nouvLogin) {
        nouvLogin.setToken(indexlogin);
        indexlogin++;
        logins.add(nouvLogin);
        
    }
    
}