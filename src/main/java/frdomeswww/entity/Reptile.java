package frdomeswww.entity;

public class Reptile extends Produit{

public Reptile() {
		super();
		// TODO Auto-generated constructor stub
	}
private String Race;
 private String Specie;
 private String Age;
 private int qty;
 
 
 @Override
	public String toString() {
		return "Reptile [Race=" + Race + ", Specie=" + Specie + ", Age=" + Age + ", qty=" + qty + "]";
	}
 
 
public final String getRace() {
	return Race;
}
public final void setRace(String race) {
	Race = race;
}
public final String getSpecie() {
	return Specie;
}
public final void setSpecie(String specie) {
	Specie = specie;
}

public final int getQty() {
	return qty;
}
public final void setQty(int qty) {
	this.qty = qty;
}
 
 
}
