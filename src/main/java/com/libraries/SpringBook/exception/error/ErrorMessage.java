package com.libraries.SpringBook.exception.error;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@ToString
public class ErrorMessage {



    private String path;
    private  String method;
    private  int status;
    private String statusText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    private LocalDateTime timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object>errors;

    public ErrorMessage() {
    }


    //HttpStatus.NOT_FOUND
    public ErrorMessage(HttpServletRequest request,
                        HttpStatus status, String message, LocalDateTime timestamp){

        this.path = request.getRequestURI();
        this.method = request.getMethod();
        this.status = status.value();
        this.statusText = status.getReasonPhrase();
        this.message = message;
        this.timestamp = timestamp;

    }

    //HttpStatus.UNPROCESSABLE_ENTITY
    public  ErrorMessage(HttpServletRequest request,
                         HttpStatus status, String message, BindingResult result, LocalDateTime timestamp){
        this.path = request.getRequestURI();
        this.method = request.getMethod();
        this.status = status.value();
        this.statusText = status.getReasonPhrase();
        this.message = message;
        this.timestamp = timestamp;
        addErrors(result);

    }


    //HttpStatus.INTERNAL_SERVER_ERROR
    public ErrorMessage(HttpServletRequest request,
                        HttpStatus status, LocalDateTime timestamp){
        this.path = request.getRequestURI();
        this.method = request.getMethod();
        this.status = status.value();
        this.statusText = status.getReasonPhrase();
        this.timestamp = timestamp;


    }


    //HttpStatus.NOT_FOUND       //HttpStatus.UNPROCESSABLE_ENTITY
    private void addErrors(BindingResult result) {
        this.errors = new HashMap<>();
        for (FieldError fieldError : result.getFieldErrors()) {
            this.errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
    }

}
