package fr.uvsq.datascale.dao;


import fr.uvsq.datasclale.modele.Promotion;

public interface PromotionHome extends HomeDAO<Promotion>{
	
	
	void insert (Promotion nouveau) ;

	boolean delete (int id) ;

	boolean update (Promotion amodifier) ;

	Promotion findByld (int id) ;

}
