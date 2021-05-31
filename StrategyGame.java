package strategygame;
/** StrategyGame class
  * Desc: Strategy game with rocks
  * @author arya peer
  * @version 11/05/2020
  */ 
//import scanner and random number generator
import java.util.Scanner;
import java.util.Random;

public class StrategyGame{
public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        // variable declaration
        int number, userInput, attempts;
        final int NEW_GAME = 1;
        final int EXIT = 2;
        final int NEW_PLAYER = 3;
        final int RANDOM_ROOF = 4;
        final int RANDOM_FLOOR = 2;
        final int STONES_ROOF = 30;
        final int STONES_FLOOR = 10;
        
        int bestScore = 0;
        int rounds = 0;
        String bestPlayer = "Computer";
        boolean validInput;
        String player = "";
        String player2 = "";
        int removalLimit=0;
        int stonesAmount =0;
        int proceed = NEW_PLAYER;
        int removalAmount =0;
        
        // main loop that starts the game over
        do{
            // intro for new players

            //if they are new players ask for their names
            if (proceed==NEW_PLAYER){
                System.out.print("\n" + "Enter player 1 name: ");
                player = keyboard.nextLine();
                System.out.print("\n" + "Enter player 2 name: ");
                player2 = keyboard.nextLine();
                System.out.println(player+" and " + player2 +" welcome to my game!");
            }
 

            System.out.println("Let the game begin!" + "\n");
            System.out.println("How many rounds do you both want to play?");
            rounds = keyboard.nextInt();
            //ensures the number is valid
            if((rounds<2)||(rounds>5)){
                do{
                    System.out.println("\n"+"please input a number of rounds between 2 and 5");
                    rounds = keyboard.nextInt();
                }while((rounds<2)||(rounds>5));
            }
            //sets player points to 0
            int playerOnePoints=0;
            int playerTwoPoints=0;
            
            
            //for loop that loops the game for that amount of rounds
            for (int i=0; i<rounds; i++){
                //generates numbers
               removalLimit = (int)  RANDOM_FLOOR + (int)(Math.random() * ((RANDOM_ROOF - RANDOM_FLOOR) + 1));

               stonesAmount = STONES_FLOOR + (int)(Math.random() * ((STONES_ROOF - STONES_FLOOR) + 1));
               int j= 0;
               //game do while loop
                do{
                     System.out.println("\n"+"round " + (i+1));
                     
                     j++;

                    //if j does not goe evenly into 2 then its player 1's turn
                    if((j%2)==1){
                        
                        System.out.println("the amount of stones is:" +stonesAmount+", "+player+  " please input the amount of rocks you want removed, the max amount you can remove is:"+removalLimit);

                        removalAmount = keyboard.nextInt();
                        //verify the removal amount is realistic
                        if((removalAmount>removalLimit)||(removalAmount<=0)){
                            do{
                                System.out.println(" Please input an amount below the limit The max amount of stones you can remove is:"+removalLimit);
                                removalAmount = keyboard.nextInt();
                            }while(removalAmount>removalLimit);
                        }
                        
                        
                        
                        if((stonesAmount-removalAmount) <= 0){
                            playerTwoPoints +=1;
                            System.out.println("\n"+"Player Two won round:"+1);
                            System.out.println(player+" has " + playerOnePoints);
                            System.out.println(player2+" has " + playerTwoPoints);
                        }
                        stonesAmount= stonesAmount-removalAmount;//remove the amount specified from the stones
                        //if j does not goe evenly into 2 then its player 1's turn, else its player two's turn
                    }else{
                        
                     
                        System.out.println("the amount of stones is:" +stonesAmount+", "+player2+  " please input the amount of rocks you want removed. The max amount of stones you can remove is:"+removalLimit);
                        removalAmount = keyboard.nextInt();
                        //verify that the removalamount is realistic
                         if((removalAmount>removalLimit)||(removalAmount<=0)){
                            do{
                                 System.out.println(" Please input an amount below the limit The max amount of stones you can remove is:"+removalLimit);
                                removalAmount = keyboard.nextInt();
                            }while(removalAmount>removalLimit);
                        }
                        if((stonesAmount-removalAmount) <=0){
                            playerOnePoints +=1;
                            System.out.println("\n"+"Player one won round:"+i);
                            System.out.println(player+" has " + playerOnePoints);
                            System.out.println(player2+" has " + playerTwoPoints);
                        }
                        stonesAmount= stonesAmount-removalAmount;//remove the amount specied from the stones
                        
                    }

                } while(stonesAmount>0);

                
            }
            

          
            //set valid input to false
            validInput = false;
            
            //do while loop to check what the final choice of the players are 
            do{
                if((playerOnePoints>bestScore)&&(playerOnePoints>playerTwoPoints)){
                    bestScore=playerOnePoints;
                    bestPlayer=player;
                    System.out.println("\n"+player+" has the best score of: "+ playerOnePoints );
                }else if((playerTwoPoints>bestScore)&&(playerTwoPoints>playerOnePoints)){
                   bestScore=playerTwoPoints;
                   bestPlayer = player2;
                   System.out.println("\n"+player2+" has the best score of: " +  playerTwoPoints);
                }else if((playerOnePoints == playerTwoPoints)&&(playerTwoPoints>bestScore)){
                   bestPlayer = player2 + " and "+ player;
                   System.out.println("\n"+player2+" and " + player+ " had equal scores of: "+ playerTwoPoints);
                }else{
                    System.out.println(bestPlayer+" has the best score of: " +  bestScore);
                }
                System.out.println("\n" + "Another game? [1 for YES / 2 for NO / 3 for new players]");
                proceed = keyboard.nextInt();
                keyboard.nextLine();
                if (proceed==NEW_GAME || proceed==EXIT || proceed==NEW_PLAYER){
                    validInput = true;
                }
                else{
                    System.out.println("This is not a valid input!");
                }
            } while (! validInput);
        } while (proceed==NEW_GAME || proceed==NEW_PLAYER);
        
        //ending if they decide to exit
        System.out.println("\n" + "Thank you for playing Guess My Number game!");
        keyboard.close();
        
    }
}


