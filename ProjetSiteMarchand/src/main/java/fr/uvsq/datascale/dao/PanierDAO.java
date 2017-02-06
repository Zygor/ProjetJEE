package fr.uvsq.datascale.dao;

import java.util.Set;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Panier;

public class PanierDAO implements PanierHome {


	@Override
	public void insert(Panier nouveau) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
		try {

			tx =session.beginTransaction() ;
			session.save(nouveau) ;
			tx.commit();

		} catch (HibernateException e) {

			tx.rollback();
		}

	}

	@Override
	public boolean update(Panier amodifier) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	/*@Override
	public boolean AjouterArticle(int idArticle) {
		Panier pan = new Panier() ;
		Set<Article> ensemble = pan.getEnsembleArticles();
		ArticleDAO aDAO = new ArticleDAO() ;
		Article ar = aDAO.findByld(idArticle) ;
		try {

			ensemble.add(ar);

		} catch (Exception e){


		}

		return true;
	}*/
	
	@Override
	public boolean AjouterArticle(int idPanier, Article art) {
		Panier pan = findByld(idPanier) ;
		Set<Article> ensemble = pan.getEnsembleArticles();
		
		try {

			ensemble.add(art);

		} catch (Exception e){


		}

		return true;
	}
	
	
	
	@Override
	public boolean SupprimerArticle(int idArticle) {
		// TODO Auto-generated method stub

		Panier pan = new Panier() ;
		Set<Article> ensemble = pan.getEnsembleArticles();
		ArticleDAO aDAO = new ArticleDAO() ;
		Article ar = aDAO.findByld(idArticle) ;


		ensemble.remove(ar);




		return true;
	}

	@Override
	public boolean Augmenter_nombre_Article(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Diminuer_nombre_Article(int idArticle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ViderPanier(int id) {

		Panier pan = findByld(id) ;

		Set<Article> ensemble = pan.getEnsembleArticles();

		try {

			ensemble.removeAll(ensemble);


		} catch (Exception e){


		}

		return true;
	}

	@Override
	public Panier findByld(int id) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;

		Panier pan = new Panier () ;
		try {

			tx =session.beginTransaction() ;
			pan = (Panier) session.get(Panier.class,id);
			//session.flush() ;
			tx.commit();

		} catch (Exception e) {
			//e.printStackTrace();
			//tx.rollback();
			System.out.println("Article non trouvéeeee");
		} /*finally {
			if (session != null && session.isOpen()) {
				//session.close();
			}
		}*/
		return pan;
	}

	@Override
	public Panier findByldClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}



}
