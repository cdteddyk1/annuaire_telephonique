package com.teddy.phonebook;
public class CreatedUser {
    String lastName;
    String firstName;
    String phoneNumber;

    public CreatedUser(String lastName, String firstName, String phoneNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return " lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phoneNumber='" + phoneNumber;
    }
}
