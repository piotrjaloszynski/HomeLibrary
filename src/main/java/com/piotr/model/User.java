package com.piotr.model;

import javax.persistence.*;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Table;
/**
 * Created by jalos on 04.08.2016.
 */@Entity
@Table
public class User extends BaseEntity {
    @Column(name = "firstName")
    String firstName;
    @Column(name = "lastName")
    String lastName;
    @Column (name="Email")
    String email;
    @Column (name= "Password")
    String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(mappedBy = "account")
    private List<Account> acocunts;
    @OneToMany(mappedBy = "book")
    private List<Book> books;
@OneToMany(mappedBy="rent")
private Rent rent;



    public List<Account> getAcocunts() {
        return acocunts;
    }

    public void setAcocunts(List<Account> acocunts) {
        this.acocunts = acocunts;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

   // public List<Rent> getRents() {
      //  return rents;
   // }

   // public void setRents(List<Rent> rents) {
   //     this.rents = rents;
   // }

    public User(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User() {
    }
}
