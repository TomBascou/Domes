package frdomeswww.service;

import java.util.ArrayList;
import java.util.List;

import Dao.LoginDaoMoc;
import Dao.ProductDaoMoc;
import frdomeswww.entity.Produit;

public class ServicePanier {
	ProductDaoMoc dao = new ProductDaoMoc();
	
	List<Produit> produits = new ArrayList<Produit>();
	
	public int addToCart(int id) {
		if(produits.add(dao.getProduct(id))) {
			System.out.println(produits);
			return 1;
		}
		return 0;
		
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
}
