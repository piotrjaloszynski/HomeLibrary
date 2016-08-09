package com.piotr.controller;

import com.piotr.model.Account;
import com.piotr.model.Rent;
import com.piotr.service.RentService;
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
public class RentController {
    @Autowired
    RentService rentService;

    @RequestMapping(value = "/rents", method = RequestMethod.GET)
    public String getAccountView(Model model) {
        List<Rent> rents = rentService.findAll();
        model.addAttribute("rentList", rents);
        return "rents-page";

    }

    @RequestMapping(value = "/create-rent", method = RequestMethod.GET)
    public String getCreateRent(Model model) {
        return "rent-create-page";
    }

    @RequestMapping(value = "/create-rent", method = RequestMethod.POST)
    public String saveAccount(@RequestParam(value = "numberOfDays") Integer numberOfDays) {

        Rent rent = new Rent();
        rent.setNumberOfDays(numberOfDays);
        return "redirect:/rent-create-page";
    }

    @RequestMapping(value = "/deleteRentAction", method = RequestMethod.POST)
    public String delete(Model model, @RequestParam(value = "id") Long id) {
        rentService.delete(id);
        return "redirect:/rents";
    }

    @RequestMapping(value = "/rent-edit", method = RequestMethod.GET)
    public String edit(Model model, @RequestParam(value = "id") Long id) {
        Rent rent = rentService.findById(id);
        model.addAttribute("rent", rent);
        return "redirect:/rents";

    }

    @RequestMapping(value = "/rent-edit", method = RequestMethod.POST)
    public String saveRent(@RequestParam(value = "id") Long id,
                           @RequestParam(value = "numberOfDays") Integer numberOfDays) {

        Rent rent = rentService.findById(id);
        rent.setNumberOfDays(numberOfDays);
        rentService.save(rent);
        return "redirect:/rents";
    }
}