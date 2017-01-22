package controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Article;

public class DeuxiemeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String nom = request.getParameter("LeNom");
	String prix = request.getParameter("LePrix");
	Article a = new Article(nom, Integer.parseInt(prix));
	HttpSession maSession = request.getSession(true);
	ArrayList<Article> panier = (ArrayList<Article>) maSession.getAttribute("lePanier");
	panier.add(a);
	getServletContext().getRequestDispatcher("/pageSuite.html").forward(request, response);

    }

}
