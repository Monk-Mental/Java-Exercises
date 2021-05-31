/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;
import java.util.Scanner;
/**
 * @author Arya Peer
 */
public class Random {

    public static void main(String[] args) {
        
         Scanner user_input = new Scanner(System.in);
         
         String password, guess;
         
         System.out.println("enter your password");
         
         password = user_input.nextLine();

         do{
             
             System.out.println("enter your guess");
             guess = user_input.nextLine();
             
             if(guess.equals(password)){
                 
                 System.out.println("Password Accepted");
                 
             }else{
                 
                 System.out.println("Error - Incorrect password");
                 
             }
         }while(!(password.equals(guess)));

    }
    
}
