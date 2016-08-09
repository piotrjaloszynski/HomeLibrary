package com.piotr.service.Impl;

import com.piotr.dao.BookDao;
import com.piotr.model.Book;

import com.piotr.model.User;
import com.piotr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    public List<Book> findAll() {
        return bookDao.findAll();
    }
    public Book save(Book book){
        return bookDao.save(book);}

    public Book findById(Long id){
        return bookDao.findOne(id);
    }
public void delete (Long id){
    bookDao.delete(id);
}
}
