package com.piotr.service.Impl;

import com.piotr.dao.AccountDao;
import com.piotr.model.Account;
import com.piotr.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public Account save(Account account) {
        return accountDao.save(account);
    }

    @Override
    public Account findById(Long id) {
        return accountDao.findOne(id);
    }

    public void delete(Long id) {
        accountDao.delete(id);
    }
}

