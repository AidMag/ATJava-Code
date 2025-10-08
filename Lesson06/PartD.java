/*
Aidan
 */

import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        
        //Setting up scanner
        Scanner in = new Scanner(System.in);

        // Setting Constant
        final double COOKIES = 0.99;

        //Getting input value
        System.out.print("Enter number of cookies you would like: ");
        int num_cookies = in.nextInt();

        //division to make it look better
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        //If statments to determine, calculate and print the costs
        if (num_cookies > 6 && num_cookies < 13) {
            double discount1 = (COOKIES * num_cookies) * 0.975;
            System.out.printf("Your total cost is %.2f%n", discount1);
        } else if (num_cookies > 12 && num_cookies < 25) {
            double discount2 = (COOKIES * num_cookies) * 0.95;
            System.out.printf("Your total cost is %.2f%n", discount2);
        } else if (num_cookies > 24) {
            double discount3 = (COOKIES * num_cookies) * 0.85;
            System.out.printf("Your total cost is %.2f%n", discount3);
        }   

        in.close();
    }
}
