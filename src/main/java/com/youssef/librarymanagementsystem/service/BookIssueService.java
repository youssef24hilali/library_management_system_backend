package com.youssef.librarymanagementsystem.service;

import com.youssef.librarymanagementsystem.repository.IssuedBooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookIssueService {

    @Autowired
    private IssuedBooksRepo issuedBooksRepo;
}
