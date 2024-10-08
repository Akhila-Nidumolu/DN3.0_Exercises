package main.java.com.example.bookstoreapi.controller;

import org.springframework.web.bind.annotation.*;

import main.java.com.example.bookstoreapi.entity.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        books.set(id, book);
        return book;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        books.remove(id);
    }
}