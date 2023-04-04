package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Book extends Item {
    private String director;
    private String actor;
}
