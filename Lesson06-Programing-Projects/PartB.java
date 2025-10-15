/*
Aidan
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two floating-point numbers: ");
        double num_1 = in.nextDouble();
        double num_2 = in.nextDouble();

        final double THRESHOLD = 1e-2;

        if (Math.abs(num_1 - num_2) < THRESHOLD) {
            System.out.print("They are the same up to two decimal places.");
        } else {
            System.out.print("They are different up to two decimal places.");
        }
        in.close();
    }
}
