package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
@Entity
@SequenceGenerator(name = "reward_seq", allocationSize = 100)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getList() {
        return list;
    }


}
