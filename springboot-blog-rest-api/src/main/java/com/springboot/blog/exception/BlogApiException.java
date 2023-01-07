package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

//BlogApiException :We write this exception for business logic or to validate request parameters
public class BlogApiException extends RuntimeException{

    private HttpStatus status;
    private String message;

    public BlogApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
