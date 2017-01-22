package controleur;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.Article;

public class PremiereServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// recuperer les parametres
	String login = request.getParameter("LeNom");
	String mdp = request.getParameter("LePasse");

	// aller vers pageSuite.html
	if (login.equals("titi") && mdp.equals("titi")) {

	    ArrayList<Article> panier = new ArrayList<Article>();
	    // tableau soit connecté
	    // demander/le tableau de session
	    HttpSession maSession = request.getSession(true);
	    // ajouter panier aux variables de la sessions
	    maSession.setAttribute("lePanier", panier);

	    getServletContext().getRequestDispatcher("/pageSuite.html").forward(request, response);
	}
	// retour vers page index.html
	else {
	    getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}
    }

}
