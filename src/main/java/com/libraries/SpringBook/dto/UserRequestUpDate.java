package com.libraries.SpringBook.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



@NoArgsConstructor
@Getter
@Setter
//TODO deixar o date com letra minúscula
public class UserRequestUpDate {



    private Long id;


    private  String name;

    private String email;


    private Date dateBirth;

    private String address;

}
