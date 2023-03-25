package jpabook.jpashop.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            User user = new User();
            Reward reward = new Reward();

            reward.setTitle("이런 이벤트 어때?");
            reward.setDescription("화난 이벤트");

            user.setAuth(Auth.USER);
            user.setName("hi");
            user.setReward(reward);

//            reward.getList().add(user);


            em.persist(user);
            em.persist(reward);
            em.flush();
            em.clear();

            Reward r= em.find(Reward.class, reward.getId());
            for(User m : r.getList()) {
                System.out.println(m.getName());
            }
            tx.commit();
        } catch (Exception e) {

        }
    }
}
