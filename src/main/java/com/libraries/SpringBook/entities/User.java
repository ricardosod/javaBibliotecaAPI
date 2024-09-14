package com.libraries.SpringBook.entities;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "user")
public class User {

    @EqualsAndHashCode.Include
    @Id
    @Column(value = "id_user")
    private Long id;

    @Column(value = "full_name")
    private  String name;

    private String email;

    @Column(value = "date_birth")
    private Date dateBirth;

    private String address;


}
