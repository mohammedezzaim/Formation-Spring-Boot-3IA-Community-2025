package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myDB1");
        EntityManager em = emf.createEntityManager();

        // insert
        em.getTransaction().begin(); // start Transaction
        User user1 = new User("3iqcommunity@gmail.com","3ia-community");
        em.persist(user1);
        em.getTransaction().commit(); // end Transaction


        em.getTransaction().begin(); // start Transaction
        User user2 = new User("amazon@gmail.com","amazon");
        em.persist(user2);
        em.getTransaction().commit(); // end Transaction


        // find
        User foundUser = em.find(User.class, user1.getId());
        if (foundUser != null){
            System.out.println(foundUser.getName());
            System.out.println(foundUser.getEmail());
        }

        // update
        em.getTransaction().begin();
        foundUser.setEmail("3iacommunity@gmail.com");
        em.merge(foundUser);
        em.getTransaction().commit();


        // Delete
        em.getTransaction().begin();
        User amazon = em.find(User.class, 2 );
        em.remove(amazon);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
