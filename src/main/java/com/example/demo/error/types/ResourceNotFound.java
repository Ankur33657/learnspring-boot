package com.example.demo.error.types;

public class ResourceNotFound extends  RuntimeException{
    public ResourceNotFound(String message) {
        super(message);
    }

}
