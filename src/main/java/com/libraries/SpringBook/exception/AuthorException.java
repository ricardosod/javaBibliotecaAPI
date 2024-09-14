package com.libraries.SpringBook.exception;

public class AuthorException extends RuntimeException{


    public AuthorException(String message){
        super(message);

    }
    public AuthorException() {
        super("Autor não encontrado");
    }

}
