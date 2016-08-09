package com.piotr.model;

import javax.persistence.*;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by jalos on 04.08.2016.
 */

@Entity
@Table(name = "book")
public class Book extends BaseEntity {
    @Column(name = "author")
    private String author;
    @Column(name = "publishingHouse")
    private String publishingHouse;
    @Column(name = "foreign")
    private String foreign;
    @Column(name = "national")
    private String national;


    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "rent")
    private Rent rent;



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getForeign() {
        return foreign;
    }

    public void setForeign(String foreign) {
        this.foreign = foreign;
    }
}
