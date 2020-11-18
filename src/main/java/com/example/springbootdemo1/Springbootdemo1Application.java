package com.example.springbootdemo1;

import com.example.springbootdemo1.configuration.BookLibraries;
import com.example.springbootdemo1.configuration.Mywork;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({Mywork.class,BookLibraries.class})
@SpringBootApplication
public class Springbootdemo1Application implements InitializingBean {


     private final Mywork  mywork;
     private final BookLibraries bookLibraries;

    public Springbootdemo1Application(Mywork mywork, BookLibraries bookLibraries) {
        this.mywork = mywork;
        this.bookLibraries = bookLibraries;
    }

    public static void main(String[] args) {

        SpringApplication.run(Springbootdemo1Application.class, args);


    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(bookLibraries);
    }
}
