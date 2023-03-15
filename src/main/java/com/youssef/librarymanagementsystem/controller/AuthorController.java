package com.youssef.librarymanagementsystem.controller;

import com.youssef.librarymanagementsystem.model.dto.AuthorDto;
import com.youssef.librarymanagementsystem.model.entity.Author;
import com.youssef.librarymanagementsystem.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/get-auth/{id}")
    public AuthorDto getAuthor(@PathVariable Integer id) {
        return this.authorService.getAuthor(id);
    }

    @GetMapping("/get-authors")
    public List<Author> authors(){
        return this.authorService.allAuthors();
    }

    @PostMapping("/save-auth")
    public AuthorDto setUser(@RequestBody Author author){
        return this.authorService.saveAuth(author);
    }

    @GetMapping("/delete-auth")
    public void deleteAuthor(@RequestParam Integer id){
        this.authorService.delete(id);
    }

    @PostMapping("/update-auth")
    public Author updateAuthor(@RequestBody Author author){
        return this.authorService.update(author);
    }
}
