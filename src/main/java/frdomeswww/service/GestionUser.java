package frdomeswww.service;

import frdomeswww.entity.Login;

public interface GestionUser {
//toutes les fonction pour maipuler les users
	public default void isValid() {};
	public default  void nouveauLogin(Login l) {};
}
