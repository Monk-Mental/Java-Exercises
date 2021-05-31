/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstword;

/**
 *
 * @author Arya Peer
 */
public class FirstWord {
   public static String getFirstWord(String str) { 
       //finds the space
       int spaceIndex = str.indexOf(" ");
       //seperates the first word by cutting off everything past the space
       String firstWord = str.substring(0,spaceIndex);
       //return the first word
       return firstWord;

   
  }  
  public static String removeFirstWord(String str) { 
      //get index of space
       int spaceIndex = str.indexOf(" ");
       //find length of sentencee
       int len = str.length();
       //seperate first word
       String removeFirstWord = str.substring(spaceIndex,len);
       //return the sentence without first word
       return removeFirstWord;
  
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String thing = "12 38 is the time";
        System.out.println(getFirstWord(thing));
        System.out.println(removeFirstWord(thing));
    }
    
}
