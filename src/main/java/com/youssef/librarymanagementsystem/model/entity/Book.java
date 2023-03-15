package com.youssef.librarymanagementsystem.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Table(name = "book")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "book_price")
    private Double bookPrice;
    private Boolean isIssued;
    @Column(name = "creation_date")
    private Date creationDate;
    @OneToMany(mappedBy = "book_cat", fetch = FetchType.LAZY)
    private List<Category> categories;
    @OneToMany(mappedBy = "book_author", fetch = FetchType.LAZY)
    private List<Author> authors;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY)
    private List<IssuedBooks> issuedBooks;
}
