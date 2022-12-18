package Dao;

import java.util.ArrayList;
import java.util.List;

import frdomeswww.entity.Chat;
import frdomeswww.entity.Chien;
import frdomeswww.entity.Login;
import frdomeswww.entity.Produit;
import frdomeswww.entity.Reptile;

public class ProductDaoMoc {
    static int indexPanier = 1;
    
    private List<Produit> products = new ArrayList();
    public ProductDaoMoc() {
        super();
        products.add(new Chien(1, "rox", "Un bon ptit gars", 47, 7, "Chien", "7",
        		"Chien1","husky","doux"));
        products.add(new Chat(2, "vanille", "Une bonne ptite gaillarde", 47, 7, "Chat", "7",
        		"Chat1","Maine Coon","poil long"));
        products.add(new Reptile(3, "coco", "Un bon ptit gars", 47, 7, "Reptile", "7",
        		"Gecko1","Guecko","Phelsuma",4));
    }
    
    public Produit getProduct(int idProduit) {
    	for (Produit p : products) {
           if(p.getId() == idProduit) {
        	   //rajouter en session
        	   System.out.println(p);
        	   return p;
           }
       }
    	return null;
    }

    public List<Produit> getAllProducts(){
    	return products;
    }
    
}
