package frdomeswww.entity;

public class Chien extends Produit{
	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String breed;
	private String coat;
	
	
	
	@Override
	public String toString() {
		return "Chat [breed=" + breed + ", coat=" + coat + "]";
	}
	public final String getBreed() {
		return breed;
	}
	public final void setBreed(String breed) {
		this.breed = breed;
	}
	public final String getCoat() {
		return coat;
	}
	public final void setCoat(String coat) {
		this.coat = coat;
	}
	
}
