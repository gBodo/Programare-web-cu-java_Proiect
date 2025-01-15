package com.example.pet_adoption_system.Constants;

public class UserRole {
    public static final String CLIENT = "Client";
    public static final String ADMIN = "Admin";


    public static boolean isValid(String role) {
        return role.equals(CLIENT) || role.equals(ADMIN);
    }
}