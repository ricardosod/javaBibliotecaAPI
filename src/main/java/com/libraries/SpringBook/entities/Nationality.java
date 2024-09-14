package com.libraries.SpringBook.entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(value = "nationality")
public class Nationality {


    @EqualsAndHashCode.Include
    @Id
    @Column(value = "id_nationality")
    private Long id;


    @Column(value = "nationality_name")
    private String nationalityName;


}
