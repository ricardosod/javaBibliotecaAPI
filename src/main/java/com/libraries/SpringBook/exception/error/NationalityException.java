package com.libraries.SpringBook.exception.error;

public class NationalityException extends RuntimeException {



    public NationalityException(String message){
        super(message);

    }
    public NationalityException() {
        super("Nacionalidade não encontrada");
    }
}
