package com.jpalearning.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a = new Alien();
    	a.setAname("abc");
    	a.setTech("Full Stack");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Alien a1=em.find(Alien.class, 8);
        System.out.println(a1);
        em.persist(a);
        em.getTransaction().commit();
    }
}
