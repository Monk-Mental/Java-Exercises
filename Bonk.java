/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonk;

/**
 *
 * @author Arya Peer
 */
public class Bonk {
    
    public String Area (int x1, int x2) {
        double area = x1*x2;
        double perm = 2*x2 + 2*x1;
        return "The area of the rectangle is:" + area + "the perimeter of the rectangle is:"+perm;
    
}
 


    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int y =0;
        int sum = x+y;
        int diff = 0;
        int prod = x * y;
        int quotient = 0;
        int remain = 0;
        if(x>y){
           diff = x-y; 
           quotient =(x/y);
           remain = x%y;
        }else if (y>x){
            diff = y-x;
            quotient =(y/x);
            remain = (y%x);
        }else if(x == y){
            diff =0;
            quotient =1;
            remain = 0;
        }
        System.out.println("x+y = " + sum);
        System.out.println("x-y = " + diff);
        System.out.println("x*y = " + prod);
        System.out.println("x/y = " + quotient);
        System.out.println("x%y = " + remain);
        
    }
}