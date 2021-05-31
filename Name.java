/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;
import java.util.Scanner;
/**[Word.java]
 *Asks the user for a word and the number of times they want it printed and prints it that amount of times.
 * @author Arya Peer
 * @10/22/2020
 */
public class Word {

    public static void main(String[] args) {
        //initialize scanner
        Scanner user_input = new Scanner(System.in);
        //declare vars
        String word;
        int printNum;
        //ask for and get name
        System.out.println("Enter the word you want printed: ");
        word = user_input.nextLine();
        //Ask for and get the amount of times they want the word printed
        System.out.println("Enter the amount of times you want it printed: ");
        printNum=user_input.nextInt();
        
        for(int i = 1; i<printNum+1; i++){
            System.out.println(word);
        }
    }
    
}
