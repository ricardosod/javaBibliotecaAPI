package com.libraries.SpringBook.dto;



import lombok.*;

import java.util.Date;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BooksResponse {



    private Long id;

    private String title;


    private String isbn;


    private  String authorsName;

    private Date yearPublication;

    private  Integer copyAvaliable;
}
