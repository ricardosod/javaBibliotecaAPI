package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.AuthorRequestCreate;
import com.libraries.SpringBook.dto.AuthorRequestUpDate;
import com.libraries.SpringBook.dto.AuthorsResponse;
import com.libraries.SpringBook.dto.UserRequestUpDate;
import com.libraries.SpringBook.entities.Authors;
import com.libraries.SpringBook.entities.User;

import java.util.List;

public interface AuthorMapper {


    AuthorsResponse toAuthorsResponse(Authors authors);

    Authors toAuthors(AuthorRequestCreate authorRequest);

    Authors toAuthorsUpDate(AuthorRequestUpDate authorRequestUpDate, Authors authors);

    List<Authors> toCollection(List<Authors> authors);

}
