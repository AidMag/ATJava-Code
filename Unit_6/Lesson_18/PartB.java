/*
Aidan
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PartB {
    public static void main(String[] args) {
       ArrayList<Double> values = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int counter = 0;
        double sum = 0, avg;
        
        while (true) {
            System.out.print("Enter a test or enter 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                break;
            } else {
                values.add(in.nextDouble());
                counter++;
            }
        } 

        for (double value : values) {
            sum += value;
        }
        avg = sum / counter;
        
        for (int i = 0; i < counter; i++) {
            System.out.printf("%n%.2f", values.get(i));
        }
        System.out.printf("%nAverage: %.2f", avg);
        in.close();
    }
}
