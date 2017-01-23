package fr.uvsq.datascale.dao;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datasclale.modele.Client;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDAO implements ClientHome {

	@Override
	public void insert(Client nouveau) {
		
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Client amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client findByld(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPassword(String LoginClient, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
