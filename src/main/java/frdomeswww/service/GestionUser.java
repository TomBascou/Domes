package frdomeswww.service;

import Dao.LoginDaoMoc;
import frdomeswww.entity.Login;

public interface GestionUser {
    LoginDaoMoc dao = new LoginDaoMoc();

//toutes les fonction pour maipuler les users
    public default int isValid(String login, String password) {
        return (dao.isValid(login, password));
        };
    public default  void nouveauLogin(Login l) {};
}