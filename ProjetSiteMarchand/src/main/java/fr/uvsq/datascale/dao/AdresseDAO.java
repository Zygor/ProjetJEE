package fr.uvsq.datascale.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.uvsq.datascale.hiberutil.HibernateUtil;
import fr.uvsq.datascale.modele.Adresse;


public class AdresseDAO implements AdresseHome {

	@Override
	public void insert(Adresse nouveau) {
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
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
	
		Adresse adr = new Adresse () ;
		   adr = (Adresse)session.get(Adresse.class,id);
		    session.delete(adr);

		    //This makes the pending delete to be done
		    session.flush() ;

		return true;
	}

	@Override
	public boolean update(Adresse amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Adresse findByld(int id) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;
	
		Adresse adr = new Adresse () ;
		try {
			
			tx =session.beginTransaction() ;
			adr = (Adresse) session.get(Adresse.class,id);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			//tx.rollback();
			
		} finally {
			if (session != null && session.isOpen()) {
				//session.close();
			}
		}
		return adr;
	}

}
