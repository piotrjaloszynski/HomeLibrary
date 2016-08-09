package com.piotr.controller;

import com.piotr.model.Account;
import com.piotr.model.Book;
import com.piotr.model.User;
import com.piotr.service.BookService;
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
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value="/books", method =RequestMethod.GET)
    public String getBooksView(Model model) {

        List<Book> books = bookService.findAll();
        model.addAttribute("BookList", books);
        return "books-page";

    }
    @RequestMapping(value="/create-book", method= RequestMethod.GET)
    public String getCreateBook(Model model){

        model.addAttribute("books", bookService.findAll());//TODO:DLACZEGO ACCOUNT NIE ROZUMIE
        return "book-create-page";

    }

    @RequestMapping(value="/create-book", method = RequestMethod.POST)
    public String saveUser(@RequestParam(value="author") String author,
                           @RequestParam(value="publishingHouse") String publishingHouse,
                           @RequestParam(value="lastName") String foreign,
                           @RequestParam(value="national") String national
    ){
        Book book=new Book();
        book.setAuthor(author);
        book.setPublishingHouse(publishingHouse);
        book.setForeign(foreign);
        book.setNational(national);

        bookService.save(book);
        return "redirect:/books";
    }
    @RequestMapping(value="/deleteBookAction", method =RequestMethod.POST)
    public String delete(Model model, @RequestParam(value = "id")Long id) {
        bookService.delete(id);
        return "redirect:/books";
    }
    @RequestMapping(value="/book-edit", method = RequestMethod.POST)
    public String saveBook(@RequestParam(value="id")Long id,
                           @RequestParam(value="author") String author,
                           @RequestParam(value="publishingHouse") String publishingHouse,
                           @RequestParam(value="foreign") String foreign,
                           @RequestParam(value="national") String national){


        Book book=bookService.findById(id);
        book.setAuthor(author);
        book.setPublishingHouse(publishingHouse);
        book.setForeign(foreign);
        book.setNational(national);
        bookService.save(book);
        return "redirect:/books";
    }
}
