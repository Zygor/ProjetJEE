package fr.uvsq.datascale.dao;


import fr.uvsq.datascale.modele.CoordBancaire;

public interface CoorBancaireHome extends HomeDAO<CoordBancaire> {
	
	void insert (CoordBancaire nouveau) ;

	boolean delete (int id) ;

	boolean update (CoordBancaire amodifier) ;

	CoordBancaire findByld (int id) ;

}
