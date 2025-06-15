package com.bookreview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class BookController {

  @Autowired
  private BookRepository repo;

  @GetMapping("/books")
  public List<Book> getBooks() {
    return repo.findAll();
  }

  @PostMapping("/books")
  public Book addBook(@RequestBody Book book) {
    return repo.save(book);
  }
}