/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;

/**
 *
 * @author Arya Peer
 */
public class Bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cost = 12;
        double tip = 0.13;
        double p = 10000;
        double r = 0.13;
        double t = 2;
        System.out.println(cost*1.13);
        System.out.println(cost*tip);
        System.out.println(cost*1.13+cost*tip);
        System.out.print("i = "+(p*r*t));
    }
    
}
