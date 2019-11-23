package com.hqlAndJpql.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import javax.persistence.Entity;

import com.hqlAndJpql.data.entities.TransactionData;

public class Application {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			//Query query = session.createQuery("select t from transaction t");
			
			List<TransactionData> transactions = (List<TransactionData>) session.createQuery("select t from transaction t").list();
			
			//List<TransactionData> transactions = query.list();
			for(TransactionData t:transactions) {
				System.out.println(t.getTransactionId());
			}
			tx.commit();
			}catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
//			finally {
//				session.close();
//				sessionFactory.close();
//			}
		
	}

}
