package com.libraries.SpringBook.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;




@Getter
@Setter
@Builder
public class NationalityRequestCreate {


    private Long id;

    private String nationalityName;


    public NationalityRequestCreate() {
    }

    public NationalityRequestCreate(Long id, String nationalityName) {
        this.id = id;
        this.nationalityName = nationalityName;
    }
}
