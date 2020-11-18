package com.example.springbootdemo1.configuration;

import com.example.springbootdemo1.entity.Book;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
@Data
@ConfigurationProperties("booklibraries")
public class BookLibraries {

    private String location;
    private List<Book> books;
}
