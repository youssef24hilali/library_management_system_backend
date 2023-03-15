package com.youssef.librarymanagementsystem.model.dto;

import com.youssef.librarymanagementsystem.model.entity.Author;
import com.youssef.librarymanagementsystem.model.entity.Book;
import com.youssef.librarymanagementsystem.model.entity.Category;
import com.youssef.librarymanagementsystem.model.entity.IssuedBooks;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

    private Integer id;
    private String title;
    private String isbn;
    private Double bookPrice;
    private Boolean isIssued;
    private Date creationDate;
    private List<Category> categories;
    private List<Author> authors;
    private List<IssuedBooks> issuedBooks;

    public static BookDto bookDto(Book book){
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .bookPrice(book.getBookPrice())
                .isIssued(book.getIsIssued())
                .isbn(book.getIsbn())
                .creationDate(book.getCreationDate())
                .categories(book.getCategories())
                .authors(book.getAuthors())
                .issuedBooks(book.getIssuedBooks())
                .build();
    }
}
