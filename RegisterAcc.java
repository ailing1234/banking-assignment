/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author ong
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegisterAcc extends Menu {

    private static final String REGISTERFILE = "./register.txt";
    private static final String LOGINFILE = "./loginfile.txt";
    private static final String ACCDETAILS = "./accdetails.txt";

    public static void register() {

        BufferedWriter bw = null;
        FileWriter fw = null;
        BufferedWriter bw2 = null;
        FileWriter fw2 = null;
        BufferedWriter bw3 = null;
        FileWriter fw3 = null;

        String userID, password, conPassword, name, address, email, accType, accNo;
        int ic, dob, mobileNo;
        double accBal;

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("UserID: ");
            userID = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            System.out.print("Confirm Password: ");
            conPassword = input.nextLine();

            if (!password.equals(conPassword)) {
                System.out.println("Password not matched with confirm password");
                register();
            }

            System.out.print("Name: ");
            name = input.nextLine();

            System.out.print("IC: ");
            ic = input.nextInt();
            input.nextLine();

            System.out.print("Date of Birth(DDMMYYYY): ");
            dob = input.nextInt();
            input.nextLine();

            System.out.print("Address: ");
            address = input.nextLine();

            System.out.print("Mobile No: ");
            mobileNo = input.nextInt();
            input.nextLine();

            System.out.print("Email: ");
            email = input.nextLine();

            System.out.print("Account Type: ");
            accType = input.nextLine();

            System.out.print("Account Number: ");
            accNo = input.nextLine();

            System.out.print("Account Balance: ");
            accBal = input.nextDouble();
            input.nextLine();

            File file = new File(REGISTERFILE);
            File file2 = new File(LOGINFILE);
            File file3 = new File(ACCDETAILS);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            if (!file2.exists()) {
                file2.createNewFile();
            }

            if (!file3.exists()) {
                file3.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            fw2 = new FileWriter(file2.getAbsoluteFile(), true);
            bw2 = new BufferedWriter(fw2);

            fw3 = new FileWriter(file3.getAbsoluteFile(), true);
            bw3 = new BufferedWriter(fw3);

            bw.write("UserID: " + userID);
            bw2.write("UserID: " + userID);
            bw3.write("UserID: " + userID);
            
           bw.write(" " + "Password: " + password);
            bw2.write(" " + "Password: " + password);

            bw.write(" " + "Name:" + name);
            bw.write(" " + "IC:" + ic);
            bw.write(" " + "Date of Birth:" + dob);
            bw.write(" " + "Address:" + address);
            bw.write(" " + "Mobile No:" + mobileNo);
            bw.write(" " + "Email:" + email);
            bw.write(" " + "Account Type:" + accType);
            
            bw.write(" " + "Account Number:" + accNo);
            bw.write(" " + "Account Balance:" + accBal);
            
            bw3.write(" " + "Account Number:" + accNo);
            bw3.write(" " + "Account Balance:" + accBal);

            bw.newLine();
            bw2.newLine();
            bw3.newLine();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (bw2 != null) {
                    bw2.close();
                }

                if (bw3 != null) {
                    bw3.close();
                }
                
                if (fw != null) {
                    fw.close();
                }

                if (fw2 != null) {
                    fw2.close();
                }
                
                if (fw3 != null) {
                    fw3.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

    }

}
