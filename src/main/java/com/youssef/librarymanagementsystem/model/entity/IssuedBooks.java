package com.youssef.librarymanagementsystem.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "issuedBooks")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssuedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "issue_date")
    private Date issueDate;
    @Column(name = "return_date")
    private Date returnDate;
    private String status;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Book book;
}
