package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
