package com.piotr.controller;

import com.piotr.model.Account;
import com.piotr.model.User;
import com.piotr.service.AccountService;
import com.piotr.service.RentService;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by jalos on 04.08.2016.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    RentService rentService;
    @Autowired
    BookController bookController;
    @Autowired
    AccountService accountService;
    @RequestMapping(value="/users", method =RequestMethod.GET)
    public String getUsersView(Model model) {

        List<User> users = userService.findAll();
        model.addAttribute("UserList", users);
        return "users-page";

    }
@RequestMapping(value="/create-user", method= RequestMethod.GET)
    public String getCreateUser(Model model){

    model.addAttribute("users", userService.findAll());//TODO:
    return "user-create-page";

}

    @RequestMapping(value="/create-user", method = RequestMethod.POST)
public String saveUser(@RequestParam(value="firstName") String firstName,
                        @RequestParam(value="lastName") String lastName){

            User user=new User();
        user.setLastName(lastName);
        user.setFirstName(firstName);
        userService.save(user);
        return "redirect:/users";
    }
@RequestMapping(value="/deleteUserAction", method =RequestMethod.POST)
    public String delete(Model model, @RequestParam(value = "id")Long id) {
        userService.delete(id);
        return "redirect:/users";
    }
    @RequestMapping(value="/user-edit", method = RequestMethod.POST)
    public String saveUser(@RequestParam(value="id")Long id,
                           @RequestParam(value="firstName") String firstName,
                           @RequestParam(value="lastName") String lastName){
       Account account=accountService.findById(id);
        User user=userService.findById(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userService.save(user);
        return "redirect:/users";
    }

    }
