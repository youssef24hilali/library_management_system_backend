package com.youssef.librarymanagementsystem.repository;

import com.youssef.librarymanagementsystem.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
