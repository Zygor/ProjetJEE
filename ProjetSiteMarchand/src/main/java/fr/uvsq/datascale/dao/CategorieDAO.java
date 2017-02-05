package fr.uvsq.datascale.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datascale.modele.Categorie;

public class CategorieDAO implements CategorieHome {

	@Override
	public void insert(Categorie nouveau) {
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
	public boolean update(Categorie amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Categorie findByld(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
