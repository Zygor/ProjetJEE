package fr.uvsq.datascale.dao;

import fr.uvsq.datasclale.modele.Categorie;

public interface CategorieHome extends HomeDAO<Categorie> {


	void insert (Categorie nouveau) ;

	boolean delete (int id) ;

	boolean update (Categorie amodifier) ;

	Categorie findByld (int id) ;

}
