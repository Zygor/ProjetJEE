package fr.uvsq.datascale.dao;

import java.util.List;

import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Categorie;

public interface ArticleHome extends HomeDAO<Article> {

	void insert (Article nouveau) ;

	boolean delete (int id) ;

	boolean update (Article amodifier) ;

	Article findByld (int id) ;
	
	List<Article> findByKeyWord (String KeyWord) ;
	
	List<Article> findByCategorie (Categorie cg) ;
	
}
