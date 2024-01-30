package com.example.Stream.API.exception;
public class EmployeeStorageIsFullException extends RuntimeException {

    public EmployeeStorageIsFullException(String  message) {
        super(message);
    }
}