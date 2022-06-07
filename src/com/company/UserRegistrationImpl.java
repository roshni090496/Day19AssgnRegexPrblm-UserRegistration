package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {

    public boolean validateFirstName( String name ) throws UserRegistrationException {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern p = Pattern.compile(regex);

            if(name.isEmpty())
                throw new UserRegistrationException("Please enter valid FIRST NAME!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);

            Matcher m = p.matcher(name);
            return m.matches();
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid FIRST NAME!" , UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
        }
    }

    public boolean validateLastName( String name ) throws UserRegistrationException {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        try {
            Pattern p = Pattern.compile(regex);

            if(name.isEmpty())
                throw new UserRegistrationException("Please enter valid LAST NAME!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);

            Matcher m = p.matcher(name);
            return m.matches();
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid LAST NAME!" , UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
        }
    }


    public boolean validateEmail( String email ) throws UserRegistrationException {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9-]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";
        try {
            Pattern p = Pattern.compile(regex);

            if(email.isEmpty())
                throw new UserRegistrationException("Please enter valid EMAIL!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);

            Matcher m = p.matcher(email);
            return m.matches();
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid EMAIL!" , UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
        }
    }


    public boolean validatePhoneNumber( String number ) throws UserRegistrationException {

        String regex = "(0|91)?[\\s][0-9]{10}";
        //String regex = "^(0/91)[0-9]{10}$";  use this regex when user gives the input through main() since console does not allow space
        try {
            Pattern p = Pattern.compile(regex);

            if (number.isEmpty())
                throw new UserRegistrationException("Please enter valid PHONE NUMBER!" , UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);

            Matcher m = p.matcher(number);
            return m.matches();
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid PHONE NUMBER!" , UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
        }
    }

    public boolean validatePassword( String password ) throws UserRegistrationException {

        String regex = "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        try {
            Pattern p = Pattern.compile(regex);

            if(password.isEmpty())
                throw new UserRegistrationException("Please enter valid PASSWORD!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);

            Matcher m = p.matcher(password);
            return m.matches();
        } catch(Exception e) {
            throw new UserRegistrationException("Please enter valid PASSWORD!" , UserRegistrationException.ExceptionType.INVALID_PASSWORD);
        }

    }
}