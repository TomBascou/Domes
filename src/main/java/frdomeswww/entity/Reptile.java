package frdomeswww.entity;

public class Reptile extends Produit{


public Reptile(int id, String name, String descript, int price, int size, String species, String age,
		String reference, String race, String specific, int qty) {
		super(id, name, descript, price, size, species, age, reference);
		this.race = race;
		this.specific = specific;
		this.qty = qty;
	}

private String race;
private String specific;
private int qty;
 
 @Override
	public String toString() {
		return "Reptile [Race=" + race + ", Specie=" + specific + ", qty=" + qty + "]";
	}
 
 
public final String getRace() {
	return race;
}
public final void setRace(String race) {
	this.race = race;
}
public final String getSpecie() {
	return specific;
}
public final void setSpecie(String specie) {
	this.specific = specie;
}

public final int getQty() {
	return qty;
}
public final void setQty(int qty) {
	this.qty = qty;
}
 
 
}
