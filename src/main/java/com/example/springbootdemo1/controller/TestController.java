package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/book")
@RestController
public class TestController {
    List<Book>  books=new ArrayList<>();
    @RequestMapping("/add")
    public ResponseEntity test(@RequestBody Book book){
        System.out.println(book);
      books.add(book);
      return ResponseEntity.ok(books);
    }

    @RequestMapping("/delete/{id}")
    public ResponseEntity test2(@PathVariable("id") int id){
        books.remove(id);
        return ResponseEntity.ok(books);
    }

    @RequestMapping("/get")
    public ResponseEntity test3(@RequestParam("name") String name){
        List<Book> results=books.stream().filter(book -> book.getName().equals(name)).collect(Collectors.toList());
        return ResponseEntity.ok(books);
    }
}
