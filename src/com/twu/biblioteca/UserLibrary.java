package com.twu.biblioteca;

import java.util.ArrayList;

public class UserLibrary {

    private ArrayList<User> users = new ArrayList<User>();

    public UserLibrary() {
        users.add(new User("user1_666", "user1", "user1@user.com", "18829290101", "user1_password"));
        users.add(new User("user2_666", "user2", "user2@user.com", "18829290102", "user2_password"));
        users.add(new User("user3_666", "user3", "user3@user.com", "18829290103", "user3_password"));
    }

    public void displayUserInfo() {
        Display display = new Display();
        System.out.print("Please input your library_number:");
        String library_number = display.getUserInput();
        System.out.print("Please input your password:");
        String password = display.getUserInput();
        int index = checkUserInfo(library_number, password);
        if (index != -1) {
            System.out.println(users.get(index).getUserDetail());
        } else {
            System.out.println("your account info is not correct");
        }
    }

    public int checkUserInfo(String library_number, String password) {
        int i = 0;
        int index = -1;
        for (User user : users) {
            if (user.checkAccount(library_number, password)) {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
}
