package fr.uvsq.datascale.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datascale.modele.Article;

import fr.uvsq.datascale.modele.Categorie;


public class ArticleDAO implements ArticleHome {

	@Override
	public void insert(Article nouveau) {
		// TODO Auto-generated method stub
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
	public boolean delete(int id) {
		try {
			Transaction tx = null ;

			Session session =  HibernateUtil.currentSession() ;
			Article art = new Article () ;
			art = findByld(id);
			tx =session.beginTransaction() ;
			session.delete(art);
			session.flush() ;
			tx.commit();
			return true;
			
		}catch (Exception e) {

			System.out.println("Article non trouvé");
			return false ;
		}
	}

	@Override
	public boolean update(Article amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Article findByld(int id) {

		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;

		Article art = new Article () ;
		try {

			tx =session.beginTransaction() ;
			art = (Article) session.get(Article.class,id);
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
		return art;
	}


@Override
public List<Article> findByKeyWord(String KeyWord) {
	Transaction tx = null ;

	Session session =  HibernateUtil.currentSession() ;
	List<Article> results =null;
	
	try {

		tx =session.beginTransaction() ;
		String hql = "select * from Articles where nom like :mot" ;
		SQLQuery query = session.createSQLQuery(hql).addEntity(Article.class);
		//((SQLQuery) query).addEntity(Article.class) ;
		query.setParameter("mot","%"+KeyWord+"%");
		
		
		results = query.list();
		tx.commit();
		
		
	} catch (Exception e) {

		tx.rollback();
		System.out.println("rien de trouvé");
		//return null ;
	}
	return results;

}


@Override
public List<Article> findByCategorie(Categorie cg) {
	
	Transaction tx = null ;

	Session session =  HibernateUtil.currentSession() ;
	List<Article> results =null;
	
	try {

		tx =session.beginTransaction() ;
		String hql = "select * from Articles where categorie_idCategorie = :idcat" ;
		SQLQuery query = session.createSQLQuery(hql).addEntity(Article.class);
		//((SQLQuery) query).addEntity(Article.class) ;
		query.setParameter("idcat",cg.getIdCategorie());
		results = query.list();
		tx.commit();
			
	} catch (Exception e) {

		tx.rollback();
		System.out.println("rien de trouvé");
		//return null ;
	}
	return results;
}

}
