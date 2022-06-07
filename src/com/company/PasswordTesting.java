package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTesting {
    public String password;
    public Boolean expectedResult;

    public PasswordTesting(String password, boolean expectedResult) {
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "Aby%6723", true } ,
                { "Aby%123", false } ,
                { "aby%1234", false } ,
                { "aBy%abc", false } ,
                { "aBy%#1234", false } ,
        } );
    }

    @Test
    public void givenPassword_IsValidOrInvalid() throws UserRegistrationException {
        try {
            UserRegistrationImpl userImpl = new UserRegistrationImpl();
            userImpl.validatePassword(this.password);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
}