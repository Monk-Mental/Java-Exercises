/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package choose.adventure.game;

/**
 *
 * @author Arya Peer
 */
import java.util.Scanner;

public class ChooseAdventureGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("WACKY DREAM GAME");
        System.out.println("\nYou wake up in the morning hungry as ever. You go downstairs and open the fridge to see what's inside.");
        System.out.println("Inside the fridge, there is an 'apple' and a singular 'meatball'.");
        System.out.println("Which food do you choose to eat?");
        String input1 = reader.nextLine();
        
        if(input1.equals("apple")||input1.equals("Apple")){
            System.out.println("\nYou pick up the apple at eat it. YUM! As you munch down on the apple, you notice a bug on the ground.");
            System.out.print("Enter 'Stomp' to kill the bug, or 'High Five' to high five the bug."); 
        }else if(input1.equals("meatball") || input1.equals("Meatball")){
            System.out.println("E");
        }
        }

}
    
