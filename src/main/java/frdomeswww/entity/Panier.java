package frdomeswww.entity;

import java.util.ArrayList;

public class Panier {

	ArrayList<Produit> productlist;
	int totalprice;
	Customer client;
	
	
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	public final ArrayList<Produit> getProductlist() {
		return productlist;
	}
	public final void setProductlist(ArrayList<Produit> productlist) {
		this.productlist = productlist;
	}
	public final int getTotalprice() {
		return totalprice;
	}
	public final void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public final Customer getClient() {
		return client;
	}
	public final void setClient(Customer client) {
		this.client = client;
	}
	
	
}
