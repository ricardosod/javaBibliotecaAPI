package com.libraries.SpringBook.dto;

import lombok.*;

import java.util.Date;







@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorsResponse {



    private  Long id;

    private String name;

    private Date dateBirth;

    private String nationality;
}
