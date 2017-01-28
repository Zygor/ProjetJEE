package fr.uvsq.datascale.hiberutil;

import fr.uvsq.datascale.dao.AdresseDAO;
import fr.uvsq.datascale.dao.ClientDAO;
import fr.uvsq.datascale.modele.Adresse;
import fr.uvsq.datascale.modele.Client;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientDAO clDAO = new ClientDAO();
		AdresseDAO aDAO = new AdresseDAO () ;

		Adresse ad = new Adresse();
		Adresse ad1 = new Adresse();
		
		Adresse adr = new Adresse();
		Adresse adr1 = new Adresse();

		ad.setCodePostal(92300);
		ad.setVille("Levallois Perret");


		ad1.setCodePostal(75001);
		ad1.setVille("Paris");

		//aDAO.insert(ad);
		//aDAO.insert(ad1); 

		/*adr = aDAO.findByld(1) ;
		adr1 = aDAO.findByld(2) ;

		System.out.println(adr.getVille());
		System.out.println(adr1.getVille());*/

		aDAO.delete(1) ;
		/*Client cl = new Client();

		cl.setNom("bb");
		cl.setPrenom("aa");
		clDAO.insert(cl);*/


		//System.out.println("aaaa");

		//Client c = new Client () ;
		/*Client c =	clDAO.findByld(1) ;

		System.out.println(c.getNom()) ;
		System.out.println(c.getGender()) ;
		System.out.println(c.getPrenom()) ;
		 */

	}




}
