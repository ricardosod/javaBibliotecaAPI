package com.libraries.SpringBook.repository;

import com.libraries.SpringBook.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    
}
