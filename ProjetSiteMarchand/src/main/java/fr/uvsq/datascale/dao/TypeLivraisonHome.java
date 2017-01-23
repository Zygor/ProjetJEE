package fr.uvsq.datascale.dao;


import fr.uvsq.datasclale.modele.TypeLivraison;

public interface TypeLivraisonHome extends HomeDAO<TypeLivraison> {
	
	
	void insert (TypeLivraison nouveau) ;

	boolean delete (int id) ;

	boolean update (TypeLivraison amodifier) ;

	TypeLivraison findByld (int id) ;

}
