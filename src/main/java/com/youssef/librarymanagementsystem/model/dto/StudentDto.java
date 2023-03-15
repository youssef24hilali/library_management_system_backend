package com.youssef.librarymanagementsystem.model.dto;

import com.youssef.librarymanagementsystem.model.entity.IssuedBooks;
import com.youssef.librarymanagementsystem.model.entity.Student;
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
public class StudentDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
    private Date creationDate;
    private List<IssuedBooks> issuedBooks;

    private StudentDto studentDto(Student student){
        return StudentDto.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .phoneNumber(student.getPhoneNumber())
                .creationDate(student.getCreationDate())
                .issuedBooks(student.getIssuedBooks())
                .build();
    }
}
