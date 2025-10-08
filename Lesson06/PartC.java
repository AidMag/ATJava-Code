/*
Explain why the following program does not produce the output that some people would expect it to produce:
    
    The following output would not produce what people would expect becuase the way floating-point values are stored.
They are stored in a limited space so when proforming calcualtions it introduces rounding errors. These slight differences 
causes the values to be slighly different, causing the program to say they are not equal.
 */

public class PartC {
    public static void main(String[] args) {
        
        double a = 1.2; 
        double b= 3.0;
        double c = a * b; 
        final double Threshold = 1e-14;

        if(Math.abs(c-3.6) < Threshold){
        System.out.println("c is 3.6");
        } else {
        System.out.println("c is not 3.6");
        }
    }
}
