package frdomeswww.entity;

public class Produit {
 private int id;
 private String name;
 private String descript;
 private int price;
 private int size;
 private String species;
 private String age;
 private String reference;
 
 
 
public Produit() {
	super();
}


@Override
public String toString() {
	return "Produit [id=" + id + ", name=" + name + ", descript=" + descript + ", price=" + price + ", size=" + size
			+ ", species=" + species + ", age=" + age + "]";
}


public final int getId() {
	return id;
}


public final void setId(int id) {
	this.id = id;
}


public final String getName() {
	return name;
}


public final void setName(String name) {
	this.name = name;
}


public final String getDescript() {
	return descript;
}


public final void setDescript(String descript) {
	this.descript = descript;
}


public final int getPrice() {
	return price;
}


public final void setPrice(int price) {
	this.price = price;
}


public final int getSize() {
	return size;
}


public final void setSize(int size) {
	this.size = size;
}


public final String getSpecies() {
	return species;
}


public final void setSpecies(String species) {
	this.species = species;
}


public final String getAge() {
	return age;
}


public final void setAge(String age) {
	this.age = age;
}


public String getReference() {
	return reference;
}


public void setReference(String reference) {
	this.reference = reference;
}



 
}
