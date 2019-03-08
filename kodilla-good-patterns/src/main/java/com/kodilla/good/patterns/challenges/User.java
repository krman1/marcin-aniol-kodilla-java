package com.kodilla.good.patterns.challenges;

public class User {

    private String firstName;
    private String lastName;
    private String login;

    public User(String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }
}
