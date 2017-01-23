package fr.uvsq.datascale.dao;

import fr.uvsq.datasclale.modele.Article;
import fr.uvsq.datasclale.modele.Client;

public interface ClientHome extends HomeDAO<Client> {

	
	
	void insert (Client nouveau) ;

	boolean delete (int id) ;

	boolean update (Client amodifier) ;

	Client findByld (int id) ;
	
	Client findByName (String name) ;
	
	Client findByLogin (String login) ;
	
	boolean checkPassword(String LoginClient, String password);
}
