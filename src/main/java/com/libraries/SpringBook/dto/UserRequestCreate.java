package com.libraries.SpringBook.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;





@Getter
@Setter
@Builder
public class UserRequestCreate {

    private Long id;

    private  String name;

    private String email;

    private Date dateBirth;

    private String address;


    public UserRequestCreate(Long id, String name, String email, Date dateBirth, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateBirth = dateBirth;
        this.address = address;
    }

}
