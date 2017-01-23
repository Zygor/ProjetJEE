package fr.uvsq.datascale.dao;

import fr.uvsq.datascale.modele.Categorie;
import fr.uvsq.datascale.modele.Commande;

public interface CommandeHome extends HomeDAO<Commande> {
	
	void insert (Commande nouveau) ;

	boolean delete (int id) ;

	boolean update (Commande amodifier) ;

	Commande findByld (int id) ;
	
	Commande findByNomClient(String name) ;
	
	String affichier_status (int id);
}
