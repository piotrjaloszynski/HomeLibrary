package com.piotr.service.Impl;

import com.piotr.dao.UserDao;
import com.piotr.model.User;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public List<User> findAll() {
        return userDao.findAll();
    }
    public User save(User user){
        return userDao.save(user);}

    public User findById(Long id){
        return userDao.findOne(id);
    }
    public void delete (Long id){
        userDao.delete(id);

    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.findByEmail(s);
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), authorities);
    }
}
