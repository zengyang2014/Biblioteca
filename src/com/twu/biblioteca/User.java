package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String libraryNumber;
    private String password;

    public User(String library_number,String name, String email, String phoneNumber, String password) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = library_number;
        this.password = password;
    }

    public String getUserDetail() {
        return String.format("name:%-4s email:%-4s phoneNumber:%s", name, email, phoneNumber);
    }

    public boolean checkAccount(String userLibraryNumber, String userPassword) {
        return libraryNumber.equals(userLibraryNumber) &&
                password.equals(userPassword);
    }

}
