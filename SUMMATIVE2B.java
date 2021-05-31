
package summative2b;
 //Program finds the hypotenuse or a right angled triangle
import java.util.Scanner;

public class SUMMATIVE2B {

  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    double side1, side2, hypotenuse;
    int position;
    String name, lastName;

    System.out.print("Enter your full name: ");
    name = user_input.nextLine();

    System.out.print("Enter the length of one of the sides (not hypotenuse): ");
    side1 = user_input.nextDouble();

    System.out.print("Enter the length of the other side (not hypotenuse): ");
    side2 = user_input.nextDouble();

    hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

    position = name.indexOf(" ");
    lastName = name.substring(position + 1, name.length());
    lastName = (lastName.substring(0, 1).toUpperCase()) + lastName.substring(1);

    System.out.print(lastName + ", the length of the hypotenuse is: " + hypotenuse);

  }
}