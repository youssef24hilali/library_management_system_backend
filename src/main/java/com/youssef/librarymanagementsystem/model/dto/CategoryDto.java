package com.youssef.librarymanagementsystem.model.dto;

import com.youssef.librarymanagementsystem.model.entity.Book;
import com.youssef.librarymanagementsystem.model.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

    private Integer id;
    private String categoryName;
    private Integer numberOfBooks;
    private String description;
    private Date creationDate;
    private Book book;

    public static CategoryDto categoryDto(Category category){
        return CategoryDto.builder()
                .id(category.getId())
                .categoryName(category.getCategoryName())
                .numberOfBooks(category.getNumberOfBooks())
                .description(category.getDescription())
                .creationDate(category.getCreationDate())
                .book(category.getBook_cat())
                .build();

    }
}
