package com.example.foodmartapplication.exceptions;

public class InstanceAlreadyExistsException extends RuntimeException{

    public InstanceAlreadyExistsException (String message){
        super (message);
    }
}
