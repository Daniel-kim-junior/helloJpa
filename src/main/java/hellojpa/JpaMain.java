package hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
       EntityManager em = emf.createEntityManager();

       EntityTransaction tx = em.getTransaction();
       tx.begin();

       try {
<<<<<<< HEAD


           Member member1 = em.find(Member.class, 150L);
           member1.setName("AAAA");

            em.close();
           System.out.println("===================");
           Member member2 = em.find(Member.class, 150L);

=======
>>>>>>> fa46f02 (TIL : JPA annotation)
           tx.commit();
       } catch (Exception e) {
           System.out.println(e);
           tx.rollback();
       } finally {
           em.close();
       }


        emf.close();


    }
}
