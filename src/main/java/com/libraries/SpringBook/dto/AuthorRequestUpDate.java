package com.libraries.SpringBook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



@NoArgsConstructor
@Getter
@Setter
public class AuthorRequestUpDate {



    private  Long id;


    private String name;


    private Date dateBirth;

    private String nationality;

}
