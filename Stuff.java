/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.Scanner;

/**
 *
 * @author Arya Peer
 */
public class Stuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        String sentence;
        sentence = input.nextLine();
        System.out.println(("Hello World").replaceAll(" ","\n"));
        
    }
    
}
