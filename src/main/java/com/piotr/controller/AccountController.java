package com.piotr.controller;

import com.piotr.model.Account;
import com.piotr.service.AccountService;
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
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public String getAccountView(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accountList", accounts);
        return "account-page";


    }

    @RequestMapping(value = "/create-account", method = RequestMethod.GET)
    public String getCreateAccount(Model model) {
        return "account-create-page";
    }

    @RequestMapping(value = "/create-account", method = RequestMethod.POST)
    public String saveAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "password") Integer password) {
        Account account = new Account();
        account.setName(name);
        account.setPassword(password);
        accountService.save(account);
        return "redirect:/account-page";
    }

    @RequestMapping(value = "/deleteAccountAction", method = RequestMethod.POST)
    public String delete(Model model, @RequestParam(value = "id") Long id) {
        accountService.delete(id);
        return "redirect:/account-page";

    }

    @RequestMapping(value = "/account-edit", method = RequestMethod.GET)
    public String edit(Model model, @RequestParam(value = "id") Long id) {
        Account account = accountService.findById(id);
        model.addAttribute("account", account);
        return "account-edit-page";
    }
    @RequestMapping(value = "/account-edit", method = RequestMethod.POST)
    public String saveCompetitor(@RequestParam(value = "id") Long id,
                                 @RequestParam(value = "name") String name,
                                 @RequestParam(value = "password") Integer password) {
        Account account = accountService.findById(id);
        account.setPassword(password);
        account.setName(name);
        accountService.save(account);
        return "redirect:/account-page";
    }

}