package fr.uvsq.datascale.hiberutil;


import fr.uvsq.datascale.dao.ClientDAO;
import fr.uvsq.datascale.modele.Client;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Client cl = new Client () ;
		
		cl.setNom("aaa");
		
		ClientDAO clDAO = new ClientDAO() ;
		
		clDAO.insert(cl);
		

	}

}