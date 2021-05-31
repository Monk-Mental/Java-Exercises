package primenumcheck;
public class Primenumcheck {
    public static boolean isPrime(int x) { 
    boolean tf = true;
    if (x <= 0){
        tf = false;
    }
    for(int i = 2; i<x; i++){
        if(x%i == 0){
            tf = false;
        }
    } 
    return tf;
  }  
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    
}
