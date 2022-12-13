package frdomeswww.entity;

import java.util.ArrayList;
import java.util.Date;

public class Commande {
	private int id;
	private Panier panier;
	private int prix;
	private Date date;
	private Employe customer;
	
	
	public Commande() {
		super();
	}
	@Override
	public String toString() {
		return "Commande [id=" + id  + ", prix=" + prix + ", date=" + date + ", customer="
				+ customer + "]";
	}
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final int getPrix() {
		return prix;
	}
	public final void setPrix(int prix) {
		this.prix = prix;
	}
	public final Date getDate() {
		return date;
	}
	public final void setDate(Date date) {
		this.date = date;
	}
	public final Employe getCustomer() {
		return customer;
	}
	public final void setCustomer(Employe customer) {
		this.customer = customer;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
}
