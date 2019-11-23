package com.oreilly.dataEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.oreilly.data.entities.Bank;
import com.oreilly.data.entities.TransactionData;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Example - 1
		EntityManagerFactory factory = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try
		{
		factory = Persistence.createEntityManagerFactory("JPA_ifinances");
		em = factory.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		
		Bank bank = createBank();
		em.persist(bank);
		
		tx.commit();
		}catch(Exception e) {
			tx.rollback();
		}finally {
			em.close();
			factory.close();
		}
	} 
		// Example -2
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_ifinances");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// Bank bank = em.find(Bank.class, 1L);
		Bank bank = em.getReference(Bank.class, 85L);
		System.out.println(em.contains(bank));
		System.out.println(bank.getName());
		
		tx.commit();
		em.close();
		emf.close(); 
		
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try
		{
		emf = Persistence.createEntityManagerFactory("JPA_ifinances");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		
	    Bank bank = em.find(Bank.class, 16L);
	    em.detach(bank);
	    System.out.println(em.contains(bank));
	    
	    bank.setName("JP Morgan & Chase");
	    Bank bank2 = em.merge(bank);
	    
	    bank.setName("Something else 2");
	    
	    tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
		}
		finally {
			em.close();
			emf.close();
		}
	}
	
	private static Bank createBank() {
		Bank bank = new Bank();
		bank.setName("Standard Charted");
		bank.setAddressLine1("23 Cross, Richmond circle");
		bank.setAddressLine2("Building No - 007");
		bank.setCity("Washington");
		bank.setCreatedBy("Ravi Rai");
		bank.setCreatedDate(new Date());
		bank.setInternational(false);
		bank.setLastUpdatedBy("Kewin");
		bank.setLastUpdatedDate(new Date());
		bank.setState("NZ");
		bank.setZipCode("12432");
		return bank;
	} 
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try
		{
		emf = Persistence.createEntityManagerFactory("JPA_ifinances");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		
	    Bank bank = em.find(Bank.class, 16L);
	    em.detach(bank);
	    System.out.println(em.contains(bank));
	    
	    bank.setName("JP Morgan & Chase");
	    Bank bank2 = em.merge(bank);
	    
	    bank.setName("Something else 2");
	    
	    tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
		}
		finally {
			em.close();
			emf.close();
		} */
		// JPSQL Example
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try
		{
		emf = Persistence.createEntityManagerFactory("JPA_ifinances");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		
		Query query=em.createQuery("from bank t");
		@SuppressWarnings("unchecked")
		List<Bank> banks = query.getResultList();
		
		for(Bank t:banks) {
			System.out.println(t.getName());
		}
	    
	    tx.commit();
		}
		catch(Exception e) {
			tx.rollback();
		}
		finally {
			em.close();
			emf.close();
		}
		
		
	}
}
