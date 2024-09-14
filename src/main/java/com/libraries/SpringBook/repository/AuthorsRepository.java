
//TODO mudar o nome com letras minúsculas
package com.libraries.SpringBook.repository;

import com.libraries.SpringBook.entities.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Authors, Long> {


}
