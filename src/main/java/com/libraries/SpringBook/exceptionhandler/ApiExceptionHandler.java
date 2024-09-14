package com.libraries.SpringBook.exceptionhandler;


import com.libraries.SpringBook.exception.UserException;
import com.libraries.SpringBook.exception.error.ErrorMessage;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;

@Slf4j
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(UserException.class)
    public ResponseEntity<ErrorMessage> handleUserException(RuntimeException ex, HttpServletRequest request){

       log.info("Api Error - {}, Service {} ", ex, ApiExceptionHandler.class);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new ErrorMessage(request, HttpStatus.NOT_FOUND, ex.getMessage(), LocalDateTime.now()));

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorMessage> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,
                                                                              HttpServletRequest request, BindingResult result){

log.info("Api Error - {}, Service {} ", ex, ApiExceptionHandler.class);
return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY)
        .contentType(MediaType.APPLICATION_JSON)
        .body(new ErrorMessage(request, HttpStatus.UNPROCESSABLE_ENTITY, message(result), result, LocalDateTime.now()));

}

        private String message(BindingResult result){
        var message = result.getFieldErrorCount() > 1 ? "Campos inválidos" : "Campo inválido";
         return message;
          }
}
