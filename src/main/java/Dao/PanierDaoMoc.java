package Dao;

import java.util.ArrayList;
import java.util.List;

import frdomeswww.entity.Login;
import frdomeswww.entity.Produit;

public class PanierDaoMoc {
    static int indexPanier = 1;
    
    private List<Produit> products = new ArrayList();
    public PanierDaoMoc() {
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
        nouvLogin.setToken(indexPanier);
        indexPanier++;
        logins.add(nouvLogin);
        
    }
    
}
