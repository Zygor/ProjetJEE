package fr.uvsq.datascale.dao;

import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Client;
import fr.uvsq.datascale.modele.Panier;

public interface PanierHome extends HomeDAO<Panier> {

	void insert (Panier nouveau) ;

	boolean delete (int id) ;

	//boolean update (Panier amodifier) ;

	//boolean AjouterArticle (int idArticle) ;
	
	boolean AjouterArticle (int idPanier, Article art) ;

	boolean SupprimerArticle (int idArticle) ;

	boolean Augmenter_nombre_Article (int idArticle) ;

	boolean Diminuer_nombre_Article (int idArticle) ;

	boolean ViderPanier (int id) ;

	Panier findByld (int id) ;

	Panier findByldClient (int idClient) ;

}
