package com.piotr.service;

import com.piotr.model.Account;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
public interface AccountService {
   List<Account> findAll();
    Account save(Account account);
    void delete(Long id);
    Account findById(Long id);
}
