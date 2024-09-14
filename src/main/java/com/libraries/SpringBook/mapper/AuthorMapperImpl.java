package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.AuthorRequestCreate;
import com.libraries.SpringBook.dto.AuthorRequestUpDate;
import com.libraries.SpringBook.dto.AuthorsResponse;
import com.libraries.SpringBook.dto.UserResponse;
import com.libraries.SpringBook.entities.Authors;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMapperImpl implements AuthorMapper{


    @Override
    public AuthorsResponse toAuthorsResponse(Authors authors) {
        return AuthorsResponse.builder()
                .id(authors.getId())
                .name(authors.getName())
                .dateBirth(authors.getDateBirth())
                .nationality(authors.getNationality())
                .build();
    }


    @Override
    public Authors toAuthors(AuthorRequestCreate authorRequest) {
        return Authors.builder()
                .name(authorRequest.getName())
                .dateBirth(authorRequest.getDateBirth())
                .nationality(authorRequest.getNationality())
                .build();
    }

    @Override
    //TODO deixar o date em minúsculo
    public Authors toAuthorsUpDate(AuthorRequestUpDate authorRequestUpDate, Authors authors) {
        return Authors.builder()
                .id(authorRequestUpDate.getId() == null ? authors.getId() : authorRequestUpDate.getId())
                .name(authorRequestUpDate.getName() == null ? authors.getName() : authorRequestUpDate.getName())
                .dateBirth(authorRequestUpDate.getDateBirth() == null ? authors.getDateBirth() : authorRequestUpDate.getDateBirth())
                .nationality(authorRequestUpDate.getNationality() == null ? authors.getNationality() : authorRequestUpDate.getNationality())
                .build();
    }

    @Override
    public List<Authors> toCollection(List<Authors> authors) {
        return List.of();
    }
}
