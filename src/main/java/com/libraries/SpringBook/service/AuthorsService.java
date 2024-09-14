package com.libraries.SpringBook.service;

import com.libraries.SpringBook.dto.AuthorRequestCreate;
import com.libraries.SpringBook.dto.AuthorRequestUpDate;
import com.libraries.SpringBook.dto.AuthorsResponse;
import com.libraries.SpringBook.entities.Authors;
import com.libraries.SpringBook.exception.AuthorException;
import com.libraries.SpringBook.exception.UserException;
import com.libraries.SpringBook.mapper.AuthorMapper;
import com.libraries.SpringBook.repository.AuthorsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class AuthorsService {


    private final AuthorsRepository authorsRepository;


    private final AuthorMapper authorMapper;


    public List<Authors> findAll(){
        List<Authors> author = (List<Authors>) authorsRepository.findAll();
        return author;

    }

    public AuthorsResponse saveAuthors(AuthorRequestCreate authorRequest){
        var author = authorMapper.toAuthors(authorRequest);
        author = authorsRepository.save(author);
        return authorMapper.toAuthorsResponse(author);
    }

    public AuthorsResponse updateAuthors(Long id, AuthorRequestUpDate authorRequestUpDate){
        var author =  authorsRepository.findById(id)
                .orElseThrow(AuthorException::new);
        var authorResponse = authorsRepository.save(authorMapper.toAuthorsUpDate(authorRequestUpDate, author));
        return authorMapper.toAuthorsResponse(authorResponse);


    }


    public AuthorsResponse findById(Long id){

        var author = authorsRepository.findById(id)
                .orElseThrow(() -> new UserException(String.format("Autor não encontrado com id: %s", id)));
        return authorMapper.toAuthorsResponse(author);

    }

    public void deleteAuthors(Long id){

        boolean exists = authorsRepository.existsById(id);
        if(!exists){
            throw  new UserException("Id não encontrado");
        }
        authorsRepository.deleteById(id);
    }
}
