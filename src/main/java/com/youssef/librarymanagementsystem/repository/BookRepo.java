package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
