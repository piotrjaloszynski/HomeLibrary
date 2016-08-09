package com.piotr.service;

import com.piotr.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
public interface UserService extends UserDetailsService {
    List<User> findAll();
    User save(User user);
    void delete(Long id);
    User findById(Long id);

}
