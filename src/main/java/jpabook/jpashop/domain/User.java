package jpabook.jpashop.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "user_seq", allocationSize = 100)
@Table(name = "member")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_auth")
    private Auth auth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reward_id")
    private Reward reward;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Auth getAuth() {
        return auth;
    }

    public Reward getReward() {
        return reward;
    }




}
