package fr.uvsq.datascale.dao;

import fr.uvsq.datasclale.modele.Adresse;

public interface AdresseHome extends HomeDAO<Adresse> {
	
    void insert (Adresse nouveau) ;
	
	boolean delete (int id) ;
	
	boolean update (Adresse amodifier) ;
	
	Adresse findByld (int id) ;

}
