/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Arya Peer
 */

public class formative {
    public static double areaOfRect(double l, double w) { 
    double area = l*w;
    return area;
    }
    
    public static double areaOfCirc(double radius){
        double area = Math.PI*(radius*radius);
        return area;
    }
    public static double areaOfTri(double base, double height){
        double area = base*height*0.5;
        return area;
    }
    
    public static double volOfRectPrism(double length, double width, double height){
        double vol = length * width * height;
        return vol;
    }
    
    public static double volSphere(double radius){
        double vol = (4/3)*Math.PI*(radius*radius*radius);
        return vol;
    }
    
    public static double volCylinder(double radius, double height){
        double vol = Math.PI*(radius*radius)*height;
        return vol;
    }
    public static double volCone(double radius, double height){
        double vol = Math.PI*(radius*radius)*(height/3);
        return vol;
    }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println(areaOfRect(3,5));
     }
}
