package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
