package com.youssef.librarymanagementsystem.service;

import com.youssef.librarymanagementsystem.model.dto.AuthorDto;
import com.youssef.librarymanagementsystem.model.entity.Author;
import com.youssef.librarymanagementsystem.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public AuthorDto getAuthor(Integer id){
        Optional<Author> author = this.authorRepo.findById(id);
        return author.map(AuthorDto::toDto).orElse(null);
    }

    public List<Author> allAuthors(){
        return this.authorRepo.findAll();
    }

    public AuthorDto saveAuth(Author author){
        return AuthorDto.toDto(this.authorRepo.save(author));
    }

    public void delete(Integer id){
        this.authorRepo.deleteById(id);
    }

    public Author update(Author author){
        return this.authorRepo.save(author);
    }
}
