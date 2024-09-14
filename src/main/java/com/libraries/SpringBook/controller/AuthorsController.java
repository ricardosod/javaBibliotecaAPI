package com.libraries.SpringBook.controller;

import com.libraries.SpringBook.dto.AuthorRequestCreate;
import com.libraries.SpringBook.dto.AuthorRequestUpDate;
import com.libraries.SpringBook.dto.AuthorsResponse;
import com.libraries.SpringBook.entities.Authors;
import com.libraries.SpringBook.entities.User;
import com.libraries.SpringBook.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/authors")
public class AuthorsController {



    @Autowired
    private AuthorsService authorsService;


    @GetMapping
    public List<Authors> findAll(){
        List<Authors> authors = authorsService.findAll();
        return authors;

    }

    @PostMapping
    public ResponseEntity<AuthorsResponse> insert(@Validated  @RequestBody AuthorRequestCreate authorRequest){
        var authorsResponse = authorsService.saveAuthors(authorRequest);
        return new ResponseEntity<>(authorsResponse, HttpStatus.CREATED);

    }

    @PutMapping(value = "/{id}")
     public ResponseEntity<AuthorsResponse> upDateAuthor(@PathVariable Long id, @RequestBody AuthorRequestUpDate authorRequestUpDate){
        var authorResponse = authorsService.updateAuthors(id, authorRequestUpDate);
        return ResponseEntity.ok(authorResponse);


    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AuthorsResponse> findBYId(@PathVariable Long id){
        var author = authorsService.findById(id);
        return ResponseEntity.ok(author);



    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Authors> delete(@PathVariable Long id) {
        authorsService.deleteAuthors(id);

        return ResponseEntity.noContent().build();
    }

}
