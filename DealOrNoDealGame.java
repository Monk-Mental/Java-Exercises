package dealornodealgame;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class DealOrNoDealGame {
static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
    start();
    }

    public static void start () {
        double [] cases = {0, 0.01, 1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 600,  750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000};
        
        List <double> doublecases = Arrays.asList(cases);
        Collections.shuffle (doublecases);
        doublecases.toArray (doublecases);


    }
}