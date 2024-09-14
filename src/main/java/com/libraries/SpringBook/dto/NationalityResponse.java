package com.libraries.SpringBook.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NationalityResponse {


    private Long id;

    private String nationalityName;

}
