/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman3;

import java.util.Scanner;

/**
 *
 * @author Arya Peer
 */
public class Hangman3 {

    public static int numDashes(String str) { 
    int c = 0;

    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == '_')
            c++;
    }

    return c;
    }
    public static String gallows(int x){
        if(x==0){
            return  " %%%%%\n %   %\n %\n %\n %\n %\n%%% ";
        }else if (x == 1){
            return " %%%%%\n %   %\n %   O\n %\n %\n %\n%%% ";
        }else if(x==2){
            return " %%%%%\n %   %\n %   O\n %   |\n %\n %\n%%% ";
        }else if(x==3){
            return " %%%%%\n %   %\n %   O\n % |_|\n %\n %\n%%% ";
        }else if(x==4){
            return  " %%%%%\n %   %\n %   O\n % |_|_|\n %\n %\n%%% ";
        }else if(x==5){
           return " %%%%%\n %   %\n %   O\n % |_|_|\n %   |\n %\n%%% ";
        }else if (x==6){
            return " %%%%%\n %   %\n %   O\n % |_|_|\n %  _|\n % |   \n%%% ";
        }else{
            return " %%%%%\n %   %\n %   O\n % |_|_|\n %  _|_\n % |   |\n%%% ";
        }
    }
    
    public static boolean repetition(String str, char characterInputted){
        int len = str.length();
        boolean repetition = false;
        for (int i = 0; i < len; i++) {
             if(str.charAt(i) == characterInputted)
                {
                    repetition = true;

             }
        }
        return repetition;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String proceed = "yes";
        String str;
        String formatted;
        int len;
        int incorrectGuesses;
        String letterOrSentence;
    do{
        String guess;
        char guessLetter;
        String guessString;
        boolean correct = false;
        boolean repetition = false;
        incorrectGuesses = 0;
        String incorrectGuessesString = "";
        
        System.out.println("input secret word");
        str = sc.nextLine();
        formatted= str.replaceAll("[a-zA-Z]", "_");
        len = str.length();

        System.out.println(formatted);
        System.out.println(incorrectGuessesString);
        
        System.out.println("");
        System.out.println("Enter letter in lowercase if you want to guess the letter, Otherwise type anything and hit enter to guess the sentence");
        letterOrSentence = sc.nextLine();
        
        
        while((incorrectGuesses<8)&&(numDashes(formatted)>0)){
         if(letterOrSentence.equals("letter")){   
            guessLetter = sc.nextLine().charAt(0);
            correct = false;
            
        for (int i = 0; i < len; i++) {
                if(formatted.charAt(i) == guessLetter)
                {
                    repetition = true;
                }
                if(str.charAt(i) == guessLetter)
                {
                    formatted = formatted.substring(0, i)+guessLetter+formatted.substring(i+1);
                    correct = true;
                }
            }
        
        if ((correct == true)&&(repetition==false)){
            System.out.println("good guess");
        }else if((correct == true)&&(repetition==true)){
            System.out.println("YOU ALREADY GUESSED THIS LETTER");
            System.out.println("YOU WILL HAVE ONE INCORRECT GUESS ADDED BECAUSE OF THIS");
            incorrectGuesses+=1;
        }else if((correct == false)&&(repetition(incorrectGuessesString, guessLetter)==true)){
            System.out.println("wrong");
            incorrectGuesses+=1;
        }else{
            System.out.println("wrong");
            incorrectGuesses+=1;
            incorrectGuessesString = incorrectGuessesString +' ' + guessLetter;
        }
        
        System.out.println(formatted);
        System.out.println("Wrong letters:" + incorrectGuessesString);
        System.out.println(gallows(incorrectGuesses));
        }else{
            guessString = sc.nextLine();
            if(guessString.equals(str)){
                System.out.println("NICE YOU GUESSED THE WORD");
                
            }else{
                System.out.println("OOPS BETTER LUCK NEXT TIME");
            }
        }
        }
        if(numDashes(formatted)==0){
            System.out.println("You won");
            formatted = str;
        }else{
            System.out.println("You lost");
        }
        
        System.out.println("Type yes in lowercase to proceed and anything else to end ");
        proceed = sc.nextLine();
        
    }while(proceed.equals("yes"));
    
    
    }
    
}

