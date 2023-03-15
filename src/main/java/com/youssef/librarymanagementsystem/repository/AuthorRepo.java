package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.dto.AuthorDto;
import com.youssef.librarymanagementsystem.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
