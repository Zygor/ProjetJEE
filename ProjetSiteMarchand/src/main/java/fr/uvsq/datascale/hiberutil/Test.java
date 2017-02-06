package fr.uvsq.datascale.hiberutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import fr.uvsq.datascale.dao.AdresseDAO;
import fr.uvsq.datascale.dao.ArticleDAO;
import fr.uvsq.datascale.dao.CategorieDAO;
import fr.uvsq.datascale.dao.ClientDAO;
import fr.uvsq.datascale.dao.PanierDAO;
import fr.uvsq.datascale.modele.Adresse;
import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Categorie;
import fr.uvsq.datascale.modele.Client;
import fr.uvsq.datascale.modele.Panier;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	ClientDAO clDAO = new ClientDAO();
		AdresseDAO aDAO = new AdresseDAO () ;

		Adresse ad = new Adresse();
		Adresse ad1 = new Adresse();

		Adresse nouvadr1 = new Adresse();


		Adresse adr = new Adresse();
		Adresse adr1 = new Adresse();
		Adresse adr2 = new Adresse();

		ad.setCodePostal(92300);
		ad.setVille("Levallois Perret");
		ad.setAdresse("151 rue Louis Rouquier");


		ad1.setCodePostal(75001);
		ad1.setVille("Paris");
		ad1.setAdresse("15 rue de Rome");

		nouvadr1.setCodePostal(78000);
		nouvadr1.setVille("Versailles");
		nouvadr1.setAdresse("jjjjjjjjjjjjj");



		aDAO.insert(ad);
		aDAO.insert(ad1); 

		adr = aDAO.findByld(1) ;
		adr1 = aDAO.findByld(2) ;

		System.out.println(adr.getVille());
		System.out.println(adr1.getVille());

		adr = aDAO.findByld(1) ;
		System.out.println(adr.getAdresse()) ;
		System.out.println(adr.getIdAdresse()) ;

		//adr = aDAO.findByld(1) ;

		aDAO.update(1, nouvadr1) ;

		adr2 = aDAO.findByld(1) ;
		System.out.println("new:"+ adr2.getAdresse());


		//aDAO.delete(1) ;*/

		/* ArticleDAO artDAO = new ArticleDAO() ;
		CategorieDAO catDAO = new CategorieDAO() ;

		Categorie tel = new Categorie() ;
		Categorie ordi = new Categorie() ;

		tel.setNomCategorie("Portables");
		ordi.setNomCategorie("Ordinateurs");

		catDAO.insert(tel);
		catDAO.insert(ordi);

		Article a1 =  new Article();
		Article a2 =  new Article();
		Article a3 =  new Article();
		Article a4 =  new Article();

		a1.setNom("AB PC");
		a1.setCategorie(ordi);

		a2.setNom("Phone");
		a2.setCategorie(tel);

		a3.setNom("PC ADF");
		a3.setCategorie(ordi);

		a4.setNom("ABPCADF");
		a4.setCategorie(ordi);

		artDAO.insert(a1);
		artDAO.insert(a2);
		artDAO.insert(a3);
		artDAO.insert(a4);

			//List<Article> listart = artDAO.findByKeyWord("PC") ;

		List<Article> listart = artDAO.findByCategorie(ordi) ;
		System.out.println(ordi.getIdCategorie());
		System.out.println(listart.size());


		for (int i=0; i< listart.size(); i++) {

			System.out.println(listart.get(i).getIdArticle());
		}*/

		Categorie tel = new Categorie() ;
		Categorie ordi = new Categorie() ;

		tel.setNomCategorie("Portables");
		ordi.setNomCategorie("Ordinateurs");

		Article a1 =  new Article();
		Article a2 =  new Article();
		Article a3 =  new Article();
		Article a4 =  new Article();
		Article a5 =  new Article();

		a1.setNom("AB PC");
		a1.setCategorie(ordi);

		a2.setNom("Phone");
		a2.setCategorie(tel);

		a3.setNom("PC ADF");
		a3.setCategorie(ordi);

		a4.setNom("ABPCADF");
		a4.setCategorie(ordi);

		a5.setNom("galaxy s6");
		a5.setCategorie(tel);

		/*ArticleDAO artDAO = new ArticleDAO() ;
		artDAO.insert(a5);*/

		

		/*PanierDAO pDAO = new PanierDAO();

		Panier pan = new Panier() ;*/
		
		ClientDAO clDAO = new ClientDAO();

		Client cl1 = new Client () ;

		cl1.setGender("homme");
		cl1.setNom("migaou");
		//cl1.setPanierClient(pan);
	
		//clDAO.insert(cl1);
		
		Client cl2 = new Client () ;

		cl2.setGender("femme");
		cl2.setNom("saafi");
		//clDAO.insert(cl2);
		
	
		Client cli = clDAO.findByName("migaou") ;
		System.out.println(cli.getGender());
		//pDAO.insert(pan);
		
		
		/*	ArrayList<Article> ensemble = new ArrayList<Article>() ;


		ensemble.add(a1) ;
		ensemble.add(a2) ;
		//pan.setPrixTotal(50);

		pan.setEnsembleArticles(ensemble);*/


		




	}


}
