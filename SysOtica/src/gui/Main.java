package gui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String agrs[]) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatetest");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        et.commit();

        em.close();

        emf.close();

    }
}
