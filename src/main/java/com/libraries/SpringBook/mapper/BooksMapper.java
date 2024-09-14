package com.libraries.SpringBook.mapper;

import com.libraries.SpringBook.dto.BooksResponse;
import com.libraries.SpringBook.entities.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksMapper{

BooksResponse toBooksResponse(Books books);



}
