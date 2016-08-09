package com.piotr.service;

import com.piotr.model.Book;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */

public interface BookService {

    List<Book> findAll();
    Book save (Book book);
    void delete (Long id);
    Book findById(Long id);
}
