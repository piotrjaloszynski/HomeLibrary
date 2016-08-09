package com.piotr.model;

import javax.persistence.*;

/**
 * Created by jalos on 04.08.2016.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")


    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
