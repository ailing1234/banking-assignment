/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ong
 */
public class test {
        private static final String REGISTERFILE = "./register.txt";
    private static final String LOGINFILE = "./loginfile.txt";
    private static final String ACCDETAILS = "./accdetails.txt";

    public static void main(String args[]) {

      
        BufferedWriter bw3 = null;
        FileWriter fw3 = null;

        String userID, password, conPassword, name, address, email, accType, accNo;
        int ic, dob, mobileNo;
        float accBal;

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("UserID: ");
            userID = input.nextLine();

            
            System.out.print("Account Number: ");
            accNo = input.nextLine();

            System.out.print("Account Balance: ");
            accBal = input.nextFloat();
            input.nextLine();

       
            File file3 = new File(ACCDETAILS);

            // if file doesnt exists, then create it
           
            if (!file3.exists()) {
                file3.createNewFile();
            }

            // true = append file
            
            fw3 = new FileWriter(file3.getAbsoluteFile(), true);
            bw3 = new BufferedWriter(fw3);

          
            bw3.write("UserID: " + userID);
            
           
            
            bw3.write(" " + "Account Number:" + accNo);
            bw3.write(" " + "Account Balance:" + accBal);

        
            bw3.newLine();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

              
                 if (bw3 != null) {
                    bw3.close();
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
