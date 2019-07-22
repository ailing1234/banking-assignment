/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ailing
 */
public class BankingSystem {

    String userID, password, conPassword, name, address, email, accType;
    int ic, dob, mobileNo;

    Scanner input = new Scanner(System.in);

    //method to register a new account
    void registerAccount() {
        System.out.print("UserID: ");
        userID = input.next();
        System.out.print("Password:");
        password = input.next();
        System.out.print("Confirm Password:");
        conPassword = input.next();
        System.out.print("Name:");
        name = input.next();
        System.out.print("IC:");
        ic = input.nextInt();
        System.out.print("Date of Birth(DDMMYYYY):");
        dob = input.nextInt();
        System.out.print("Address:");
        address = input.next();
        System.out.print("Mobile No:");
        mobileNo = input.nextInt();
        System.out.print("Email:");
        email = input.next();
        System.out.print("Account Type:");
        accType = input.next();
    }

    //display account
    void showAccount() {
        System.out.println("UserID: " + userID);
        System.out.println("Name:" + name);
        System.out.println("IC:" + ic);
        System.out.println("Date of Birth:" + dob);
        System.out.println("Address:" + address);
        System.out.println("Mobile No:" + mobileNo);
        System.out.println("Email:" + email);
        System.out.println("Account Type:" + accType);
    }

    public void login() {

        try {
            int option;
            Scanner input = new Scanner(System.in);

            do {

                System.out.println("Login to your account:");
                System.out.print("UserID: ");
                userID = input.next();
                System.out.print("Password:");
                password = input.next();
                System.out.println(userID + "," + "Welcome to OK Bank");
                System.out.println("------------------");
                System.out.println("1. Deposit.");
                System.out.println("2. Withdraw.");
                System.out.println("3. Transaction.");
                System.out.println("4. History.");
                System.out.println("5. Account Detail.");
                System.out.println("6. Exit.");

                System.out.print("Please select your option: ");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        //Deposit
                        break;

                    case 2:
                        //Withdraw
                        break;

                    case 3:
                        //Transaction
                        break;
                    case 4:
                        //History
                        break;
                    case 5:
                        //Account Detail
                        break;
                    case 6:
                        //Exit
                        System.out.println("Good Bye..");
                        break;
                }
            } while (option <= 6);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Scanner input = new Scanner(System.in);
            int option;

            do {
                System.out.println("Welcome to OK Bank");
                System.out.println("------------------");
                System.out.println("1. Register a new account.");
                System.out.println("2. Login to your account.");
                System.out.println("3. Exit.");
                System.out.print("Please select your option: ");
                option = input.nextInt();

                switch (option) {
                    case 1:
                        BankingSystem cusDetail = new BankingSystem();
                        cusDetail.registerAccount();
                        cusDetail.showAccount();
                        break;

                    case 2:
                        //Login
                        BankingSystem cusLogin = new BankingSystem();
                        cusLogin.login();
                        break;

                    case 3:

                        System.out.println("Good Bye..");
                        break;
                }
            } while (option <= 3);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
