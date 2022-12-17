package frdomeswww.entity;

public class Chat extends Produit{
	public Chat(int id, String name, String descript, int price, int size, String species, String age,
			String reference, String breed, String coat) {
		super(id, name, descript, price, size, species, age, reference);
		this.breed = breed;
		this.coat = coat;
	}
	public Chat() {
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
