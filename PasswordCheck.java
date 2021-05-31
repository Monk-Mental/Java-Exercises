/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordcheck;

/**
 *
 * @author Arya Peer
 */
public class PasswordCheck {
public static boolean twoOrMoreDigits(String str) { 
    int c = 0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isDigit(str.charAt(i))) {
            c++;
        }
    }
    
    if (c >= 2){
        return true;
    }else{
        return false;
    }
}
public static boolean noSymbols(String str){
    int c = 0;
    for (int i = 0; i < str.length(); i++) {
        if (Character.isLetterOrDigit(str.charAt(i))) {
            c++;
        }
    }
    
    if (c ==str.length()){
        return true;
    }else{
    return false;  
    }
    
}

public static boolean appropriateLength (String str){
    if((str.length()<=10)&&(str.length()>0)){
        return true;
    }else{
        return false;
    }
}
public static boolean validPassword (String str){
    if((noSymbols(str)==true)&&(appropriateLength(str)==true)&&(twoOrMoreDigits(str)==true)){
        return true;
    }else{
        return false;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
}
}
