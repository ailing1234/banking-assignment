/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author ong
 */
public class LoginAcc extends Menu {

    private static final String REGISTERFILE = "./register.txt";
    private static final String LOGINFILE = "./loginfile.txt";

    public static void login() {

        BufferedReader br = null;
        FileReader fr = null;

        /*BufferedReader bw2 = null;
        FileReader fw2 = null;*/
        String userID, password, line;
        int option;

        Scanner input = new Scanner(System.in);

        try {
            fr = new FileReader(LOGINFILE);
            br = new BufferedReader(fr);

            System.out.println("Login to your account:");
            System.out.print("UserID: ");
            userID = input.next();
            System.out.print("Password:");
            password = input.next();
            while ((line = br.readLine()) != null) {
                if (line.contains(userID) && line.contains(password)) {
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

                
            }else{
                    System.out.println("Please enter the correct user id or password.");
                    login();
                }

        }

    }
    catch (Exception ex

    
        ) {
            ex.printStackTrace();
    }

    
        finally {
            try {
            if (br != null) {
                br.close();
            }

            if (fr != null) {
                fr.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
}
