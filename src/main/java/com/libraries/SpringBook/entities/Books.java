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
@Table(name = "books")
public class Books {

    @EqualsAndHashCode.Include
    @Id
    @Column(value = "id_books")
     private Long id;

     private String title;


     private String isbn;

    @Column(value = "authors_name")
     private  String authorsName;

    @Column(value = "year_publication")
     private Date yearPublication;

    //TODO alterar o nome para available
    @Column(value = "copy_avaliable")
     private  Integer copyAvaliable;

}
