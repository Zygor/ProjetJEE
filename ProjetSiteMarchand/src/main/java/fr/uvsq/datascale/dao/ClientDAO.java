package fr.uvsq.datascale.dao;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datascale.modele.Article;
import fr.uvsq.datascale.modele.Client;
import fr.uvsq.datascale.modele.Panier;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class ClientDAO implements ClientHome {

	@Override
	public void insert(Client nouveau) {

		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
		try {
			PanierDAO pDAO	= new PanierDAO() ;
			Panier pan = new Panier () ;
			nouveau.setPanierClient(pan);
			pDAO.insert(pan);
			
			tx =session.beginTransaction() ;
			session.save(nouveau) ;
			tx.commit();

		} catch (HibernateException e) {

			tx.rollback();
		}
	}

	@Override
	public Client findByld(int id) {

		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
		//Session session = null;
		Client cli = new Client () ;
		try {
			//session = HibernateUtil.getSessionFactory().openSession();
			//session =  HibernateUtil.currentSession() ;
			tx =session.beginTransaction() ;
			cli = (Client) session.get(Client.class,id);
			tx.commit();

			//Hibernate.initialize(Client);
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();

		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return cli;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client amodifier) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Client findByName(String name) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
	
		Client result = new Client () ;

		try {

			tx =session.beginTransaction() ;
			String hql = "select * from Clients where nom = :name" ;
			Query query = session.createSQLQuery(hql).addEntity(Client.class);
			//((SQLQuery) query).addEntity(Article.class) ;
			query.setParameter("name",name);
			//result = query.list();
			result = (Client) query.uniqueResult() ;
			tx.commit();

		} catch (Exception e) {

			tx.rollback();
			System.out.println("rien de trouvé");
			//return null ;
		}
		return result;
	}

	@Override
	public Client findByLogin(String login) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
	
		Client result = new Client () ;

		try {

			tx =session.beginTransaction() ;
			String hql = "select * from Clients where mail = :log" ;
			Query query = session.createSQLQuery(hql).addEntity(Client.class);
			//((SQLQuery) query).addEntity(Article.class) ;
			query.setParameter("log",login);
			//result = query.list();
			result = (Client) query.uniqueResult() ;
			tx.commit();

		} catch (Exception e) {

			tx.rollback();
			System.out.println("rien de trouvé");
			//return null ;
		}
		return result;
	}

	@Override
	public boolean checkPassword(String LoginClient, String password) {
		Client user = findByLogin(LoginClient) ;
		if (user != null && password.equals(user.getPassword()))
			return true;
		else
			return false;
	}

}
