package com.itacademy.java.oop.basics;

public class PasswordCheck {
    public static void main(String[] args) {

        Password password = new Password(Password.enterPassword());
        password.checkIfValid();

    }

}
