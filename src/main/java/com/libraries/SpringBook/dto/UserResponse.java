package com.libraries.SpringBook.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {



    private Long id;

    @NotNull
    private  String name;

    @Email
    private String email;


    private Date dateBirth;

    private String address;
}
