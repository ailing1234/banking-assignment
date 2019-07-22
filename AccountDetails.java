/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ong
 */
public class AccountDetails extends LoginAcc {

    private static final String ACCDETAILS = "./accdetails.txt";
    
    public static void main(String args[]){
        
    BufferedReader br = null;
    FileReader fr = null;

    /*BufferedReader bw2 = null;
        FileReader fw2 = null;*/
    String userID, accNo, line;
    double accBal;
    int option;

    Scanner input = new Scanner(System.in);

    
        try {
        fr = new FileReader(ACCDETAILS);
        br = new BufferedReader(fr);

        System.out.println("Login to your account:");
        System.out.print("UserID: ");
        userID = input.next();
       
        while ((line = br.readLine()) != null) {
            if (line.contains(userID)) {
                System.out.println(userID + "," + "Welcome to OK Bank");
                System.out.println(line);
                

            } else {
               
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
