/*
Aidan
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
        System.out.printf("It will take %d years to decay to %.2fg.", years , amount);

        in.close();
    }
}
