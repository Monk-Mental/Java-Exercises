

import java.util.Scanner; //import the Scanner for keyboard I/O

/** NextLineBlues */
class NextLineBlues { 
  
  /** Main Method */
  public static void main(String[] args) { 
  
    // Create a Scanner for IO
    Scanner input = new Scanner(System.in);
    
    // Create variables to hold user messages
    int number1, number2;
    String text = "";
    
    //Ask the user for a number
    System.out.println("Enter a number: ");
    number1 = input.nextInt();  
    
    //Ask the user for a message
    System.out.println("Enter a message: ");    
    text = input.nextLine();

    System.out.println("Enter another number: ");
    number2 = input.nextInt();

    System.out.println("You entered the following: ");
    System.out.println(number1);
    System.out.println(text);
    System.out.println(number2);
    
  }
}
