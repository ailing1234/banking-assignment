/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author ong
 */
public class Menu {

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
                        RegisterAcc cusDetail = new RegisterAcc();
                        cusDetail.register();
                        break;

                    case 2:
                        //Login
                        LoginAcc cusLogin = new LoginAcc();
                        cusLogin.login();
                        break;

                    case 3:

                        System.out.println("Good Bye..");
                        System.exit(0);
                        break;
                }
            } while (option <= 3);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
