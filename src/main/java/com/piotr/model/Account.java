package com.piotr.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private int password;

   // public Book getBook() {
     //   return book;
   // }

    //public void setBook(Book book) {
    //    this.book = book;
    //}

  //  public User getUser() {
  //      return user;
   // }

    //public void setUser(User user) {
      //  this.user = user;
   // }

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Account() {
    }
}
