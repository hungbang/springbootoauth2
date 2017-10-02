package com.smartdev.springbootoauth2.domain;

import javax.persistence.*;

@Entity
@Table(name = "random_city")
public class City {

    private Long id;
    private String name;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
