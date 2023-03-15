package com.youssef.librarymanagementsystem.model.dto;

import com.youssef.librarymanagementsystem.model.entity.Book;
import com.youssef.librarymanagementsystem.model.entity.IssuedBooks;
import com.youssef.librarymanagementsystem.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IssuedBooksDto {

    private Integer id;
    private Date issueDate;
    private Date returnDate;
    private String status;
    private Student student;
    private Book book;

    public static IssuedBooksDto issuedBooksDto(IssuedBooks issuedBooks){
        return IssuedBooksDto.builder()
                .id(issuedBooks.getId())
                .book(issuedBooks.getBook())
                .issueDate(issuedBooks.getIssueDate())
                .returnDate(issuedBooks.getReturnDate())
                .status(issuedBooks.getStatus())
                .student(issuedBooks.getStudent())
                .build();
    }
}
