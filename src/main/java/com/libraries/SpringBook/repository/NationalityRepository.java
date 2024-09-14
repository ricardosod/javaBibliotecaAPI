package com.libraries.SpringBook.repository;

import com.libraries.SpringBook.entities.Nationality;
import org.springframework.data.repository.CrudRepository;

public interface NationalityRepository extends CrudRepository<Nationality, Long> {
}
