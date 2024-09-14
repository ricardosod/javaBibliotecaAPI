package com.libraries.SpringBook.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;




@Getter
@Setter
@Builder
public class AuthorRequestCreate {


    private  Long id;


    private String name;


    private Date dateBirth;

    private String nationality;


    public AuthorRequestCreate(Long id, String name, Date dateBirth, String nationality) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
    }
}
