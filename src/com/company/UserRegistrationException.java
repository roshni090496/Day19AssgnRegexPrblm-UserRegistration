package com.company;

//Customized Exception class extended from Exception superclass
public class UserRegistrationException extends Exception{
    public ExceptionType type;

    //To inform user whether the input type is invalid
    public enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PHONE_NUMBER, INVALID_EMAIL_ID, INVALID_PASSWORD
    }

    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}