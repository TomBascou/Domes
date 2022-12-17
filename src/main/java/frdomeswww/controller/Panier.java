package frdomeswww.controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.ProductDaoMoc;

@WebServlet("/panier")
public class Panier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Panier() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("zzz");
			ProductDaoMoc dao = new ProductDaoMoc();
			String recup = request.getParameter("idProduit");
			int idProduct= Integer.parseInt(recup);
			if(dao.getProduct(idProduct) != null) {
				HttpSession session = request.getSession();
				session.setAttribute("produit" + idProduct, dao.getProduct(idProduct));	
		}
			getServletContext().getRequestDispatcher("pages/panier.jsp").forward(request, response);

	}
	
}
