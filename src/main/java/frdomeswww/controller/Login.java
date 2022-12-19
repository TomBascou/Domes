package frdomeswww.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import frdomeswww.service.GestionLoginImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;   
    
    private GestionLoginImpl gestionLogin = new GestionLoginImpl();
    
    public Login() {
        super();
    }
    
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        
        System.out.println(login + password);
        System.out.println(this.gestionLogin.isValid(login, password));
        if(this.gestionLogin.isValid(login, password) == 0) {
            getServletContext().getRequestDispatcher("/login.html").forward(request, response);
            
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("login", login);
            session.setAttribute("token", this.gestionLogin.isValid(login, password));
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

}