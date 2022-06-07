package com.company;

@FunctionalInterface
public interface UserRegistrationInterface {
    boolean validateEntries(String input) throws UserRegistrationException;
}