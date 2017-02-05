package fr.uvsq.datascale.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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
		try {
			Transaction tx = null ;

			Session session =  HibernateUtil.currentSession() ;
			Adresse adr = new Adresse () ;
			adr = findByld(id);
			tx =session.beginTransaction() ;
			session.delete(adr);
			session.flush() ;
			tx.commit();
			return true;
		}catch (Exception e) {

			System.out.println("Adresse non trouvée");
			return false ;
		}



	}


	@Override
	public Adresse findByld(int id) {
		Transaction tx = null ;

		Session session =  HibernateUtil.currentSession() ;

		Adresse adr = new Adresse () ;
		try {

			tx =session.beginTransaction() ;
			adr = (Adresse) session.get(Adresse.class,id);
			//session.flush() ;
			tx.commit();

		} catch (Exception e) {
			//e.printStackTrace();
			//tx.rollback();
			System.out.println("adresse non trouvéeeee");
		} /*finally {
			if (session != null && session.isOpen()) {
				//session.close();
			}
		}*/
		return adr;
	}

	@Override
	public boolean update(int idAdr, Adresse nouvelle) {
		Transaction tx = null ;
		
		Session session =  HibernateUtil.currentSession() ;
		
		try {
			
			tx =session.beginTransaction() ;

			/*Query query = session.createQuery("update Adresses set adresse = :nouvadr" 
			+ " where idAdresse = :Id");*/
			
			Query query = session.createSQLQuery("update Adresses set adresse = :nouvadr where idAdresse = :Id");
					
		
			query.setParameter("nouvadr", nouvelle.getAdresse());
			query.setParameter("Id", idAdr);
			int result = query.executeUpdate();
			tx.commit();
			return true;
		}
		catch (Exception e) {

			System.out.println("erreur");
			return false ;
		}
	}

	@Override
	public boolean update(Adresse amodifier) {
		// TODO Auto-generated method stub
		return false;
	}

}
