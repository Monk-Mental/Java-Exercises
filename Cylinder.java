/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinder;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Arya Peer
 */
public class Cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        double height=input.nextDouble();
        double radius=input.nextDouble();
        
        double sa=2*(Math.PI)*radius*height+2*(Math.PI)*(radius*radius);
        sa=Math.round(sa*10.0)/10.0;
        double v = (Math.PI)*(radius*radius)*height;
        v=Math.round(v*10.0)/10.0;
        System.out.println(sa);
        System.out.println(v);
        
        System.out.println(Math.round(3.56));
        
    }
    
}
