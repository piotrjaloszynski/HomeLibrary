package com.piotr.service;

import com.piotr.model.Rent;

import java.util.List;


public interface RentService {
    List<Rent> findAll();
    Rent save (Rent rent);
    void delete(Long id);
    Rent findById(Long id);
}
