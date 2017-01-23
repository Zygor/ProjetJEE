package fr.uvsq.datascale.dao;

import fr.uvsq.datasclale.modele.Article;
import fr.uvsq.datasclale.modele.Categorie;

public interface ArticleHome extends HomeDAO<Article> {

	void insert (Article nouveau) ;

	boolean delete (int id) ;

	boolean update (Article amodifier) ;

	Article findByld (int id) ;
	
	Article findByKeyWord (String KeyWord) ;
	
	Article findByCategorie (Categorie cg) ;
	
}
