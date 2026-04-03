package org.derryfield.math;

public class Alegebra {
    
    public static double harmonic_mean(double x, double y) {
        if (x > 0 && y > 0) {
            double mean = (2 * x * y) / (x + y);
            return mean;
        } else {
            throw new ArithmeticException("Doubles must be positive");
        } 
    }
}
