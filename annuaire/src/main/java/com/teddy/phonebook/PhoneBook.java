package com.teddy.phonebook;
import com.teddy.phonebook.CreatedUser;

import java.util.Scanner;


public class PhoneBook {
    public static void main(String[] args) {
        System.out.println(" Creation de votre phoneNumber");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez votre lastName : ");
        String lastName = scanner.nextLine();
        System.out.println("Rentrez votre firstName : ");
        String firstName = scanner.nextLine();
        System.out.println("Rentrez votre phoneNumber : ");
        String phoneNumber = scanner.nextLine();
        CreatedUser newUser = new CreatedUser(lastName,firstName,phoneNumber);
        System.out.println(newUser);

    }


}
