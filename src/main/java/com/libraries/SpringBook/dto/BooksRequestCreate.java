package com.libraries.SpringBook.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class BooksRequestCreate {


    private Long id;

    private String title;


    private String isbn;


    private  String authorsName;

    private Date yearPublication;

    private  Integer copyAvaliable;

    public BooksRequestCreate() {
    }

    public BooksRequestCreate(Long id, String title, String isbn, String authorsName, Date yearPublication, Integer copyAvaliable) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authorsName = authorsName;
        this.yearPublication = yearPublication;
        this.copyAvaliable = copyAvaliable;
    }
}
