package com.kodilla.good.patterns.challenges;

public class User {

    private String userNick;
    private String userName;

    public User(String userNick, String userName) {
        this.userNick = userNick;
        this.userName = userName;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }
}
