package fr.uvsq.datascale.dao;

public interface HomeDAO<T> {
	
    void insert (T nouveau) ;
	
	boolean delete (int id) ;
	
	boolean update (T amodifier) ;
	
	T findByld (int id) ;
 
}
