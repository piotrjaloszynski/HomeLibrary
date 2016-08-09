package com.piotr.service.Impl;

import com.piotr.dao.RentDao;
import com.piotr.model.Rent;
import com.piotr.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentDao rentDao;

    public List<Rent> findAll() {
        return rentDao.findAll();
    }


    public Rent save(Rent rent) {
        return rentDao.save(rent);
    }


    public Rent findById(Long id) {
        return rentDao.findOne(id);
    }

    public void delete(Long id) {
 rentDao.delete(id);
    }

}
