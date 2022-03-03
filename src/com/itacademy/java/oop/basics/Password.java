package com.itacademy.java.oop.basics;

import java.util.Scanner;

public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public static String enterPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password consisting of 10 symbols (letters and numbers). At least 2 of the symbols must be digits; no special symbols allowed.");
        String password = scanner.nextLine();
        return password;
    }

    public void checkIfValid() {
        int length = password.length();
        boolean valid = true;

        if (length < 10 || password == null) {
            System.out.println("Attention: not enough symbols (at least 10 symbols needed)");
            valid = false;
        }

        for (int i = 0; i < length; i++) {
            if ((Character.isLetterOrDigit(password.charAt(i)) == false)) {
                System.out.println("Attention: contains special symbols (no special symbols allowed)");
                valid = false;
                break;
            }
        }

        int digitCount = 0;
        for (int i = 0; i < length; i++) {

            if ((Character.isDigit(password.charAt(i)) == true)) {
                digitCount++;
            }
        }
        if (digitCount < 2){
            System.out.println("Attention: not enough digits (at least 2 digits needed)");
            valid = false;
        }

        showAnswer(valid);
    }

    private void showAnswer(boolean valid) {
        if (valid == true) {
            System.out.println("Password " + password + " is valid.");
        } else {
            System.out.println("Password " + password + " is NOT valid.");
        }
    }
}
