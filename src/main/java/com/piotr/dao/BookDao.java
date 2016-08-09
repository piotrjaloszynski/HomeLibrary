package com.piotr.dao;

import com.piotr.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 04.08.2016.
 */@Repository
public interface BookDao extends JpaRepository<Book,Long> {
}
