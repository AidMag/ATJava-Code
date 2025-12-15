/*
Aidan
 */

public class PartB {
    public static void main(String[] args) {

        double sum = 0, avg;
        
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%n%.1f",numbers[i]);
            sum += numbers[i];
        }

        avg = sum / 5;

        System.out.printf("%nAvg = %.1f", avg);
    }
}