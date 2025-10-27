/*
Aidan
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //Getting values for variables
        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temp = in.nextDouble();
        char system = in.next().charAt(0);
        
        // declearing variable
        char C = 'C';
        char F = 'F';

        //Cascade of if else
        if (system == C) {
            if (temp == 100) {
                System.out.printf("At a temperature of %.2f C, water is boiling.", temp);
            } else if (temp > 100){
                System.out.printf("At a temperature of %.2f C, water is in a gaseous state (i.e., steam).", temp);
            } else if (temp < 100 && temp > 0) {
                System.out.printf("At a temperature of %.2f C, water is liquid.", temp);
            } else if (temp <= 0) {
                System.out.printf("At a temerature of %.2f C, water is frozen.", temp);
            }
        }
        if (system == F) {
            if (temp == 212) {
                System.out.printf("At a temperature of %.2f F, water is boiling.", temp);
            } else if (temp > 212){
                System.out.printf("At a temperature of %.2f F, water is in a gaseous state (i.e., steam).", temp);
            } else if (temp < 212 && temp > 32) {
                System.out.printf("At a temperature of %.2f F, water is liquid.", temp);
            } else if (temp <= 32) {
                System.out.printf("At a temerature of %.2f F, water is frozen.", temp);
            }
        }

        in.close();
    }
}
