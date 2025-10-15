/*
Write a program that reads a temperature value and the letter C for Celsius or F for Fahrenheit.
Print whether water is liquid, solid, or gaseous at the given temperature at sea level.
Use a freezing point of 0 deg C and a boiling point of 100 deg C for this example.
Your program run should look something like the following,
Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: 212 F
At a temperature of 212.00 F, water is in a gaseous state (i.e., steam).
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature and a 'C' for Celsius or 'F' for Fahrenheit: ");
        double temp = in.nextDouble();
        String system = in.next();
        
        String C = "C";
        String F = "F";

        if (C == system) {
            if (temp == 100) {
                System.out.printf("At a temperature of %.2f C, water is boiling.");
            } else if (temp > 100){
                System.out.printf("At a temperature of %.2f C, water is in a gaseous state (i.e., steam).");
            } else if (temp < 100 && temp > 0) {
                System.out.printf("At a temperature of %.2f C, water is liquid.");
            } else if (temp <= 0) {
                System.out.printf("At a temerature of %.2f C, water is frozen.");
            }
        }
        if (F == system) {
            if (temp == 212) {
                System.out.printf("At a temperature of %.2f F, water is boiling.");
            } else if (temp > 212){
                System.out.printf("At a temperature of %.2f F, water is in a gaseous state (i.e., steam).");
            } else if (temp < 212 && temp > 32) {
                System.out.printf("At a temperature of %.2f F, water is liquid.");
            } else if (temp <= 32) {
                System.out.printf("At a temerature of %.2f F, water is frozen.");
            }
        }

        in.close();
    }
}
