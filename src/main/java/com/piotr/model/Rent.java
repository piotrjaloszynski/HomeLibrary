package com.piotr.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by jalos on 04.08.2016.
 */
@Entity
@Table
public class Rent extends BaseEntity {
    @Column(name = "numberOfDays")
    int numberOfDays;
    @ManyToOne()
    @JoinColumn(name = "books_id")
    private Book book;



    @ManyToOne()
    @JoinColumn(name="user_id")
    private User user;
    public Rent(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


    public Rent() {
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
