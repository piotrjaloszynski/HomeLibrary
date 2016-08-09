package com.piotr.controller;

import com.piotr.service.BookService;
import com.piotr.service.RentService;
import com.piotr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jalos on 07.08.2016.
 */
@Controller
public class AdminController {
    @Autowired
    UserService userService;
            @Autowired
            BookService booksService;

    @Autowired
    RentService rentsService;

    //@RequestMapping (value=)

}
//
//@RequestMapping (value="/history",method= RequestMethod.GET)

//public String getHistoryView(Model model){
   // List<Result> results= resultService.findAll();
   // model.addAttribute("results",results) ;
   // return "exam-history";


