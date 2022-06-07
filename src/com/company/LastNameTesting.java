package com.company;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LastNameTesting {
    public String lastName;
    public Boolean expectedResult;

    public LastNameTesting(String lastName, boolean expectedResult) {
        this.lastName = lastName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"Roshni", true},
                {"Singh", false},
                {"hello", false},
                {"Rajput", false},
                {null, false},
                {" ", false}
        });
    }

    @Test
    public void givenlastName_IsValidOrInvalid() throws UserRegistrationException {
        try {
            UserRegistrationImpl userImpl = new UserRegistrationImpl();
            userImpl.validateLastName(this.lastName);
        } catch ( UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
        }
    }
}