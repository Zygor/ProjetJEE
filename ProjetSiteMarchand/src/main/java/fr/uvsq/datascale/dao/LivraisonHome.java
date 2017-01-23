package fr.uvsq.datascale.dao;

import fr.uvsq.datascale.modele.Livraison;


public interface LivraisonHome extends HomeDAO<Livraison> {

	
	
	void insert (Livraison nouveau) ;

	boolean delete (int id) ;

	//boolean update (Livraison amodifier) ;

	Livraison findByld (int id) ;
	
	Livraison findByIdCommande(int idCommande) ;
	
	void afficher_details (int id) ;
	
	
}
