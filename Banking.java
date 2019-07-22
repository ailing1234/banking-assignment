/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ailing
 */
import java.util.Scanner;

public class Banking {

    /**
     * @param args the command line arguments
     */
    private String userID, password, conPassword, name, address, email, accType;
    private int option, ic, dob, mobileNo;

    Scanner input = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Welcome to OK Bank");
        System.out.println("------------------");
        System.out.println("1. Register a new account.");
        System.out.println("2. Login to your account.");
        System.out.println("3. Exit.");

    }

    public void getRegisterInfo() {

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

    public void login(){
        

        Scanner input = new Scanner(System.in);
        
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
        System.out.println("5. Exit.");

        System.out.print("Please select your option: ");
        option = input.nextInt();
        try {

            if (option == 1) {
                //deposit

            } else if (option == 2) {
                //withdraw

            } else if (option == 3) {
                //transaction
            } else if (option == 4) {
                //History
            } else if (option == 5) {
                System.exit(0);
            } else {
                System.out.println("Please enter correct option.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
   
    public static void main(String[] args) {
        // TODO code application logic here

        String userID, password, conPassword, name, address, email, accType;
        int option, ic, dob, mobileNo;

        Scanner input = new Scanner(System.in);
        Banking menu = new Banking();
        menu.showMenu();
        System.out.print("Please select your option: ");
        option = input.nextInt();
        try {

            if (option == 1) {
                //Register

                Banking cusDetail = new Banking();
                cusDetail.getRegisterInfo();

            } else if (option == 2) {
                //Login
                Banking cusLogin = new Banking();
                cusLogin.login();
            

            } else if (option == 3) {
                System.exit(0);
            } else {
                System.out.println("Please enter correct option.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    
}
