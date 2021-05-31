/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thing;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Arya Peer
 */
public class Thing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Random rand = new Random();
   Scanner sc = new Scanner(System.in);
  
   boolean exit = false;
   int bestScore = 1000;
   String bestPlayer ="";
   String currentPlayer ="";
 
   System.out.println("Enter Your Name:");
   currentPlayer = sc.nextLine();
 
 
   do{
  
   int guess = 0;
   int counter = 0;
   boolean correctGuess = false;
 
     int randInt=rand.nextInt(100);
    
     for(int i = 1; i<11; i++){
       System.out.println("Enter Your Guess:");
       guess =sc.nextInt();
       if(guess>randInt){
         System.out.println("too high");
         counter+=1;
         System.out.println("You have guessed "+counter+" times");
       }else if (guess<randInt){
         System.out.println("too low");
         counter+=1;
         System.out.println("You have guessed "+counter+" times");
       }else if(guess == randInt){
         System.out.println("Correct");
         counter+=1;
         System.out.println("You have guessed "+counter+" times");
         correctGuess= true ;
         break;
 
       }
     }
     if(counter<bestScore){
     bestScore = counter;
     bestPlayer = currentPlayer;
     System.out.println("You are the best Player! You had a score of: " + counter);
     System.out.println("Would you like to play again?");
        String playAgain = sc.nextLine();
     int sameOrNew;
     if((playAgain.equals("yes"))||(playAgain.equals("Yes"))){
       exit=false;
       System.out.println("Same Player or New Player (Enter 1 for same and 2 for New");
       sameOrNew = sc.nextInt();
       if(sameOrNew ==1){
         currentPlayer=currentPlayer;
       }else{
       System.out.println("Enter Your Name:");
       currentPlayer =sc.nextLine();
       }
     }else if((playAgain.equals("no"))||(playAgain.equals("No"))) {
       exit = true;
     }
     }else if(counter>bestScore){
       System.out.println(bestPlayer+ " has the highest score with a score of "+ bestScore);
       System.out.println("Would you like to play again?");
    String playAgain = sc.nextLine();
    int sameOrNew;
     if((playAgain.equals("yes"))||(playAgain.equals("Yes"))){
       exit=false;
       System.out.println("Same Player or New Player (Enter 1 for same and 2 for New");
       sameOrNew = sc.nextInt();
       if(sameOrNew ==1){
         currentPlayer=currentPlayer;
       }else{
       System.out.println("Enter Your Name:");
       currentPlayer =sc.nextLine();
       }
     }else if((playAgain.equals("no"))||(playAgain.equals("No"))) {
       exit = true;
     }
     }else if(correctGuess = false){
       System.out.println("The Number Is"+ randInt);
       System.out.println(bestPlayer+ " has the highest score with a score of "+ bestScore);
       System.out.println("Would you like to play again?");
    String playAgain = sc.nextLine();
    int sameOrNew;
     if((playAgain.equals("yes"))||(playAgain.equals("Yes"))){
       exit=false;
       System.out.println("Same Player or New Player (Enter 1 for same and 2 for New");
       sameOrNew = sc.nextInt();
       if(sameOrNew ==1){
         currentPlayer=currentPlayer;
       }else{
       System.out.println("Enter Your Name:");
       currentPlayer =sc.nextLine();
       }
     }else if((playAgain.equals("no"))||(playAgain.equals("No"))) {
       exit = true;
     }
     }
 
    
   }while(exit==false);
 }
}
    