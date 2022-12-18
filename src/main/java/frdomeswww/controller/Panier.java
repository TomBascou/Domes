package frdomeswww.controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.ProductDaoMoc;
import frdomeswww.entity.Produit;
import frdomeswww.service.ServicePanier;

@WebServlet("/Panier")
public class Panier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Panier() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ProductDaoMoc dao = new ProductDaoMoc();
			ServicePanier sp = new ServicePanier();
			
			String recup = request.getParameter("idProduit");
			int idProduct= Integer.parseInt(recup);
			
			if(sp.addToCart(idProduct) == 1) {
				sp.addToCart(idProduct + 1);
				List<Produit> panier = sp.getProduits();
				System.out.println(panier);
				HttpSession session = request.getSession();
				session.setAttribute("panier", panier);	
		}
			getServletContext().getRequestDispatcher("/pages/panier.jsp").forward(request, response);

	}
	
}
