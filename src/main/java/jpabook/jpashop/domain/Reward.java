package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "user_seq", allocationSize = 100)
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "reward_id")
    private Long id;
    private String title;
    @Lob
    private String description;

    @OneToMany(mappedBy = "reward")
    private List<User> list = new ArrayList<>();




}
