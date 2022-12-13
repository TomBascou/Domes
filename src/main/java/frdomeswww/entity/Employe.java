package frdomeswww.entity;

public class Employe extends User {
private String siret;
private String numeroSécu;
private Admin admin;


public Employe() {
	super();
	// TODO Auto-generated constructor stub
}


public final String getSiret() {
	return siret;
}
public final void setSiret(String siret) {
	this.siret = siret;
}
public final String getNumeroSécu() {
	return numeroSécu;
}
public final void setNumeroSécu(String numeroSécu) {
	this.numeroSécu = numeroSécu;
}
public final Admin getAdmin() {
	return admin;
}
public final void setAdmin(Admin admin) {
	this.admin = admin;
}

}
