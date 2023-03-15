package com.youssef.librarymanagementsystem.service;

import com.youssef.librarymanagementsystem.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;
}
