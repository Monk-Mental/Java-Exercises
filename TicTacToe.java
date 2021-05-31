package tictactoe;
/*[TicTacToe.java]
 * This is the game of tictactoe. It demonstrates
 * use of 2D arrays and methods
 * @author Mangat
 * @version 1.0, Nov 2020
 */
import java.util.Scanner;

class TicTacToe { 

  public static void main(String[] args) { 
    
    Scanner input = new Scanner(System.in);
  
    char[][] board = {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
    int userChoice;
    char playerTurn='O';
    int numOfMoves =0;
       
  
    System.out.println("Welcome to TicTacToe");
    System.out.println("1 2 3\n4 5 6\n7 8 9");
    
    do {
      
      if (playerTurn=='O'){
        playerTurn = 'X';
      } else { 
        playerTurn = 'O';
      }
      
    System.out.println("\nPlayer "+playerTurn+" turn");
    display2DArray(board);
    
    do{
    System.out.println("Choose a position: ");
    userChoice = input.nextInt();
    
    } while (!makeMove(board, userChoice, playerTurn)); 
    
    numOfMoves++;
    System.out.println(numOfMoves);
    
    }while(!checkWin(board) && numOfMoves!=9 );
    
    System.out.println("Game Over.");
    display2DArray(board);
    
    if (checkWin(board)) {
      System.out.println("Winner is player: "+playerTurn);    
    }else {                        
      System.out.println("Tie Game.");  
    }
  }
  
  
  
   /**
   * checkWin
   * Determines if there is a horizontal, vertical, or diagonal win
   * @param board the 2Darray containg the game of tictactoe
   * @return true if there is a win, otherwise false
   */
  public static boolean checkWin(char[][] board) { 
    for (int i = 0; i< board.length; i++) {  
      if (board[i][0]==board[i][1] && board[i][0]==board[i][2] && board[i][0]!='.') {//horizontal
        return true;
      }else if(board[0][i]==board[1][i] && board[0][i]==board[2][i] && board[0][i]!='.') { //vertical
        return true;
      }
      
    }
    
    //Diagonals
    if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0]!='.') {
      return true;
    }else if (board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[0][2]!='.') {
      return true;
    }
    return false;  
  }
  
   /**
   * makeMove
   * Attempts to apply a 'X' or 'O' to the tictactoe gameboard
   * @param board the 2Darray holding the tictactoegame
   * @param position the location of the move (#1-9)
   * @param player either 'X' or 'O'
   * @return true if the move was succesful, otherwise false (spot taken)
   */
  public static boolean makeMove(char[][] board, int position, char player) { 
    if (board[(position-1)/3][(position-1)%3] != '.') { 
      return false; //spot taken
    }else { 
      board[(position-1)/3][(position-1)%3]=player;
    }
    return true;
    
  }
  
  
  
   /**
   * display2DArray
   * Outputs the contents of a char array to the console
   * @param sArray the array to be displayed
   */
  public static void display2DArray(char[][] data) { 

    for (int i = 0; i< data.length; i++) {  
      for (int j = 0; j< data[i].length; j++) { 
      System.out.print(data[i][j]+" ");
    }
    System.out.println("");
    }
  }
  