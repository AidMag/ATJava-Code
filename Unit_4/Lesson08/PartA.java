/*
 * The half life of Cesium 90, a dangerous radioactive isotope released in the Fukushima reactor accident, is 30 years.
 * That is, half of its radioactive material will decay every 30 years.
 * Write a Java program that uses a while loop to calculate how many years it will take before 99% of the original cesium will be gone.
Assume that you begin with 100.0% of the material.
After 30 each 30 year period has passed, assume the material is equal to its previous amount divided by 2.
Determine what your test condition should be for your loop.
Print the number of years required (should be a multiple of 30) and the amount of material leftover (as a percentage).

 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        
        //Setting up scanner and getting the amount of cecium 90
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount (g) of Cesium 90: ");
        double amount = in.nextDouble();

        // finding the amount of cecium that will be left
        double one_percent = amount * 0.01;

        // declaring the variable years
        int years = 0;

        // while loop that calculates how many years it will take for 99% of the cecium 90 to decay
        while (amount > one_percent){
            amount = amount / 2;
            years = years + 30;
        }

        // printing the number of years
        System.out.printf("It will take %d years to decay to %.2f.", years , amount);

        in.close();
    }
}
