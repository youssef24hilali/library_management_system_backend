package com.youssef.librarymanagementsystem.model.dto;

import com.youssef.librarymanagementsystem.model.entity.Author;
import com.youssef.librarymanagementsystem.model.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Date creationDate;
    private Book book;

    public static AuthorDto toDto(Author author){
        return AuthorDto.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .email(author.getEmail())
                .creationDate(author.getCreationDate())
                .book(author.getBook_author())
                .build();
    }
}
