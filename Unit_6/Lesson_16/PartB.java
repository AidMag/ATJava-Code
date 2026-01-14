/*
Aidan
*/

import java.util.Scanner;
import java.util.Arrays;

public class PartB {

    public static double average(double... values) {
        double avg, value = 0;

        for (int i = 0; i < values.length; i++) {
            value += values[i];
        }

        avg = value / values.length;

        return avg;
    }

    public static void main(String[] args) {
       
        // Setting up variables and Arrays and Scanner
        Scanner in = new Scanner(System.in);
        double[] values = new double[10];
        int counter = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter an integer or type 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                values[i] = in.nextInt();
                counter++;
            }
        }
        
        System.out.printf("The average of your inputs are %.2f", average(Arrays.copyOf(values, counter)));

        in.close();
    }
}
