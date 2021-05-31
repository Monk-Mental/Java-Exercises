/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass10132020;

/**
 *
 * @author Arya Peer
 */
import java.util.Scanner;

public class InClass10132020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        String word1, word2;
        word1 = input.nextLine();
        word2 = input.nextLine();
        
        int compare = word1.compareTo(word2);
        
        if(compare>0){
            System.out.println(1);
        }else if (compare < 0){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
        
        input.close();
        
    }
    
}
