package com.libraries.SpringBook.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;



@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "authors")
public class Authors {



    @EqualsAndHashCode.Include
    @Id
    @Column(value = "id_authors")
    private  Long id;

    @Column(value = "author_name")
    private String name;

    @Column(value = "date_birth")
    private Date dateBirth;

    private String nationality;


}
