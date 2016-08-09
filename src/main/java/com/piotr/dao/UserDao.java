package com.piotr.dao;

import com.piotr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jalos on 04.08.2016.
 */

@Repository
public interface UserDao extends JpaRepository<User,Long>{

   User findByEmail(String email);
}
