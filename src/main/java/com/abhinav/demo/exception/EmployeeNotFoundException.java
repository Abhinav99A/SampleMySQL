package com.abhinav.demo.exception;


public class EmployeeNotFoundException extends  RuntimeException {

    public EmployeeNotFoundException(String message, Throwable cause)
    {
        super(message,cause);
    }

    public EmployeeNotFoundException()
    {
        super();
    }
}