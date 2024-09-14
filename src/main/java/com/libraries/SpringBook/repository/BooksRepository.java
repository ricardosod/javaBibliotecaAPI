package com.libraries.SpringBook.repository;

import com.libraries.SpringBook.entities.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Long> {


}
