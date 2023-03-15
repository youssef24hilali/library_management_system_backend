package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.entity.IssuedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuedBooksRepo extends JpaRepository<IssuedBooks, Integer> {
}
