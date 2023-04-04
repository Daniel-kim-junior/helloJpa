package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Movie extends Item {
    private String actor;
    private String director;
}
