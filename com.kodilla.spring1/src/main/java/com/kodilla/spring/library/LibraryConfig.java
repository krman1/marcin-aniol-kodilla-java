package com.kodilla.spring.library;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {


    public Library library() {
        return new Library(libraryDbController());
    }


    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}
